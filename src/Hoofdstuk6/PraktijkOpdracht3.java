package Hoofdstuk6;

import java.awt.*;
import java.applet.*;

public class PraktijkOpdracht3 extends Applet {
    double cijfer1;
    double cijfer2;
    double cijfer3;
    double cijfer4;
    double uitkomst;
    double uitkomst2;
    double cijfer5;
    double uitkomst3;
    int cijfer6;
    double uitkomst4;

    public void init() {
        setBackground(Color.WHITE);

        cijfer1 = 5.9;
        cijfer2 = 6.3;
        cijfer3 = 6.9;
        cijfer4 = 3;
        uitkomst = cijfer1 + cijfer2 + cijfer3;
        uitkomst2 = uitkomst / cijfer4;
        cijfer5 = 10;
        uitkomst3 = uitkomst2 * cijfer5;
        cijfer6 = 63;
        uitkomst4 = cijfer6 / cijfer5;}


    public void paint(Graphics g) {
        getGraphics().drawString("Het gemiddelde is: " + uitkomst4, 20, 20);


    }
}
