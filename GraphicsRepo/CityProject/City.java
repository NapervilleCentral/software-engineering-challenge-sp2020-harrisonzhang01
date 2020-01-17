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

public class City extends Applet implements MouseListener, MouseMotionListener{
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
      build4 = new Building(3*width + 925, 700, c4, h4, width);

      Color c5 = new Color(149,159,159);
      doof1 = new Doofinator(300, 300, c5);

      setSize (APPLET_WIDTH, APPLET_HEIGHT);


      //Changes cursor to a crosshair
	  Image aim = Toolkit.getDefaultToolkit().getImage("crosshair.png");
	  Cursor crosshair = Toolkit.getDefaultToolkit().createCustomCursor(aim, new Point(0,0), "custom");
      setCursor(crosshair);

      wide = getSize().width;
	  high = getSize().height;
	  //setBackground( Color.black );
	  mouseX = wide/2;
	  mouseY = high/2;

	  addMouseListener( this );
	  addMouseMotionListener( this );


   }

   //-----------------------------------------------------------------
   //  Paints the city on the applet.
   //-----------------------------------------------------------------
   public void paint (Graphics page){
      //audio = getAudioClip(getCodeBase(), "theme.au");
      audio.loop();

      build1.draw(page);
      build2.draw(page);
      build3.draw(page);
      build4.draw(page);

      Image img = getImage(getDocumentBase(), "doof.jpg");
      page.drawImage(img, 0, 0, getWidth()-850, getHeight(), this);

      doof1.draw(page);
      int count = 0;
      while(count < 1000){
		  repaint();
	  }

   }

   public void mouseClicked(MouseEvent event){
	   Building build = new Building(event);
	   int tall = build.getHeight();
	   while(tall > 0){
		   build.setHeight(tall);
		   tall = tall - 10;
	   }
   }
   public void mouseExited(MouseEvent){}
}
