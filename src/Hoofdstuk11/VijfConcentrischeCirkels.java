package Hoofdstuk11;

import java.applet.Applet;
import java.awt.*;

public class VijfConcentrischeCirkels extends Applet {

    public void paint(Graphics g) {
        int y = 10;
        int b = 100;

        for (int a = 0; a < 5; a++) {
            g.drawOval(b,b,y,y);
            y = y + 10;
            b = b - 5;

            setBackground(Color.WHITE);
        }
    }
}
