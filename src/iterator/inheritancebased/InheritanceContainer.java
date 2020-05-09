package iterator.inheritancebased;

public class InheritanceContainer {
	Object[] items;
	int size;
	
	public Iterator iterator() { 
		return new InheritanceContainerIterator(this);
	}
}
