package pilha;

public class StackExeption extends Exception {
	
	private static final long serialVersionUID = 1L;
	
	String message;

	public StackExeption(String message) {
		super(message);
	}
	
	public static StackExeption stackIsEmpty(String message) {
		return new StackExeption(message);
	}
	
	public static StackExeption stackItsFull(String message) {
		return new StackExeption(message);
	}
}
