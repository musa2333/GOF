package org.gof.Subject.event;

import java.lang.reflect.Method;

public class Event {

	private Object object;
	public Object getObject() {
		return object;
	}
	public void setObject(Object object) {
		this.object = object;
	}
	public String getMethodName() {
		return methodName;
	}
	public void setMethodName(String methodName) {
		this.methodName = methodName;
	}
	public Object[] getParams() {
		return params;
	}
	public void setParams(Object[] params) {
		this.params = params;
	}
	public Class[] getParamTypes() {
		return paramTypes;
	}
	public void setParamTypes(Class[] paramTypes) {
		this.paramTypes = paramTypes;
	}

	private String methodName;
	private Object[] params;
	
	@SuppressWarnings("rawtypes")
	private Class[] paramTypes;
	
	public Event(Object object,String methodName,Object ...args) {
		this.object=object;
		this.methodName=methodName;
		this.params=args;
		constructParamTypes(this.params);
	}
    /**
     * get paramTypes
     * @param params
     */
	private void constructParamTypes(Object[] params) {
		// TODO Auto-generated method stub
		this.paramTypes=new Class[params.length];
		for(int i=0;i<params.length;i++) {
			this.paramTypes[i]=params[i].getClass();
		}
	}
	
	public void invoke() throws Exception {
		
			Method method=this.object.getClass().getMethod(methodName, paramTypes);
			if(method==null) {
				return;
			}
			method.invoke(this.object, this.params);
		
	}
	
}
