package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Fenetre extends JFrame   implements ActionListener {

    private Annimation annimation = new Annimation();
    private MenuBas menuBas = new MenuBas();
    private JPanel container = new JPanel();

    public Fenetre(int Hauteur, int Longueur , String Titre) {
        this.setTitle(Titre);
        this.setSize(Hauteur , Longueur);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        container.setLayout(new BorderLayout());
        container.add(annimation , BorderLayout.CENTER);
        container.add(menuBas , BorderLayout.SOUTH);
        menuBas.btnAdd.addActionListener(new Add());
        menuBas.btnAction.addActionListener(new Action());
        menuBas.btnDelete.addActionListener(new Delete());
        this.setContentPane(container);
        this.setVisible(true);
        annimation.go();

    }

    public void actionPerformed(ActionEvent arg0) {

        System.out.println(arg0);
    }


    class Add implements ActionListener {
        public void actionPerformed(ActionEvent arg0) {
            annimation.ajouterBulle();
        }
    }

    class Action implements ActionListener {
        public void actionPerformed(ActionEvent arg0) {
            System.out.println("action");
        }
    }

    class Delete implements ActionListener {
        public void actionPerformed(ActionEvent arg0) {
            System.out.println("delette");
        }
    }




}
