package Hoofdstuk10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class MaandEnSchrikkeljaar extends Applet {
    TextField tekstvak1, tekstvak2;
    Label label;
    String s, a, tekst1, tekst2;
    int maand, jaartal;


    public void init() {
        setBackground(Color.WHITE);

        this.setSize(700,100);
        tekstvak1 = new TextField("", 15);
        label = new Label("Typ een maand nummer");
        tekstvak1.addActionListener(new TekstvakListener());
        tekst1 = "";
        add (label);
        add (tekstvak1);

        tekstvak2 = new TextField("", 15);
        tekstvak2.addActionListener(new TekstvakListener());
        label = new Label("Jaar nummer");
        tekst1 = "";
        add (label);
        add (tekstvak2);
    }


    public void paint(Graphics g) {
        this.setSize(700,100);
        if (tekst1 != null && tekst2 != null) {
            g.drawString(tekst1, 20, 80);
            g.drawString(tekst2, 170, 80);
        }


    }
    class TekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            a = tekstvak2.getText();
            int dagen_feb = 28;
            jaartal = Integer.parseInt( a );
            if ( (jaartal % 4 == 0 && !(jaartal % 100 == 0)) ||
                    jaartal % 400 == 0 ) {
                tekst2 = ""+ jaartal + " is een schrikkeljaar";
                dagen_feb = 29;
            }
            else {
                tekst2 = ""+ jaartal + " is geen schrikkeljaar";
            }

            s = tekstvak1.getText();
            maand = Integer.parseInt(s);
            switch (maand) {
                case 1:
                    tekst1 = "Januari bevat 31 dagen";
                    break;
                case 2:
                    tekst1 = "Februari bevat "+ dagen_feb +" dagen";
                    break;
                case 3:
                    tekst1 = "Maart bevat 31 dagen";
                    break;
                case 4:
                    tekst1 = "April bevat 30 dagen";
                    break;
                case 5:
                    tekst1 = "Mei bevat 31 dagen";
                    break;
                case 6:
                    tekst1 = "Juni bevat 30 dagen";
                    break;
                case 7:
                    tekst1 = "Juli bevat 31 dagen";
                    break;
                case 8:
                    tekst1 = "Augustus bevat 31 dagen";
                    break;
                case 9:
                    tekst1 = "September bevat 30 dagen";
                    break;
                case 10:
                    tekst1 = "Oktober bevat 31 dagen";
                    break;
                case 11:
                    tekst1 = "November bevat 30 dagen";
                    break;
                case 12:
                    tekst1 = "December bevat 31 dagen";
                    break;
                default:
                    tekst1 = "Ongeldig getal!";
                    break;
            }
            repaint();
        }
    }
}
