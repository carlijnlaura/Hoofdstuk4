package Hoofdstuk10;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class HoogsteGetal extends Applet{
    TextField tekst1;
    int hoogstegetal;
    int getal;


    public void init() {
        tekst1 = new TextField("",10);
        tekst1Listener t1l = new tekst1Listener();
        tekst1.addActionListener( t1l );
        add (tekst1);
    }

    public void paint (Graphics g){
        g.drawString("Hoogste getal =  " + hoogstegetal,20,60);

    }

    class tekst1Listener implements ActionListener {
        public void actionPerformed( ActionEvent e ) {
            getal = Integer.parseInt(tekst1.getText());
            if (getal > hoogstegetal) {
                hoogstegetal = getal;
                repaint();
            }


        }
    }
}
