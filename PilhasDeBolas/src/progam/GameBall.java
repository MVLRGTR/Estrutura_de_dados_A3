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
		
		
		System.out.println("chamando o metodo changeBall para pilha6 indice 5 metodo desempilhar e empilhar pilha7 indice 6...");
		try {
			game.changeBall(pilhas, 5, 6);
		}catch(StackExeption e) {
			System.out.println(e);
		}
		
		ShowMenu.showGameStacks(pilhas);
	}

}
