package Hoofdstuk11;

import java.applet.Applet;
import java.awt.*;

public class VijfVierkanten extends Applet {

    public void paint (Graphics g){
        int hoogte = 50;
        int breedte = 50;
        int x = 50;
        int y = 50;

        for(int i = 0; i <5; i++){
            y+= 50;
            g.setColor(Color.GRAY);
            g.drawRect(x, y, breedte , hoogte );
            x += breedte;

            setBackground(Color.WHITE);
        }
    }
}
