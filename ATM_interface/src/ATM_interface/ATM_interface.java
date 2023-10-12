package ATM_interface;


	import java.util.Scanner;
	public class ATM_interface {
	

	    private static double balance = 1000.0; // Initial balance

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        while (true) {
	            System.out.println("Welcome to the ATM!");
	            System.out.println("1. Check Balance");
	            System.out.println("2. Deposit");
	            System.out.println("3. Withdraw");
	            System.out.println("4. Exit");
	            System.out.print("Please select an option (1/2/3/4): ");

	            int choice = scanner.nextInt();

	            switch (choice) {
	                case 1:
	                    checkBalance();
	                    break;
	                case 2:
	                    deposit(scanner);
	                    break;
	                case 3:
	                    withdraw(scanner);
	                    break;
	                case 4:
	                    System.out.println("Thank you for using the ATM. Goodbye!");
	                    scanner.close();
	                    System.exit(0);
	                default:
	                    System.out.println("Invalid option. Please select a valid option.");
	            }
	        }
	    }

	    private static void checkBalance() {
	        System.out.println("Your balance is: $" + balance);
	    }

	    private static void deposit(Scanner scanner) {
	        System.out.print("Enter the amount to deposit: $");
	        double amount = scanner.nextDouble();
	        if (amount > 0) {
	            balance += amount;
	            System.out.println("Deposit successful. Your new balance is: $" + balance);
	        } else {
	            System.out.println("Invalid deposit amount. Please enter a positive amount.");
	        }
	    }

	    private static void withdraw(Scanner scanner) {
	        System.out.print("Enter the amount to withdraw: $");
	        double amount = scanner.nextDouble();
	        if (amount > 0 && amount <= balance) {
	            balance -= amount;
	            System.out.println("Withdrawal successful. Your new balance is: $" + balance);
	        } else {
	            System.out.println("Invalid withdrawal amount or insufficient balance.");
	        }
	    }
	}


