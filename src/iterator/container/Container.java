package iterator.container;

public class Container {
	
	Object[] items;
	int size;
	
	public ContainerIterator iterator() { 
		return new ContainerIterator(this);
	}
	

}
