package progam;

import java.time.Duration;
import java.util.List;

import pilha.Pilha;

public class ShowMenu {
	
	public static void showMenu() {
		System.out.println("*=============== Bem vindo ao JOGO DE ORGANIZAR PILHAS DE BOLAS ==========================*");
		 System.out.println("1. Iniciar Jogo");
         System.out.println("2. Regras do Jogo");
         System.out.println("3. Mostrar tempos");
         System.out.println("4. Sair do jogo");
         System.out.println("OBS : Dentro do jogo caso deseje voltar para o menu digite exit na pilha de tirar bola !!!");
         System.out.println("*========================================================================================*");
         System.out.print("Escolha uma opção: ");
         
	}
	
	public static void showRules() {
        System.out.println("*===================================== REGRAS DO JOGO =====================================*");
        System.out.println("- O objetivo é separar todas as bolas por cor, organizando-as dentro de pilhas específicas.");
        System.out.println("- O jogo possui 7 pilhas, sendo uma delas inicialmente vazia.");
        System.out.println("- Cada pilha pode conter até 7 bolas.");
        System.out.println("- As bolas devem ser movidas uma de cada vez.");
        System.out.println("- Uma pilha só pode conter bolas de uma única cor.");
        System.out.println("- Se todas as pilhas estiverem organizadas por cor, o jogador vence!");
        System.out.println("*==========================================================================================*");
        System.out.println("Digite um numero qualquer para voltar ao menu...");
    }
	
	public static void cleanConsole() {
		for (int i = 0; i < 3; i++) {
	        System.out.println();
	    }
	}
	
	public static void showGameStacks2(Pilha[] pilhas) {
		System.out.println("*------------------------------------GAME STACK BALL---------------------------------------*");
		System.out.println("*                                                                                      *");
		System.out.println("*                                                                                      *");
		System.out.println("*     PILHA 1     PILHA 2     PILHA 3     PILHA 4     PILHA 5     PILHA 6     PILHA 7  *");
		System.out.println("*                                                                                      *");
		 System.out.printf("*      %-10s    %-10s       %-10s       %-10s       %-10s       %-10s       %-10s     \n*",pilhas[0].getColorIndex(0),pilhas[1].getColorIndex(0),pilhas[2].getColorIndex(0),pilhas[3].getColorIndex(0),pilhas[4].getColorIndex(0),pilhas[5].getColorIndex(0),pilhas[6].getColorIndex(0));
		 System.out.printf("*     |           |           |           |           |           |           |       \n*");
		 System.out.printf("*      %-10s    %-10s       %-10s       %-10s       %-10s       %-10s       %-10s     \n*",pilhas[0].getColorIndex(1),pilhas[1].getColorIndex(1),pilhas[2].getColorIndex(1),pilhas[3].getColorIndex(1),pilhas[4].getColorIndex(1),pilhas[5].getColorIndex(1),pilhas[6].getColorIndex(1));
		 System.out.printf("*     |           |           |           |           |           |           |       \n*");
		 System.out.printf("*      %-10s    %-10s       %-10s      %-10s        %-10s       %-10s       %-10s     \n*",pilhas[0].getColorIndex(2),pilhas[1].getColorIndex(2),pilhas[2].getColorIndex(2),pilhas[3].getColorIndex(2),pilhas[4].getColorIndex(2),pilhas[5].getColorIndex(2),pilhas[6].getColorIndex(2));
		 System.out.printf("*     |           |           |           |           |           |           |       \n*");
		 System.out.printf("*      %-10s    %-10s       %-10s       %-10s       %-10s       %-10s       %-10s     \n*",pilhas[0].getColorIndex(3),pilhas[1].getColorIndex(3),pilhas[2].getColorIndex(3),pilhas[3].getColorIndex(3),pilhas[4].getColorIndex(3),pilhas[5].getColorIndex(3),pilhas[6].getColorIndex(3));
		 System.out.printf("*     |           |           |           |           |           |           |       \n*");
		 System.out.printf("*      %-10s    %-10s       %-10s       %-10s       %-10s       %-10s       %-10s     \n*",pilhas[0].getColorIndex(4),pilhas[1].getColorIndex(4),pilhas[2].getColorIndex(4),pilhas[3].getColorIndex(4),pilhas[4].getColorIndex(4),pilhas[5].getColorIndex(4),pilhas[6].getColorIndex(4));
		 System.out.printf("*     |           |           |           |           |           |           |       \n*");
		 System.out.printf("*      %-10s    %-10s       %-10s       %-10s       %-10s       %-10s       %-10s     \n*",pilhas[0].getColorIndex(5),pilhas[1].getColorIndex(5),pilhas[2].getColorIndex(5),pilhas[3].getColorIndex(5),pilhas[4].getColorIndex(5),pilhas[5].getColorIndex(5),pilhas[6].getColorIndex(5));
		 System.out.printf("*     |           |           |           |           |           |           |       \n*");
		 System.out.printf("*      %-10s    %-10s       %-10s       %-10s       %-10s       %-10s       %-10s     \n*",pilhas[0].getColorIndex(6),pilhas[1].getColorIndex(6),pilhas[2].getColorIndex(6),pilhas[3].getColorIndex(6),pilhas[4].getColorIndex(6),pilhas[5].getColorIndex(6),pilhas[6].getColorIndex(6));
		 System.out.printf("*     |           |           |           |           |           |           |       \n*");
		System.out.println("*    ___         ___         ___         ___         ___         ___         ___        *");
		 
	}
	
	public static void showGameStacks(Pilha[] pilhas) {
	    System.out.println("*------------------------------------GAME STACK BALL------------------------------------*");
	    System.out.println("* *");
	    System.out.println("* *");
	    System.out.println("* PILHA 1     PILHA 2     PILHA 3     PILHA 4     PILHA 5     PILHA 6     PILHA 7  *");
	    System.out.println("* *");
	    for (int i = 0; i < 7; i++) {
	        System.out.printf("* %-10s  %-10s  %-10s  %-10s  %-10s  %-10s  %-10s     *\n",
	                pilhas[0].getColorIndex(i),
	                pilhas[1].getColorIndex(i),
	                pilhas[2].getColorIndex(i),
	                pilhas[3].getColorIndex(i),
	                pilhas[4].getColorIndex(i),
	                pilhas[5].getColorIndex(i),
	                pilhas[6].getColorIndex(i));
	        if (i < 6) {
	            System.out.println("*   |           |           |           |           |           |           |       *");
	        }
	    }
	    System.out.println("*   |           |           |           |           |           |           |         *");
	    System.out.println("*  ___         ___         ___         ___         ___         ___         ___        *");
	}
	
	public static void showTimes(List<Duration> durationGames) {
		ShowMenu.cleanConsole();
		System.out.println("*=========================Mostrando seus tempos=========================*");
		for(int i = 0 ; i < durationGames.size() ; i++) {
			System.out.println("Tempo total de jogo: " + durationGames.get(i).toMinutes() + " min " + durationGames.get(i).getSeconds() % 60 + " seg");
		}
		ShowMenu.cleanConsole();
	}
	
}
