package org.gof.adapter.player;

public class Translator extends Player {

	private ForeignerPlayer foreignerPlayer=new ForeignerPlayer();
	public Translator(String name) {
		super(name);
		// TODO Auto-generated constructor stub
		foreignerPlayer.setName(name);
	}

	@Override
	public void attack() {
		// TODO Auto-generated method stub
      foreignerPlayer.jingong();
	}

	@Override
	public void defense() {
		// TODO Auto-generated method stub
      foreignerPlayer.fangshou();
	}

}
