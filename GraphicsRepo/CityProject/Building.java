/**
 * @Harrison Zhang
 * Building Class - Creates buildings with windwos
 */

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Building{
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
   //  Draws building relative to baseX, baseY, width, and height.
   //-----------------------------------------------------------------
   public void init(){

   }
   public void draw (Graphics page){
      //draws building
      page.setColor(color);
      page.fillRect(baseX-width, baseY-height, width, height);
   }
   public void drawWindow(Graphics page){
	   //draws windows
       int x = baseX;
	   int y = baseY;
	   Color window = new Color(230,230,230);
	   for(int i = 0; i < height; i++){
		   for(int j = 0; j < width; j++){
			   page.setColor(window);
			   x+=15;
			   if(x<(baseX+width)){
				   page.fillRect(x-155,y,10,10);
			   }

	       }
	       x=baseX;
	       y-=15;
	       if(y<(baseY-height)){
			   break;
		   }
	   }
    }

   /**
   * setHeight
   * @param new height for building
   */
   public void setHeight(int y){
   		height = y;
   }
   /*
   * getHeight
   * @returns height
   */
   public int getHeight(){
	   return height;
   }
   /*
   * getWidth
   * @returns width
   */
   public int getWidth(){
   	   return width;
   }
   /*
   * getBaseX
   * @returns baseX
   */
   public int getBaseX(){
   	   return baseX;
   }
   /*
   * getBaseY
   * @returns baseY
   */
   public int getBaseY(){
   	   return baseY;
   }
   /*
   * setBaseY
   * @param y
   */
	public void setBaseY(int y){
		baseY = y;
	}

}
