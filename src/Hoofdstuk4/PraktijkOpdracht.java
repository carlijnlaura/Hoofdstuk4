package Hoofdstuk4;
import java.awt.*;
import java.applet.*;

public class PraktijkOpdracht extends Applet {

    public void init() {

    }
    public void paint(Graphics g) {
        setBackground(Color.WHITE);
        //Rechte lijn
        g.drawLine(50,50,250,50);
        g.drawString("Lijn",130,65);

        //Rechthoek
        g.drawRect(50,100,200,75);
        g.drawString("Rechthoek",110,190);

        //Afgeronde rechthoek
        g.drawRoundRect(50,220,205,75,25,25);
        g.drawString("Afgeronde Rechthoek",90,315);

        //Gevulde rechthoek met ovaal
        g.setColor(Color.BLACK);
        g.drawRect(300,100,200,75);
        g.setColor(Color.MAGENTA);
        g.fillRect(300,100,200,75);
        g.setColor(Color.BLACK);
        g.drawOval(300,100,200,75);
        g.drawString("Gevulde rechthoek met ovaal",310,190);

        //Gevulde ovaal
        g.setColor(Color.MAGENTA);
        g.drawOval(300,220,200,75);
        g.fillOval(300,220,200,75);
        g.setColor(Color.BLACK);
        g.drawString("Gevulde ovaal",350,315);

        //Taartpunt met ovaal eromheen
        g.drawOval(550,100,200,80);
        g.setColor(Color.MAGENTA);
        g.fillArc(590,100,160,85,360,50);
        g.setColor(Color.BLACK);
        g.drawString("Taartpunt met ovaal eromheen",560,200);


        //Cirkel
        g.setColor(Color.BLACK);
        g.drawOval(600,220,100,100);
        g.drawString("Cirkel",630,340);





    }
}