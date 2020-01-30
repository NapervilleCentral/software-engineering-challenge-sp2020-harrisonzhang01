/**
 * Harrison Zhang
 * 01/30/2019
 * City Project
 * Draws a city using applet functionality
 */

import java.util.Random;
import java.applet.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class City extends Applet implements MouseListener{//, MouseMotionListener{
   private final int APPLET_WIDTH = 1920;
   private final int APPLET_HEIGHT = 1080;
   private final int HEIGHT_MIN = 100;
   private final int WIDTH_MIN = 75;
   private final int VARIANCE = 50;

   private Building build1, build2, build3, build4, build5;

   private AudioClip audio;

   private int wide, high, mouseX, mouseY;

   //-----------------------------------------------------------------
   //  Creates several buildings with varying characteristics.
   //-----------------------------------------------------------------
   public void init ()
   {
      int h1, h2, h3, h4, w1, w2, w3, w4;  // heights of stick figures
      audio = getAudioClip(getCodeBase(), "theme.au");

      Random generator = new Random();

      h1 = HEIGHT_MIN + generator.nextInt(VARIANCE)+300;
      h2 = HEIGHT_MIN + generator.nextInt(VARIANCE)+300;
      h3 = HEIGHT_MIN + generator.nextInt(VARIANCE)+300;
      h4 = HEIGHT_MIN + generator.nextInt(VARIANCE)+300;

      int width = 150;

      Color sky = new Color(134, 218, 252);
      setBackground(sky);

      Color c1 = new Color(200, 209, 192);
      Color c2 = new Color(191, 200, 217);
      Color c3 = new Color(154, 194, 206);
      Color c4 = new Color(186, 197, 215);

      build1 = new Building(800, 700, c1, h1, width);
      build2 = new Building(width + 825, 700, c2, h2, width);
      build3 = new Building(2*width + 850, 700, c3, h3, width);
      build4 = new Building(3*width + 875, 700, c4, h4, width);

      Color c5 = new Color(149,159,159);

      setSize (APPLET_WIDTH, APPLET_HEIGHT);


      //Changes cursor to a crosshair
	  Image aim = Toolkit.getDefaultToolkit().getImage("crosshair.png");
	  Cursor crosshair = Toolkit.getDefaultToolkit().createCustomCursor(aim, new Point(0,0), "custom");
      setCursor(crosshair);


	  addMouseListener( this );
	  //addMouseMotionListener( this );

   }

   //-----------------------------------------------------------------
   //  Paints the city on the applet.
   //-----------------------------------------------------------------
   public void paint (Graphics page){
      audio = getAudioClip(getCodeBase(), "theme.au");
      //audio.loop();
      
      //draws buildings
      build1.draw(page);
      build2.draw(page);
      build3.draw(page);
      build4.draw(page);

      //draws windows
      build1.drawWindow(page);
      build2.drawWindow(page);
      build3.drawWindow(page);
      build4.drawWindow(page);

      //Creates Doofenshmirtz Tower
      Image img = getImage(getDocumentBase(), "doof.jpg");
      page.drawImage(img, 0, 0, getWidth()-850, getHeight(), this);

	  //Animates building heights
      Random gen = new Random();
	  int count = 0;
	  int newHeight1 = build1.getHeight();
	  int newHeight2 = build2.getHeight();
	  int newHeight3 = build3.getHeight();
	  int newHeight4 = build4.getHeight();
	 while(count < 50){
		  newHeight1 = newHeight1 + (gen.nextInt(3)-1)*5;
		  newHeight2 = newHeight2 + (gen.nextInt(3)-1)*5;
		  newHeight3 = newHeight3 + (gen.nextInt(3)-1)*5;
		  newHeight4 = newHeight4 + (gen.nextInt(3)-1)*5;

		  build1.setHeight(newHeight1);
		  build2.setHeight(newHeight2);
		  build3.setHeight(newHeight3);
		  build4.setHeight(newHeight4);
		  //repaint();
		  
		  try{
			  Thread.sleep(10);//30 or 60 fps = 17
		  }catch(Exception e){}
		  count++;
	  }
	  repaint();

   }
   
   //makes buildings disappear when clicked on
   public void mouseClicked(MouseEvent e){
	   mouseX = e.getX();
	   mouseY = e.getY();

	   //X & Y bounds
	   int x_req1 = build1.getBaseX() + build1.getWidth() - 155;
	   int y_req1 = build1.getBaseY() + build1.getHeight() - 400;

	   if((mouseX > build1.getBaseX() - 155 && mouseX < x_req1) &&
	      (mouseY > build1.getBaseY() - 400 && mouseY < y_req1)){

			//building disappears from the screen
		   while(build1.getBaseY() < APPLET_HEIGHT ){
			   //next = next + 50;
			   build1.setBaseY(build1.getBaseY()+500);
			   repaint();
			}
	   }

	   //building 2
	   int x_req2 = build2.getBaseX() + build2.getWidth() - 155;
	   int y_req2 = build2.getBaseY() + build2.getHeight() - 400;

	   if((mouseX > build2.getBaseX() - 155 && mouseX < x_req2) &&
		  (mouseY > build2.getBaseY() - 400 && mouseY < y_req2)){

			//building disappears from the screen
		   while(build2.getBaseY() < APPLET_HEIGHT ){
			   build2.setBaseY(build2.getBaseY()+500);
			   repaint();
			}
	   }

	   //building 3
	   int x_req3 = build3.getBaseX() + build3.getWidth() - 155;
	   int y_req3 = build3.getBaseY() + build3.getHeight() - 400;

	   if((mouseX > build3.getBaseX() - 155 && mouseX < x_req3) &&
		  (mouseY > build3.getBaseY() - 400 && mouseY < y_req3)){

			//building disappears from the screen
		   while(build3.getBaseY() < APPLET_HEIGHT ){
			   build3.setBaseY(build3.getBaseY()+500);
			   repaint();
			}
	   }

	   //building 4
	   int x_req4 = build4.getBaseX() + build4.getWidth() - 155;
	   int y_req4 = build4.getBaseY() + build4.getHeight() - 400;

	   if((mouseX > build4.getBaseX() - 155 && mouseX < x_req4) &&
		  (mouseY > build4.getBaseY() - 400 && mouseY < y_req4)){

			//building disappears from the screen
		   while(build4.getBaseY() < APPLET_HEIGHT ){
			   //next = next + 50;
			   build4.setBaseY(build4.getBaseY()+500);
			   repaint();
			}
	   }
   }

   public void mousePressed(MouseEvent e){}
   public void mouseEntered(MouseEvent e){}

   public void mouseReleased(MouseEvent e){}
   public void mouseExited(MouseEvent e){}

   public void mouseDragged(MouseEvent e){}
   public void mouseMoved(MouseEvent e){}


}
