/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoe;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.LineBorder;

/**
 *
 * @author Anurag
 */
public class Cell extends JPanel
{
    private char token = ' ';
    
    public Cell()
    {
        setBorder(new LineBorder(Color.black, 1));
        addMouseListener(new MouseListener());        
    }
    public char getToken()
    {
        return token;
    }
    public void setToken(char c)
    {
        token = c;
        repaint();
    }
    
    @Override
    protected void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        
        if(token == 'X')
        {
            g.drawLine(10, 10, getWidth()-10, getHeight()-10);
        }
        else if(token == 'O')
        {
            g.drawOval(10, 10, getWidth()-10, getWidth());
        }
    }
}
