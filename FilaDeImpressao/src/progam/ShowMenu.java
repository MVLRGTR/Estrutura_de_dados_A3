package progam;

import fila.WaitingLine;
import fila.WaitingLineException;
import fila.Document;

public class ShowMenu {
	
	public static void showMenu() {
		System.out.println("*=============================Menu fila HEAP=============================*");
		System.out.println("*                                                                        *");
		System.out.println("* 1 - Listar Prioridades                                                 *");
		System.out.println("* 2 - Nº Documentos Na fila                                              *");
		System.out.println("* 3 - Mostra Documentos da fila de forma detalhada                       *");
		System.out.println("* 4 - Exportar fila para um aquivo                                       *");
		System.out.println("* 5 - Imprimir Documento 		                                         *");
		System.out.println("* 6 - Colocar Documento na fila                                          *");
		System.out.println("* 7 - Sair do Progama                                                    *");
		System.out.println("*                                                                        *");
		System.out.print("* Digite a Opção desejada :");
	}
	
	public static void cleanConsole() {
		for (int i = 0; i < 3; i++) {
	        System.out.println();
	    }
	}
	
	public static void listPriority() {
		System.out.println("*=============================Lista de Prioridade==============================*");
		System.out.println("* 1 URGENT  => Tem prioridade acima de todos os outros.                        *");
		System.out.println("* 2 HIGHT   => Prioridade nível alto.                                          *");
		System.out.println("* 3 NORMAL  => Prioridade Normal.                                              *");
		System.out.println("* 4 LOW     => Prioridade baixa.                                               *");
		System.out.println("* 5 VERYLOW => Prioridade muito baixa.                                         *");
		System.out.println("*==============================================================================*");
	}
	
	public static void documentsNumber(WaitingLine fila) {
		System.out.println("*============ Mostrando fila ============*");
		System.out.println("* Número total de Documentos : "+fila.size());
		System.out.println(fila.toString());
	}
	
	public static void showDocumentsDetails(WaitingLine fila) {
		int cont = 1;
		ShowMenu.cleanConsole();
		System.out.println("*========================= Mostrando Documentos Fila Heap =========================*");
		try {
			Document temp = fila.showFirst();
			while(temp != null) {
				System.out.printf("*========== %-10s ==========*\n",temp.getTitle());
				System.out.println("* Número do Documento na Fila => "+cont);
				System.out.printf("* Prioridade => %d : %s \n",temp.getPriority().getPriorityInt(),temp.getPriority().name());
				System.out.println("* Conteúdo do Documento : ");
				System.out.println(temp.getContent());
				System.out.println();
				temp = temp.getNext();
				cont++;
			}
		}catch (WaitingLineException e) {
			System.out.println(e);
		}
	}
	
	
	public static void showDocumentDetails(Document document) {
		System.out.printf("*========== %-10s ==========*\n",document.getTitle());
		System.out.println("* Número do Documento na Fila => "+document.getInsertPosition());
		System.out.printf("* Prioridade => %d : %s \n",document.getPriority().getPriorityInt(),document.getPriority().name());
		System.out.println("* Conteúdo do Documento : ");
		System.out.println(document.getContent());
		System.out.println();
	}

}
