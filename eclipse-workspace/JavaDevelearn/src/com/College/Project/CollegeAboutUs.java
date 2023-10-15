package com.College.Project;

public class CollegeAboutUs {
	private String principle;
	private String vicePresident;
	private String facts;
	private String info;
	private String coc;
	private String ms;

	public String getFacts() {
		return facts;
	}

	public void setFacts(String facts) {
		this.facts = facts;
	}

	public CollegeAboutUs(String principle, String vicePresident, String facts) {
		this.principle = principle;
		this.vicePresident = vicePresident;
		this.facts = facts;
	}

	public String getPrinciple() {
		return principle;
	}

	public void setPrinciple(String principle) {
		this.principle = principle;
	}

	public String getVicePresident() {
		return vicePresident;
	}

	public void setVicePresident(String vicePresident) {
		this.vicePresident = vicePresident;
	}

	public String collegeInfo() {
		return info = """
				Parle Tilak Vidyalaya Association’s Mulund College of Commerce (Autonomous), has a rich legacy of inculcating quality education through right values. The philosophy of PTVA is ‘to educate, empower and elevate the students to equip them with the right knowledge, right understanding, right values and right skills in a secure and conducive learning environment.’ At MCC, every effort is made to imbibe the PTVA philosophy in the right spirit. MCC is known for its discipline, quality education and overall development of students through academic and co-curricular and extra-curricular activities. We offer an array of programs in Commerce and Accountancy, Management Studies and Computing and Technology. As an autonomous college, we have introduced new courses and programs that will expand the horizons of our students and prepare them better for life outside the college campus. Thus, PTVA’s Mulund College of Commerce is equipped to provide its students with the enhanced skills to meet the demands of the rapidly changing world.

				We are now implementing the National Education Policy 2020, a comprehensive framework to guide the development of education in the country. The policy on education has been revised after over three decades and is set to usher major changes in the structure and quality of education in India. One of the key goals of this policy is holistic education, an approach which will enable teaching that focuses on academics, social behaviour, critical thinking, and the overall development of the students. This will allow students to choose their courses according to their aptitude and interests. Another guideline provided by the NEP includes the hybrid model of education. This educational model will include online and classroom teaching, providing students with more flexibility and a chance to personalize their curriculum. As an institution, we are working towards making our contribution to the development of education aligned to the NEP 2020 guidelines and pave the way for the next generation of students.

				We extend a warm welcome to all our students and wish them well in their journey towards academic excellence.

				""";
	}
	
	public String codeOfConduct() {
		return coc = """
				Learners :-
				
				1. The learners shall abide by all the rules and regulations of college and university as enforced from time to time.
				2. The learners shall actively participate in the learning process.
				3. The learners shall not indulge into acts of ragging in any form.
				
				Non-Teaching Staff :-
				
				1. The staff shall be punctual and act with sincerity, honesty, diligence and integrity.
				2. The staff shall behave politely with their colleagues, teachers, students and parents.
				3. The staff shall raise their grievances, if any, at appropriate forum and in appropriate manner.
				
				""";
	}
	
	public String mileStone() {
		return ms = """
				Year	Acheivement
				
				2023	Bachelor of Computer Applications (BCA) and Bachelor of Business Administration (BBA) programmes were introduced.
				2022	B.Sc. (Data Science) and M.Sc. (Finance) programmes were introduced. Several credit based short term courses were introduced to increase the employability of learners
				2021	The College was conferred Academic Autonomy by UGC and entered the 4th Cycle of NAAC accreditation with A Grade (3.26 Score).
				
				""";
	}
}
