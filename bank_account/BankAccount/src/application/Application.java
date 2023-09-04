package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class Application {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Please, enter your name: ");
		String name = sc.nextLine();
		System.out.print("Enter the number of your account: ");
		int number = sc.nextInt();
		sc.nextLine();
		System.out.print("Enter your agency: ");
		String agency = sc.nextLine();
		System.out.print("Enter your balance: ");
		float balance = sc.nextFloat();
		
		Account acc = new Account(number, agency, name, balance);
		
		System.out.println(acc.toString());
		
		sc.close();
	}

}
