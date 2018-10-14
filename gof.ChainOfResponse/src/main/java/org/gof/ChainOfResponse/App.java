package org.gof.ChainOfResponse;

import org.gof.ChainOfResponse.Request.Request;
import org.gof.ChainOfResponse.handler.AbstractHandler;
import org.gof.ChainOfResponse.handler.CommonManager;
import org.gof.ChainOfResponse.handler.GeneralManager;
import org.gof.ChainOfResponse.handler.Majordomo;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "hello manager" );
        AbstractHandler commonManager=new CommonManager("Tony");
        AbstractHandler generalManager=new GeneralManager("Bob");
        AbstractHandler majordomo=new Majordomo("Lay");
        
        commonManager.setSuperior(generalManager);
        generalManager.setSuperior(majordomo);
        
        Request request=new Request();
        request.setRequestType("ask for leave");
        request.setRequestNum(3);
        request.setRequestContent(" ask for three days off!  ");
        commonManager.handleRequest(request);
        
        Request request1=new Request();
        request1.setRequestType("ask for Pay rise");
        request1.setRequestNum(300);
        request1.setRequestContent(" ask for 300 yuan pay rise");
        commonManager.handleRequest(request1);
        
        Request request2=new Request();
        request2.setRequestType("ask for Pay rise");
        request2.setRequestNum(1200);
        request2.setRequestContent(" ask for 1200 yuan pay rise");
        commonManager.handleRequest(request2);
    }
}
