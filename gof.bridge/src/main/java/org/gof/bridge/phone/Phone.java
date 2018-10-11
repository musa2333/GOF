package org.gof.bridge.phone;

import org.gof.bridge.software.AbstractSoft;

public abstract class Phone {
   protected AbstractSoft soft;
   public void setSoft(AbstractSoft soft) {
	   this.soft=soft;
   }
   
   public abstract void run();
}
