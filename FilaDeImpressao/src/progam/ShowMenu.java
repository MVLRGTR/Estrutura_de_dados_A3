package progam;

import fila.WaitingLine;
import fila.WaitingLineException;
import java.util.Scanner;

import fila.Document;

public class ShowMenu {
	
	public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_BLUE = "\u001B[34m";
	
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
		System.out.println();
		try {
			Document temp = fila.showFirst();
			while(temp != null) {
				System.out.printf("*========== %-10s ==========*\n",temp.getTitle());
				System.out.println("* Posição na Fila => "+cont);
				System.out.printf("* Prioridade => %d : %s \n",temp.getPriority().getPriorityInt(),temp.getPriority().name());
				System.out.println("* Conteúdo do Documento : ");
				System.out.println(temp.getContent());
				System.out.println();
				temp = temp.getNext();
				cont++;
			}
		}catch (WaitingLineException e) {
			System.out.println(e.getMessage());
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
	
	public static void addNewDocument(Scanner sc,WaitingLine fila) {
		while(true) {
			try {
				System.out.println("*=============================Cadastrar Documento==============================*");
				System.out.println();
				
				sc.nextLine();
				System.out.print(ANSI_GREEN+"Digite o titulo do documento : " +ANSI_RESET);
				String title = sc.nextLine();
				
				System.out.println();
				
				
				System.out.printf(ANSI_GREEN+"Digite o conteudo do documento : "+ANSI_RESET);
				String content = sc.nextLine();
				System.out.println();
				
				ShowMenu.listPriority();
				System.out.print(ANSI_GREEN+"Digite a prioridade do documento :"+ANSI_RESET);
				int priority = sc.nextInt();
				
				Document document =  new Document(content,title,priority);
				fila.insert(document);
				return;
			}catch (IllegalArgumentException e) {
				System.out.println("Formato digitado invalido !!!");
				System.out.println(e.getMessage());
			}catch (WaitingLineException e) {
				System.out.println(e.getMessage());
			}
		}
	}

}
