package test;

import java.util.Scanner;
import java.awt.*;
public class Tetris21 extends javax.swing.JPanel {

    //static char c;
    int[][] occupied = new int[10][20];

   /* // [seven tokens] [ four rotations ] [ four cells]
    static int[][][] xRotationArray = {
       { {0,1,1,2}, {0,0,0,1}, {2,0,1,2}, {0,1,1,1} },  // token number 0
       { {0,0,1,1}, {1,2,0,1}, {0,0,1,1}, {1,2,0,1} },  // token number 1
       { {1,1,0,0}, {0,1,1,2}, {1,1,0,0}, {0,1,1,2} },  // token number 2
       { {0,1,2,2}, {0,1,0,0}, {0,1,1,2}, {1,1,0,1} },  // token number 3
       { {1,0,1,2}, {1,0,1,1}, {0,1,1,2}, {0,0,1,0} },  // token number 4
       { {0,1,0,1}, {0,1,0,1}, {0,1,0,1}, {0,1,0,1} },  // token number 5
       { {0,1,2,3}, {0,0,0,0}, {0,1,2,3}, {0,0,0,0} }   // token number 6
    };

    static int[][][] yRotationArray = {
       { {0,1,0,0}, {0,1,2,2}, {0,1,1,1}, {0,0,1,2} },  // token number 0
       { {0,0,1,2}, {0,0,1,1}, {0,1,1,2}, {0,0,1,1} },  // token number 1
       { {0,1,1,2}, {0,0,1,1}, {0,1,1,2}, {0,0,1,1} },  // token number 2
       { {0,0,0,1}, {0,0,1,2}, {0,1,1,1}, {0,1,2,2} },  // token number 3
       { {0,1,1,1}, {0,1,1,2}, {0,0,1,0}, {0,1,1,2} },  // token number 4
       { {0,0,1,1}, {0,0,1,1}, {0,0,1,1}, {0,0,1,1} },  // token number 5
       { {0,0,0,0}, {0,1,2,3}, {0,0,0,0}, {0,1,2,3} }   // token number 6
    };


  int score=0;  // score
  int lineCompleted = 0;   // number of lines completed
  int level=0;            //Level

  javax.swing.JLabel scoreLabel = new javax.swing.JLabel("SCORE : 0");
  javax.swing.JLabel levelLabel = new javax.swing.JLabel("LEVEL : 0");

  public void init()
  {
    this.setPreferredSize(new java.awt.Dimension(400,480));
    this.setBackground(java.awt.Color.GREEN);

    this.setLayout(null);    // absolute coordinate system

    scoreLabel.setBounds(300,0,100,30);  // x,y,w,h (in pixels)
    this.add(scoreLabel);

    levelLabel.setBounds(300,100,100,30);
    this.add(levelLabel);

  }

  public void drawCell(int x,int y)
  {
    occupied[x][y] = 1;
  }

  public void eraseCell(int x,int y)
  {
    occupied[x][y] = 0;
  }

  public void drawToken(int x, int y, int[] xArray, int[] yArray)
  {
    for (int i=0;i<4;i++)
    {
      drawCell(x+xArray[i],y+yArray[i]);
    }
  }

  public void eraseToken(int x, int y, int[] xArray, int[] yArray)
  {
    for (int i=0;i<4;i++)
    {
      eraseCell(x+xArray[i],y+yArray[i]);
    }
  }
*/
  public void paint(java.awt.Graphics gr)
  {
    super.paint(gr);

    /*this.setPreferredSize(new java.awt.Dimension(400,480));
	    this.setBackground(java.awt.Color.GREEN);

	    this.setLayout(null);    // absolute coordinate system

	    scoreLabel.setBounds(300,0,100,30);  // x,y,w,h (in pixels)
	    this.add(scoreLabel);

	    levelLabel.setBounds(300,100,100,30);
    this.add(levelLabel);


    for (int x=0;x<occupied.length;x++)
      for (int y=0;y<occupied[0].length;y++)
        if (occupied[x][y]==1)
        {
          // draw cell
          gr.setColor(java.awt.Color.BLACK);
          gr.fillRect(x*24,y*24,24,24);
          gr.setColor(java.awt.Color.BLUE);
          gr.fillRect(x*24+1,y*24+1,22,22);
        }
        else
        {
          // erase cell
          gr.setColor(java.awt.Color.WHITE);
          gr.fillRect(x*24,y*24,24,24);
        }*/
        gr.setSize (200,200);
        gr.setBackground (Color.Black);
  }
  public static void main(String[] args)
  {

      paint pt = new paint();
      pt.setVisible(true);

      javax.swing.JFrame window = new javax.swing.JFrame("Tetris World");
  }
}