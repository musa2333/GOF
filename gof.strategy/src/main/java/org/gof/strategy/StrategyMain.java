package org.gof.strategy;

import org.gof.strategy.context.StrategyContext;

/**
 * entry
 * @author musa
 *
 */
public class StrategyMain {
    /**
     * test entry
     * @param args
     */
	public static void main(String[] args) {
		
		//totalMoney
		double totalMoney=234.0d;
		double accMoney=0.0d;
		System.out.println(" actual money is  "+totalMoney);
		//base on strategy
		System.out.println("we have no discount event!!");
		StrategyContext context=new StrategyContext("normal");
		accMoney=context.acceptCash(totalMoney);
		System.out.println("total is:"+accMoney);
		
		totalMoney=400.0d;
		System.out.println("actual money is "+totalMoney);
		System.out.println("now we have discount event!!!");
		context=new StrategyContext("8 discount");
		accMoney=context.acceptCash(totalMoney);
		System.out.println("total is:"+accMoney);
		
		totalMoney=2350.0d;
		System.out.println("actual money is "+totalMoney);
		System.out.println("now we have 300 minus 180 event!!!");
		context=new StrategyContext("300 minus 180");
		accMoney=context.acceptCash(totalMoney);
		System.out.println("total is: "+accMoney);
	}
}
