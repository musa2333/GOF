package org.gof.flyweight.flyweight;

import org.gof.flyweight.User.User;

public class Forum extends Website {

	@Override
	public void Use(User user) {
		// TODO Auto-generated method stub
      System.out.println("the user:"+user.getName()+" is using forum");
	}

}
