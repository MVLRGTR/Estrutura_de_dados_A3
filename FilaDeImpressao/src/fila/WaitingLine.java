package fila;

public class WaitingLine {

	private Document start = null;
	private Document end = null;
	
	
	public void insert(Document newDocument) {
		int cont = 0;
		Document temp = start;
		if(start == null) {
			start = newDocument;
			end = newDocument;
		}else {
			while(true) {
				
			}
		}
	}
	
	private void insertTo(int posi) {
		
	}
	
	public Document remove() {
		if(!isEmpty()) {
			Document retVal = start;
			start.setNext(retVal.getNext());
			return retVal;
		}
		return null;
	}
	
	public Document showFirst() {
		if(!isEmpty()) {
			return start;
		}
		return null;
	}
	
	public Document showLast() {
		if(!isEmpty()) {
			return end;
		}
		return null;
	}
	
	public boolean isEmpty() {
		return (start == null) ? true : false;
	}
	
	public int size() {
		int size = 0 ;
		Document aux = start;
		while(aux != null) {
			size++;
			aux=aux.getNext();
		}
		return size;
	}
	
}
