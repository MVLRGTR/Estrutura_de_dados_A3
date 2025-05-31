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
			//a inserção heap e feita da seguinte forma ,com a fila original [115] e filaAux [] e precisando adicionar 3 em modos heap , então eu 
			//venho tirando os elementos da fila principal e colocando na filaAux com o loop while e venho testando quando a prioridade do elemento atual e menor do que o elemento
			//que eu estou retirando da fila e caso isso ocorra eu sei onde eu preciso inserir o elemento novo filaAux , vou fazer um exemplo abaixo.
			//
			//   FILA[1,1,5] E FILAAUX[] INSERT 3
			//1º 3 É MENOR QUE 1 = FALSE || FILA[1,5] E FILAAUX[1] 
			//2º 3 É MENOR QUE 1 = FALSE || FILA[5] E FILAAUX[1,1] 
			//3º 3 É MENOR QUE 5 = TRUE  || FILA[5] E FILAAUX[1,1,3,5]  // NESSE MOMENTO O IF DO LOOP É ACIONADO E ENTÃO EU INSIRO O ELEMENTO3 E DEPOIS 0 5 MANTENDO A ORDEM HEAP
			//DEPOIS DESSE PROCESSO EU ATUALIZO OS PONTEIROS FAZENDO COM QUE A FILA ATUAL RECEBA AUX.
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
