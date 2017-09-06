package Hoofdstuk5;

import java.awt.*;
import java.applet.*;

public class PraktijkOpdracht2 extends Applet {

    public void init() {

    }

    public void paint(Graphics g) {
        setBackground(Color.WHITE);
        //declaratie.
        Color opvulkleur;
        Color lijnkleur;
        int breedte;
        int hoogte;

        //initialisatie.
        opvulkleur = Color.MAGENTA;
        lijnkleur = Color.BLACK;
        breedte = 200;
        hoogte = 100;

        //Rechte lijn
        g.drawLine(50,50,250,50);
        g.drawString("Lijn",130,65);

        //Rechthoek
        g.drawRect(50,100,breedte,hoogte);

        //Afgeronde rechthoek
        g.drawRoundRect(50,220,breedte,hoogte,25,25);

        //Gevulde rechthoek met ovaal
        g.drawRect(300,100,breedte,hoogte);
        g.setColor(opvulkleur);
        g.fillRect(300,100,breedte,hoogte);
        g.setColor(lijnkleur);
        g.drawOval(300,100,breedte,hoogte);

        //Gevulde ovaal
        g.setColor(opvulkleur);
        g.drawOval(300,220,breedte,hoogte);
        g.fillOval(300,220,breedte,hoogte);

        //Taartpunt met ovaal eromheen
        g.setColor(lijnkleur);
        g.drawOval(550,100,breedte,hoogte);
        g.setColor(opvulkleur);
        g.fillArc(550,100,breedte,hoogte,360,45);

        //Cirkel
        g.setColor(lijnkleur);
        g.drawOval(600,220,100,100);

    }
}