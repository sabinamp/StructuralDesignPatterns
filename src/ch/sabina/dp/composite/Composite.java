package ch.sabina.dp.composite;

import java.util.ArrayList;
import java.util.List;

//defines the behavior of the components having children and stores child components.
public class Composite implements Component{
	private List<Component> children;
	public Composite() {
		children = new ArrayList<>();
	}
	
	@Override
	public int operation() {
		int sum=0;
		for(Component each: children) {			
			sum += each.operation();
			System.out.println("operation done: "+each.operation());
			
		}
		return 0;
	
	}

	@Override
	public boolean remove(Component c) {
		boolean successful = children.remove(c);
		return successful;
	}

	@Override
	public boolean add(Component c) {
		boolean successful =children.add(c);
		return successful;
	}

	@Override
	public List<Component> getChildren() {
		
		return children;
	}
	

}
