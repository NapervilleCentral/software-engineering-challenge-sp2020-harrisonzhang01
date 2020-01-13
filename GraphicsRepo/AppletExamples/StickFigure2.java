//********************************************************************
//  StickFigure.java       Author: Lewis/Loftus/Cocking
//
//  Represents a graphical stick figure.
//********************************************************************

import java.awt.*;
import java.util.Random;

public class StickFigure2 implements Runnable
{
   private int baseX;     // center of figure
   private int baseY;     // floor (bottom of feet)
   private Color color;   // color of stick figure
   private int height;    // height of stick figure

   private Random gen = new Random();

   //-----------------------------------------------------------------
   //  Sets up the stick figure's primary attributes.
   //-----------------------------------------------------------------
   public StickFigure2 (int center, int bottom, Color shade, int size)
   {
      baseX = center;
      baseY = bottom;
      color = shade;
      height = size;
   }

   //-----------------------------------------------------------------
   //  Draws this figure relative to baseX, baseY, and height.
   //-----------------------------------------------------------------
   public void draw (Graphics page)
   {
      int top = baseY - height;  // top of head

      page.setColor (color);

      // head			x		y	w	h
      page.drawOval(baseX-10, top, 20, 20);
      page.setColor(Color.yellow);
      //smile
      page.fillArc(baseX-5, top+7, 10, 10, 190, 160);
      page.setColor(color);

      // trunk
      //increases y moves closer to the bottom, center of head moved down to bottom of head
      page.drawLine(baseX, top+20, baseX, baseY - 30);

      page.drawLine (baseX, baseY-30, baseX-15, baseY);  // legs
      page.drawLine (baseX, baseY-30, baseX+15, baseY);

      page.drawLine (baseX, baseY-70, baseX-25, baseY-70);  // arms
      page.drawLine (baseX, baseY-70, baseX+20, baseY-85);

   }
   /**
   * setHeight
   * @param new height for figure
   */
   public void setHeight(int size){
   		height = size;
   }
   /**
   * run method changes height of my figures
   */
   public void run(){
   		while(true){
			int newHeight = 100 + gen.nextInt(45);
			height = newHeight;

		//just to slow downt he movement of the figure
		try{
			Thread.sleep(17);//30 or 60 fps
		}catch(Exception e){}
		//test for is this working
		System.out.println(height);
	}
   }
}
