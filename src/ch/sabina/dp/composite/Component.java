package ch.sabina.dp.composite;

import java.util.List;

//The Component in the below class diagram, defines an interface for all objects in the composition 
// both the composite and the leaf nodes. T
public interface Component {
		int operation();
		boolean remove(Component c);
		boolean add(Component c);
		List<Component> getChildren();
		
		
}
