package tarea4_ordenamiento;

import java.awt.*;
import javax.swing.*;
        
public class Menu extends JFrame {
    
    JFrameSwing jf = new JFrameSwing();
    //jf.setVisible(true);
    DragAndDrop dr = new DragAndDrop();
    //dr.setVisible(true);
    
    Container lienzo;
    JLabel txt_title, txt_t1;
    JButton btn_drag, btn_jframe, btn_salir;
    
    public Menu(){
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setBounds(0, 0, 450, 320);
        this.setTitle("Menu de Opciones");
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setLayout(null);
        
        txt_title = new JLabel("Menu de Opciones");
        txt_title.setFont( new Font("Candara", Font.BOLD, 28));
        txt_title.setBounds(75, 10, 350, 75);
        txt_title.setForeground(new Color(0x58665C));
        txt_title.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/menu.png")));
        
        txt_t1 = new JLabel("Seleccione una opción.");
        txt_t1.setFont(new Font("Candara Light", Font.PLAIN,18));
        txt_t1.setBounds(115, 95, 270, 20);
        txt_t1.setForeground(new Color(0x58665C));
        
        btn_drag = new JButton("Menu Drag And Drop");
        btn_drag.setFont(new Font("Candara Light", Font.BOLD,18));
        btn_drag.setBounds(75, 130, 300, 35);
        btn_drag.setForeground(new Color(0x58665C));
        btn_drag.setBackground(new Color(0xEBFFF0));
        
        btn_jframe = new JButton("Menu JFrame");
        btn_jframe.setFont(new Font("Candara Light", Font.BOLD,18));
        btn_jframe.setBounds(75, 175, 300, 35);
        btn_jframe.setForeground(new Color(0x58665C));
        btn_jframe.setBackground(new Color(0xEBFFF0));
        
        btn_salir = new JButton("Salir del programa");
        btn_salir.setFont(new Font("Candara Light", Font.BOLD,18));
        btn_salir.setBounds(75, 220, 300, 35);
        btn_salir.setForeground(new Color(0x58665C));
        btn_salir.setBackground(new Color(0xEBFFF0));
        
        btn_drag.addActionListener(new java.awt.event.ActionListener(){
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setVisible(false);
                dr.setVisible(true);
            }
        });
        
        btn_jframe.addActionListener(new java.awt.event.ActionListener(){
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setVisible(false);
                jf.setVisible(true);
            }
        });
        
        btn_salir.addActionListener(new java.awt.event.ActionListener(){
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JOptionPane.showMessageDialog(null, "Cerraste el programa, nos vemos pronto","Salir",3);
                System.exit(0);
            }
        });
        
        lienzo = this.getContentPane();
        lienzo.add(txt_title);
        lienzo.add(txt_t1);
        lienzo.add(btn_drag);
        lienzo.add(btn_jframe);
        lienzo.add(btn_salir);
        
    }
    
}
