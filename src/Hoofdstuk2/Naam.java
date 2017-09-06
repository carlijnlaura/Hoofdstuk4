
import java.awt.*;
import java.applet.*;

public class Naam extends Applet {

    public void init() {

    }
    public void paint(Graphics g) {
      setBackground(Color.WHITE);
       g.setColor(Color.BLUE);
        g.drawString("Carlijn", 50, 60 );
        g.setColor(Color.RED);
        g.drawString("den Hartog", 50, 70 );
    }

}
