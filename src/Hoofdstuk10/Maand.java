package Hoofdstuk10;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Maand extends Applet {
    TextField tekstvak;
    Label label;
    String s, tekst1, tekst2;
    int dag;

    public void init() {
        setBackground(Color.WHITE);
        tekstvak = new TextField("", 20);
        label = new Label("Typ het maandnummer en druk op enter");
        tekstvak.addActionListener(new TekstvakListener());
        tekst1 = "";
        add (label);
        add(tekstvak);
    }

    public void paint(Graphics g) {
        g.drawString(tekst1, 80, 90 );
        g.drawString(tekst2,80,110);
    }

    class TekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s = tekstvak.getText();
            dag = Integer.parseInt(s);
            switch (dag) {
                case 1:
                    tekst1 = "Januari";
                    tekst2 = "deze maand bevat 31 dagen";
                    break;
                case 2:
                    tekst1 = "Februari";
                    tekst2 = "deze maand bevat 28/29 dagen";
                    break;
                case 3:
                    tekst1 = "Maart";
                    tekst2 = "deze maand bevat 31 dagen";
                    break;
                case 4:
                    tekst1 = "April";
                    tekst2 = "deze maand bevat 30 dagen";
                    break;
                case 5:
                    tekst1 = "Mei";
                    tekst2 = "deze maand bevat 31 dagen";
                    break;
                case 6:
                    tekst1 = "Juni";
                    tekst2 = "deze maand bevat 30 dagen";
                    break;
                case 7:
                    tekst1 = "Juli";
                    tekst2 = "deze maand bevat 31 dagen";
                    break;
                case 8:
                    tekst1 = "Augustus";
                    tekst2 = "deze maand bevat 31 dagen";
                    break;
                case 9:
                    tekst1 = "September";
                    tekst2 = "deze maand bevat 30 dagen";
                    break;
                case 10:
                    tekst1 = "Oktober";
                    tekst2 = "deze maand bevat 31 dagen";
                    break;
                case 11:
                    tekst1 = "November";
                    tekst2 = "deze maand bevat 30 dagen";
                    break;
                case 12:
                    tekst1 = "December";
                    tekst2 = "deze maand bevat 31 dagen";
                    break;
                default:
                    tekst1 = "Dit maandnummer bestaat niet!";
                    break;
            }
            repaint ();
        }
    }
}