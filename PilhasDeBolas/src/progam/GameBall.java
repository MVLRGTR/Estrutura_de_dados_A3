package progam;

import java.util.InputMismatchException;
import java.util.Scanner;

public class GameBall {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		MethodsGame game = new MethodsGame();
		int choice=-1;
		
		while(true) {
			try {
				switch(choice) {
					
				case -1:
					ShowMenu.showMenu();
					choice = sc.nextInt();
					break;
				
				case 1:
					PlayingGame playinGame = new PlayingGame(game, sc);
					playinGame.startGame();
					choice =-1;
					break;
					
				case 2:
					ShowMenu.cleanConsole();
					ShowMenu.showRules();
					sc.next();
					sc.nextLine();
					choice =-1;
					break;
				
				case 3:
					System.out.println("Saindo do jogo...");
					sc.close();
					return;
					
				default:
					System.out.println("Opção digitada inválida");
					choice = -1;
				}
				
			}catch(InputMismatchException e) {
				System.out.println("Entrada inválida. Por favor, digite um número.");
                sc.next();
			}
		}
			
	}

}
