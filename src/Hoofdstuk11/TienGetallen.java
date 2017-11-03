package Hoofdstuk11;

import java.awt.*;
import java.applet.*;

public class TienGetallen extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        int teller;
        int y = 0;

        for (teller = 20; teller >= 10; teller--) {
            y += 20;

            g.drawString("" + teller, 50, y);
            setBackground(Color.WHITE);
        }
    }
}