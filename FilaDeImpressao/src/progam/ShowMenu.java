package progam;

public class ShowMenu {
	
	public static void showMenu() {
		System.out.println("*=============================Menu fila HEAP=============================*");
		System.out.println("*                                                                        *");
		System.out.println("* 1 - Listar Prioridades                                                 *");
		System.out.println("* 2 - Documentos Na fila                                                 *");
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
	

}
