package org.gof.ChainOfResponse.handler;

import org.gof.ChainOfResponse.Request.Request;

public class CommonManager extends AbstractHandler {

	

	public CommonManager(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void handleRequest(Request request) {
	       if(request.getRequestType().equals("ask for leave")&&request.getRequestNum()<4) {
	    	   System.out.println("the manager name is "+this.name+" approved the request :"+request.getRequestContent());
	       }else if(request.getRequestType().equals("ask for Pay rise")) {
	    	   handler.handleRequest(request);
	       }
	}

}
