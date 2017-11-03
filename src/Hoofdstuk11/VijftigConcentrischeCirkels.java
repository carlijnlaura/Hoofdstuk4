package Hoofdstuk11;

import java.applet.Applet;
import java.awt.*;

public class VijftigConcentrischeCirkels extends Applet{

    public void paint(Graphics g){
        int y = 30;
        int b = 250;

        for(int a = 0; a < 50; a++){
        g.drawOval(b,b,y,y);
        y = y + 10;
        b = b - 5;

        setBackground(Color.WHITE);
        }
    }
}
