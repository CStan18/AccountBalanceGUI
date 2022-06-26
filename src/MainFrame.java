//// Most of this code is from YT Channel: Java Code Junkie
//// Java Swing Tutorial for Beginners
//import javax.swing.*;
//import java.awt.*;
//
//public class MainFrame {
//
//
//    private JFrame appFrame;
//
//    public void initialize() {
//        appFrame = new JFrame();
//        appFrame.setTitle("Account Balance");
//        appFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
//        appFrame.setSize(250, 250);
//        // Centers on the screen
//        appFrame.setLocationRelativeTo(null);
//
//        JPanel panel = new JPanel();
//        panel.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 100));
//
//
//        Button button1 = new Button("Create Account");
//        JTextField createAccountField = new JTextField();
//        panel.add(button1);
//        panel.add(createAccountField);
//
//        Button button2 = new Button("Deposit");
//        JTextField depositField = new JTextField();
//        panel.add(button2);
//        panel.add(depositField);
//
//        Button button3 = new Button("Withdrawal");
//        JTextField withdrawalField = new JTextField();
//        panel.add(button3);
//        panel.add(withdrawalField);
//
//        Button button4 = new Button("Balance");
//        JTextField balanceField = new JTextField();
//        panel.add(button4);
//        panel.add(balanceField);
//
//        appFrame.add(panel, BorderLayout.CENTER);
//
//        panel.setPreferredSize(new Dimension(250, 250));
//
//        appFrame.setVisible(true);
//    }
//}
