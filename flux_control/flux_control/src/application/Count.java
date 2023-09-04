package application;

import java.util.Locale;
import java.util.Scanner;

import exceptions.InvalidParametersException;

public class Count {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the first number: ");
		int num1 = sc.nextInt();
		
		System.out.print("Enter the second number: ");
		int num2 = sc.nextInt();
		
		try {
			count(num1, num2);
		} catch(InvalidParametersException e) {
			System.out.println(e.getMessage());
		}
		
		sc.close();
	}
	
	public static void count(int num1, int num2) throws InvalidParametersException{
		if(num1 > num2) {
			throw new InvalidParametersException();
		}
		
		for(int i = 0; i < num2 - num1; i++) {
			System.out.println("Printing number " + (i+1));
		}
	}

}
