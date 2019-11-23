package com.company;
import java.util.Random;

import java.awt.*;

public class Bulle {
    private Random rand = new Random();
    private int x;
    private int y;
    private boolean backX = true;
    private boolean backY = true;
    private Color couleur;
    private Color tableauCouleur[] = {Color.red, Color.orange, Color.cyan, Color.blue, Color.MAGENTA};

    public Bulle(int width , int height) {
        this.x = random(0 , width);
        this.y = random(0 , height);
        this.couleur = tableauCouleur[random(0 , tableauCouleur.length)];

    }

    private int random(int min , int max ) {
        return this.rand.nextInt(max - min + 1) + min;
    }



    /* --------------- SET ------*/
    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setBackX(boolean backX) {
        this.backX = backX;
    }

    public void setBackY(boolean backY) {
        this.backY = backY;
    }

    /* --------------- GET ------*/

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Color getCouleur() {
        return couleur;
    }
}
