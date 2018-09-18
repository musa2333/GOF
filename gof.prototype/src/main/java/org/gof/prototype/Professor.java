package org.gof.prototype;

public class Professor implements Cloneable {

	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAcademic() {
		return academic;
	}
	public void setAcademic(String academic) {
		this.academic = academic;
	}
	private String academic;
	/**
	 * clone
	 */
	public Object clone() {
		Professor professor=null;
		try {
			professor=(Professor)super.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return professor;
		
	}
	
	public String toString() {
		
		return "Professor name is "+name+" from  "+academic+" Academic";
		
	}
	
	
}