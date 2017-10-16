package Hoofdstuk10;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class HoogsteEnLaagste extends Applet{
    TextField tekst1;
    int hoogstegetal, laagstegetal;
    int getal;


    public void init() {
        tekst1 = new TextField("",5);
        tekst1Listener t1l = new tekst1Listener();
        tekst1.addActionListener( t1l );
        add (tekst1);
    }

    public void paint (Graphics g){
        setBackground(Color.WHITE);
        g.drawString("Hoogste getal =  " + hoogstegetal,50,50);
        g.drawString("Laagste getal =  "+ laagstegetal,50,70);

    }

    class tekst1Listener implements ActionListener {
        public void actionPerformed( ActionEvent e ) {
            getal = Integer.parseInt(tekst1.getText());
            if (getal > hoogstegetal) {
                hoogstegetal = getal;
                repaint();
            }
            else if (getal < hoogstegetal) {
                laagstegetal = getal;
                repaint();
            }
        }
    }
}
