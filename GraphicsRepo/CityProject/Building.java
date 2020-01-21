//********************************************************************
//  StickFigure.java       Author: Lewis/Loftus/Cocking
//
//  Represents a graphical stick figure.
//********************************************************************

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
   public Building(MouseEvent event){


   }

   //-----------------------------------------------------------------
   //  Draws this figure relative to baseX, baseY, and height.
   //-----------------------------------------------------------------
   public void init(){

   }
   public void draw (Graphics page){

      //draws building
      page.setColor(color);
      page.drawRect(baseX, baseY, -width, -height);


      //Button button = new Button("");
      //button.setBounds(50,100,95,30);
      //button.setBackground(color);

      //button.addActionListener(new ActionListener(){
		  //public void actionPerformed(ActionEvent e){
			  //page.drawRect(baseX, baseY, 500, 500);}});

      //windows
   }
   public void drawWindow(Graphics page){
	   int x = width;
	   int y = height;
	   Color window = new Color(230,230,230);
	   for(int i = 0; i < height; i++){
		   for(int j = 0; j < width; j++){
			   page.setColor(window);
			   //page.fillRect(x,y,10,10);
			   x+=15;
			   //if(x>baseX && x<(baseX+width) && y>baseY && y<(baseY+height)){
				   page.fillRect(x,y,10,10);
			   //}

	       }
	       x=0;
	       y+=15;
	   }
    }

   /**
   * setParam
   * @param new height, width, and color for building
   */

   public void setHeight(int y){
   		height = y;
   }
   public int getHeight(){
	   return height;
   }
   public int getWidth(){
   	   return width;
   }
   public int getBaseX(){
   	   return baseX;
   }
   public int getBaseY(){
   	   return baseY;
   }
   public void run(){

	}

}
