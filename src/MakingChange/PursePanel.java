package MakingChange;

import javax.swing.*;
import java.awt.*;

public class PursePanel extends JPanel {
    private Purse purse;

    PursePanel() {
        purse = new Purse();
        this.setBackground(Color.RED);
        this.setPreferredSize(new Dimension(700, 700));
    }

    public void updatePurse(Purse newPurse) {
        this.purse = newPurse;
        removeAll();
        revalidate();
        repaint();
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        for (Denomination type : purse.cash.keySet()) {
            ImageIcon icon = new ImageIcon(type.img());
            JLabel label = new JLabel(icon);
            this.add(label);
        }


    }
}
