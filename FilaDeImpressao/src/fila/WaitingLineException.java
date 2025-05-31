package fila;

public class WaitingLineException extends Exception{
	
	private static final long serialVersionUID = 1L;
	private final String type;
	
	public WaitingLineException(String message, String type) {
		super(message);
		this.type = type;
	}
	
	public static WaitingLineException waitingLineIsEmpty(String message) {
		return new WaitingLineException(message,"EMPTY");
	}
	
	public static WaitingLineException waitingLinePriorityErro(String message) {
		return new WaitingLineException(message,"PRIORITY");
	}
	
	public static WaitingLineException documentVariablesErro(String message) {
		return new WaitingLineException(message,"VARIABLES");
	}
	
	public String getType() {
		return type;
	}

}
