// Most of this code is from YT Channel: Java Code Junkie
// Java Swing Tutorial for Beginners
import javax.swing.*;
import java.awt.*;

public class BankAccountGUI {
    private JFrame appFrame;
    private BankAccount myAccount;
    private JButton withdrawalButton;
    private JButton depositButton;
    private JLabel accountLabel;
    private JTextField amountTextField;
    private JLabel amountLabel;
    private JLabel balance;
    private JLabel balanceLabel;

    private double getAmount() {
        String amountText = amountTextField.getText();
        return Double.parseDouble(amountText);
    }

    private void updateBalanceLabel() {
        balanceLabel.setText("New Balance = " + myAccount.getBalance());
    }

    private boolean validateAmount() {
        String amountText = amountTextField.getText();
        if (amountText.length() == 0) {
            JOptionPane.showMessageDialog(null, "Please enter amount");
            return false;
        }
        try {
            Double.parseDouble(amountText);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null,
                    "Enter a positive number");
            return false;
        }

        double value = Double.parseDouble(amountText);

        if (value < 0) {
            JOptionPane.showMessageDialog(null, "Amount must be positive");
            return false;
        }

        return true;
    }

    public void initialize() {
        myAccount = new BankAccount();
        appFrame = new JFrame();
        appFrame.setTitle("Account Balance");
        appFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        appFrame.setBounds(200, 200, 300, 200);
        appFrame.setLayout(new BorderLayout());
        // Centers on the screen
        appFrame.setLocationRelativeTo(null);

        JPanel amountPanel = new JPanel();
        JPanel buttonsPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JPanel balancePanel = new JPanel();

        appFrame.add(amountPanel);
        appFrame.add(buttonsPanel, BorderLayout.NORTH);
        appFrame.add(balancePanel, BorderLayout.SOUTH);

        withdrawalButton = new JButton("Withdrawal");
        depositButton = new JButton("Deposit");

        buttonsPanel.add(depositButton);
        buttonsPanel.add(withdrawalButton);

        amountLabel = new JLabel("Amount");
        amountPanel.add(amountLabel);

        amountTextField = new JTextField();
        amountTextField.setColumns(5);
        amountPanel.add(amountTextField);

        balanceLabel = new JLabel("Balance = 0");
        balancePanel.add(balanceLabel);

        withdrawalButton.addActionListener(action -> {
            if (!validateAmount()) {
                return;
            }
            myAccount.withdrawal(getAmount());
            updateBalanceLabel();
                });

        depositButton.addActionListener(action -> {
            if (!validateAmount()) {
                return;
            }

            myAccount.deposit(getAmount());
            updateBalanceLabel();
        });

        appFrame.setVisible(true);
    }
}
