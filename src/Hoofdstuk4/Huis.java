package Hoofdstuk4;

import java.awt.*;
import java.applet.*;

public class Huis extends Applet {

    public void init() {

    }

    public void paint(Graphics g) {
        setBackground(Color.WHITE);
        //Dak
        g.setColor(Color.BLACK);
        int[] xPoints = {50, 120, 200};
        int[] yPoints = {120, 20, 120};
        g.drawPolygon(xPoints, yPoints, 3);
        g.fillPolygon(xPoints, yPoints, 3);

        //Huis
        g.setColor(Color.PINK);
        g.drawRect(50,120,150,180);
        g.fillRect(50,120,150,180);

        //Deur
        g.setColor(Color.BLACK);
        g.drawRect(70,220,50,80);
        g.fillRect(70,220,50,80);

        //Raam
        g.setColor(Color.WHITE);
        g.drawRect(130,160,50,50);
        g.fillRect(130,160,50,50);

        //Vlagge stok
        g.setColor(Color.BLACK);
        g.drawRect(250,120,5,180);
        g.fillRect(250,120,5,180);

        //Vlag
        g.setColor(Color.RED);
        g.drawRect(255,120,70,15);
        g.fillRect(255,120,70,15);
        g.setColor(Color.BLUE);
        g.drawRect(255,150,70,15);
        g.fillRect(255,150,70,15);










    }
}
