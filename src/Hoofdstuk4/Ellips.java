package Hoofdstuk4;

import java.awt.*;
import java.applet.*;

public class Ellips extends Applet {

    public void init() {

    }
    public void paint(Graphics g) {
        setBackground(Color.BLUE);
        g.setColor(Color.YELLOW);
        g.drawOval(20,20,175,100);
        g.fillOval(20,20,175,100);
    }
}