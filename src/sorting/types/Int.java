package sorting.types;

public class Int implements Comparable {
	
	private int value;
	
	public Int(int value) {
		this.value = value;
	}
	
	public int getValue() { 
		return this.value;
	}
	
	public void setValue(int value) { 
		this.value = value;
	}
	
	@Override
	public String toString() {
		return String.valueOf(this.value);
	}
	
	@Override
	public boolean equals(Object obj) {
		Int complement = (Int) obj;
		return this.getValue() == complement.getValue();
	}

	@Override
	public int compareTo(Object obj) {
		Int complement = (Int) obj;
		return this.getValue() - complement.getValue();
	}

}
