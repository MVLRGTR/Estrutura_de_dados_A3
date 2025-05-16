package pilha;

public class StackExeption extends Exception {
	
	private static final long serialVersionUID = 1L;
	private final String type;
	String message;

	public StackExeption(String message ,String type) {
		super(message);
		this.type =type;
	}
	
	public static StackExeption stackIsEmpty(String message) {
		return new StackExeption(message,"EMPTY");
	}
	
	public static StackExeption stackItsFull(String message) {
		return new StackExeption(message,"FULL");
	}

	public String getType() {
		return type;
	}
	
}
