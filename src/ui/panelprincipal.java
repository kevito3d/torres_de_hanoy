/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author kevin
 */
public class panelprincipal extends JPanel{

    private ImageIcon archivo0 = new ImageIcon(this.getClass().getResource("/imagenes/jugar.png"));
    private Image archivo_modificado0 = archivo0.getImage();
    private Icon icon_jugar = new ImageIcon(archivo_modificado0);
    // private ImageIcon archivo1 = new ImageIcon(this.getClass().getResource("/imagenes/comoJugar.png"));
    // private Image archivo_modificado1 = archivo1.getImage();
    // private Icon icon_comoJugar = new ImageIcon(archivo_modificado1);
    // private ImageIcon archivo2 = new ImageIcon(this.getClass().getResource("/imagenes/puntuaciones.png"));
    // private Image archivo_modificado2 = archivo2.getImage();
    // private Icon icon_puntuaciones = new ImageIcon(archivo_modificado2);
    // private ImageIcon archivo3 = new ImageIcon(this.getClass().getResource("/imagenes/salir.png"));
    // private Image archivo_modificado3 = archivo3.getImage();
    // private Icon icon_salir = new ImageIcon(archivo_modificado3);
    paneldelmenu panel;
    paneldeljuego panel2;

    public panelprincipal() {
        setLayout(null);
        setSize(900, 604);
        setOpaque(true);
        setBackground(Color.white);
        panel = new paneldelmenu();
        panel2 = new paneldeljuego();
        panel2.setVisible(false);
        panel.setBounds(0, 0, 900, 604);
        panel2.setBounds(0, 0, 900, 604);
        add(panel);
        add(panel2);
        panel.getbtn_jugar().addMouseListener(e);
        panel2.getbtn_atras().addMouseListener(e2);
        /*panel.getbtn_comoJugar().addMouseListener(e3);
        panel.getbtn_puntuaciones().addMouseListener(e4);
        panel.getbtn_salir().addMouseListener(e5);*/
    }
    MouseListener e = new MouseListener() {
        @Override
        public void mouseClicked(MouseEvent me) {
            panel.setVisible(false);
            panel2.setVisible(true);
            
        }

        @Override
        public void mousePressed(MouseEvent me) {

        }

        @Override
        public void mouseReleased(MouseEvent me) {

        }

        @Override
        public void mouseEntered(MouseEvent me) {
            panel.getbtn_jugar().setIcon(icon_jugar);
        }

        @Override
        public void mouseExited(MouseEvent me) {
            panel.getbtn_jugar().setIcon(null);
        }
    };
    MouseListener e2 = new MouseListener() {
        @Override
        public void mouseClicked(MouseEvent me) {
            int option = JOptionPane.showConfirmDialog(
                        null,
                        "¿Estás seguro de que quieres cerrar la aplicación?",
                        "Confirmación de cierre",
                        JOptionPane.YES_NO_OPTION,
                        JOptionPane.QUESTION_MESSAGE);
                if (option == JOptionPane.YES_OPTION) {
                    panel2.setVisible(false);
            panel.setVisible(true);
            updateUI();
            panel2.getbtn_atras().setForeground(Color.black);
                } 
        }

        @Override
        public void mousePressed(MouseEvent me) {

        }

        @Override
        public void mouseReleased(MouseEvent me) {

        }

        @Override
        public void mouseEntered(MouseEvent me) {
            panel2.getbtn_atras().setForeground(Color.red);
        }

        @Override
        public void mouseExited(MouseEvent me) {
            panel2.getbtn_atras().setForeground(Color.black);
        }
    };
    MouseListener e3 = new MouseListener() {
        @Override
        public void mouseClicked(MouseEvent me) {
            removeAll();
            add(panel);
            System.out.println("asdasdasdsd");
            updateUI();
        }

        @Override
        public void mousePressed(MouseEvent me) {

        }

        @Override
        public void mouseReleased(MouseEvent me) {

        }

        @Override
        public void mouseEntered(MouseEvent me) {
        }

        @Override
        public void mouseExited(MouseEvent me) {
        }
    };
    MouseListener e4 = new MouseListener() {
        @Override
        public void mouseClicked(MouseEvent me) {
            removeAll();
            add(panel);
            updateUI();
        }

        @Override
        public void mousePressed(MouseEvent me) {

        }

        @Override
        public void mouseReleased(MouseEvent me) {

        }

        @Override
        public void mouseEntered(MouseEvent me) {
        }

        @Override
        public void mouseExited(MouseEvent me) {
        }
    };
    MouseListener e5 = new MouseListener() {
        @Override
        public void mouseClicked(MouseEvent me) {
            System.exit(0);
        }

        @Override
        public void mousePressed(MouseEvent me) {

        }

        @Override
        public void mouseReleased(MouseEvent me) {

        }

        @Override
        public void mouseEntered(MouseEvent me) {
            //panel.getbtn_salir().setIcon(icon_salir);
        }

        @Override
        public void mouseExited(MouseEvent me) {
            panel.getbtn_salir().setIcon(null);
        }
    };

   
   

}
