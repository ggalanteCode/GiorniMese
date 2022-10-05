package com.soprasteria.giornimese;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nomeMese;
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("Inserisci il nome del mese: ");
		nomeMese = s.nextLine();
		
		if(nomeMese.equalsIgnoreCase("gennaio") ||
				nomeMese.equalsIgnoreCase("marzo") ||
				nomeMese.equalsIgnoreCase("maggio") ||
				nomeMese.equalsIgnoreCase("luglio") ||
				nomeMese.equalsIgnoreCase("agosto") ||
				nomeMese.equalsIgnoreCase("ottobre") ||
				nomeMese.equalsIgnoreCase("dicembre"))
			System.out.println("Numero giorni: " + 31);
		else if(nomeMese.equalsIgnoreCase("febbraio"))
			System.out.println("Numero giorni: " + 28);
		else if(nomeMese.equalsIgnoreCase("aprile") ||
				nomeMese.equalsIgnoreCase("giugno") ||
				nomeMese.equalsIgnoreCase("settembre") ||
				nomeMese.equalsIgnoreCase("novembre"))
			System.out.println("Numero giorni: " + 30);
	}

}
