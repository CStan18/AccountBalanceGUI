// Most of this code is from YT Channel: Java Code Junkie
// Java Swing Tutorial for Beginners
import javax.swing.*;
import java.awt.*;

public class MainFrame {

    private JFrame appFrame;

    public void initialize() {
        appFrame = new JFrame();
        appFrame.setTitle("Account Balance");
        appFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        appFrame.setSize(800, 500);
        // Centers on the screen
        appFrame.setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 5));
        panel.setBackground(Color.BLUE);

        Button button1 = new Button("Button1");
        panel.add(button1);

        Button button2 = new Button("Button2");
        panel.add(button2);

        Button button3 = new Button("Button3");
        panel.add(button3);

        Button button4 = new Button("Button4");
        panel.add(button4);

        appFrame.add(panel, BorderLayout.NORTH);

        appFrame.setVisible(true);
    }
}
