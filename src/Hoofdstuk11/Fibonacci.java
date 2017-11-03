package Hoofdstuk11;

import java.awt.*;
import java.applet.*;

public class Fibonacci extends Applet{

    public void paint (Graphics g){
            int number1 = -1;
            int number2 = 1;
            int number3;
            int y = 10;

            for(int a = 0; a < 35; a++){
                y+=20;
                number3 = number1 + number2;
                number1 = number2;
                number2 = number3;
            g.drawString("" + number3, 50,y);
            setBackground(Color.WHITE);
        }

    }

}
