package org.gof.Template.subPaper;

import org.gof.Template.TestPaper;

public class Testpaper2 extends TestPaper{
	
	public Testpaper2(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	public void TestOperation1() {
		super.TestOperation1();
		System.out.println(this.name+" choose "+"A");
	}
	
	public void TestOperation2() {
		super.TestOperation2();
		System.out.println(this.name+" choose "+"B");
	}

}
