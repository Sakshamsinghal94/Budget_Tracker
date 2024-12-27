package BudgetTracker;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * The BudgetTracker.Tracker class provides a simple way to manage financial transactions.
 * It allows users to add income, add expenses, view all transactions, check the current balance,
 * and terminate the program.
 */
public class Tracker {

    // List to store transaction records
    private List<String> transactions = new ArrayList<>();

    // Tracks the total balance
    private BigDecimal balance = BigDecimal.ZERO;

    /**
     * Adds an income transaction to the tracker.
     *
     * @param source the source of the income (e.g., salary, investment, etc.)
     * @param amount the amount of income to be added (must be greater than zero)
     */
    public void addIncome(String source, double amount) {
        if (amount <= 0) {
            System.out.println("Amount must be greater than zero.");
            return;
        }

        transactions.add(formatTransaction("Income", source, amount));
        balance = balance.add(BigDecimal.valueOf(amount));
        System.out.println("Income added successfully.");
    }

    /**
     * Adds an expense transaction to the tracker.
     *
     * @param expense the description of the expense (e.g., groceries, rent, etc.)
     * @param amount the amount of the expense to be deducted (must be greater than zero)
     */
    public void addExpense(String expense, double amount) {
        if (amount <= 0) {
            System.out.println("Amount must be greater than zero.");
            return;
        }
        transactions.add(formatTransaction("Expense", expense, amount));
        balance = balance.subtract(BigDecimal.valueOf(amount));
        System.out.println("Expense added successfully.");
    }

    /**
     * Displays all recorded transactions in the tracker.
     * If no transactions are recorded, a message is displayed to indicate this.
     */
    public void viewTransactions() {
        if (transactions.isEmpty()) {
            System.out.println("No records found.");
        } else {
            System.out.println("Transactions:");
            for (String transaction : transactions) {
                System.out.println(transaction);
            }
        }
    }

    /**
     * Displays the current balance.
     * The balance is displayed with precision using BigDecimal.
     */
    public void viewBalance() {
        System.out.println("The remaining balance is: " + balance);
    }

    /**
     * Exits the program after displaying a goodbye message.
     * This method terminates the application using {@link System#exit(int)}.
     */
    public void exit() {
        System.out.println("Exiting the program. Thank you!");
        System.exit(0);
    }

    /**
     * Helper method to format a transaction string.
     *
     * @param type the type of transaction (e.g., "Income", "Expense")
     * @param description a short description of the transaction
     * @param amount the amount involved in the transaction
     * @return a formatted string representing the transaction
     */
    private String formatTransaction(String type, String description, double amount) {
        return String.format("%s: %s | Amount: %.2f", type, description, amount);
    }
}
