package org.gof.Composite.component;

import java.util.ArrayList;
import java.util.List;

public class Composite extends Component {

	private List<Component> children=new ArrayList<>();
	
	public Composite(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void add(Component component) {
		// TODO Auto-generated method stub
       children.add(component);
	}

	@Override
	public void remove(Component component) {
		// TODO Auto-generated method stub
       children.remove(component);
	}

	@Override
	public void show(int depth) {
		// TODO Auto-generated method stub
       String prefix=getPrefix(depth);
       System.out.println(prefix+name);
       for(Component component:children) {
    	   component.show(depth+2);
       }
	}

	private String getPrefix(int depth) {
		// TODO Auto-generated method stub
		String result="";
		for(int i=0;i<depth;i++) {
			result+="-";
		}
		return result;
	}

}
