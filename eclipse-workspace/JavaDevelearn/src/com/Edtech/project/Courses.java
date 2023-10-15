package com.Edtech.project;

public class Courses {
	private String courseName;
	
	public Courses(String courseName) {
		this.courseName = courseName;
	}
	
	public Courses() {}
	
	public int getCourse1() {
		System.out.println("-----------------------  Price : 3500");
		System.out.println("|                     |  This course include: ");
		System.out.println("|                     |  1) This "+courseName+" course is made for beginner");
		System.out.println("|                     |  2) Every Topic was covered in depth by top expert faculty");
		System.out.println("|       "+courseName+"           |  3) These course is based on-demand video recorded");
		System.out.println("|                     |  4) This course will complete in 7 week");
		System.out.println("|                     |");
		System.out.println("|                     |");
		System.out.println("-----------------------");
		return 3500;
	}
	
	public int getCourse2() {
		System.out.println("-----------------------  Price : 4500");
		System.out.println("|                     |  This course include: ");
		System.out.println("|                     |  1) This "+courseName+" course is made for beginner");
		System.out.println("|                     |  2) Every Topic was covered in depth by top expert faculty");
		System.out.println("|       "+courseName+"           |  3) These course is based on-demand video recorded");
		System.out.println("|                     |  4) This course will complete in 7 week");
		System.out.println("|                     |");
		System.out.println("|                     |");
		System.out.println("-----------------------");
		return 4500;
	}
	
	public int getCourse3() {
		System.out.println("-----------------------  Price : 5500");
		System.out.println("|                     |  This course include: ");
		System.out.println("|                     |  1) This "+courseName+" course is made for beginner");
		System.out.println("|                     |  2) Every Topic was covered in depth by top expert faculty");
		System.out.println("|       "+courseName+"           |  3) These course is based on-demand video recorded");
		System.out.println("|                     |  4) This course will complete in 7 week");
		System.out.println("|                     |");
		System.out.println("|                     |");
		System.out.println("-----------------------");
		return 5500;
	}

	public int getCourse4() {
		System.out.println("-----------------------  Price : 4300");
		System.out.println("|                     |  This course include: ");
		System.out.println("|                     |  1) This "+courseName+" course is made for beginner");
		System.out.println("|                     |  2) Every Topic was covered in depth by top expert faculty");
		System.out.println("|       "+courseName+"           |  3) These course is based on-demand video recorded");
		System.out.println("|                     |  4) This course will complete in 7 week");
		System.out.println("|                     |");
		System.out.println("|                     |");
		System.out.println("-----------------------");
		return 4300;
	}

	public int getCourse5() {
		System.out.println("-----------------------  Price : 9500");
		System.out.println("|                     |  This course include: ");
		System.out.println("|                     |  1) This "+courseName+" course is made for beginner");
		System.out.println("|                     |  2) Every Topic was covered in depth by top expert faculty");
		System.out.println("|       "+courseName+"           |  3) These course is based on-demand video recorded");
		System.out.println("|                     |  4) This course will complete in 7 week");
		System.out.println("|                     |");
		System.out.println("|                     |");
		System.out.println("-----------------------");
		return 9500;
	}
	
	public String getCourseName(int payment) {
		if(getCourse1() == payment) return "java";
		else if(getCourse2() == payment) return "DSA";
		else if(getCourse3() == payment) return "DataSci";
		else if(getCourse4() == payment) return "DataAnaly";
		else return "DevOps";
	}
}
