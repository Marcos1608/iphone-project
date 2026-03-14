package iphone.main;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Iphone iphone = new Iphone();
		Scanner sc = new Scanner(System.in);
		
		while (iphone.isOn()) {
			
			//Menu Principal do Iphone
			int option = iphone.showMenu(sc);
	
			switch (option) {
				
			//Player de Música
				case 1:
					
					iphone.openMusicPlayer(sc);
					break;
					
				case 2:
					//TODO
					break;
				
				case 3:
					//TODO
					break;
				
				case 4:
					iphone.turnOff();
					break;
					
				default:
					System.out.println("\nAplicativo Inexistente!");
					continue;
			}
			
		}
	}

}
