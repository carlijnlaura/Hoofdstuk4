package Hoofdstuk11;

import java.applet.Applet;
import java.awt.*;

public class HonderdConcentrischeCirkels extends Applet {

    public void paint (Graphics g){
        int y = 60;
        int b = 500;

        for(int a= 0; a < 100; a++){
            g.drawOval(b,b,y,y);
            y = y + 10;
            b = b - 5;

            setBackground(Color.WHITE);
        }
    }
}
