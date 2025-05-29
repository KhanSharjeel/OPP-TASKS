import javax.swing.*;
import java.awt.*;

// Account class
class Account {
    private String accountNumber;
    private double balance;

    public Account(String accountNumber) {
        this.accountNumber = accountNumber;
        this.balance = 0.0;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }
}

// Abstract User class
abstract class User {
    private String email, password, id, name;

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getId() {
        return id;
    }

    public String getPassword() {
        return password;
    }

    protected void setUserDetails(String id, String name, String email, String password) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
    }
}

// Customer class
class Customer extends User {
    Account account;
    private boolean isActive = false;

    public Customer(String id, String name, String email, String password, String accountNumber) {
        setUserDetails(id, name, email, password);
        this.account = new Account(accountNumber);
    }

    public void deposit(double amount) {
        if (!isActive) {
            JOptionPane.showMessageDialog(null, "Account is inactive. Cannot deposit.");
            return;
        }
        if (amount > 0) {
            account.setBalance(account.getBalance() + amount);
            JOptionPane.showMessageDialog(null, "Deposited: $" + amount);
        } else {
            JOptionPane.showMessageDialog(null, "Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (!isActive) {
            JOptionPane.showMessageDialog(null, "Account is inactive. Cannot withdraw.");
            return;
        }
        if (amount > 0 && account.getBalance() >= amount) {
            account.setBalance(account.getBalance() - amount);
            JOptionPane.showMessageDialog(null, "Withdrew: $" + amount);
        } else {
            JOptionPane.showMessageDialog(null, "Insufficient balance or invalid amount.");
        }
    }

    public void transfer(Customer recipient, double amount) {
        if (!isActive) {
            JOptionPane.showMessageDialog(null, "Account is inactive. Cannot transfer.");
            return;
        }
        if (amount > 0 && account.getBalance() >= amount) {
            this.withdraw(amount);
            recipient.deposit(amount);
            JOptionPane.showMessageDialog(null, "Transferred $" + amount + " to " + recipient.getName());
        } else {
            JOptionPane.showMessageDialog(null, "Transfer failed.");
        }
    }

    public void checkBalance() {
        JOptionPane.showMessageDialog(null, "Your balance: $" + account.getBalance());
    }

    public void setActive(boolean active) {
        this.isActive = active;
    }

    public boolean isActive() {
        return isActive;
    }

    public Account getAccount() {
        return account;
    }
}

// Admin class
class Admin extends User {
    public Admin(String id, String name, String email, String password) {
        setUserDetails(id, name, email, password);
    }

    public void approveCustomer(Customer c) {
        c.setActive(true);
        JOptionPane.showMessageDialog(null, "Approved customer: " + c.getName());
    }

    public void deactivateCustomer(Customer c) {
        c.setActive(false);
        JOptionPane.showMessageDialog(null, "Deactivated customer: " + c.getName());
    }
}

// Customer GUI
class CustomerGUI extends JFrame {
    private Customer customer;
    private Customer[] customers;

    public CustomerGUI(Customer customer, Customer[] customers) {
        this.customer = customer;
        this.customers = customers;

        setTitle("Bank System - Customer Dashboard");
        setSize(1920, 789);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(8, 1));

        JTextField amountField = new JTextField();
        JTextField recipientField = new JTextField();
        JButton depositBtn = new JButton("Deposit");
        JButton withdrawBtn = new JButton("Withdraw");
        JButton transferBtn = new JButton("Transfer");
        JButton checkBalanceBtn = new JButton("Check Balance");

        depositBtn.addActionListener(e -> {
            try {
                double amount = Double.parseDouble(amountField.getText());
                customer.deposit(amount);
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Invalid amount.");
            }
        });

        withdrawBtn.addActionListener(e -> {
            try {
                double amount = Double.parseDouble(amountField.getText());
                customer.withdraw(amount);
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Invalid amount.");
            }
        });

        transferBtn.addActionListener(e -> {
            try {
                String recipientID = recipientField.getText();
                double amount = Double.parseDouble(amountField.getText());
                for (Customer c : customers) {
                    if (c.getId().equals(recipientID)) {
                        customer.transfer(c, amount);
                        return;
                    }
                }
                JOptionPane.showMessageDialog(null, "Recipient not found.");
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Invalid amount.");
            }
        });

        checkBalanceBtn.addActionListener(e -> customer.checkBalance());

        add(new JLabel("Amount: "));
        add(amountField);
        add(new JLabel("Recipient ID (for transfer): "));
        add(recipientField);
        add(depositBtn);
        add(withdrawBtn);
        add(transferBtn);
        add(checkBalanceBtn);

        setVisible(true);
    }
}

// Admin GUI
class AdminGUI extends JFrame {
    private Admin admin;
    private Customer[] customers;
    private JTextArea customerListArea;

    public AdminGUI(Admin admin, Customer[] customers) {
        this.admin = admin;
        this.customers = customers;

        setTitle("Bank System - Admin Panel");
        setSize(1920, 1000);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        JPanel buttonPanel = new JPanel(new GridLayout(4, 1));
        JButton viewCustomersBtn = new JButton("View Customers");
        JButton approveCustomerBtn = new JButton("Approve Customer");
        JButton deactivateCustomerBtn = new JButton("Deactivate Customer");
        JButton viewDetailsBtn = new JButton("View Account Details");

        customerListArea = new JTextArea();
        customerListArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(customerListArea);

        viewCustomersBtn.addActionListener(e -> updateCustomerList());

        approveCustomerBtn.addActionListener(e -> {
            String id = JOptionPane.showInputDialog("Enter Customer ID to Approve:");
            for (Customer c : customers) {
                if (c.getId().equals(id)) {
                    admin.approveCustomer(c);
                    updateCustomerList();
                    return;
                }
            }
            JOptionPane.showMessageDialog(null, "Customer not found.");
        });

        deactivateCustomerBtn.addActionListener(e -> {
            String id = JOptionPane.showInputDialog("Enter Customer ID to Deactivate:");
            for (Customer c : customers) {
                if (c.getId().equals(id)) {
                    admin.deactivateCustomer(c);
                    updateCustomerList();
                    return;
                }
            }
            JOptionPane.showMessageDialog(null, "Customer not found.");
        });

        viewDetailsBtn.addActionListener(e -> {
            String id = JOptionPane.showInputDialog("Enter Customer ID to View Details:");
            for (Customer c : customers) {
                if (c.getId().equals(id)) {
                    JOptionPane.showMessageDialog(null,
                            "Customer ID: " + c.getId() +
                                    "\nName: " + c.getName() +
                                    "\nEmail: " + c.getEmail() +
                                    "\nAccount Number: " + c.getAccount().getAccountNumber() +
                                    "\nBalance: $" + c.getAccount().getBalance() +
                                    "\nStatus: " + (c.isActive() ? "Active" : "Inactive"));
                    return;
                }
            }
            JOptionPane.showMessageDialog(null, "Customer not found.");
        });

        buttonPanel.add(viewCustomersBtn);
        buttonPanel.add(approveCustomerBtn);
        buttonPanel.add(deactivateCustomerBtn);
        buttonPanel.add(viewDetailsBtn);

        add(buttonPanel, BorderLayout.WEST);
        add(scrollPane, BorderLayout.CENTER);

        setVisible(true);
    }

    private void updateCustomerList() {
        StringBuilder details = new StringBuilder("Customer List:\n");
        for (Customer c : customers) {
            details.append("ID: ").append(c.getId())
                    .append(" | Name: ").append(c.getName())
                    .append(" | Status: ").append(c.isActive() ? "Active" : "Inactive")
                    .append("\n");
        }
        customerListArea.setText(details.toString());
    }
}

// Main class
class BankSystem {
    public static void main(String[] args) {
        Customer c1 = new Customer("65831", "Ibrahim Haroon", "IbrahinHaroon@riphah.com", "pass123", "AC65831");
        Customer c2 = new Customer("53099", "Sharjeel Khan", "Sharjeel@riphah.com", "pass456", "AC53099");
        Admin admin = new Admin("65732", "Bilal Admin", "BilalSaif@.com", "adminpass");

        Customer[] customers = { c1, c2 };

        SwingUtilities.invokeLater(() -> {
            new CustomerGUI(c1, customers); // Simulate Alice logged in
            new AdminGUI(admin, customers);
        });
    }
}