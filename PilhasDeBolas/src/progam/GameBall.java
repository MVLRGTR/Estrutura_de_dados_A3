package progam;

import pilha.Ball;
import pilha.Pilha;
import pilha.StackExeption;

public class GameBall {

	public static void main(String[] args) {
		Pilha[] pilhas = new Pilha[7];

		for (int i = 0; i < pilhas.length; i++) {
			pilhas[i] = new Pilha();
		}

		PlayingGame game = new PlayingGame();

		try {
			game.initStacks(pilhas);
		} catch (StackExeption e) {
			System.out.println("Erro ao preencher as pilhas: " + e.getMessage());
		}
		
		for(int i = 0 ; i < 7 ; i++) {
			pilhas[i].showStack();
			System.out.println("-----------------------------------------------------------");
		}
		
		game.celarStacks(pilhas);
		
		for(int i = 0 ; i < 7 ; i++) {
			pilhas[i].showStack();
			System.out.println("-----------------------------------------------------------");
		}
		
		System.out.println("Ceiando um pilha winner...");
		Pilha pilhaWinner = new Pilha();
		try {
			pilhaWinner.stack(new Ball(3));
			pilhaWinner.stack(new Ball(3));
			pilhaWinner.stack(new Ball(3));
			pilhaWinner.stack(new Ball(3));
			pilhaWinner.stack(new Ball(3));
			pilhaWinner.stack(new Ball(3));
			pilhaWinner.stack(new Ball(4));
			pilhaWinner.stack(new Ball(4));
			
		}catch(StackExeption e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("pilhaWinner : "+pilhaWinner.winnerStack());
		
	}

}
