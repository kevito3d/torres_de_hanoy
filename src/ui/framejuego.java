/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;


import javax.swing.JFrame;

/**
 *
 * @author kevin
 */
public class framejuego extends JFrame{
    
    private panelprincipal panel; 
    public framejuego(){
        panel=new panelprincipal();
        this.setVisible(true);
        this.setSize(900,640);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.add(panel);
        
    }
    
    
    
    
}
