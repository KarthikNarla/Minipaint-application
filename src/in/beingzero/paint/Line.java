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
public class Line extends Shape {

    //@Override
    public void draw(Graphics g) {
    
       g.drawLine(100, 20, super.getWidth(),super.getHeight());
    }
    
}
