package org.lessons.java.security;
import java.util.Scanner;

public class PasswordGenerator {

	public static void main(String[] args) {
		System.out.println("Welcome to Java Password Generator");
		System.out.println("-------------------------------------------");
		Scanner input = new Scanner (System.in);
		System.out.println("Inserisci il tuo nome :");
		String name = input.nextLine();
		System.out.println("-------------------------------------------");
		System.out.println("Inserisci il tuo cognome :");
		String lastName = input.nextLine();
		System.out.println("-------------------------------------------");
		System.out.println("Inserisci la tua data di nascita  :");
		System.out.println("Giorno (gg) :");
		int ageDay = input.nextInt();
		System.out.println("Mese (mm)  :");
		int ageMonth = input.nextInt();
		System.out.println("Anno (aaaa) :");
		int ageYear = input.nextInt();
		System.out.println("-------------------------------------------");
		input.nextLine();
		System.out.println("Inserisci il tuo colore preferito :");
		String favColor = input.nextLine() ;
		System.out.println("-------------------------------------------");
		int ageSum = ageDay + ageMonth + ageYear ;
		System.out.println(ageSum);
		System.out.println("La tua super sicurissima password è :");
		System.out.println(name + "-" + lastName + "-" + favColor + "-" + ageSum);
		System.out.println("-------------------------------------------");
		System.out.println("");
		System.out.println("Copyright ©  RaffoV 2024");
		
	}

}
