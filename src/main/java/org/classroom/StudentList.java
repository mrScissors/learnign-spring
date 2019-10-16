package org.classroom;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class StudentList {
	List<Student> studentList1;

	public List<Student> getStudentList1() {
		return studentList1;
	}
	@Autowired
	@Qualifier("StudentList1")
	public void setStudentList1(List<Student> studentList1) {
		this.studentList1 = studentList1;
	}


	
}
