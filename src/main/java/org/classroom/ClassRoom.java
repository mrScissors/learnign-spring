package org.classroom;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class ClassRoom {
	Student stud;
	StudentList studlist;
	int listIndicator = 0;
	public StudentList getStudlist() {
		return studlist;
	}
	@Autowired
	@Qualifier("StudentList1")
	public void setStudlist(StudentList studlist) {
		this.studlist = studlist;
		listIndicator = 1;
	}

	public Student getStud() {
		return stud;
	}

	public void setStud(Student stud) {
		this.stud = stud;
	}
	
	Location locat;
	
	
	public Location getLocat() {
		return locat;
	}
	@Autowired
	@Qualifier("Location3")
	public void setLocat(Location locat) {
		this.locat = locat;
	}
	
	Mentor ment;
	
	public Mentor getMent() {
		return ment;
	}
@Autowired
@Qualifier("Mentor3")
	public void setMent(Mentor ment) {
		this.ment = ment;
	}
	
	int duration;
	

	public int getDuration() {
		return duration;
	}
	
	
	public void setDuration(int duration) {
		this.duration = duration;
	}

	public void printClassDetails() {
		
		if(listIndicator == 0) {
			System.out.println("Name: " + stud.name 
					+ "\n" + "ID: " + stud.studentID 
					+ "\n" + "Age: " + stud.age 
					+ "\n" + "Gender: " + stud.Gender 
					+ "\n" + "City: " + locat.City 
					+ "\n" + "Area: " + locat.Area
					+ "\n" + "MentorName: " + ment.name
					+ "\n" + "MentorID: " + ment.mentorID
					+ "\n" + "MentorAge: " + ment.age
					+ "\n" + "MentorGender: " + ment.Gender
					+ "\n" + "_____________________________________________________");

		}
		
		
		if(listIndicator == 1) {
			System.out.println("ClassRoom List ------------>");
			studlist.studentList1.forEach(n -> System.out.println(n.toString()));
			System.out.println("\n" + "City: " + locat.City 
					+ "\n" + "Area: " + locat.Area
					+ "\n" + "MentorName: " + ment.name
					+ "\n" + "MentorID: " + ment.mentorID
					+ "\n" + "MentorAge: " + ment.age
					+ "\n" + "MentorGender: " + ment.Gender
					+ "\n" + "_____________________________________________________");
		}
	}
	

	
	
	
}
