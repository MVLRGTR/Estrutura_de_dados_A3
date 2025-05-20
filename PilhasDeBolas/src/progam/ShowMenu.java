package progam;

public class ShowMenu {
	
	public static void showMenu() {
		System.out.println("=============== Bem vindo ao JOGO DE ORGANIZAR PILHAS DE BOLAS ===============");
		 System.out.println("1. Iniciar Jogo");
         System.out.println("2. Regras do Jogo");
         System.out.println("3. Sair");
         System.out.print("Escolha uma opção: ");
	}
	
	public static void mostrarRegras() {
        System.out.println("=============== REGRAS DO JOGO ===============");
        System.out.println("- O objetivo é separar todas as bolas por cor, organizando-as dentro de pilhas específicas.");
        System.out.println("- O jogo possui 7 pilhas, sendo uma delas inicialmente vazia.");
        System.out.println("- Cada pilha pode conter até 7 bolas.");
        System.out.println("- As bolas devem ser movidas uma de cada vez.");
        System.out.println("- Uma pilha só pode conter bolas de uma única cor.");
        System.out.println("- Se todas as pilhas estiverem organizadas por cor, o jogador vence!");
        System.out.println("Pressione Enter para voltar ao menu...");
    }
	
	public void cleanConsole() {
		for (int i = 0; i < 50; i++) {
	        System.out.println();
	    }
	}

}
