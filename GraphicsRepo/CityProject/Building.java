//********************************************************************
//  StickFigure.java       Author: Lewis/Loftus/Cocking
//
//  Represents a graphical stick figure.
//********************************************************************

import java.awt.*;

public class Building
{
   private int baseX;     // center of building
   private int baseY;     // floor
   private Color color;   // color of building
   private int height;    // height of buildling
   private int width;	  // width of building

   //-----------------------------------------------------------------
   //  Sets up the building's primary attributes.
   //-----------------------------------------------------------------
   public Building (int x, int y, Color shade, int tall, int wide){
      baseX = x;
      baseY = y;
      color = shade;
      height = tall;
      width = wide;
   }

   public Building(){
	   baseX = 0;
	   baseY = 0;
	   color = Color.cyan;
	   height = 0;
	   width = 0;
   }

   //-----------------------------------------------------------------
   //  Draws this figure relative to baseX, baseY, and height.
   //-----------------------------------------------------------------
   public void draw (Graphics page)
   {

      //increases y moves closer to the bottom, center of head moved down to bottom of head
      page.drawRect(baseX, baseY, -width, -height);
      page.setColor(color);

      //windows

   }

   /*
   * drawDoof, draws Doofenshmirtz Tower.
   */
   public void drawDoof(Graphics page){
	   int x[] = {500,1000,1000,300};
	   int y[] = {700,700,400,400};
	   page.drawPolygon(x,y,4);
   }

   /**
   * setParam
   * @param new height, width, and color for building
   */

   public void setParam(int x, int y, Color shade){
   		height = x;
   		width = y;
   		color = shade;
   }
}
