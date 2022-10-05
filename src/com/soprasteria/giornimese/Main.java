package com.soprasteria.giornimese;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nomeMese;
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("Inserisci il nome del mese: ");
		nomeMese = s.nextLine();
		
		if(nomeMese.equalsIgnoreCase("gennaio"))
			System.out.println("Numero giorni: " + 31);
		else if(nomeMese.equalsIgnoreCase("febbraio"))
			System.out.println("Numero giorni: " + 28);
		else if(nomeMese.equalsIgnoreCase("marzo"))
			System.out.println("Numero giorni: " + 31);
		else if(nomeMese.equalsIgnoreCase("aprile"))
			System.out.println("Numero giorni: " + 30);
		else if(nomeMese.equalsIgnoreCase("maggio"))
			System.out.println("Numero giorni: " + 31);
		else if(nomeMese.equalsIgnoreCase("giugno"))
			System.out.println("Numero giorni: " + 30);
		else if(nomeMese.equalsIgnoreCase("luglio"))
			System.out.println("Numero giorni: " + 31);
		else if(nomeMese.equalsIgnoreCase("agosto"))
			System.out.println("Numero giorni: " + 31);
		else if(nomeMese.equalsIgnoreCase("settembre"))
			System.out.println("Numero giorni: " + 30);
		else if(nomeMese.equalsIgnoreCase("ottobre"))
			System.out.println("Numero giorni: " + 31);
		else if(nomeMese.equalsIgnoreCase("novembre"))
			System.out.println("Numero giorni: " + 30);
		else if(nomeMese.equalsIgnoreCase("dicembre"))
			System.out.println("Numero giorni: " + 31);
	}

}
