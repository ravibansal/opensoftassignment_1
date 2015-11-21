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
 * @author sampadsaha
 */
public class TicTacToeFrame extends JFrame {
    
    // Indication of turn
    
    private char whoseTurn = 'X';
    private boolean gameOver = false;
    
    // Creation of 3X3 grid
    
    private Cell[][] cells = new Cell[3][3];
    
    // Creation of status label
    JLabel jlblStatus = new JLabel("X's Turn to Play");
    
    
    public TicTacToeFrame(){
        
        // Panel for grids
        JPanel panel = new JPanel(new GridLayout(3,3,0,0));
        for(int i=0;i<3;i++)
            for(int j=0;j<3;j++)
                panel.add(cells[i][j] = new Cell());
        
        panel.setBorder(new LineBorder(Color.yellow, 1));
        jlblStatus.setBorder(new LineBorder(Color.red, 2));
        add(panel, BorderLayout.CENTER);
        add(jlblStatus, BorderLayout.SOUTH);
          
    }
    
    public boolean isFull(){
       for(int i=0;i<3;i++)
            for(int j=0;j<3;j++)
                if(cells[i][j].getToken() == ' ')
                    return false;
       return true;
            
    }
    
    public boolean isWon(char token){
      // check rows
        for(int i=0;i<3;i++)
            if((cells[i][0].getToken()== token)
                && (cells[i][1].getToken()== token)
                && (cells[i][2].getToken()== token))
                return true;
        
      // check columns
        for(int j=0;j<3;j++)
            if((cells[0][j].getToken()== token)
                && (cells[1][j].getToken()== token)
                && (cells[2][j].getToken()== token))
                return true;
        
      // check diagonals
        if((cells[0][0].getToken()== token)
            && (cells[1][1].getToken()== token)
            && (cells[2][2].getToken()== token))
            return true;
        
        if((cells[0][2].getToken()== token)
            && (cells[1][1].getToken()== token)
            && (cells[2][0].getToken()== token))
            return true;
        
        
        return false;
              
    } 
    
    public class Cell extends JPanel {
    
        private char token = ' ';

        public Cell(){
            setBorder(new LineBorder(Color.BLACK, 1));
            addMouseListener(new MyMouseListener());

        }

        public char getToken(){
            return token;
        }

        public void setToken(char c){
            token = c;
            repaint();

        }

        @Override

        protected void paintComponent(Graphics g){

            super.paintComponent(g);

            if(token == 'X'){
                g.drawLine(10, 10, getWidth()-10, getHeight()-10);
                g.drawLine(getWidth()-10, 10, 10, getHeight()-10);

            }

            else if(token == 'O'){
                g.drawOval(10, 10, getWidth()-20, getHeight()-20);

            }


        }

        private class MyMouseListener extends MouseAdapter{
            
            @Override
            
            public void mouseClicked(MouseEvent e){
                
                if(gameOver)
                    return;
                else{
                    
                    if(token == ' ' && whoseTurn != ' ')
                    setToken(whoseTurn);
                    if(isWon(whoseTurn)){
                       jlblStatus.setText(whoseTurn + "has won !!!! GAME OVER!!!");
                       whoseTurn = ' ';
                       gameOver = true;
                    }
                    else if(isFull()){
                        jlblStatus.setText("Match Draw!!! GAME OVER!!!!");
                        whoseTurn = ' ';
                        gameOver = true;
                    }
                    else {
                        whoseTurn = (whoseTurn == 'X')?'O':'X';
                        jlblStatus.setText(whoseTurn +  "'s Turn");
                    } 
                    
                }
            }
        }
    }
}
