/**
 * Write a description of class Doofinator here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.awt.*;
public class Aim{

	static JFrame frame;
	static Label label, label1, label2;
	Aim(){
      frame = new JFrame("cursor");
      JPanel panel = new JPanel();

      Image aim = Toolkit.getDefaultToolkit().getImage("crosshair.png");

      Point point = new Point(0,0);
      Label label = new Label("crosshair");

      Cursor crosshair = Toolkit.getDefaultToolkit().createCustomCursor(aim, point, "crosshair");
      label.setCursor(crosshair);
      panel.add(label);
      frame.add(panel);
      frame.setSize(250, 300);
   }
}
