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
			fila.insert(new Document("ola dfdsjfhsd","texte1",1));
			fila.insert(new Document("ola dfdsjfhsd","texte1",1));
			fila.insert(new Document("ola dfdsjfhsd","texte2",2));
			fila.insert(new Document("ola dfdsjfhsd","texte5",5));
		}catch(WaitingLineException e) {
			System.out.println(e);
		}
		try {

			while (true) {
				switch (choice) {
				case -1:
					ShowMenu.showMenu();
					choice = sc.nextInt();
					break;
				case 1:
					ShowMenu.cleanConsole();
					ShowMenu.listPriority();
					System.out.print("Digite qualquer letra ou numero para voltar ao menu...");
					sc.next();
					ShowMenu.cleanConsole();
					choice = -1;
					break;
				case 2:
					ShowMenu.cleanConsole();
					ShowMenu.documentsNumber(fila);
					System.out.print("Digite qualquer letra ou numero para voltar ao menu...");
					sc.next();
					ShowMenu.cleanConsole();
					choice = -1;
					break;
				case 3:
					ShowMenu.showDocumentsDetails(fila);
					System.out.print("Digite qualquer letra ou numero para voltar ao menu...");
					sc.next();
					ShowMenu.cleanConsole();
					choice = -1;
					break;
				case 4:
					break;
				case 5:
					try {
						char decision;
						ShowMenu.showDocumentDetails(fila.showFirst());
						System.out.print("Tem certeza que deseja imprimir o documento S/N :");
						decision = sc.next().charAt(0);
						decision = Character.toUpperCase(decision);
						if(decision == 'S') {
							System.out.println("Entrou aqui");
							fila.remove();
						}else {
							System.out.println("Voltando ao menu Principal...");
							choice = -1;
						}
						
					}catch(WaitingLineException e) {
						System.out.println("Erro ao processar sua operação!!!");
						System.out.println(e);
						System.out.println("Voltando para o menu principal...");
					}catch(InputMismatchException e) {
						System.out.println(e.getMessage());
					}
					break;
				case 6:
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


	}

}
