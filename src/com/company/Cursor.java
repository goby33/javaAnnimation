package com.company;

import javax.swing.*;

public class Cursor extends JSlider {
    public Cursor(int min , int max) {
        this.setMaximum(100);
        this.setMinimum(0);
        this.setValue(30);
        this.setPaintTicks(true);
        this.setPaintLabels(true);
        this.setMinorTickSpacing(10);
        this.setMajorTickSpacing(20);
    }


}
