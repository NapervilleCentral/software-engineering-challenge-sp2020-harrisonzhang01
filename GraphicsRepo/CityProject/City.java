//********************************************************************
//  LineUp.java       Author: Lewis/Loftus/Cocking
//
//  Demonstrates the use of a graphical object.
//********************************************************************

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
   private Doofinator doof1;

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

      w1 = WIDTH_MIN + generator.nextInt(VARIANCE)+50;
	  w2 = WIDTH_MIN + generator.nextInt(VARIANCE)+50;
	  w3 = WIDTH_MIN + generator.nextInt(VARIANCE)+50;
      w4 = WIDTH_MIN + generator.nextInt(VARIANCE)+50;

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
      doof1 = new Doofinator(300, 300, c5);

      setSize (APPLET_WIDTH, APPLET_HEIGHT);


      //Changes cursor to a crosshair
	  Image aim = Toolkit.getDefaultToolkit().getImage("crosshair.png");
	  Cursor crosshair = Toolkit.getDefaultToolkit().createCustomCursor(aim, new Point(0,0), "custom");
      setCursor(crosshair);

      //wide = getSize().width;
	  //high = getSize().height;
	  //mouseX = wide/2;
	  //mouseY = high/2;

	  //addMouseListener( this );
	  //addMouseMotionListener( this );

   }

   //-----------------------------------------------------------------
   //  Paints the city on the applet.
   //-----------------------------------------------------------------
   public void paint (Graphics page){
      //audio = getAudioClip(getCodeBase(), "theme.au");
      audio.loop();

      build1.draw(page);
      build1.drawWindow(page);
      build2.draw(page);
      build3.draw(page);
      build4.draw(page);

      Image img = getImage(getDocumentBase(), "doof.jpg");
      page.drawImage(img, 0, 0, getWidth()-850, getHeight(), this);

      doof1.draw(page);


      //while(count < 1000){
		  //repaint();
	  //}
	  Random gen = new Random();
	  int count = 0;
	  //int newHeight1 = build1.getHeight();
	  int newHeight2 = build2.getHeight();
	  int newHeight3 = build3.getHeight();
	  int newHeight4 = build4.getHeight();
	  while(count < 50){
		 // newHeight1 = newHeight1 + gen.nextInt(3)-1;
		  newHeight2 = newHeight2 + (gen.nextInt(3)-1)*5;
		  newHeight3 = newHeight3 + (gen.nextInt(3)-1)*5;
		  newHeight4 = newHeight4 + (gen.nextInt(3)-1)*5;

		  build2.setHeight(newHeight2);
		  build3.setHeight(newHeight3);
		  build4.setHeight(newHeight4);
		  repaint();
		  //just to slow downt he movement of the figure
		  try{
			  Thread.sleep(10);//30 or 60 fps = 17
		  }catch(Exception e){}
		  //test for is this working
		  count++;
	  }

   }
   public void mouseClicked(MouseEvent e){
	   mouseX = e.getX();
	   mouseY = e.getY();
	   if(mouseX > build1.getBaseX() && mouseX < (build1.getBaseX()+build1.getWidth()) &&
	      mouseY > build1.getBaseY() && mouseY < (build1.getBaseY()+build1.getHeight()));{
		   int next = build1.getHeight();
		   while(build1.getHeight() < 700){
			   next = next + 100;
			   build1.setHeight(next);
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
