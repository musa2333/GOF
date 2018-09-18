package org.gof.prototype;

public class Main {
  public static void main(String[] args) {
	  Professor professor=new Professor();
	  professor.setAcademic("Computer academy");
	  professor.setName("Tony");
	  //shallow copy
	  Student student=new Student();
	  student.setAge(20);
	  student.setSex("male");
	  student.setName("Nick");
	  student.setProfessor(professor);
	  student.display();
	  
	 
	  Student fstudent=(Student)student.clone();
	  fstudent.setAge(30);
	  fstudent.setName("Micky");
	  fstudent.setSex("female");
	  //deep and shallow copy test
	  Professor fprofessor=fstudent.getProfessor();
	  fprofessor.setAcademic("chemistry academy");
	  fprofessor.setName("Bob");
	  //fstudent.setProfessor(professor);
	  fstudent.display();
	  
	  //shallow copy effect
	  student.display();
	  
	  //deep Copy
	  
  }
}
