package progam;

import fila.WaitingLine;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ProgramPrint {

	public static void main(String[] args) {

		WaitingLine fila = new WaitingLine();
		Scanner sc = new Scanner(System.in);
		int choice = -1;

		try {

			while (true) {

				switch (choice) {
				case -1:
					ShowMenu.showMenu();
					choice = sc.nextInt();
				case 1:
					break;
				case 2:
					break;
				case 3:
					break;
				case 7:
					System.out.println("Saindo...");
					sc.close();
					return;
				default:
					System.out.println("Opção digitada inválida");
					choice = -1;
				}

			}

		}  catch (InputMismatchException e) {
			System.out.println("Entrada inválida. Por favor, digite um número.");
			sc.next();
		}

		System.out.println(fila.toString());

	}

}
