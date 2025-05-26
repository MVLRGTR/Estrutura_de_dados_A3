package progam;

import fila.WaitingLine;
import fila.Document;

public class ProgramPrint {

	public static void main(String[] args) {
		
		WaitingLine fila = new WaitingLine();	
		
		fila.insert(new Document("primeira impressão",1));
		fila.insert(new Document("segunda impressão com prioridade 1",1));
		fila.insert(new Document("terceira impressão com prioridade 3",3));
		fila.insert(new Document("quarta impressão com prioridade 5",5));
		fila.insert(new Document("quinta impressão com prioridade 2",5));
		
		
		System.err.println(fila.toString());
	
	}

}
