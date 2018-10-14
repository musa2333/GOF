package org.gof.ChainOfResponse.Request;

public class Request {
    private String requestType;
    public String getRequestType() {
		return requestType;
	}
	public void setRequestType(String requestType) {
		this.requestType = requestType;
	}
	public int getRequestNum() {
		return requestNum;
	}
	public void setRequestNum(int requestNum) {
		this.requestNum = requestNum;
	}
	public String getRequestContent() {
		return requestContent;
	}
	public void setRequestContent(String requestContent) {
		this.requestContent = requestContent;
	}
	private int requestNum;
    private String requestContent;
    
    
}
