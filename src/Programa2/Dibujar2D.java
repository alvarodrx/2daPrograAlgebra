/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Programa2;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

/**
 *
 * @author alvar_000
 */
public class Dibujar2D extends JPanel{
    
    Linea l;

    Dibujar2D() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    protected void paintComponent(Graphics g){
        for(int i = 0; i <= 300; i+=30){
            g.setColor(Color.red);
            g.drawLine(0, i, 300, i);
            g.setColor(Color.blue);
            g.drawLine(i,0,i,300);
        }
        //g.drawLine(l.getA().getX(), l.getA().getY(), l.getB().getX(), l.getB().getY());
        g.setColor(Color.blue);
        g.drawRect(149, 0, 2, 300);
        
        g.setColor(Color.red);
        g.drawRect(0, 149, 300, 2);
        
        
    }
    
    
   

    public Dibujar2D(Linea l) {
        this.l = l;
    }
    
    
}
