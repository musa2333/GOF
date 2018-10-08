package org.gof.Composite.component;

public class Leaf extends Component {

	public Leaf(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void add(Component component) {
		// TODO Auto-generated method stub
        System.out.println("can not add child");
	}

	@Override
	public void remove(Component component) {
		// TODO Auto-generated method stub
        System.out.println("can not remove child");
	}

	@Override
	public void show(int depth) {
		// TODO Auto-generated method stub
       System.out.println(getPrefix(depth)+name);
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
