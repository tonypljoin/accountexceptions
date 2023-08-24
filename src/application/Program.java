package application;

import java.util.Scanner;

import model.entities.Account;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter account data");
		System.out.print("Number: ");
		int number = sc.nextInt();
		System.out.print("Holder: ");
		sc.nextLine();
		String holder = sc.nextLine();
		System.out.print("Inicial balance: ");
		double balance = sc.nextDouble();
		System.out.print("Withdraw limit: ");
		double limit = sc.nextDouble();
		Account account = new Account(number, holder, balance, limit);

		System.out.println();
		System.out.print("Enter amount for withdraw: ");
		double amount = sc.nextDouble();
		account.withdraw(amount);
		System.out.printf("New balance: %.2f",account.getBalance());

		
		


		
		
		
		
		
		sc.close();

	}

}
