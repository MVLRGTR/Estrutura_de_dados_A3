package progam;

import pilha.Ball;
import pilha.Pilha;
import pilha.StackExeption;

public class GameBall {

	public static void main(String[] args) {
		Pilha pilha = new Pilha();
		System.out.println("Empilhando dados...");
		try {
			pilha.stack(new Ball(1));
			pilha.stack(new Ball(2));
			pilha.stack(new Ball(3));
			pilha.stack(new Ball(4));
			pilha.stack(new Ball(5));
			pilha.stack(new Ball(6));
			pilha.stack(new Ball(7));
			pilha.stack(new Ball(8));
			
		}catch (StackExeption e) {
			System.out.println();
			System.out.println("-------------------------------------------");
			System.out.println(e.getMessage());
		}
		
		System.out.println();
		System.out.println("-------------------------------------------");
		System.out.println("Dsempilhando dados...");
		
		try {
			pilha.unstack();
			pilha.unstack();
			pilha.unstack();
			pilha.unstack();
			pilha.unstack();
			pilha.unstack();
			pilha.unstack();
			pilha.unstack();
			
		}catch(StackExeption e) {
			System.out.println();
			System.out.println("-------------------------------------------");
			System.out.println(e.getMessage());
		}
		
		pilha.showStack();

	}

}
