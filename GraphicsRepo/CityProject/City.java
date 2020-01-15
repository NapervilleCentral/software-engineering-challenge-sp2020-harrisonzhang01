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
   private final int APPLET_WIDTH = 1500;
   private final int APPLET_HEIGHT = 700;
   private final int HEIGHT_MIN = 100;
   private final int WIDTH_MIN = 75;
   private final int VARIANCE = 50;

   private Building build1, build2, build3, build4, build5;

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

      w1 = WIDTH_MIN + generator.nextInt(VARIANCE)+50;
	  w2 = WIDTH_MIN + generator.nextInt(VARIANCE)+50;
	  w3 = WIDTH_MIN + generator.nextInt(VARIANCE)+50;
      w4 = WIDTH_MIN + generator.nextInt(VARIANCE)+50;

      Color c1 = new Color(200, 209, 192);
      Color c2 = new Color(191, 200, 217);
      Color c3 = new Color(154, 194, 206);
      Color c4 = new Color(186, 197, 215);

      build1 = new Building (600, 700, c1, h1, w1);
      build2 = new Building (w1 + 650, 700, c2, h2, w2);
      build3 = new Building (w1 + w2 + 750, 700, c3, h3, w3);
      build4 = new Building (w1 + w2 + w3 + 900, 700, c4, h4, w4);


      Color scene = new Color(134, 218, 252);
      setBackground (scene);
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

      Image img = getImage(getDocumentBase(), "doof.jpg");

      //this.setSize(300,100);
      page.drawImage(img, 0, 75, getWidth()-1000, getHeight()-100, this);

      int newHeight = HEIGHT_MIN + generator.nextInt(VARIANCE);
      int newHeight2 = HEIGHT_MIN + generator.nextInt(VARIANCE);

      int newWidth = WIDTH_MIN + generator.nextInt(VARIANCE);
      int newWidth2 = WIDTH_MIN + generator.nextInt(VARIANCE);



   }
}
