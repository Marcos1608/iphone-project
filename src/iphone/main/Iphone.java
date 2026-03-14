package iphone.main;

import java.util.Scanner;

import iphone.features.MusicPlayer;
import iphone.features.Telephone;
import iphone.features.WebBrowser;

public class Iphone {

	private boolean IphoneIsOn = true;
	
	MusicPlayer musicPlayer = new MusicPlayer();
	Telephone telephone = new Telephone();
	WebBrowser webBrowser = new WebBrowser();
	
	public MusicPlayer getMusicPlayer() {
		return musicPlayer;
	}
	
	
	public Telephone getTelephone() {
		return telephone;
	}


	public WebBrowser getWebBrowser() {
		return webBrowser;
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
		System.out.print("Escolha um Aplicativo: ");
		
		return sc.nextInt();
	}
	
	public void openMusicPlayer(Scanner sc) {
		musicPlayer.start(sc);
	}
	
	
}
