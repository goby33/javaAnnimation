package com.company;
import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Panneau extends JPanel {

    protected List<Bulle> ListBulle = new ArrayList<Bulle>();

    public void paintComponent(Graphics g) {
        g.fillRect(0, 0, this.getWidth(), this.getHeight());
        for (int i = 0; i < this.ListBulle.size(); i++) {
            Bulle bulleProvisoire = this.ListBulle.get(i);
            g.setColor(bulleProvisoire.getCouleur());
            g.fillOval(bulleProvisoire.getX(), bulleProvisoire.getY(), 50, 50);
        }
    }


}







