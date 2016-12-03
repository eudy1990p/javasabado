/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javasabado;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author Eudy
 */
public class ventana extends JFrame {
    
    JTextField jtf1;
    JLabel l;
    JButton jb;
    
    public ventana(){
        super("hola por fin gui");
        this.setSize(200,300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        this.ini();
        this.setVisible(true);
    }
    
    public void ini(){
        jtf1 = new JTextField("hola como estas");
        this.add(jtf1);
        this.l = new JLabel("Estoy Aqui");
        this.add(l);
        this.jb = new JButton("Enviar");
        this.add(jb);
    }
    
}






