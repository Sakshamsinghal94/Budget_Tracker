<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Budget Tracker</title>
</head>
<body>
    <h1>Budget Tracker</h1>
    <p>A simple and intuitive console-based application to manage personal finances by tracking income, expenses, and budgets.</p>

    <hr>

    <h2>Features</h2>
    <ul>
        <li><strong>Add Income</strong>: Record income sources with details like amount, source, and date.</li>
        <li><strong>Add Expenses</strong>: Log expenses with categories (e.g., Food, Travel, Rent), amounts, and dates.</li>
        <li><strong>View Summary</strong>: Display current income, expenses, and remaining budget in real-time.</li>
        <li><strong>Search Transactions</strong>: Find specific income or expense records by date or category.</li>
        <li><strong>Save & Load Data</strong>: Persist data to a file for future reference and reload when needed.</li>
    </ul>

    <hr>

    <h2>Technologies Used</h2>
    <ul>
        <li><strong>Language</strong>: Java</li>
        <li><strong>File Handling</strong>: Used for saving and retrieving transaction records.</li>
        <li><strong>OOP Concepts</strong>: Designed using Object-Oriented Programming principles.</li>
        <li><strong>Collections Framework</strong>: Used for managing and organizing transaction data.</li>
    </ul>

    <hr>

    <h2>Installation</h2>
    <ol>
        <li>Clone the repository:
            <pre><code>git clone https://github.com/yourusername/budget-tracker.git</code></pre>
        </li>
        <li>Navigate to the project directory:
            <pre><code>cd budget-tracker</code></pre>
        </li>
        <li>Compile the Java files:
            <pre><code>javac BudgetTracker.java</code></pre>
        </li>
        <li>Run the application:
            <pre><code>java BudgetTracker</code></pre>
        </li>
    </ol>

    <hr>

    <h2>How to Use</h2>
    <ol>
        <li>Launch the application from your terminal.</li>
        <li>Follow the on-screen instructions to:
            <ul>
                <li>Add income or expenses.</li>
                <li>View or search transactions.</li>
                <li>Save data to a file.</li>
            </ul>
        </li>
        <li>Exit the application when done, and your data will be securely stored for the next session.</li>
    </ol>

    <hr>

    <h2>Sample Usage</h2>
    <pre>
<code>
Welcome to Budget Tracker!

1. Add Income
2. Add Expense
3. View Summary
4. Search Transactions
5. Save & Exit

Enter your choice: 1

Enter income amount: 5000
Enter source: Salary
Enter date (YYYY-MM-DD): 2024-12-27
Income added successfully!
</code>
    </pre>

    <hr>

    <h2>Future Enhancements</h2>
    <ul>
        <li>Implement database integration for better data management.</li>
        <li>Add support for multiple users/accounts.</li>
        <li>Generate visual reports using graphical libraries.</li>
    </ul>

    <hr>

    <h2>Contributing</h2>
    <p>Contributions are welcome!</p>
    <ol>
        <li>Fork the repository.</li>
        <li>Create a new branch:
            <pre><code>git checkout -b feature-name</code></pre>
        </li>
        <li>Commit your changes:
            <pre><code>git commit -m "Add your message"</code></pre>
        </li>
        <li>Push to the branch:
            <pre><code>git push origin feature-name</code></pre>
        </li>
        <li>Open a pull request.</li>
    </ol>

    <hr>

    <h2>License</h2>
    <p>This project is licensed under the <a href="LICENSE">MIT License</a>.</p>

    <hr>

    <h2>Acknowledgements</h2>
    <ul>
        <li>Inspired by the need for simple and effective financial management tools.</li>
        <li>Developed as part of a learning project in Java.</li>
    </ul>
</body>
</html>
