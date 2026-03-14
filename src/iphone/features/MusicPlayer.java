package iphone.features;

import java.util.Scanner;

public class MusicPlayer {
	
	private boolean playingMusic = false;
	private boolean paused = false;
	private String[] musics = {"Cliffs of Dover - Eric Johnson", 
							   "Holding On - Dragonforce", 
							   "Phoenix - Stratovarius"};
	
	public void setPlayingMusic(boolean playingMusic) {
		this.playingMusic = playingMusic;
	}

	public boolean isPlayingMusic() {
		return playingMusic;
	}

	public String getMusics(int option) {
		return musics[option - 1];
	}	
	
	public void start(Scanner sc) {
			
		System.out.println("\nBem Vindo ao Player de Música!");
		int musicOption;
		while (true){
			if (playingMusic == false) {
				musicOption = musicChoiceMenu(sc);
				if (musicOption > 0 && musicOption < 4) {
					playingMusic = true;
					System.out.println("\nTocando: " + musics[musicOption - 1]);
				}
				else if (musicOption <= 0 || musicOption >= 5){
					System.out.println("Opção Inválida");
				}
				else {
					break;
				}
			}
			else {
				int musicOptionMenu = showMusicMenu(sc);
				if (musicOptionMenu != 3) {
					musicMenuOptionChoise(musicOptionMenu);
				}
				else {
					System.out.println("A música parou");
					playingMusic = false;
				}
			}
		}
	}
	
	public int musicChoiceMenu(Scanner sc) {
		System.out.println("\n1. Cliffs of Dover - Eric Johnson");
		System.out.println("2. Holding On - Dragonforce");
		System.out.println("3. Phoenix - Stratovarius");
		System.out.println("4. para sair do app");
		System.out.print("\nQual música deve tocar?: ");
		return sc.nextInt();
	}
	
	public int showMusicMenu(Scanner sc) {
		System.out.println("\n1. Pausar\n2. Retomar\n3. Parar");
		return sc.nextInt();
	}
	
	public void musicMenuOptionChoise(int choise) {
		if (choise == 1 && paused == false) {
			paused = true;
			System.out.println("A Música foi pausada.");
		}
		else if (choise == 1 && paused == true) {
			System.out.println("A música já está pausada!");
		}
		else if (choise == 2 && paused == true) {
			paused = false;
			System.out.println("A música foi retomada.");
		}
		else if (choise == 2 && paused == false) {
			System.out.println("A Música já está tocando!");
		}else {
			System.out.println("Opção Inválida!");
		}
	}
	
}


















