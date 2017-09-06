package Hoofdstuk4;

import java.awt.*;
import java.applet.*;

public class Staafdiagram extends Applet {

    public void init() {

    }

    public void paint(Graphics g) {
        setBackground(Color.WHITE);
        //Staafdiagram horizontaal
        g.setColor(Color.BLACK);
        g.drawLine(50,250,250,250);

        //Staafdiagram verticaal
        g.setColor(Color.BLACK);
        g.drawLine(50,40,50,250);

        //Verdeling
        g.setColor(Color.BLACK);
        g.drawString("0",40,250);
        g.drawString("20",35,210);
        g.drawString("40",35,170);
        g.drawString("60",35,130);
        g.drawString("80",35,90);
        g.drawString("100",25,50);
        g.drawString("kg",20,250);
        g.drawString("kg",17,210);
        g.drawString("kg",17,170);
        g.drawString("kg",17,130);
        g.drawString("kg",17,90);
        g.drawString("kg",9,50);

        //Staven
        g.setColor(Color.BLACK);
        g.drawRect(60,40,30,210);
        g.fillRect(60,40,30,210);

        g.setColor(Color.BLUE);
        g.drawRect(120,85,30,165);
        g.fillRect(120,85,30,165);

        g.setColor(Color.PINK);
        g.drawRect(180,170,30,80);
        g.fillRect(180,170,30,80);

        //Namen
        g.setColor(Color.BLACK);
        g.drawString("Jeroen",55,270);
        g.drawString("Hans",120,270);
        g.drawString("Valerie",175,270);
        g.drawString("Namen",270,260);









    }

}


