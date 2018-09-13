package org.gof.strategy.strategy;

public class CashSuperRebate implements CashSuper {

	private double moneyRebate=1d;
	
	public CashSuperRebate(String rebate) {
		
		this.moneyRebate=Double.valueOf(rebate);
	
	}
	
	public double acceptCash(double money) {
		
		return money*this.moneyRebate;
	}

}
