package progam;

import java.util.InputMismatchException;
import java.util.Scanner;

import pilha.StackExeption;

public class PlayingGame {
	
	private MethodsGame game;
	private Scanner sc;
	
	public PlayingGame(MethodsGame game , Scanner sc) {
		this.game = game;
		this.sc = sc;
	}
	
	public boolean startGame() {
		int originStack ;
		int destinationStack;
		int originTemp =1;
		int destinationTemp=1;
		
		try {
			game.initStacks();
		}catch(StackExeption e) {
			System.out.println(e.getMessage());
		}
		
		sc.nextLine();
		
		while(!game.verifyWinner() ) {
			
			try {
				ShowMenu.cleanConsole();
				ShowMenu.showGameStacks(game.getStacks());
				
				System.out.print("Digite nº pilha (1-7) para poder tirar a bola :");
				String originInput = sc.nextLine().trim();
				if (originInput.equals("exit")) {
                    System.out.println("Voltando ao menu principal...");
                    return false;
                }
				originStack = Integer.parseInt(originInput) - 1;
			
				
		        System.out.print("Digite nº pilha (1-7) para poder colocar a bola :");
				String destinationInput = sc.nextLine().trim();
				destinationStack = Integer.parseInt(destinationInput) - 1;
				
				if(originStack == destinationTemp && destinationStack == originTemp) {
					throw StackExeption.operatorInvalid("Error : Você não pode fazer essa operação , pois ela viola a regra do rollback!!!");
				}else {
					game.changeBall(originStack, destinationStack);
					originTemp=originStack;
					destinationTemp=destinationStack;
				}
		
				
			}catch(StackExeption e) {
				System.err.println(e.getMessage());
			}catch(InputMismatchException e) {
				System.err.println(e.getMessage());
			}catch(NumberFormatException e) {
				System.err.println("Entrada inválida para a pilha . Digite um número entre 1 e 7.");
			}
		}
		ShowMenu.cleanConsole();
		ShowMenu.showGameStacks(game.getStacks());

		System.out.println(ShowMenu.TEXT_GREEN+"=-=-=-=-=-=-=-=-=-=-=-= VITÓRIA =-=-=-=-=-=-=-=-=-=-=");
		System.out.println(ShowMenu.TEXT_GREEN+"=-=-=--=-=-=-Parabéns, você ganhou o jogo!=-=-=-=-=-=-");
		System.out.println(ShowMenu.TEXT_GREEN+"=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-="+ShowMenu.RESET);

		
		return true; 
		
	}

}