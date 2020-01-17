/**
 * Write a description of class Doofinator here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class Shoot extends Applet implements MouseListener, MouseMotionListener{
   private int mouseX, mouseY;

   //-----------------------------------------------------------------
   //  Sets up the building's primary attributes.
   //-----------------------------------------------------------------
   public Shoot (int x, int y, Color shade){
      baseX = x;
      baseY = y;
      color = shade;
   }

   //-----------------------------------------------------------------
   //  Draws this figure relative to baseX, baseY, and height.
   //-----------------------------------------------------------------
   public void draw (Graphics page)
   {

      //increases y moves closer to the bottom, center of head moved down to bottom of head
      page.fillArc(baseX, baseY, 75, 75, 0, 360);
      page.setColor(color);

      int x[] = {baseX-25, baseX+50, baseX+25};
      int y[] = {baseY+75, baseY+75, baseY+60};
      page.fillPolygon(x, y, 3);
      page.setColor(color);

      //windows

   }
}
