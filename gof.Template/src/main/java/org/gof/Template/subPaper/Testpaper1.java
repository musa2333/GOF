package org.gof.Template.subPaper;

import org.gof.Template.TestPaper;

public class Testpaper1 extends TestPaper {
   public Testpaper1(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

public void TestOperation1() {
	   super.TestOperation1();
	   System.out.println(this.name+" choose "+"c");
   }
   
   public void TestOperation2() {
	   super.TestOperation2();
	   System.out.println(this.name+" choose "+"b");
   }
}
