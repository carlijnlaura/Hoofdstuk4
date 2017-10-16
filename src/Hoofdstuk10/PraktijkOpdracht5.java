package Hoofdstuk10;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;


public class PraktijkOpdracht5 extends Applet {
    TextField tekstvak;
    Label label;
    String s, tekst;
    int cijfer;

    public void init() {
        tekstvak = new TextField("", 10);
        label = new Label("Type je cijfer in en druk op enter");
        tekstvak.addActionListener( new TekstvakListener() );
        tekst = "";
        add(label);
        add(tekstvak);
    }

    public void paint(Graphics g) {
        g.drawString(tekst, 50, 60 );
        setBackground(Color.WHITE);
        g.setColor(Color.BLACK);
    }

    class TekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s = tekstvak.getText();
            cijfer = Integer.parseInt( s );
            switch(cijfer) {
                case 1:
                    tekst = "Slecht";
                    break;
                case 2:
                    tekst = "Slecht";
                    break;
                case 3:
                    tekst = "Slecht";
                    break;
                case 4:
                    tekst = "Onvoldoende";
                    break;
                case 5:
                    tekst = "Matig";
                    break;
                case 6:
                    tekst = "Voldoende";
                    break;
                case 7:
                    tekst = "Voldoende";
                    break;
                case 8:
                    tekst = "Goed";
                    break;
                case 9:
                    tekst = "Goed";
                    break;
                case 10:
                    tekst = "Goed";
                    break;
                default:
                    tekst = "Dit cijfer bestaat niet!";
                    break;
            }
            repaint();
        }
    }
}
