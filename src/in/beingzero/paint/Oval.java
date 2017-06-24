
import in.beingzero.paint.Shape;
import java.awt.Graphics;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author karthik-pc
 */
public class Oval extends Shape{

    public void draw(Graphics g) 
    {
      g.drawOval(10, 10,super.getWidth(),super.getHeight());
    
    }
    
}
