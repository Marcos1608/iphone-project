package iphone.main;

import java.util.Scanner;

public class Main {

	private static boolean iphoneLigado = true;
	private static boolean musicaTocando = false;
	private static int option;
	
	public static void main(String[] args) {
		
		Iphone iphone = new Iphone();
		Scanner sc = new Scanner(System.in);
		
		while (iphoneLigado == true) {
			System.out.println("\n====Tela Inicial====");
			System.out.println("\n====Aplicativos====");
			System.out.println("1. Player de Música");
			System.out.println("2. Telefone");
			System.out.println("3. Navegador de Internet");
			System.out.println("4. Desligar o Iphone");
			System.out.print("Escolha um Aplicativo: ");
			option = sc.nextInt();
			
			switch (option) {
				
				case 1:
					System.out.println("\nBem Vindo ao Player de Música!");
					if (musicaTocando == false) {
						System.out.println("\n1. Cliffs of Dover - Eric Johnson");
						System.out.println("2. Holding On - Dragonforce");
						System.out.println("3. Phoenix - Stratovarius");
						System.out.print("\nQual música deve tocar?:");
						var musicOption = sc.nextInt();
						var musicaEscolhida = iphone.selecionarMusica(musicOption);
						System.out.println("\nTocando " + musicaEscolhida);
						musicaTocando = true;
						continue;
						
						//TODO: Talvez terei de construir o Player de música dentro de um While para que
						//quando musicaTocando = true, vá para as opções de pausar e tocar.
						
					}
					
				case 2:
					System.out.println("\nTeste 2");
					continue;
					
				case 3:
					System.out.println("\nTeste 3");
					continue;
					
				case 4:
					iphoneLigado = false;
					continue;
					
				default:
					System.out.println("\nAplicativo Inexistente!");
					continue;
			}
			
		}
	}

}
