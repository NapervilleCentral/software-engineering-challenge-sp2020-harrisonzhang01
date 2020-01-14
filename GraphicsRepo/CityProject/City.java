//********************************************************************
//  LineUp.java       Author: Lewis/Loftus/Cocking
//
//  Demonstrates the use of a graphical object.
//********************************************************************

import java.util.Random;
import java.applet.Applet;
import java.awt.*;
import javax.swing.*;

public class City extends Applet
{
   private final int APPLET_WIDTH = 1000;
   private final int APPLET_HEIGHT = 700;
   private final int HEIGHT_MIN = 100;
   private final int WIDTH_MIN = 75;
   private final int VARIANCE = 50;

   private Building build1, build2, build3, build4;

   //-----------------------------------------------------------------
   //  Creates several buildings with varying characteristics.
   //-----------------------------------------------------------------
   public void init ()
   {
      int h1, h2, h3, h4, w1, w2, w3, w4;  // heights of stick figures
      Random generator = new Random();

      h1 = HEIGHT_MIN + generator.nextInt(VARIANCE)+100;
      h2 = HEIGHT_MIN + generator.nextInt(VARIANCE)+100;
      h3 = HEIGHT_MIN + generator.nextInt(VARIANCE)+100;
      h4 = HEIGHT_MIN + generator.nextInt(VARIANCE)+100;

      w1 = WIDTH_MIN + generator.nextInt(VARIANCE);
	  w2 = WIDTH_MIN + generator.nextInt(VARIANCE);
	  w3 = WIDTH_MIN + generator.nextInt(VARIANCE);
      w4 = WIDTH_MIN + generator.nextInt(VARIANCE);

      build1 = new Building (200, 500, Color.red, h1, w1);
      build2 = new Building (w1 + 250, 500, Color.green, h2, w2);
      build3 = new Building (w1 + w2 + 300, 500, Color.blue, h3, w3);
      build4 = new Building (w1 + w2 + w3 + 350, 500, Color.yellow, h4, w4);
      build4 = new Building (w1 + w2 + w3 + 350, 500, Color.yellow, h4, w4);

      //setBackground (Color.black);
      setSize (APPLET_WIDTH, APPLET_HEIGHT);
   }

   //-----------------------------------------------------------------
   //  Paints the stick figures on the applet.
   //-----------------------------------------------------------------
   public void paint (Graphics page)
   {

	  Random generator = new Random();
      build1.draw(page);
      build2.draw(page);
      build3.draw(page);
      build4.draw(page);

      int newHeight = HEIGHT_MIN + generator.nextInt(VARIANCE);
      int newHeight2 = HEIGHT_MIN + generator.nextInt(VARIANCE);

      int newWidth = WIDTH_MIN + generator.nextInt(VARIANCE);
      int newWidth2 = WIDTH_MIN + generator.nextInt(VARIANCE);



   }
}
