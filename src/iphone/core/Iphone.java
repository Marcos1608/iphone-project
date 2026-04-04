package iphone.core;

import java.util.Scanner;

import iphone.browser.WebBrowser;
import iphone.music.MusicPlayer;
import iphone.telephone.Telephone;

public class Iphone {

	private boolean IphoneIsOn = true;
	
	MusicPlayer musicPlayer = new MusicPlayer();
	Telephone telephone = new Telephone();
	WebBrowser webBrowser = new WebBrowser();
	
	public void openMusicPlayer(Scanner sc) {
		musicPlayer.start(sc);
	}
	
	public void openTelephone(Scanner sc) {
		telephone.start(sc);
	}
	
	public void openWebBrowser(Scanner sc) {
		webBrowser.start();
	}
	
	public boolean isOn() {
		return IphoneIsOn;
	}
	
	public void turnOff() {
		IphoneIsOn = false;
	}
	
	public int showMenu(Scanner sc) {
		System.out.println("\n====Tela Inicial====");
		System.out.println("\n====Aplicativos====");
		System.out.println("\n1. Player de Música");
		System.out.println("2. Telefone");
		System.out.println("3. Navegador de Internet");
		System.out.println("4. Desligar o Iphone");
		System.out.print("\nEscolha um Aplicativo: ");
		
		while (!sc.hasNextInt()) {
	        System.out.println("\nEntrada inválida! Digite um número.");
	        sc.next();
	        System.out.print("\nEscolha um Aplicativo: ");
	    }
		
		return sc.nextInt();
	}
	
}
