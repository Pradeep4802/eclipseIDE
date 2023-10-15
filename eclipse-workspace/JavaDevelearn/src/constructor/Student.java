package constructor;

public class Student {
	int rollNo;
	String name;
	String email;
	int phy,bio,maths,chem;
	
	public Student(int rollNo,String name,String email,int maths,int bio,int phy,int chem) {
		this.rollNo = rollNo;
		this.name = name;
		this.email = email;
		this.phy = phy;
		this.maths = maths;
		this.chem = chem;
		this.bio = bio;
	}
	
	double percentage() {
		return totalMarks()*100/400;
	}
	
	int totalMarks() {
		return phy+maths+chem+bio;
	}
	
	public void display() {
		System.out.println(rollNo+" "+name+" "+email+" "+chem+" "+phy+" "+maths+" "+bio);
		System.out.println("Total Marks: " + name + " is : " + this.totalMarks());
		System.out.println("Percentage : " + this.percentage());
	}
	
	public static void main(String args[]) {
		Student s = new Student(101,"Suraj","Sg@gmail.com",90,67,64,89);
		s.display();
		System.out.println("---------------------");
		Student s1 = new Student(102,"Sakshi","Sk@gmail.com",98,77,34,69);
		s1.display();
		System.out.println("------------------");
		s.rollNo=211;
		s.chem = 40;
		s.display();
	}
}
