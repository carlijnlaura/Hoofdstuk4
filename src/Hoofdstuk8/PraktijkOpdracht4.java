package Hoofdstuk8;

import java.awt.*;
import java.applet.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PraktijkOpdracht4 extends Applet {
    TextField tekstvak1;
    TextField tekstvak2;
    Button plus;
    Button min;
    Button delen;
    Button keer;
    double getal;

    public void init() {
        //Plus
        plus = new Button("+");
        plusListener pl = new plusListener();
        plus.addActionListener(pl);
        add(plus);

        //Min
        min = new Button("-");
        minListener ml = new minListener();
        min.addActionListener(ml);
        add(min);

        //Delen
        delen = new Button(":");
        delenListener dl = new delenListener();
        delen.addActionListener( dl );
        add(delen);

        //Keer
        keer = new Button("x");
        keerListener kl = new keerListener();
        keer.addActionListener( kl );
        add(keer);

        tekstvak1 = new TextField("insert number");
        add(tekstvak1);
        tekstvak2 = new TextField("insert number");
        add(tekstvak2);

    }


    public void paint(Graphics g) {
        setBackground(Color.WHITE);
        g.drawString("Antwoord: " + getal, 20, 100);

        repaint();


    }
        //PLUS
    class plusListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            double num1 = Double.parseDouble(tekstvak1.getText());
            double num2 = Double.parseDouble(tekstvak2.getText());
            getal = (num1 + num2);
        }
    }
        //MIN
    class minListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            double num1 = Double.parseDouble(tekstvak1.getText());
            double num2 = Double.parseDouble(tekstvak2.getText());
            getal = (num1 - num2);


        }
    }
        //DELEN
    class delenListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            double num1 = Double.parseDouble(tekstvak1.getText());
            double num2 = Double.parseDouble(tekstvak2.getText());
            getal = (num1 / num2);
        }
    }
        //KEER
    class keerListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            double num1 = Double.parseDouble(tekstvak1.getText());
            double num2 = Double.parseDouble(tekstvak2.getText());
            getal = (num1 * num2);
        }
    }
}


