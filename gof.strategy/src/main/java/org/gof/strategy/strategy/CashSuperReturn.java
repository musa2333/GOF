package org.gof.strategy.strategy;

public class CashSuperReturn implements CashSuper {

	private double moneyCondition=0d;
	private double moneyReturn=0d;
	
	public CashSuperReturn(String condition,String moneyReturn) {
		this.moneyCondition=Double.valueOf(condition);
		this.moneyReturn=Double.valueOf(moneyReturn);
	}
	
	public double acceptCash(double money) {
		double result=0.0d;
		if(money>=moneyCondition)
			result=money-moneyReturn;
		return result;
	}

}
