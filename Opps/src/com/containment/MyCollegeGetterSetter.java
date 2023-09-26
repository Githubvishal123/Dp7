package com.containment;

public class MyCollegeGetterSetter {

	public static void main(String[] args) {
		
		Course c1=new Course();
		c1.setCid(101);
		c1.setCname("FullStack");
		c1.setFees(65000f);
		
		Student s1=new Student();
		s1.setSid(1);
		s1.setName("aniket");
		s1.setCourse(c1);
		
		System.out.println(s1);
		// 2nd way
		
		Student s2=new Student();
		s2.setSid(2);
		s2.setName("Vishal");
		s2.setCourse(new Course());
		s2.getCourse().setCid(102);
		s2.getCourse().setCname("java");
		s2.getCourse().setFees(6475f);

		System.out.println(s2);
	}

}
