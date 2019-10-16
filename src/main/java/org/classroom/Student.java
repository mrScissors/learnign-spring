package org.classroom;

public class Student {
	String name;
	enum gender{male, female};
	gender Gender;
	int studentID;
	int age;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getStudentID() {
		return studentID;
	}
	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public Student(String name, gender gndr, int studentID, int age){
		this.setName(name);
		this.setStudentID(studentID);
		this.setAge(age);
		this.Gender = gndr;
	}
	
	public String toString() {
		return "Name: " + name 
				+ "\n" + "ID: " + studentID 
				+ "\n" + "Age: " + age 
				+ "\n" + "Gender: " + Gender 
				+ "\n" + "_____________________________________________________";
	}
	
}
