package Hoofdstuk6;

import java.awt.*;
import java.applet.*;

public class Deelsom extends Applet {

        int a;
        int b;
        int uitkomst;

        public void init() {
            a = 113;
            b = 4;
            uitkomst = a/b;
        }

        public void paint(Graphics g) {
            g.drawString("De uitkomst is: "+ uitkomst, 20,20);
        }







        //Jan, Ali, Jeannette en jij



}

