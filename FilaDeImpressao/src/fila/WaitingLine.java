package fila;

public class WaitingLine {

	private Document start = null;
	private Document end = null;
	private int positions = 0;
	
	public void insertHeap(Document newDocument) throws WaitingLineException{
		WaitingLine filaAux = new WaitingLine();  //Aqui eu instancio a fila auxiliar para o corte da estrutura de dados
		Document temp = start;
		int cont = 0 ;
		if (start == null) {
			start = newDocument;
			end = newDocument;
			positions++;
		} else {
			int DocumentPriority = newDocument.getPriority().getPriorityInt();
			int insertionPosition = 2;
			//----------------------
			while (temp.getNext() != null && DocumentPriority >= temp.getPriority().getPriorityInt()
					&& DocumentPriority >= temp.getNext().getPriority().getPriorityInt()) {
				temp = temp.getNext();
				cont++;
				System.out.println("while");
			}
			//----------------------
			for(int i = 0 ; i < cont+1 ; i++) {
				filaAux.insert(this.remove());
				System.out.println("for");
			}
			//----------------------
			if(this.isEmpty()) {
				start = filaAux.getStart();
			}else {
				filaAux.insert(newDocument);
				filaAux.end.setNext(this.start);
				start = filaAux.showFirst();
			}
			
		}
	}

	public void insert(Document newDocument) throws WaitingLineException {
		if (start == null) {
			start = newDocument;
			end = newDocument;
			positions++;
		} else {
			end.setNext(newDocument);
			end = newDocument;
			positions++;
		}
	}

	public Document remove() throws WaitingLineException {
		if (!isEmpty()) {
			Document retVal = start;
			start = start.getNext();
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
	
	private void updatePositions() throws WaitingLineException {
		if(!isEmpty()) {
			Document aux = start;
			int position = 1;
			while(aux != null) {
				aux.setInsertPosition(position);
				position++;
				if(aux.getNext() == null) {
					end = aux;
				}
				aux=aux.getNext();
			}
		}else {
			throw WaitingLineException.waitingLineIsEmpty("A fila está vazia !!!");
		}
	}

	private Document getStart() {
		return start;
	}

	private void setStart(Document start) {
		this.start = start;
	}

	private Document getEnd() {
		return end;
	}

	private void setEnd(Document end) {
		this.end = end;
	}
	

}
