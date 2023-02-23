package com.example.demo.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "Student")
//@Getter
//@Setter
//@NoArgsConstructor
//@AllArgsConstructor
public class stud{
@Id
@Column(name = "rollno")
private int rollno;
@Column(name = "name")
private String name;
@Column(name = "marks")  
private int marks;

public int getRollno() {
return rollno;
}

public void setRollno(int rollno) {
this.rollno = rollno;
}

public String getName() {
return name;
}

public void setName(String name) {
this.name = name;
}

public int getMarks() {
return marks;
}

public void setMarks(int marks) {
this.marks = marks;
}
public stud() {};
public stud(int rollno, String name, int marks) {
super();
this.rollno = rollno;
this.name = name;
this.marks= marks;
}
}