package iphone.telephone;

import java.util.Scanner;

public class Telephone {
	
	public void start(Scanner sc) {
		System.out.println("\n===Telefone===");
		int option = telephoneMenu(sc);
		switch (option) {
			case 1: 
				call(sc);
		}
	}
	
	public void call(Scanner sc) {
		System.out.println("Digite o numero (com DDD e sem espaços, 0 para cancelar): ");
		String numberCalled = sc.next();
			if ("0".equals(numberCalled)) {
				return;
			}
			else if (numberCalled.length() != 0) {
				System.out.println("Número Inválido");
			}
	}
	
	public boolean phoneNumberIsValid(String numberCalled) {
		return numberCalled != null && numberCalled.length() == 11;
	}

	public void answerThePhone() {
		// TODO Auto-generated method stub
		
	}

	public void startVoiceMail() {
		// TODO Auto-generated method stub
		
	}
	
	public int telephoneMenu (Scanner sc) {
		System.out.println("\nO que deseja fazer?");
		System.out.println("\n 1. Fazer ligação");
		System.out.println("2. Atender Ligação");
		System.out.println("3. Iniciar correio de voz");
		System.out.print("\nSelecione uma opção: ");
		
		return sc.nextInt();
	}
}
