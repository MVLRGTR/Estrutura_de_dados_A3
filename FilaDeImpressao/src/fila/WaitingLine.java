package fila;

public class WaitingLine {

	private Document start = null;
	private Document end = null;
	
	
	public void insert(Document newDocument) {
		if(start == null) {
			start = newDocument;
			end = newDocument;
		}else {
			
		}
	}
	
	
	
	
}
