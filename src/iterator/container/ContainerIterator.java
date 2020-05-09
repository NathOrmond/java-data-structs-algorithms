package iterator.container;

public class ContainerIterator {
	
	private int current = 0;
	private Container container;
	
	public ContainerIterator(Container c) {
		this.container = c;
	}
	
	public boolean hasnNext() { 
		return current < container.size;
	}
	
	public Object next() { 
		return container.items[current++];
	}

}
