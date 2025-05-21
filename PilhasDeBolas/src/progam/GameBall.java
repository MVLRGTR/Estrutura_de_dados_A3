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
		
		System.out.println("Pilha7 , bola na posição 3 indice 0 : "+pilhas[6].getColorIndex(0));
		System.out.println("Pilha7 , bola na posição 3 indice 0 : "+pilhas[6].getColorIndex(1));
		System.out.println("Pilha7 , bola na posição 3 indice 0 : "+pilhas[6].getColorIndex(2));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*
		game.celarStacks(pilhas);
		
		for(int i = 0 ; i < 7 ; i++) {
			pilhas[i].showStack();
			System.out.println("-----------------------------------------------------------");
		}
		
		
		 Pilha[] pilhasWinner = new Pilha[7];
		for(int i= 0 ; i < 7 ; i++) {
			pilhasWinner[i] = new Pilha();
		}
		for(int i = 0 ; i < 7 ;i++) {
			try {
				pilhasWinner[i].stack(new Ball(i+1));
				pilhasWinner[i].stack(new Ball(i+1));
				pilhasWinner[i].stack(new Ball(i+1));
				pilhasWinner[i].stack(new Ball(i+1));
				pilhasWinner[i].stack(new Ball(i+1));
				pilhasWinner[i].stack(new Ball(i+1));
				pilhasWinner[i].stack(new Ball(i+1));
			}catch(StackExeption e) {
				System.out.println(e.getMessage());
			}
		}
		
		System.out.println("*-------------------------WINNER-------------------------*");
		System.out.println("Jogo ganho : "+game.verifyWinner(pilhasWinner));
		System.out.println("*-------------------------LOSER-------------------------*");
		try {
			pilhasWinner[2].unstack();
		}catch(StackExeption e) {
			System.out.println(e.getMessage());
		}
		
		try {
			pilhasWinner[2].stack(new Ball(2));;
		}catch(StackExeption e) {
			System.out.println(e.getMessage());
		}
		System.out.println("VerifyLoser : " + game.verifyWinner(pilhasWinner));
		 */
	}

}
