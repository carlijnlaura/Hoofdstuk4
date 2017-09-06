package Hoofdstuk4;

import java.awt.*;
import java.applet.*;

public class Stoplicht extends Applet {

    public void init() {

    }
    public void paint(Graphics g) {
        setBackground(Color.WHITE);

        //Statief
        g.setColor(Color.BLACK);
        g.drawRect(150,100,10,5);
        g.fillRect(150,100,10,5);
        g.setColor(Color.WHITE);
        g.drawRect(150,105,10,5);
        g.fillRect(150,105,10,5);
        g.setColor(Color.BLACK);
        g.drawRect(150,110,10,5);
        g.fillRect(150,110,10,5);
        g.setColor(Color.WHITE);
        g.drawRect(150,115,10,5);
        g.fillRect(150,115,10,5);
        g.setColor(Color.BLACK);
        g.drawRect(150,120,10,5);
        g.fillRect(150,120,10,5);
        g.setColor(Color.WHITE);
        g.drawRect(150,125,10,5);
        g.fillRect(150,125,10,5);
        g.setColor(Color.BLACK);
        g.drawRect(150,130,10,5);
        g.fillRect(150,130,10,5);
        g.setColor(Color.WHITE);
        g.drawRect(150,135,10,5);
        g.fillRect(150,135,10,5);
        g.setColor(Color.BLACK);
        g.drawRect(150,140,10,5);
        g.fillRect(150,140,10,5);
        g.setColor(Color.WHITE);
        g.drawRect(150,145,10,5);
        g.fillRect(150,145,10,5);
        g.setColor(Color.BLACK);
        g.drawRect(150,150,10,5);
        g.fillRect(150,150,10,5);
        g.setColor(Color.WHITE);
        g.drawRect(150,155,10,5);
        g.fillRect(150,155,10,5);
        g.setColor(Color.BLACK);
        g.drawRect(150,160,10,5);
        g.fillRect(150,160,10,5);
        g.setColor(Color.WHITE);
        g.drawRect(150,165,10,5);
        g.fillRect(150,165,10,5);
        g.setColor(Color.BLACK);
        g.drawRect(150,170,10,5);
        g.fillRect(150,170,10,5);
        g.setColor(Color.WHITE);
        g.drawRect(150,175,10,5);
        g.fillRect(150,175,10,5);
        g.setColor(Color.BLACK);
        g.drawRect(150,180,10,5);
        g.fillRect(150,180,10,5);
        g.setColor(Color.WHITE);
        g.drawRect(150,185,10,5);
        g.fillRect(150,185,10,5);
        g.setColor(Color.BLACK);
        g.drawRect(150,190,10,5);
        g.fillRect(150,190,10,5);

        g.drawLine(150,100,150,190);
        g.drawLine(160,100,160,190);

        //Bord
        g.drawRoundRect(130,20,50,80,10,10);
        g.fillRoundRect(130,20,50,80,10,10);

        //Lichten
        g.setColor(Color.GREEN);
        g.drawOval(143,23,23,23);
        g.fillOval(143,23,23,23);

        g.setColor(Color.ORANGE);
        g.drawOval(143,48,23,23);
        g.fillOval(143,48,23,23);

        g.setColor(Color.RED);
        g.drawOval(143,73,23,23);
        g.fillOval(143,73,23,23);









    }
}