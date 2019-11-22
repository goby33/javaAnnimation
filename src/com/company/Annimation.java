package com.company;

public class Annimation extends Panneau {
    public Annimation() {
        super();

    }

    public void go() {
    while (true) {
        for (int i = 0; i < this.getNbreELement(); i++) {
            int x = this.getValeurX(i);
            int y = super.getValeurY(i);

            if (x < 1) {
                this.setbackX(i, false);
            }

            if (x > this.getWidth() - 50) {
                this.setbackX(i, true);
            }

            //Idem pour l'axe y
            if (y < 1) {
                this.setbackY(i, false);
                ;
            }
            if (y > this.getHeight() - 50) {
                this.setbackY(i, true);
            }
            ;

            if (!this.getbackX(i))
                this.setValeurX(i, ++x);
                //Sinon, on décrémente
            else
                this.setValeurX(i, --x);
            //Idem pour l'axe Y
            if (!this.getbackY(i))
                this.setValeurY(i, ++y);
            else
                this.setValeurY(i, --y);

            //On redessine notre Panneau
            this.repaint();
            //Comme on dit : la pause s'impose ! Ici, trois millièmes de seconde

        }
        try {
            Thread.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
        }

    public void Ajouter() {
        System.out.println("Ajouter");
    }
}


/*
* */