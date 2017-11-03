package Hoofdstuk11;

import java.applet.Applet;
import java.awt.*;

public class Schaakbord extends Applet {


    public void paint(Graphics g) {
    int x = 20;
    int y = 20;
    int row = 0;
    g.drawString("Help credits naar Frits!",25,15);

    for (int i = 1; i <=64; i++) {
    if (row % 2 == 0) {
    if (i % 2 == 0) {

        g.drawRect(x, y, 20, 20); }

    else {
    g.fillRect(x, y, 20, 20); }

    }

    else {
    if (i % 2 == 0) {
        g.fillRect(x, y, 20, 20);
    }

    else {
    g.drawRect(x, y, 20, 20); }

    }

    x+=20;

    if (i % 8 == 0) {
    y += 20;
    x = 20;
    row++;


            }
        }
    }
}


