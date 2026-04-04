package iphone.music;

import java.util.List;
import java.util.Scanner;

import iphone.music.enums.PlayerAction;
import iphone.music.model.Music;

public class MusicPlayer {
	
	private boolean playingMusic = false;
	private boolean closeApp = false;
	private List<Music> musics = List.of(
		    new Music("Cliffs of Dover", "Eric Johnson"),
		    new Music("Holding On", "Dragonforce"),
		    new Music("Phoenix", "Stratovarius")
		);

	public void start(Scanner sc) {
			
		System.out.println("\n===Music Player===");
		closeApp = false;
		while (!closeApp){
			if (!playingMusic) {
				handleMusicSelection(sc);
				continue;
			}
			handleMusicControl(sc);
		}
	}
	
	private void handleMusicSelection(Scanner sc) {
	    int selectedMusic = showMenu(sc);
	    choiceOfMusic(selectedMusic);
	}
	
	private void handleMusicControl(Scanner sc) {
	    int selectedOption = showMusicOptions(sc);
	    controlMusic(selectedOption);
	}
	
	private int showMenu(Scanner sc) {
		for (int i = 0; i < musics.size(); i++) {
		    System.out.println((i + 1) + ". " + musics.get(i));
		}
	    int exitOption = musics.size() + 1;
	    System.out.println("\n" + exitOption + ". Sair");

	    System.out.print("\nQual música deve tocar?: ");
	    isAnOption(sc);
	    return sc.nextInt();
	}
	
	private void choiceOfMusic(int musicOption) {
		if (musicOption >= 1 && musicOption <= musics.size()) {
			playingMusic = true;
			int musicIndex = musicOption - 1;
			System.out.println("\nTocando: " + musics.get(musicIndex));
			return;
		}
		if (musicOption == 4) {
		        closeApp = true;
		        return;
		    }
		System.out.println("Opção inválida");
		}
	
	private int showMusicOptions(Scanner sc) {
		System.out.println("\n1. Pausar\n2. Retomar\n3. Parar");
		isAnOption(sc);
		return sc.nextInt();
	}
	
	private void controlMusic(int optionChosen) {
	    try {
	        PlayerAction action = PlayerAction.fromInt(optionChosen);
	        action.execute();
	        if (optionChosen == 3) playingMusic = false;
	    } catch (IllegalArgumentException e) {
	        System.out.println(e.getMessage());
	    }
	}
	
	private void isAnOption(Scanner sc) {
		while (!sc.hasNextInt()) {
	        sc.next();
	        System.out.println("Opção Inválida.");
	    }
	}
	
}


















