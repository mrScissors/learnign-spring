package org.classroom;

import org.classroom.Student.gender;

public class Mentor {
	String name;
	gender Gender;
	int mentorID;
	int age;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public gender getGender() {
		return Gender;
	}
	public void setGender(gender gender) {
		Gender = gender;
	}
	public int getMentorID() {
		return mentorID;
	}
	public void setMentorID(int mentorID) {
		this.mentorID = mentorID;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public Mentor(String name, gender gndr, int id, int age) {
		this.setName(name);
		this.setGender(gndr);
		this.setMentorID(id);
		this.setAge(age);
	}
}
