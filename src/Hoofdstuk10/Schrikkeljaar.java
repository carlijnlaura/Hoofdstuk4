package Hoofdstuk10;

import javax.swing.*;
import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Schrikkeljaar extends Applet {
    TextField tekstvak;
    Label label;
    String tekst;
    int jaar;
    String result;

    public void init() {
        setBackground(Color.WHITE);
        tekstvak = new TextField("", 20);
        label = new Label("Typ een jaartal en druk op enter");
        tekstvak.addActionListener(new TekstvakListener());
        tekst = "";
        add (label);
        add(tekstvak);
    }

    public void paint(Graphics g) {
        if (jaar != 0 && result != null) {
            g.drawString(jaar + " is " + result, 20, 70);
        }
    }

    class TekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String tekst_string = tekstvak.getText();
            try {
                jaar = Integer.parseInt(tekst_string);
            } catch (Exception e1) {
                JOptionPane.showMessageDialog(null, "geen geldig getal");
                return;
            }

            if (jaar % 4 == 0) {
                result = "wel een schrikkeljaar. Februari heeft 29 dagen";
            } else {
                result = "niet een schrikkeljaar. Februari heeft 28 dagen";
            }
            repaint();
        }
    }
}
