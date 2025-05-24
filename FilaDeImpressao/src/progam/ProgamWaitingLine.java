package progam;

import fila.Document;
import fila.WaitingLine;

public class ProgamWaitingLine {

	public static void main(String[] args) {
		WaitingLine queue = new WaitingLine();
		
		System.out.println("Colocando documentos na fila...");
		
		queue.insert(new Document("Ola mundo",2));
		queue.insert(new Document("Ola mundo",3));
		queue.insert(new Document("Ola mundo",4));
		queue.insert(new Document("Ola mundo",5));
		
		System.out.println("tamanho da fila : "+queue.size());
		
		System.out.println("primeiro documento prioridade : " +queue.showFirst().getPriority().name());
		

	}

}
