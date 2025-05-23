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
				String originInput = sc.nextLine().trim();
				try {
                    originStack = Integer.parseInt(originInput) - 1;
                } catch (NumberFormatException e) {
                    System.out.println("Entrada inválida para a pilha de origem. Digite um número entre 1 e 7.");
                    continue; 
                }
				
		        System.out.print("Digite nº pilha (1-7) para poder colocar a bola :");
				String destinationInput = sc.nextLine().trim();
				try {
                    destinationStack = Integer.parseInt(destinationInput) - 1;
                } catch (NumberFormatException e) {
                    System.out.println("Entrada inválida para a pilha de destino. Digite um número entre 1 e 7.");
                    continue; 
                }
				game.changeBall(originStack, destinationStack);
				
			}catch(StackExeption e) {
				System.out.println(e.getMessage());
			}catch(InputMismatchException e) {
				System.out.println(e.getMessage());
			}
		}
		
	}

}
