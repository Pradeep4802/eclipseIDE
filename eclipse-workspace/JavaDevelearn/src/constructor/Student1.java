package constructor;

public class Student1 {
	int rollNo;
	String name;
	String email;
	int phy,bio,maths,chem;
	
	public Student1(int rollNo,String name,String email,int maths,int bio,int phy,int chem) {
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
	
//	public void display() {
//		System.out.println(rollNo+" "+name+" "+email+" "+chem+" "+phy+" "+maths+" "+bio);
//		System.out.println("Total Marks: " + name + " is : " + this.totalMarks());
//		System.out.println("Percentage : " + this.percentage());
//	}
	
	public static void main(String args[]) {
		Student1 s = new Student1(101,"Suraj","Sg@gmail.com",90,67,64,89);
		System.out.println(s);
		System.out.println(s.toString());
		System.out.println("---------------------");
		Student1 s1 = new Student1(102,"Sakshi","Sk@gmail.com",98,77,34,69);
		System.out.println(s1);
		System.out.println(s1.toString());

	}
}
