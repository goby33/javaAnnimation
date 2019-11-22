package com.company;
import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Panneau extends JPanel {
    Random rand = new Random();
    List<Integer> x = new ArrayList<Integer>();
    List<Integer> y = new ArrayList<Integer>();
    List<Boolean> backY=new ArrayList<Boolean>();
    List<Boolean> backX=new ArrayList<Boolean>();
    List<Integer> couleur = new ArrayList<Integer>();

    Color tableau[] = {Color.red, Color.orange, Color.cyan, Color.blue, Color.MAGENTA};


    public void paintComponent(Graphics g) {
        g.fillRect(0, 0, this.getWidth(), this.getHeight());
        for (int i = 0; i < x.size(); i++) {
            g.setColor(tableau[couleur.get(i)]);
            g.fillOval(x.get(i), y.get(i), 50, 50);
        }
    }

    private int randomCouleur() {
        return rand.nextInt(tableau.length - 1 - 0 + 1) + 0;
    }

    private int randomX() {
        return rand.nextInt(this.getWidth() - 0 + 1) + 0;
    }

    private int randomY() {
        return rand.nextInt(this.getHeight() - 0 + 1) + 0;
    }

    public int getNbreELement() {
        return x.size();
    }


    public int getValeurX(int i) {
        return x.get(i);
    }


    public int getValeurY(int i) {
        return y.get(i);
    }


    public void ajouterBulle() {
        x.add(randomX());
        y.add(randomY());
        backY.add(false);
        backX.add(false);
        couleur.add(this.randomCouleur());
        this.repaint();
    }

    public void setbackY(int i , boolean valeur) {
        this.backY.set(i , valeur);
    }
    public void setbackX(int i , boolean valeur) {
        this.backX.set(i , valeur);
    }

    public boolean getbackX(int i) {
        return backX.get(i);
    }
    public boolean getbackY(int i) {
        return backY.get(i);
    }
    public void setValeurX(int i, int valeur) {
        this.x.set(i, valeur);
    }


    public void setValeurY(int i  , int valeur) {
       this.y.set(i ,valeur );
    }
}







