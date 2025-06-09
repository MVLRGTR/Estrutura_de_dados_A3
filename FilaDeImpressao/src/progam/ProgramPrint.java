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
			fila.insertHeap(new Document("Nasceu numa família judaica russa que perdeu suas rendas com a Guerra Civil Russa e se viu obrigada a emigrar em decorrência da perseguição a judeus, que, à época, resultou em diversos extermínios em massa. A futura escritora chegou ao Brasil, ainda pequena, em 1922, com seus pais e suas duas irmãs.[nota 1] Clarice dizia não ter nenhuma ligação com a Ucrânia — \"Naquela terra eu literalmente nunca pisei: fui carregada de colo\" — e que sua verdadeira pátria era o Brasil. Inicialmente, a família passou um breve período em Maceió, até se mudar para o Recife, onde Clarice cresceu e onde, aos oito anos, perdeu a mãe.[9][10][11] Aos quatorze anos de idade, transferiu-se com o pai e as irmãs para o Rio de Janeiro, na Tijuca, na Rua Mariz e Barros, 241, local onde a família se estabilizou e onde o seu pai viria a falecer, em 1940.", "Clarice Lispector", 1));
			fila.insertHeap(new Document("Clóvis de Barros Filho (Ribeirão Preto, 21 de outubro de 1965) é um jornalista, filósofo e professor livre-docente na área de Ética da Escola de Comunicações e Artes da Universidade de São Paulo (ECA-USP). Dentre seus livros, publicou \"Ética na Comunicação\" (Summus, 2008), é co-autor de \"O Habitus na Comunicação\" (Paulus, 2003) e organizador de \"Comunicação na Polis\" (Vozes, 2002)", "Clóvis de Barros Filho", 1));
			fila.insertHeap(new Document("Revelado pelo Santos em 2009, desde cedo correspondeu às expectativas e conquistou diversos títulos com o clube, incluindo dois Campeonatos Paulistas seguidos, uma Copa do Brasil e uma Libertadores, sendo esta a primeira do Peixe desde 1963.", "Neymar Jr", 2));
			fila.insertHeap(new Document("Decorria o ano de 1993 quando um grupo de empresários se associou e decidiu comprar algumas máquinas, equipamentos e um terreno perto da rodovia Br 040 - Km 51. Aproveitando o clima ameno da região serrana, a existência de água de qualidade excepcional e fazendo uso dos excelentes conhecimentos  de um mestre cervejeiro e de matéria-prima importada de alta qualidade, é lançada em 1994 a cerveja Itaipava", "Itaipava", 5));
			fila.insertHeap(new Document("mais conhecido como Cacá Bueno (Rio de Janeiro, 24 de julho de 1976), é um automobilista brasileiro, campeão da Stock Car Light (1997), pentacampeão da Stock Car Brasil (2006, 2007, 2009, 2011 e 2012) e tricampeão da Copa Fiat (2010, 2011, 2012). É irmão de Popó Bueno, também piloto da Stock Car, e filho mais velho do narrador e apresentador de televisão Galvão Bueno. ", "Cacá Bueno", 3));
			fila.insertHeap(new Document("No ano de 2007, durante o auge de sua carreira, foi o vencedor dos prêmios de melhor jogador do mundo pela FIFA e pelo Ballon d'Or, entregue pela revista francesa France Football, premiações que posteriormente foram unificadas. Em 2008 e em 2010, foi eleito uma das personalidades mais influentes do ano no mundo pela Time 100.[4][5] Kaká sempre foi habitualmente convocado à Seleção Brasileira.","Kaká",4));
			fila.insertHeap(new Document("Considerado o narrador esportivo de maior popularidade do Brasil, ao mesmo tempo que é alvo de críticas por ufanismos e exageros, é famoso por ter narrado momentos relevantes e históricos do esporte nacional. Entre esses eventos estão a conquista do tetra e o pentacampeonato mundial da Seleção Brasileira de Futebol, os títulos mundiais da Fórmula 1 e o acidente fatal do piloto brasileiro Ayrton Senna em 1994, vitórias de times brasileiros em Libertadores da América e Mundiais de Clubes, além de vários Jogos Olímpicos da era moderna.","Galvão Bueno",3));;
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
					char decision;
					ShowMenu.cleanConsole();
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
				case 5:
					ShowMenu.cleanConsole();
					ShowMenu.addNewDocument(sc, fila);
					choice = -1;
					break;
				case 6:
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
