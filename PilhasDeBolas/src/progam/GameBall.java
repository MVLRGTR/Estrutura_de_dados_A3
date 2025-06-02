package progam;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class GameBall {
	
	private static boolean winner = false;
	private static LocalDateTime startTime;
	private static LocalDateTime endTime;
	private static List<Duration> durationGames = new ArrayList<>();

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		MethodsGame game = new MethodsGame();
		int choice=-1;
		
		while(true) {
			try {
				switch(choice) {
					
				case -1:
					ShowMenu.showMenu();
					choice = sc.nextInt();
					break;
				
				case 1:
					PlayingGame playinGame = new PlayingGame(game, sc);
					startTime = LocalDateTime.now();
					winner = playinGame.startGame();
					endTime = LocalDateTime.now();
					if(winner == true) {
						Duration duration = Duration.between(startTime, endTime);
						long minutes = duration.toMinutes();
						long remainingSeconds = duration.getSeconds() % 60;
						durationGames.add(duration);
						System.out.println("Tempo total de jogo: " + minutes + " min " + remainingSeconds + " seg");
					}
					choice =-1;
					break;
					
				case 2:
					ShowMenu.cleanConsole();
					ShowMenu.showRules();
					sc.next();
					sc.nextLine();
					choice =-1;
					break;
				
				case 3:
					if(!durationGames.isEmpty()) {
						ShowMenu.showTimes(durationGames);	
					}else {
						System.out.println();
						System.out.println("Você ainda não tem nenhum jogo !!!");
						System.out.println();
					}
					choice =-1;
					break;
					
				case 4:
					System.out.println("Saindo do jogo...");
					sc.close();
					return;
					
				default:
					System.out.println("Opção digitada inválida");
					choice = -1;
				}
				
			}catch(InputMismatchException e) {
				System.out.println("Entrada inválida. Por favor, digite um número.");
                sc.next();
			}
		}
			
	}

}
