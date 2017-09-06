package Hoofdstuk4;
import java.awt.*;
import java.applet.*;

public class Dobbelsteen extends Applet {

    public void init() {

    }
    public void paint(Graphics g) {
        setBackground(Color.PINK);

        //Dobbel
        g.setColor(Color.WHITE);
        g.drawRoundRect(100,100,100,100,30,30);
        g.fillRoundRect(100,100,100,100,30,30);

        //Stenen
        g.setColor(Color.BLACK);
        g.drawOval(115,115,25,25);
        g.fillOval(115,115,25,25);
        g.drawOval(115,160,25,25);
        g.fillOval(115,160,25,25);
        g.drawOval(160,115,25,25);
        g.fillOval(160,115,25,25);
        g.drawOval(160,160,25,25);
        g.fillOval(160,160,25,25);



    }
}