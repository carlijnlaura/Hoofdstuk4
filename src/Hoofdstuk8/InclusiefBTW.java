package Hoofdstuk8;

import javax.swing.*;
import java.applet.*;
import java.awt.event.*;
import java.awt.*;

//OK knop, Label, 21% optellen

public class InclusiefBTW extends Applet {
    Label label;
    TextField tekstvak;
    Button knop;
    String schermtekst;
    Double totaal;

    public void init() {
        knop = new Button("Ok");
        KnopListener kl = new KnopListener();
        knop.addActionListener( kl );
        add (knop);

        tekstvak = new TextField("Prijs");
        label = new Label("Bereken");
        add(tekstvak);
        add(label);
    }

    public void paint(Graphics g) {
        setBackground(Color.WHITE);
        g.drawString("" + totaal + " $ inclusief BTW",20,60);

    }

    class KnopListener implements ActionListener {
        public void actionPerformed (ActionEvent e) {
            double num1 = Double.parseDouble(tekstvak.getText());
            totaal = (num1 * 1.21);

            repaint();
        }

    }

}
