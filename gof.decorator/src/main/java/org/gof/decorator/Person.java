package org.gof.decorator;

public class Person {
   private String name;
   
   public Person (String name) {
	   this.name=name;
   }
   
   public void show() {
	   System.out.println("the person :"+name+" is wearing !");
   }
}
