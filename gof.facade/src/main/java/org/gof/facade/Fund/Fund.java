package org.gof.facade.Fund;

import org.gof.facade.invest.NationalDebt;
import org.gof.facade.invest.Realty1;
import org.gof.facade.invest.Stock1;
import org.gof.facade.invest.Stock2;
import org.gof.facade.invest.Stock3;
/**
 * the Fund to do invest
 * @author musa
 *
 */
public class Fund {
	
	private NationalDebt nationalDebt;
	private Realty1 realty1;
	private Stock1 stock1;
	private Stock2 stock2;
	private Stock3 stock3;
	
	public Fund() {
		realty1=new Realty1();
		stock1=new Stock1();
		stock2=new Stock2();
		stock3=new Stock3();
		nationalDebt=new NationalDebt();
	}
	
	public void buy() {
		realty1.buy();
		stock1.buy();
		stock2.buy();
		stock3.buy();
		nationalDebt.buy();
	}
	
	public void sell() {
		realty1.sell();
		stock1.sell();
		stock2.sell();
		stock3.sell();
		nationalDebt.sell();
	}

}
