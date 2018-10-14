package org.gof.ChainOfResponse.handler;

import org.gof.ChainOfResponse.Request.Request;

public abstract class AbstractHandler {
    protected AbstractHandler handler;
    protected String name;
    
    public AbstractHandler(String name) {
    	this.name=name;
    }
    
    public void setSuperior(AbstractHandler handler) {
    	this.handler=handler;
    }
    
    public abstract void handleRequest(Request request);
}
