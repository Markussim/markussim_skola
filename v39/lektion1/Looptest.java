package lektion1;

import java.util.Scanner;

public class Looptest {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		String namn;

		System.out.println("Vad heter du?");

		namn = input.nextLine();

		System.out.println("Ålder?");

		String alder;

		alder = input.nextLine();

		String adress;

		System.out.println("Adress?");

		adress = input.nextLine();

		String past;

		System.out.println("Postnummer?");

		past = input.nextLine();

		String stad;

		System.out.println("Stad?");

		stad = input.nextLine();

		String tele;

		System.out.println("Telefon?");

		tele = input.nextLine();

		System.out.println("Namn\t" + namn + "\nÅlder\t" + alder + "\nAdress\t" + adress + "\nPostn\t" + past
				+ "\nStad\t" + stad + "\nTelefon\t" + tele);

	}

}