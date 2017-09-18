package Hoofdstuk8;

import javax.swing.*;
import java.applet.*;
import java.awt.event.*;
import java.awt.*;

public class Knop extends Applet {
    Label label;
    TextField tekstvak;
    Button knop;
    String schermtekst;


    public void init() {
        knop = new Button("Ok");
        KnopListener kl = new KnopListener();
        knop.addActionListener( kl );
        add (knop);

        knop = new Button("Reset");
        ResetListener k1 = new ResetListener();
        knop.addActionListener( k1 );
        add (knop);

        tekstvak = new TextField("Klik op mij");
        label = new Label("Type iets in het tekstvakje");
        add (tekstvak);
        add (label);
    }

    public void paint(Graphics g) {
        setBackground(Color.WHITE);
        g.drawString(schermtekst, 20,60);

    }


    class KnopListener implements ActionListener {
        public void actionPerformed( ActionEvent e ) {
            schermtekst = tekstvak.getText();
            repaint();
        }
    }

    class ResetListener implements ActionListener {
        public void actionPerformed( ActionEvent e){
            tekstvak.setText("");
            schermtekst = tekstvak.getText();
            repaint();
        }
    }

}