package org.gof.strategy.context;

import org.gof.strategy.strategy.CashSuper;
import org.gof.strategy.strategy.CashSuperNormal;
import org.gof.strategy.strategy.CashSuperRebate;
import org.gof.strategy.strategy.CashSuperReturn;

/**
 * cash context
 * @author musa
 *
 */
public class StrategyContext {

	private CashSuper cashSuper;
	
	public StrategyContext(String strategy) {
		switch(strategy) {
		case "normal":
			cashSuper=new CashSuperNormal();
			break;
		case "8 discount":
			cashSuper=new CashSuperRebate("0.8");
			break;
		case "300 minus 180":
			cashSuper=new CashSuperReturn("300","180");
		    break;
		
		}
	}
	/**
	 * add acceptCash
	 * @param money
	 * @return
	 */
	public double acceptCash(double money) {
		return cashSuper.acceptCash(money);
	}
	
}
