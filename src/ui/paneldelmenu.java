/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author kevin
 */
public class paneldelmenu extends JPanel{
    private JButton comoJugar;
    private JButton jugar;
    private JButton puntuaciones;
    private JButton salir;
    private ImageIcon base = new ImageIcon(this.getClass().getResource("/imagenes/main.png"));
    public paneldelmenu(){
        setLayout(null);
        setOpaque(false);
        //setSize(900, 604);
        btn_jugar();
        btn_comoJugar();
        btn_puntuaciones();
        btn_salir();
    }
    public void btn_jugar(){
        jugar= new JButton();
        jugar.setBounds(57, 167, 139, 55);
        jugar.setContentAreaFilled(false);
        jugar.setBorder(null);
        add(jugar);
    }
    public JButton getbtn_jugar(){
        return this.jugar;
    }
    public void btn_comoJugar(){
        comoJugar= new JButton();
        comoJugar.setBounds(57, 243, 440, 55);
        comoJugar.setContentAreaFilled(false);
        comoJugar.setBorder(null);
        add(comoJugar);
    }
    public JButton getbtn_comoJugar(){
        return this.comoJugar;
    }
     public void btn_puntuaciones(){
        puntuaciones= new JButton();
        puntuaciones.setBounds(58, 316, 349, 55);
        puntuaciones.setContentAreaFilled(false);
        puntuaciones.setBorder(null);
        add(puntuaciones);
    }
    public JButton getbtn_puntuaciones(){
        return this.puntuaciones;
    }
    public void btn_salir(){
        salir= new JButton();
        salir.setBounds(58, 390, 121, 55);
        salir.setContentAreaFilled(false);
        salir.setBorder(null);
        add(salir);
    }
    public JButton getbtn_salir(){
        return this.salir;
    }
    @Override
    public void paint(Graphics g) {
        g.drawImage(base.getImage(), 0, 0, this.getWidth(), this.getHeight(), this);
        setOpaque(false);
        super.paint(g); //To change body of generated methods, choose Tools | Templates.
    }
}
