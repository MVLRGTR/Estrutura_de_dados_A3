package progam;

import java.util.Random;

import pilha.Ball;
import pilha.ColorBall;
import pilha.Pilha;
import pilha.StackExeption;

public class PlayingGame {
	
	public int randomColor() {
		Random random = new Random();
		int randomNumber = random.nextInt(7)+1;
		return randomNumber;
	}
	
	public void initStacks(Pilha[] pilhas) throws StackExeption {
		ColorBall currentColor = null, lastColor = null;
		
		for(int i = 0 ; i < 7 ; i++) {
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
	
	public boolean verifyWinner(Pilha[] pilhas) {
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
	
	public void changeBall(Pilha[] pilhas,int posi1 , int posi2) throws StackExeption { //LEMBRAR PARA TRABALHAR COM INDICE 0
		pilhas[posi2].stack(pilhas[posi1].unstack());
	}
	
	
}
