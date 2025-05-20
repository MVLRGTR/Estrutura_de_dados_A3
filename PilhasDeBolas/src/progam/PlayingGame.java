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
		
		for (int i = 0 ; i < 7 ; i++) {
			if(i==0) {
				for(int j = 0 ; j < 7 ; j++) {
					pilhas[i].stack(new Ball(this.randomColor()));
				}
				currentColor = pilhas[i].showTop().getColor();
				lastColor = pilhas[i].showTop().getColor();
				System.out.println("Pilha : "+i+" "+pilhas[i].toString());
			}else {
				do {
					for(int j = 0 ; j < 7 ; j++) {
						pilhas[i].stack(new Ball(this.randomColor()));
					}
					currentColor = pilhas[i].showTop().getColor();
				}while(currentColor == lastColor);
				if(currentColor==lastColor) {
					for(int k = 0 ; k < 7 ; k++) {
						pilhas[i].unstack();
					}
				}
				lastColor=currentColor;
			}
		}
	}
	
}
