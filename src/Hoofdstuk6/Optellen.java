package Hoofdstuk6;

import java.awt.*;
import java.applet.*;

public class Optellen extends Applet {
    int cijfer1;
    int cijfer2;
    int uitkomst;

    public void init() {
        setBackground(Color.WHITE);

        cijfer1 = 2147483647;
        cijfer2 = 2;
        uitkomst = cijfer1 * cijfer2;}

    public void paint(Graphics g) {
        getGraphics().drawString("De uitkomst is: " + uitkomst, 20, 20);

    }
}


