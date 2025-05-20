package progam;

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

	}

}
