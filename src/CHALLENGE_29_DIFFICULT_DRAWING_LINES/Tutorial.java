/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CHALLENGE_29_DIFFICULT_DRAWING_LINES;

import java.awt.Graphics;
import java.awt.Color;
import javax.swing.JFrame;

/**
 *
 * @author adam
 */
public class Tutorial extends JFrame{
    
    public Tutorial()
    {
        setTitle("Rysowanie");
        setSize(960,960);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(true);
    }
    public void paint(Graphics g)   // z biblioteki 
    {
         g.setColor(Color.red);
         g.drawLine(0, 480, 960, 480); // horizontal
         g.drawLine(0,0,960,960);      // diagonal
         g.setColor(Color.black);
         g.drawLine(480,0,480,480); 
         g.drawLine(480,480,480,960);
         g.drawLine(0, 960, 960, 0);
         
    }
    
    public static void main(String[]args)
    {
        Tutorial tut = new Tutorial();
    }
}
