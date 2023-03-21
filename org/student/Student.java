package org.student;

import org.department.Department;

public class Student extends Department{
	public void studentName() {
		System.out.println("Kabilan");
	}
	public void studentDept() {
		System.out.println("Computer Science");
	}
	public void studentId() {
		System.out.println("SRM230512");
	}
    public static void main(String[] args) {
    	Student studentInfo=new Student();
    	studentInfo.collegeName();
    	studentInfo.collegeCode();
    	studentInfo.collegeRank();
    	studentInfo.deptName();
    	studentInfo.studentName();
    	studentInfo.studentId();
    	studentInfo.studentDept();
    	
    	
	
}
}
