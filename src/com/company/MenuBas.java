package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuBas extends JPanel implements ActionListener {

   protected Button btnAdd = new Button("Add");
   protected Button btnDelete = new Button("Delete");
   protected Button btnAction = new Button("Play");
   protected Cursor cursor = new Cursor(0,100);

    public MenuBas() {
        this.setLayout(new GridLayout(1, 4));
         this.add(this.btnAdd);
         this.add(this.btnDelete);
         this.add(this.btnAction);
         this.add(cursor);
        btnAdd.addActionListener(this);


    }
    public void actionPerformed(ActionEvent arg0) {
            System.out.println("mmm");
    }
}
