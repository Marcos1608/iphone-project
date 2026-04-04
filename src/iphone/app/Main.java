package iphone.app;

import java.util.Scanner;

import iphone.core.Iphone;

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
					iphone.openTelephone(sc);
					break;
				
				case 3:
					iphone.openWebBrowser(sc);
					break;
				
				case 4:
					iphone.turnOff();
					break;
					
			}
		}
	}

}
