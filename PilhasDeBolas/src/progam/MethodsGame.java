package progam;

import java.util.Random;

import pilha.Ball;
import pilha.ColorBall;
import pilha.Pilha;
import pilha.StackExeption;

public class MethodsGame {
	
	Pilha[] pilhas = new Pilha[7];
	
	public MethodsGame() {
	}
	
	public int randomColor() {
		Random random = new Random();
		int randomNumber = random.nextInt(7)+1;
		return randomNumber;
	}
	
	public void initStacks() throws StackExeption {
		ColorBall currentColor = null, lastColor = null;
		
		for (int i = 0; i < pilhas.length; i++) {
			pilhas[i] = new Pilha();
		}
		
		for(int i = 0 ; i < 6 ; i++) {
			do {
				pilhas[i].clear();
				
				for(int j = 0 ; j < 7 ; j++) {
					pilhas[i].stack(new Ball(this.randomColor()));
				}
				
				if(i==0) {
					currentColor = pilhas[i].showTop().getColor();
					lastColor = pilhas[i].showTop().getColor();
				}else {
					currentColor = pilhas[i].showTop().getColor();
				}
				
			}while(i!=0 && currentColor == lastColor);
			lastColor = currentColor;
		}
	}
	
	public void clearStacks(Pilha[] pilhas) {
		for(int i = 0 ; i < 7 ; i++) {
			pilhas[i].clear();
		}
	}
	
	public boolean verifyWinner() {
		int cont = 0;
		for(int i = 0 ; i < 7 ; i++) {
			if(!pilhas[i].winnerStack()) {
				return false;
			}
			cont++;
		}
		if(cont==7) {
			return true;
		}else {
			return false;
		}
	}
	
	public void changeBall(int posi1 , int posi2) throws StackExeption { //LEMBRAR PARA TRABALHAR COM INDICE 0
		if(posi1==posi2) {
			throw StackExeption.operationInvalid("Você não pode tirar uma bola para colocar na mesma pilha !!!");
		}
		if(posi1 < 0 || posi1 > 6 || posi2 < 0 || posi2 > 6 ) {
			throw StackExeption.operatorInvalid("O valor digitado para as pilhas é Invalido !!!");
		}
		Ball temp = pilhas[posi1].unstack();
		temp.setNext(null);
		pilhas[posi2].stack(temp);
	}
	
	public Pilha[] getStacks() {
		return pilhas;
	}
	
	public void showStacks() {
		for(int i = 0 ; i < 7 ; i++) {
			pilhas[i].showStack();
			System.out.println("-----------------------------------------------------------");
		}
	}
	
}
