package org.gof.prototype;

public class Student implements Cloneable {
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	private int age;
	private String sex;
	private Professor professor;
	
	public Professor getProfessor() {
		return professor;
	}
	public void setProfessor(Professor professor) {
		this.professor = professor;
	}
	public Object clone() {
		Student student=null;
		try {
			student=(Student)super.clone();
			//deep copy method
			student.setProfessor((Professor)student.professor.clone());
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return student;
	}
	
	public void display() {
		System.out.println("the person name is :"+name+" sex is :"+sex+" age is :"+age+" professor :"+professor.toString());
	}

}
