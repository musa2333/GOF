package gof.proxy.impl;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
/**
 * use dynamic proxy method
 * @author musa
 *
 */
public class DynamicProxyHandler implements InvocationHandler {
	
	private Object object;
	public DynamicProxyHandler(Object object) {
		this.object=object;
	}

	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		
		System.out.println("use dynamic proxy!!!!");
		Object result=method.invoke(object, args);
		System.out.println("finish use dynamic proxy!!");
		// TODO Auto-generated method stub
		return result;
	}

}
