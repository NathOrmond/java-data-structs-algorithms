package iterator.inheritancebased;

public class InheritanceContainerIterator implements Iterator {

	private int current = 0;
	private  InheritanceContainer container;
	
	public InheritanceContainerIterator(InheritanceContainer c) {
		this.container = c;
	}
	
	@Override
	public boolean hasNext() {
		return current < this.container.size;
	}

	@Override
	public Object next() {
		return this.container.items[this.current++];
	}

}
