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

   //-----------------------------------------------------------------
   //  Draws this figure relative to baseX, baseY, and height.
   //-----------------------------------------------------------------
   public void draw (Graphics page)
   {

      //increases y moves closer to the bottom, center of head moved down to bottom of head
      page.drawRect(baseX, baseY, width, height);
      page.setColor(color);

      //windows

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
