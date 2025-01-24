package MakingChange;

import javax.swing.*;
import java.awt.*;

public class PursePanel extends JPanel {
    private Purse newPurse;

    PursePanel() {
        newPurse = new Purse();
        this.setBackground(Color.RED);
        this.setPreferredSize(new Dimension(700, 700));
    }

    public void updatePurse(Purse newPurse) {
        this.newPurse = newPurse;

        for (Component component : this.getComponents()) {
            this.remove(component);
        }

        for (Denomination type : newPurse.cash.keySet()) {
            for (int i = 1; i < newPurse.cash.get(type); i++) {
                ImageIcon icon = new ImageIcon(type.img());
                JLabel label = new JLabel(icon);
                this.add(label);
            }
        }
        revalidate();
        repaint();
        newPurse.cash.clear();
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
    }
}
