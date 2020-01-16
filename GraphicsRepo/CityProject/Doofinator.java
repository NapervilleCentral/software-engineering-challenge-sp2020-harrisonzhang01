/**
 * Write a description of class Doofinator here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.awt.*;
public class Doofinator{
   private int baseX;     // center of building
   private int baseY;     // floor
   private Color color;   // color of building
   private int height;    // height of buildling
   private int width;     // width of building

   //-----------------------------------------------------------------
   //  Sets up the building's primary attributes.
   //-----------------------------------------------------------------
   public Doofinator (int x, int y, Color shade){
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
