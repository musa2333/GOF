package org.gof.adapter.player;

public class ForeignerPlayer {

	private String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void jingong() {
		System.out.println("the player "+name+" is attack");
	}
	
	public void fangshou() {
		System.out.println("the player "+name+" is defense");
	}
}
