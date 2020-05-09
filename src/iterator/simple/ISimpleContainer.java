package iterator.simple;

public interface ISimpleContainer {
	
	void insert(Object x);
	void remove(Object x);
	Object find (Object x);
	
	boolean isEmpty();
	void makeEmpty();

}
