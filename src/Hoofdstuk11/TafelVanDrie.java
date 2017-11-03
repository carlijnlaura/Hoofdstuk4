package Hoofdstuk11;

import java.applet.Applet;
import java.awt.*;

public class TafelVanDrie extends Applet{


    public void paint(Graphics g) {
        int y = 20;

        for (int i = 1; i<=10; i++){
            y+= 20;
            g.drawString(i +" x " + 3 + " = " +i * 3,20,y);
            setBackground(Color.WHITE);

        }
    }
}
