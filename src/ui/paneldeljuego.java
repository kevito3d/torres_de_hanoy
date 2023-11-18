/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;
import java.awt.event.*;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import logica.control;

/**
 *
 * @author kevin
 */
public class paneldeljuego extends JPanel  { 
    public static JLabel []cositos;
    public static JPanel []right0;
    public static JPanel []center0;
    public static JPanel[]left0;
    int seleccion;
    int movimientos;
    int tiempo;
    JPanel superior;
    JLabel txt_tiempo,txt_movimientos,txt_ltiempo,txt_lmovimientos;
    JPanel pControlador;
    JButton a,s,d;
    control c;
    boolean bandera=false;
    private JButton atras;
    private ImageIcon base = new ImageIcon(this.getClass().getResource("/imagenes/base.png"));
    public paneldeljuego(){
        setLayout(null);
        setOpaque(false);
        //setSize(900, 604);
        c=new control(7);
        top();
        controlador();
    }
    public void top(){
        tiempo =movimientos= 0;
        superior=new JPanel(new BorderLayout());
        superior.setBounds(0, 0, 900, 100);
        superior.setOpaque(false);
        
        atras= new JButton("atras");
        atras.setFont(new Font("comic kings", 1, 16));
        atras.setContentAreaFilled(false);
        superior.add(atras,BorderLayout.WEST);
        
        
        txt_ltiempo=new JLabel("Tiempo");
        txt_ltiempo.setFont(new Font("comic kings", 1, 16));
        txt_lmovimientos=new JLabel("Movimientos");
        txt_lmovimientos.setFont(new Font("comic kings", 1, 16));
        txt_tiempo=new JLabel("0");
        txt_tiempo.setFont(new Font("comic kings", 1, 20));
        txt_tiempo.setHorizontalAlignment((int) CENTER_ALIGNMENT);
        txt_movimientos=new JLabel("0");
        txt_movimientos.setFont(new Font("comic kings", 1, 20));
        txt_movimientos.setHorizontalAlignment((int) CENTER_ALIGNMENT);
        JPanel der=new JPanel(new GridLayout(1,4));
        der.setOpaque(false);
        der.add(txt_lmovimientos);
        der.add(txt_movimientos);
        der.add(txt_ltiempo);
        der.add(txt_tiempo);
        
        superior.add(der,BorderLayout.EAST);
        add(superior);
    }
    public void controlador(){
        JPanel p_fichas =new JPanel();
        p_fichas.setBounds(65, 160, 770, 270);
        p_fichas.setOpaque(false);
        p_fichas.setLayout(new GridLayout(1, 3));
        add(p_fichas);
        
        
        JPanel left =new JPanel();
        left.setLayout(new GridLayout(7, 1));
        left.setOpaque(false);
        p_fichas.add(left);
        cositos=new JLabel[7];
        left0 =new JPanel[7];
        int au=200;
        int aui=100;
        for (int i = 0; i < 7; i++) {
            left0[i]=new JPanel(null);
            left0[i].setOpaque(false);
            cositos[i]=new JLabel();
            cositos[i].setBackground(Color.green);
            cositos[i].setOpaque(true);
            // border radius to cositos
            
            
            cositos[i].setBounds(aui,2,(p_fichas.getWidth()/3)-au,(p_fichas.getHeight()/7)-1);
            left0[i].add(cositos[i]);
            left.add(left0[i]);
            aui=aui-15;
            au=au-30;
        }
        
        
        JPanel center =new JPanel();
        center.setLayout(new GridLayout(7, 1));
        center.setOpaque(false);
        p_fichas.add(center);
        
        center0=new JPanel[7];
        for (int i = 0; i < 7; i++) {
            center0[i]=new JPanel(null);
            center0[i].setOpaque(false);
            center.add(center0[i]);
        }
        
        
        
        JPanel right =new JPanel();
        right.setLayout(new GridLayout(7, 1));
        right.setOpaque(false);
        p_fichas.add(right);
        
        right0=new JPanel[7];
        for (int i = 0; i < 7; i++) {
            right0[i]=new JPanel(null);
            right0[i].setOpaque(false);
            right.add(right0[i]);
        }
        /*fichas fi = new fichas();
        fi.setBounds(65, 160, 770, 270);
        add(fi);*/
        
        
        pControlador = new JPanel();
        pControlador.setLayout(new GridLayout(1, 3));
        pControlador.setOpaque(false);
        
        a = new JButton();
        a.setFocusable(false);
        //a.setSize(getWidth()/3 , getHeight());
        a.setContentAreaFilled(false);
        a.addActionListener(new manejador());
        // a.setBorder(null);
        
        //add mouve listener to button
        a.addMouseListener(new evento());
        
        
        pControlador.add(a);
        s = new JButton();
        s.setFocusable(false);
        //s.setSize(getWidth() / 3, getHeight());
        s.setContentAreaFilled(false);
        s.addActionListener(new manejador());
        s.setBorder(null);
        pControlador.add(s);
        d = new JButton();
        d.setFocusable(false);
        //d.setSize(getWidth() / 3, getHeight());
        d.setContentAreaFilled(false);
        d.addActionListener(new manejador());
        d.setBorder(null);
        pControlador.add(d);
        
        pControlador.setBounds(65, 160, 770, 270);
        add(pControlador);
    }
    
   
    public JButton getbtn_atras(){
        return this.atras;
    }
    
    public class manejador implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
           if(e.getSource()==a){
               c.coneccion(1);
           }else if(e.getSource()==s){
               c.coneccion(2);
           }else if(e.getSource()==d){
               c.coneccion(3);
           }
            
        }

    }
    @Override
    public void paint(Graphics g) {
        g.drawImage(base.getImage(), 0, 0, this.getWidth(), this.getHeight(), this);
        setOpaque(false);
        super.paint(g); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
 class evento implements MouseListener{

    public evento(){

    }   
 
    @Override
    public void mouseReleased(MouseEvent arg0) {
    }
    
    @Override
    public void mousePressed(MouseEvent arg0) {
    }
    
    @Override
    public void mouseExited(MouseEvent arg0) {
        // arg0.getComponent().setBackground(Color.green);
    }

    @Override
    public void mouseEntered(MouseEvent arg0) {
        // arg0.getComponent().setBackground(Color.red);
    }
   
    @Override
    public void mouseClicked(MouseEvent arg0) {
    }

}


