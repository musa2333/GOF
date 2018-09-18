package org.gof.Template;

import org.gof.Template.subPaper.Testpaper1;
import org.gof.Template.subPaper.Testpaper2;

/**
 * main entries
 * @author musa
 *
 */
public class main {
	
	public static void main(String[] args) {
		TestPaper tester1=new Testpaper1("Tonny");
		tester1.TestOperation1();
		tester1.TestOperation2();
		
		TestPaper tester2=new Testpaper2("Candy");
		tester2.TestOperation1();
		tester2.TestOperation2();
	}

}
