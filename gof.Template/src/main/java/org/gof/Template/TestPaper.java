package org.gof.Template;

public abstract class TestPaper {
	protected String name;
	public TestPaper(String name) {
		this.name=name;
	}

	public void TestOperation1() {
		System.out.println("test1 is :");
	}
	
	public void TestOperation2() {
		System.out.println("test2 is: ");
	}
	
	public void TestOperation3() {
		System.out.println("test3 is : ");
	}
}
