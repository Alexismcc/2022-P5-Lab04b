// Lab04bvst.java
// The AWT Graphics Program
// This is the student, starting version of Lab04b.


import java.awt.*;
import java.applet.*;


public class Lab04bvst extends Applet
{

    public void paint(Graphics g)
    {
        // DRAW CUBE
        g.drawRect(50,50,200,200);
        g.drawRect(100,100,200,200);
        g.drawLine(50,50,100,100);
        g.drawLine(250,50,300,100);
        g.drawLine(100,300,50,250);
        g.drawLine(300,300,250,250);

        // DRAW SPHERE

        g.drawOval(75,75,200,200);
        g.drawOval(75,150,200,50);
        g.drawOval(75,125,200,100);
        g.drawOval(75,100,200,150);
        g.drawOval(150,75,50,200);
        g.drawOval(125,75,100,200);
        g.drawOval(100,75,150,200);

        // DRAW INSCRIBED/CIRCUMSCRIBED TRIANGLE

        g.drawOval(750,425,150,150);
        g.drawLine(750,500,875,445);
        g.drawLine(750,500,825,575);
        g.drawLine(825,575,875,445);
        g.drawOval(776,477,71,71);

        // DRAW APCS

        // A
        g.fillRect(75,450,25,125);
        g.fillRect(75,450,75,25);
        g.fillRect(125,450,25,125);
        g.fillRect(75,500,75,25);
        // P
        g.fillRect(175,450,25,125);
        g.fillRect(175,450,75,25);
        g.fillRect(225,450,25,75);
        g.fillRect(175,500,75,25);
        // C
        g.fillRect(275,450,75,25);
        g.fillRect(275,450,25,125);
        g.fillRect(275,550,75,25);
        // S
        g.fillRect(375,450,75,25);
        g.fillRect(375,450,25,75);
        g.fillRect(375,500,75,25);
        g.fillRect(425,500,25,75);
        g.fillRect(375,550,75,25);


        // DRAW PACMEN FLOWER
        g.fillArc(665,250,100,100,45,270);
        g.fillArc(600,315,100,100,-45,270);
        g.fillArc(535,250,100,100,225,270);
        g.fillArc(600,185,100,100,-225,270);
    }

}


