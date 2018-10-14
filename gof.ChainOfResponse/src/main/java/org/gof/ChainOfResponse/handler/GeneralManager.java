package org.gof.ChainOfResponse.handler;

import org.gof.ChainOfResponse.Request.Request;

public class GeneralManager extends AbstractHandler {

	
	public GeneralManager(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void handleRequest(Request requset) {
		// TODO Auto-generated method stub
       if(requset.getRequestType().equals("ask for Pay rise")&&requset.getRequestNum()<=1500&&requset.getRequestNum()>200) {
    	   System.out.println("the manager name is "+name+" approve the request:"+requset.getRequestContent()+" pay is "+requset.getRequestNum());
       }
	}

}
