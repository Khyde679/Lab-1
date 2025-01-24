package MakingChange;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class RegisterPanel extends JPanel {
    private Register register;
    private JLabel inputLabel;
    private JButton inputButton;
    private JPanel inputPanel;
    private JTextField input;
    private PursePanel changePanel;

    RegisterPanel() {
        register = new Register();
        inputLabel = new JLabel("Enter a dollar amount: $");
        inputButton = new JButton("Make Change!");
        input = new JTextField();
        inputPanel = new JPanel();
        changePanel = new PursePanel();

        this.setBackground(Color.GRAY);
        inputPanel.setBackground(Color.LIGHT_GRAY);
        inputButton.setBackground(Color.WHITE);
        inputButton.setForeground(Color.BLACK);
        inputButton.addActionListener(new InputListener());
        inputPanel.add(inputLabel);
        inputPanel.add(input);
        inputPanel.add(inputButton);

        input.setPreferredSize(new Dimension(100, 25));
        inputPanel.setPreferredSize(new Dimension(375, 45));
        this.setPreferredSize(new Dimension(750, 750));
        this.add(inputPanel);
        this.add(changePanel);

    }

    private class InputListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            double amt = Double.parseDouble(input.getText());
            System.out.println(register.makeChange(amt));
            changePanel.updatePurse(register.makeChange(amt));
            revalidate();
            repaint();
        }
    }
}
