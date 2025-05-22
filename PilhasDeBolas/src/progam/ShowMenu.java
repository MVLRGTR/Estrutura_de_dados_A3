package progam;

import pilha.Pilha;

public class ShowMenu {
	
	public static void showMenu() {
		System.out.println("=============== Bem vindo ao JOGO DE ORGANIZAR PILHAS DE BOLAS ===============");
		 System.out.println("1. Iniciar Jogo");
         System.out.println("2. Regras do Jogo");
         System.out.println("3. Sair");
         System.out.print("Escolha uma opção: ");
	}
	
	public static void showRules() {
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
	

	
	/*
	public static void showGameStacks(Pilha[] pilhas) {
		System.out.println("*----------------------------------GAME STACK BALL----------------------------------*");
		System.out.println("*                                                                                   *");
		System.out.println("*                                                                                   *");
		System.out.println("*   PILHA 1     PILHA 2     PILHA 3     PILHA 4     PILHA 5     PILHA 6     PILHA 7 *");
		System.out.println("*                                                                                   *");
		 System.out.printf("*    %-10s     %-10s      %-10s       %-10s       %-10s       %-10s       %-10s    \n*",pilhas[0].getColorIndex(0),pilhas[1].getColorIndex(0),pilhas[2].getColorIndex(0),pilhas[3].getColorIndex(0),pilhas[4].getColorIndex(0),pilhas[5].getColorIndex(0),pilhas[6].getColorIndex(0));
		 System.out.printf("*   |           |           |           |           |           |           |      \n*");
		 System.out.printf("*   %s          %s          %s          %s          %s          %s          %s     \n*",pilhas[0].getColorIndex(1),pilhas[1].getColorIndex(1),pilhas[2].getColorIndex(1),pilhas[3].getColorIndex(1),pilhas[4].getColorIndex(1),pilhas[5].getColorIndex(1),pilhas[6].getColorIndex(1));
		 System.out.printf("*   |           |           |           |           |           |           |      \n*");
		 System.out.printf("*   %s          %s          %s          %s          %s          %s          %s     \n*");
		 System.out.printf("*   |           |           |           |           |           |           |      \n*");
		 System.out.printf("*   %s          %s          %s          %s          %s          %s          %s     \n*");
		 System.out.printf("*   |           |           |           |           |           |           |      \n*");
		 System.out.printf("*   %s          %s          %s          %s          %s          %s          %s     \n*");
		 System.out.printf("*   |           |           |           |           |           |           |      \n*");
		 System.out.printf("*   %s          %s          %s          %s          %s          %s          %s     \n*");
		 System.out.printf("*   |           |           |           |           |           |           |      \n*");
		 System.out.printf("*   %s          %s          %s          %s          %s          %s          %s     \n*");
		 System.out.printf("*   |           |           |           |           |           |           |      \n*");
		System.out.println("*  ___         ___         ___         ___         ___         ___         ___    *");
		 
	}
*/
	
	public static void showGameStacks(Pilha[] pilhas) {
	    final int totalPilhas = 7;
	    final int alturaMaxima = 8;

	    System.out.println("*----------------------------------GAME STACK BALL----------------------------------*");
	    System.out.println("*                                                                                   *");
	    System.out.println("*                                                                                   *");

	    // Cabeçalho das pilhas
	    System.out.print("*");
	    for (int i = 0; i < totalPilhas; i++) {
	        System.out.printf("   PILHA %-2d ", i + 1);
	    }
	    System.out.println("  *");

	    System.out.println("*                                                                                   *");

	    // Conteúdo das pilhas
	    for (int nivel = 0; nivel < alturaMaxima; nivel++) {
	        System.out.print("*");
	        for (int i = 0; i < totalPilhas; i++) {
	            String cor = pilhas[i].getColorIndex(nivel);
	            if (cor == null) cor = "";
	            System.out.printf("   %-10s", cor); // alinhamento fixo de 10 caracteres
	        }
	        System.out.println("  *");

	        // Separadores entre níveis
	        System.out.print("*");
	        for (int i = 0; i < totalPilhas; i++) {
	            System.out.print("   |          ");
	        }
	        System.out.println(" *");
	    }

	    // Base das pilhas
	    System.out.print("*");
	    for (int i = 0; i < totalPilhas; i++) {
	        System.out.print("   ___        ");
	    }
	    System.out.println("*");
	}




	
}
