package progam;

import fila.Document;
import fila.WaitingLine;
import fila.WaitingLineException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ProgramPrint {

	public static void main(String[] args) {

		WaitingLine fila = new WaitingLine();
		Scanner sc = new Scanner(System.in);
		int choice = -1;

		try {
			fila.insert(new Document("ola dfdsjfhsd", "texte1", 1));
			fila.insert(new Document("ola dfdsjfhsd", "texte1", 1));
			fila.insert(new Document("ola dfdsjfhsd", "texte2", 2));
			fila.insert(new Document("ola dfdsjfhsd", "texte5", 5));
			fila.insert(new Document("ola funconando", "texte3", 3));
		} catch (WaitingLineException e) {
			System.out.println(e);
		}

		while (true) {
			try {

				switch (choice) {
				case -1:
					ShowMenu.cleanConsole();
					ShowMenu.showMenu();
					choice = sc.nextInt();
					break;
				case 1:
					ShowMenu.cleanConsole();
					ShowMenu.listPriority();
					choice = -1;
					break;
				case 2:
					ShowMenu.cleanConsole();
					ShowMenu.documentsNumber(fila);
					choice = -1;
					break;
				case 3:
					ShowMenu.cleanConsole();
					ShowMenu.showDocumentsDetails(fila);
					choice = -1;
					break;
				case 4:
					break;
				case 5:
					char decision;
					ShowMenu.cleanConsole();;
					ShowMenu.showDocumentDetails(fila.showFirst());
					System.out.print("Tem certeza que deseja imprimir o documento S/N :");
					decision = sc.next().charAt(0);
					decision = Character.toUpperCase(decision);
					if (decision == 'S') {
						fila.remove();
						choice = -1;
					} else {
						System.out.println("Voltando ao menu Principal...");
						choice = -1;
					}
					break;
				case 6:
					break;
				case 7:
					System.out.println("Saindo...");
					sc.close();
					return;
				default:
					System.out.println();
					System.out.println("  Opção digitada inválida !!!");
					choice = -1;
				}

			} catch (InputMismatchException e) {
				System.out.println("Entrada inválida. Por favor, digite um número.");
				sc.next();
			} catch (WaitingLineException e) {
				System.out.println("Erro ao processar sua operação!!!");
				System.out.println(e.getMessage());
				System.out.println("Voltando para o menu principal...");
				choice = -1;
			}
		}
	}

}
