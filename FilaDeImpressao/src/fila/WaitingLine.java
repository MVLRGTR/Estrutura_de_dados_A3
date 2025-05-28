package fila;

public class WaitingLine {

	private Document start = null;
	private Document end = null;
	private int positions = 0;

	public void insert(Document newDocument) {
		Document temp = start;
		if (start == null) {
			start = newDocument;
			end = newDocument;
			positions++;
		} else {
			int DocumentPriority = newDocument.getPriority().getPriorityInt();
			while (temp.getNext() != null && DocumentPriority >= temp.getPriority().getPriorityInt()
					&& DocumentPriority >= temp.getNext().getPriority().getPriorityInt()) {
				temp = temp.getNext();
			}
			newDocument.setNext(temp.getNext());
			temp.setNext(newDocument);
			end = temp;
			positions++;
		}
	}

	public Document remove() throws WaitingLineException {
		if (!isEmpty()) {
			Document retVal = start;
			start.setNext(retVal.getNext());
			return retVal;
		}
		throw WaitingLineException.waitingLineIsEmpty("A fila está vazia !!!");
	}

	public Document showFirst() throws WaitingLineException {
		if (!isEmpty()) {
			return start;
		}
		throw WaitingLineException.waitingLineIsEmpty("A fila está vazia !!!");
	}

	public Document showLast() throws WaitingLineException {
		if (!isEmpty()) {
			return end;
		}
		throw WaitingLineException.waitingLineIsEmpty("A fila está vazia !!!");
	}

	public boolean isEmpty() {
		return (start == null) ? true : false;
	}

	public int size() {
		int size = 0;
		Document aux = start;
		while (aux != null) {
			size++;
			aux = aux.getNext();
		}
		return size;
	}

	public String toString() {
		if (isEmpty()) {
			return "Não podemos imprimir a fila pois ela está vazia";
		} else {
			StringBuilder sb = new StringBuilder();
			sb.append("Lista de Prioridade \n");
			Document temp = start;
			for (int i = 0; i < positions; i++) {
				sb.append("* " + temp.getPriority().getPriorityInt() + "\n");
				temp = temp.getNext();
			}
			return sb.toString();
		}
	}

}
