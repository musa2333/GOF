package org.gof.ChainOfResponse.handler;

import org.gof.ChainOfResponse.Request.Request;

public class Majordomo extends AbstractHandler {

	

	public Majordomo(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void handleRequest(Request request) {
		// TODO Auto-generated method stub
       if(request.getRequestType().equals("ask for leave")&&(request.getRequestNum()>=4&&request.getRequestNum()<=15)) {
    	   System.out.println("the manager name is "+this.name+" approved the request :"+request.getRequestContent());
       }else if(request.getRequestType().equals("ask for Pay rise")&&request.getRequestNum()<500) {
    	   System.out.println("the manager name is "+this.name+" approved the request :"+request.getRequestContent());
    	   
       }else if(request.getRequestType().equals("ask for Pay rise")&&request.getRequestNum()>=500) {
    	   handler.handleRequest(request);
       }
	}

}
