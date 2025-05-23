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
	
	public void startGame() {
		int originStack;
		int destinationStack;
		
		try {
			game.initStacks();
		}catch(StackExeption e) {
			System.out.println(e.getMessage());
		}
		
		while(!game.verifyWinner()) {
			
			try {
				ShowMenu.cleanConsole();
				ShowMenu.showGameStacks(game.getStacks());
				System.out.print("Digite nº pilha (1-7) para poder tirar a bola :");
				originStack = sc.nextInt();
				originStack-=1;
				System.out.print("Digite nº pilha (1-7) para poder colocar a bola :");
				destinationStack = sc.nextInt();
				destinationStack-=1;
				game.changeBall(originStack, destinationStack);
				
			}catch(StackExeption e) {
				System.out.println(e.getMessage());
			}catch(InputMismatchException e) {
				System.out.println(e.getMessage());
			}
		}
		
	}

}
