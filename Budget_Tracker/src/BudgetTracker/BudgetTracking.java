package BudgetTracker;

import java.util.Scanner;

/**
 * The BudgetTracker.BudgetTracking class provides a command-line interface for managing a budget.
 * It allows users to add income, add expenses, view transaction history, check the current balance,
 * and exit the application.
 */
public class BudgetTracking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Tracker tracker = new Tracker();

        while (true) {
            // Display the menu
            System.out.println("\nBudget BudgetTracker.Tracker Menu:");
            System.out.println("1. Add Income");
            System.out.println("2. Add Expense");
            System.out.println("3. View Transactions");
            System.out.println("4. View Balance");
            System.out.println("5. Exit");

            System.out.print("Select an option: ");
            int option = sc.nextInt(); // Read the user's menu selection
            sc.nextLine(); // Consume the newline character

            switch (option) {
                case 1:
                    System.out.print("Enter the source of income: ");
                    String source = sc.nextLine();
                    System.out.print("Enter the amount: ");
                    double amount = sc.nextDouble();
                    tracker.addIncome(source, amount);
                    break;

                case 2:
                    System.out.print("Enter the expense description: ");
                    String expense = sc.nextLine();
                    System.out.print("Enter the amount: ");
                    double expenseAmount = sc.nextDouble();
                    tracker.addExpense(expense, expenseAmount);
                    break;

                case 3:
                    tracker.viewTransactions();
                    break;

                case 4:
                    tracker.viewBalance();
                    break;

                case 5:
                    tracker.exit();
                    break;

                default:
                    System.out.println("Invalid option, please try again.");
            }
        }
    }
}
