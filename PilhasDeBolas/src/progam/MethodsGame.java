package progam;

import java.util.Random;

import pilha.Ball;
import pilha.ColorBall;
import pilha.Pilha;
import pilha.StackExeption;

public class MethodsGame {

	Pilha[] pilhas = new Pilha[7];
	private int countBlue = 0, countGreen = 0, countYellow = 0, countOrange = 0, countPurple = 0, countRed = 0;

	public MethodsGame() {
	}

	public int randomColor() {
		Random random = new Random();
		int randomNumber = random.nextInt(6) + 1;
		return randomNumber;
	}

	public void initStacks() throws StackExeption {
		ColorBall currentColor = null, lastColor = null;
		boolean opt = false;

		for (int i = 0; i < pilhas.length; i++) {
			pilhas[i] = new Pilha();
		}

		countBlue = countGreen = countYellow = countOrange = countPurple = countRed = 0;

		for (int i = 0; i < 6; i++) {
			do {
				pilhas[i].clear();

				for (int j = 0; j < 7; j++) {
					pilhas[i].stack(new Ball(this.randomColor()));
				}

				if (i == 0) {
					currentColor = pilhas[i].showTop().getColor();
					lastColor = pilhas[i].showTop().getColor();
				} else {
					currentColor = pilhas[i].showTop().getColor();
				}

				opt = numberColors(pilhas[i]);

			} while (i != 0 && currentColor == lastColor || !opt);

			// Se passou, atualiza os contadores com os valores da pilha atual
			updateColorCounts(pilhas[i]);
			lastColor = currentColor;
		}
	}

	public void clearStacks(Pilha[] pilhas) {
		for (int i = 0; i < 7; i++) {
			pilhas[i].clear();
		}
	}

	public boolean verifyWinner() {
		int cont = 0;
		for (int i = 0; i < 7; i++) {
			if (pilhas[i].winnerStack()) {
				cont++;
			}
		}
		if (cont == 6) {
			return true;
		} else {
			return false;
		}
	}

	public void changeBall(int posi1, int posi2) throws StackExeption { // LEMBRAR PARA TRABALHAR COM INDICE 0
		if (posi1 == posi2) {
			throw StackExeption.operationInvalid("\n\nVocê não pode tirar uma bola para colocar na mesma pilha !!!");
		}
		if (posi1 < 0 || posi1 > 6 || posi2 < 0 || posi2 > 6) {
			throw StackExeption.operatorInvalid("\n\nO valor digitado para as pilhas é Invalido !!!");
		}
		if (pilhas[posi1].isEmpty()) {
			throw StackExeption.stackIsEmpty("\n\nError : Pilha selecionada está vazia !!!");
		}
		if (pilhas[posi2].isFull()) {
			throw StackExeption.stackItsFull("\n\nError : Pilha de destino selecionada está cheia !!!");
		}
		Ball temp = pilhas[posi1].unstack();
		temp.setNext(null);
		pilhas[posi2].stack(temp);
	}

	public Pilha[] getStacks() {
		return pilhas;
	}

	public void showStacks() {
		for (int i = 0; i < 7; i++) {
			pilhas[i].showStack();
			System.out.println("-----------------------------------------------------------");
		}
	}

	public boolean numberColors(Pilha pilha) {
		// Simula contadores temporários
		int tempBlue = countBlue;
		int tempGreen = countGreen;
		int tempYellow = countYellow;
		int tempOrange = countOrange;
		int tempPurple = countPurple;
		int tempRed = countRed;

		for (int j = 0; j < 7; j++) {
			switch (pilha.getColorIndex(j)) {
				case "BLUE":
					if (++tempBlue > 7)
						return false;
					break;
				case "GREEN":
					if (++tempGreen > 7)
						return false;
					break;
				case "YELLOW":
					if (++tempYellow > 7)
						return false;
					break;
				case "ORANGE":
					if (++tempOrange > 7)
						return false;
					break;
				case "PURPLE":
					if (++tempPurple > 7)
						return false;
					break;
				case "RED":
					if (++tempRed > 7)
						return false;
					break;
				default:
					return false;
			}
		}
		return true;
	}

	public void updateColorCounts(Pilha pilha) {
		for (int j = 0; j < 7; j++) {
			switch (pilha.getColorIndex(j)) {
				case "BLUE":
					countBlue++;
					break;
				case "GREEN":
					countGreen++;
					break;
				case "YELLOW":
					countYellow++;
					break;
				case "ORANGE":
					countOrange++;
					break;
				case "PURPLE":
					countPurple++;
					break;
				case "RED":
					countRed++;
					break;
			}
		}
	}

}
