import java.util.Scanner;

public class simplebankingapplication {

    public static void main(String[] args) {
        double balance = 1000.0; // initial balance
        double saving balance=0.0//iitial saving
        double depositAmount, withdrawalAmount;
        String name;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to JamiiBank!");
        System.out.print("Please enter your name: ");
        name = scanner.nextLine();

        System.out.println("Hello, " + name + ". Your current balance is $" + balance);

        // main menu loop
        boolean exit = false;
        while (!exit) {
            System.out.println("Please choose an option:");
            System.out.println("1. Check balance");
            System.out.println("2. Deposit money");
            System.out.println("3. Withdraw money");
            System.out.println("4. Check savings balance");
             System.out.println("5. Deposit to savings");
             System.out.println("6. Withdraw from savings");
            System.out.println("7. Exit");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1: // check balance
                    System.out.println("Your current balance is $" + balance);
                    break;

                case 2: // deposit money
                    System.out.print("Enter the deposit amount: ");
                    depositAmount = scanner.nextDouble();
                    balance += depositAmount;
                    System.out.println("$" + depositAmount + " has been deposited into your account.");
                    System.out.println("Your current balance is $" + balance);
                    break;

                case 3: // withdraw money
                    System.out.print("Enter the withdrawal amount: ");
                    withdrawalAmount = scanner.nextDouble();
                    if (withdrawalAmount > balance) {
                        System.out.println("Insufficient funds. Your current balance is $" + balance);
                    } else {
                        balance -= withdrawalAmount;
                        System.out.println("$" + withdrawalAmount + " has been withdrawn from your account.");
                        System.out.println("Your current balance is $" + balance);
                    }
                    break;
                                       case 4: // check savings balance
                       System.out.println("Your current savings balance is $" + savingsBalance);
                       break;

                   case 5: // deposit to savings
                       System.out.print("Enter the deposit amount: ");
                       depositAmount = scanner.nextDouble();
                       savingsBalance += depositAmount;
                       System.out.println("$" + depositAmount + " has been deposited into your savings account.");
                       System.out.println("Your current savings balance is $" + savingsBalance);
                       break;

                   case 6: // withdraw from savings
                       System.out.print("Enter the withdrawal amount: ");
                       withdrawalAmount = scanner.nextDouble();
                       if (withdrawalAmount > savingsBalance) {
                           System.out.println("Insufficient funds. Your current savings balance is $" + savingsBalance);
                       } else {
                           savingsBalance -= withdrawalAmount;
                           System.out.println("$" + withdrawalAmount + " has been withdrawn from your savings account.");
                           System.out.println("Your current savings balance is $" + savingsBalance);
                       }
                       break;


                case 7: // exit
                    System.out.println("Thank you for using JamiiBank. Goodbye!");
                    exit = true;
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }

        scanner.close();
    }

}
