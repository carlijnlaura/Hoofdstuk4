package Hoofdstuk11;

import java.awt.*;
import java.applet.*;

public class VerticaleLijnen extends Applet {

    public void init (){}

    public void paint(Graphics g) {
        int teller;
        int y = 0;

        for(teller = 0; teller < 11; teller++){
            y += 20;
            g.drawLine(y,20,y, 300 );
            setBackground(Color.WHITE);

        }
    }

}
