/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package in.beingzero.paint;

import java.awt.Graphics;

/**
 *
 * @author karthik-pc
 */
public abstract class Shape implements IShape {
   
    int x1,y1,x2,y2;
    
    public int getWidth() 
    {
        return x2-x1;
    }
    
    public int getHeight()
    {
        return y2-y1;
    }
    
    public abstract void draw(Graphics g);
    
}
