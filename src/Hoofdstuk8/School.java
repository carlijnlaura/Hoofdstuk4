package Hoofdstuk8;

import java.awt.*;
import java.applet.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


    public class School extends Applet {
        int Man, Vrouw,  potentiëlevrouw, potentiëleman, totaal;
        Button man, vrouw, vrouw2, man2;
        Button knop;
        TextField tekstvak;
        String s;


        public void init() {
            Man = 0;
            Vrouw = 0;
            potentiëlevrouw = 0;
            potentiëleman = 0;
            totaal = 0;



            man = new Button("Man");
            manListener ml = new manListener();
            man.addActionListener( ml );
            add (man);

            vrouw = new Button("Vrouw");
            vrouwListener vl = new vrouwListener();
            vrouw.addActionListener( vl );
            add (vrouw);

            man2 = new Button("potentiële Man");
            man2Listener m2l = new man2Listener();
            man2.addActionListener( m2l );
            add (man2);

            vrouw2 = new Button("potentiële Vrouw");
            vrouw2Listener v2l = new vrouw2Listener();
            vrouw2.addActionListener( v2l );
            add (vrouw2);

        }

        public void paint(Graphics g) {
            setBackground(Color.WHITE);
            g.drawString("Aantal mannen: " + Man,20,80);
            g.drawString("Aantal vrouwen: " + Vrouw,20,100);
            g.drawString("Aantal potentiële mannen: " + potentiëleman,20,120);
            g.drawString("Aantal potentiële vrouwen: " + potentiëlevrouw,20,140);
            totaal = Man + Vrouw + potentiëlevrouw + potentiëleman;
            g.drawString("Totaal aantal mensen aanwezi: " + totaal,20,160);

        }

        class manListener implements ActionListener {
            public void actionPerformed( ActionEvent e ) {
                Man++ ;
                repaint();
            }

        }

        class vrouwListener implements ActionListener {
            public void actionPerformed( ActionEvent e ) {
                Vrouw++ ;
                repaint();
            }

        }
        class man2Listener implements ActionListener {
            public void actionPerformed( ActionEvent e ) {
                potentiëleman++ ;
                repaint();
            }

        }
        class vrouw2Listener implements ActionListener {
            public void actionPerformed(ActionEvent e) {
                potentiëlevrouw++ ;
                repaint();

            }
        }
    }
