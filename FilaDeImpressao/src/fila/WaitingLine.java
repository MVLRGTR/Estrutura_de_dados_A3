package fila;

public class WaitingLine {

	private Document start = null;
	private Document end = null;
	private int positions = 0;
	
	public void insert(Document newDocument) {
		int cont = 0;
		Document temp = start;
		if(start == null) {
			start = newDocument;
			end = newDocument;
			positions++;
		}else {
			Document temp = start;
			int DocumentPriority = newDocument.getPriority().getPriorityInt();
			while(temp.getNext() != null && DocumentPriority >= temp.getPriority().getPriorityInt() && DocumentPriority >= temp.getNext().getPriority().getPriorityInt()) {
				temp = temp.getNext();
			}
			newDocument.setNext(temp.getNext());
			temp.setNext(newDocument);
			end = temp;
			positions++;
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
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Lista de Prioridade \n");
		Document temp = start;
		for(int i = 0 ; i < positions;i++) {
			sb.append(temp.getPriority().getPriorityInt() + "\n");
			temp = temp.getNext();
		}
		return sb.toString();
	}
	
}
