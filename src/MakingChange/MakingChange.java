package MakingChange;
import javax.swing.*;
import java.awt.*;

public class MakingChange {
    public static void main(String[] args) {
        JFrame frame = new JFrame("MakingChange");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        RegisterPanel panel = new RegisterPanel();
        frame.getContentPane().add(panel);
        frame.pack();

        frame.setVisible(true);
    }
}
