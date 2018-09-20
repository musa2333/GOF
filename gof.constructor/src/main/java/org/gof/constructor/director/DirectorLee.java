package org.gof.constructor.director;

import org.gof.constructor.builder.Builder;

public class DirectorLee {
   private Builder builder;
   
   public DirectorLee(Builder builder) {
	   this.builder=builder;
   }
   
   public void construct() {
	   System.out.println("product build begin !!!");
	   builder.buildPartA();
	   builder.buildPartB();
   }
}
