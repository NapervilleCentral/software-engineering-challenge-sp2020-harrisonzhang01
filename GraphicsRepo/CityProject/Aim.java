/**
 * Write a description of class Doofinator here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.awt.*;
import java.applet.Applet;
public class Aim extends Applet{

	static Label label, label1, label2;
	Aim(){
      Panel panel = new Panel();

      Image aim = Toolkit.getDefaultToolkit().getImage("crosshair.png");

      Point point = new Point(0,0);
      Label label = new Label("crosshair");

      Cursor crosshair = Toolkit.getDefaultToolkit().createCustomCursor(aim, point, "crosshair");
      label.setCursor(crosshair);

   }
}
