import javax.swing.*;
import java.awt.*;

public class AccountBalanceAppFrame {

    private static void initialize() {
        JTextField balanceField;
        JTextField depositField;
        JTextField withdrawalField;
        JLabel balanceLabel;
        JLabel depositLabel;
        JLabel withdrawalLabel;
        GridBagConstraints layoutConst;

        double balance = 0.0;

        balanceLabel = new JLabel("Balance: ");
        depositLabel = new JLabel("Deposit: ");
        withdrawalLabel = new JLabel("Withdrawal: ");

        balanceField = new JTextField(String.valueOf(balance));
        depositField = new JTextField(String.valueOf(0.0));
        withdrawalField = new JTextField(String.valueOf(0.0));

        // Construct the JFrame object and set title
        JFrame appFrame = new JFrame("Bank Account");

        // Set the layout
        appFrame.setLayout(new GridBagLayout());

        // Set layout constraints
        layoutConst = new GridBagConstraints();

        // Specify component's grid location
        layoutConst.gridx = 0;
        layoutConst.gridy = 0;
        layoutConst.insets = new Insets(10, 10, 10, 10);
        appFrame.add(balanceLabel, layoutConst);

        layoutConst.gridx = 1;
        layoutConst.gridy = 0;
        layoutConst.insets = new Insets(10, 10, 10, 10);
        balanceField.setColumns(8);
        appFrame.add(balanceField, layoutConst);

        layoutConst.gridx = 0;
        layoutConst.gridy = 1;
        layoutConst.insets = new Insets(10, 10, 10, 10);
        appFrame.add(depositLabel, layoutConst);

        layoutConst.gridx = 1;
        layoutConst.gridy = 1;
        layoutConst.insets = new Insets(10, 10, 10, 10);
        depositField.setColumns(8);
        appFrame.add(depositField, layoutConst);

        layoutConst.gridx = 0;
        layoutConst.gridy = 2;
        layoutConst.insets = new Insets(10, 10, 10, 10);
        appFrame.add(withdrawalLabel, layoutConst);

        layoutConst.gridx = 1;
        layoutConst.gridy = 2;
        layoutConst.insets = new Insets(10, 10, 10, 10);
        withdrawalField.setColumns(8);
        appFrame.add(withdrawalField, layoutConst);

        appFrame.setSize(500, 500);

        // Set the program to exit when the user closes the frame
        appFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Resize window to fit components
        appFrame.pack();

        // Make the frame visible to the user
        appFrame.setVisible(true);
    }

    public static void main(String[] args) {
        initialize();

//        balanceField.setText(String.valueOf(balance));









    }
}
