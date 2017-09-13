package Hoofdstuk6;

import java.awt.*;
import java.applet.*;

public class UurDagJaar extends Applet {
    int a;
    int b;
    int c;
    int uitkomst;

    public void init() {
         setBackground(Color.WHITE);

        //Uur
        a = 60;
        uitkomst = a * a;

        getGraphics().setColor(Color.BLACK); }


        public void paint(Graphics g) {
        getGraphics().drawString("De uitkomst is: " + uitkomst + " seconden in een uur", 20,20);

        //Dag
            int b = 24;

            uitkomst = a * a * b;

            g.drawString("De uitkomst is: " + uitkomst + " seconden in een dag",20,50);

            //Jaar
            int c = 365;

            uitkomst = a * a * b * c;

            g.drawString("De uitkomst is: " + uitkomst + " seconden in een jaar",20,80);

    }
}