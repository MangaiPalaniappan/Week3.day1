package org.student;

import org.department.Department;

public class Student extends Department  {
	public void StudentName() {
		System.out.println("Mangai");
	}
	public void StudentDept() {
		System.out.println("IT");
	}
	public void StudentID() {
		System.out.println("111915205025");
	}
	public static void main(String[] args) {
		
		Student stu = new Student();
		stu.StudentDept();
		stu.StudentName();
		stu.StudentID();
		stu.CollegeName();
		stu.CollegeCode();
		stu.CollegeRank();
		stu.DeptName();
		
	}

}
