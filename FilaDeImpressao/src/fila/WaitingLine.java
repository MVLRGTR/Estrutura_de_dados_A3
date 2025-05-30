package fila;

public class WaitingLine {

	private Document start = null;
	private Document end = null;
	
	public void insertHeap(Document newDocument) throws WaitingLineException{
		WaitingLine filaAux = new WaitingLine();  //Aqui eu instancio a fila auxiliar para o corte da estrutura de dados

		if (start == null) {
			start = newDocument;
			end = newDocument;
		} else {
			boolean insert = false;
			Document temp = this.start;
			
			while(temp!=null) {
				if(!insert && newDocument.getPriority().getPriorityInt() < temp.getPriority().getPriorityInt()) {
					filaAux.insert(newDocument);
					insert = true;
				}
				filaAux.insert(temp);
				temp = temp.getNext();
			}
			if(!insert) {
				filaAux.insert(newDocument);
			}
			
			this.start = filaAux.showFirst();
			this.end = filaAux.showLast();
		}
		
	}

	public void insert(Document newDocument) throws WaitingLineException {
		if (start == null) {
			start = newDocument;
			end = newDocument;
		} else {
			end.setNext(newDocument);
			end = newDocument;
		}
	}

	public Document remove() throws WaitingLineException {
		if (!isEmpty()) {
			Document retVal = start;
			start = start.getNext();
			return retVal;
		}
		throw WaitingLineException.waitingLineIsEmpty("A fila está vazia remove !!!");
	}

	public Document showFirst() throws WaitingLineException {
		if (!isEmpty()) {
			return start;
		}
		throw WaitingLineException.waitingLineIsEmpty("A fila está vazia showFirst !!!");
	}

	public Document showLast() throws WaitingLineException {
		if (!isEmpty()) {
			return end;
		}
		throw WaitingLineException.waitingLineIsEmpty("A fila está vazia showLast !!!");
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
			for (int i = 0; i < this.size(); i++) {
				sb.append("* " + temp.getPriority().getPriorityInt() + "\n");
				temp = temp.getNext();
			}
			return sb.toString();
		}
	}
	
	/*private void updatePositions() throws WaitingLineException {
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
			throw WaitingLineException.waitingLineIsEmpty("A fila está vazia UpdatePositions !!!");
		}
	}
*/
}
