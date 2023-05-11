package tarea4_ordenamiento;

import java.awt.*;
import javax.swing.*;
import clases.ListaNumero;

public class JFrameSwing extends JFrame{
    
    //Menu mn = new Menu();
    
    Container lienzo;
    JLabel txt_title, txt_ingresa;
    JTextField fld_number;
    JButton btn_ingresar, btn_ordenar, btn_reset, btn_menu, btn_salir;
    JTextArea txtar_ordenar;
    
    private int Number;
    public ListaNumero lista = new ListaNumero();
    
    public JFrameSwing(){
        this.setDefaultCloseOperation(EXIT_ON_CLOSE); //Recuerda quitar esto
        this.setTitle("JFrame, Menu de Ordenamiento");
        this.setBounds(350, 200, 450, 550);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setLayout(null);
        
        txt_title = new JLabel("Menu de Ordenamiento");
        //setBounds(Coordenada X,Coordenada Y, Anchura , Altura)
        txt_title.setBounds(40, 10, 351, 64);
        txt_title.setFont(new Font("Candara", Font.BOLD, 28));
        txt_title.setForeground(new Color(0x58665C));
        txt_title.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/menu.png")));
        
        txt_ingresa = new JLabel("Ingresa valores numericos enteros");
        txt_ingresa.setBounds(100, 75, 350, 22);
        txt_ingresa.setFont(new Font("Candara Light", Font.PLAIN, 18));
        txt_ingresa.setForeground(new Color(0x58665C));
        
        fld_number = new JTextField("");
        fld_number.setBounds(120, 103, 208, 22);
        fld_number.setFont(new Font("Candara Light", Font.PLAIN, 12));
        
        txtar_ordenar = new JTextArea("Ingrese numeros para ordenar");
        txtar_ordenar.setBounds(55, 303, 350, 120);
        txtar_ordenar.setFont(new Font("Candara Light", Font.PLAIN, 14));
        txtar_ordenar.setForeground(new Color(0x58665C));
        txtar_ordenar.setRows(5);
        
        btn_ingresar = new JButton("Ingresar");
        btn_ingresar.setBounds(110, 151, 228, 38);
        btn_ingresar.setFont(new Font("Candara", Font.BOLD, 24));
        btn_ingresar.setBackground(new Color(0xEBFFF0));
        btn_ingresar.setForeground(new Color(0x58665C));
        btn_ingresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ingresar.png")));
        
        btn_ordenar = new JButton("Ordenar");
        btn_ordenar.setBounds(110, 195, 228, 38);
        btn_ordenar.setFont(new Font("Candara", Font.BOLD, 24));
        btn_ordenar.setBackground(new Color(0xEBFFF0));
        btn_ordenar.setForeground(new Color(0x58665C));
        btn_ordenar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ordenar.png")));
        
        btn_reset = new JButton("Resetear");
        btn_reset.setBounds(110, 239, 228, 38);
        btn_reset.setFont(new Font("Candara", Font.BOLD, 24));
        btn_reset.setBackground(new Color(0xEBFFF0));
        btn_reset.setForeground(new Color(0x58665C));
        btn_reset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/reset.png")));
        
        btn_menu = new JButton("Menu");
        btn_menu.setBounds(50, 443, 165, 36);
        btn_menu.setFont(new Font("Candara", Font.BOLD, 24));
        btn_menu.setBackground(new Color(0xEBFFF0));
        btn_menu.setForeground(new Color(0x58665C));
        
        btn_salir = new JButton("Salir");
        btn_salir.setBounds(245, 443, 165, 36);
        btn_salir.setFont(new Font("Candara", Font.BOLD, 24));
        btn_salir.setBackground(new Color(0xEBFFF0));
        btn_salir.setForeground(new Color(0x58665C));
        
        btn_ingresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                if(fld_number.getText().isEmpty()){
                    JOptionPane.showMessageDialog(null, "No dejes el campo vacio","Ingresar_Error",3);
                }else{
                    try{
                        lista.agregar(Integer.valueOf(fld_number.getText()));
                        fld_number.setText("");
                    }catch(NumberFormatException e){
                        JOptionPane.showMessageDialog(null, "Error, ingrese solo numeros enteros " + e.getMessage(),"Error",1);
                        fld_number.setText("");
                    }
                }
            }
        });
        
        btn_ordenar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try{
                    txtar_ordenar.setText(fld_number.getText()); 
                    System.out.println("\n");
                    System.out.println("Lista desordenada:");
                    lista.Mostrar();
                    System.out.println("\n");
                    System.out.println("Lista ordenada:");
                    lista.Ordenar();
                    fld_number.setText("");
                    txtar_ordenar.setText(lista.lista_mostrar);
                    JOptionPane.showMessageDialog(null, "Se han ordenado los datos","Ordenamiento",3);
                }catch(Exception e){
                    JOptionPane.showMessageDialog(null, "Error, aun no has ingresado ningun dato " + e.getMessage(),"Error",1);
                    fld_number.setText("");
                }
            }
        });
        
        btn_reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lista.Reseterar();
                fld_number.setText("");
                txtar_ordenar.setText("Ingrese numeros para ordenar");
                JOptionPane.showMessageDialog(null, "Acabas de reiniciar los numeros, vuelve a ingresar de cero","Reiniciar",3);
            }
        });
        
        btn_menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lista.Reseterar();
                setVisible(false);
                JOptionPane.showMessageDialog(null, "Por favor vuelve a iniciar el programa, no pude lograr que se volviera a abrir el menu.\n"
                        + "Cometia un error de recursividad la cual no pude solucionar, una disculpa.","Error",3);
                System.exit(0);
            }
        });
        
        btn_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JOptionPane.showMessageDialog(null, "Cerraste el programa, nos vemos pronto","Salir",3);
                System.exit(0);
            }
        });
        
        lienzo = this.getContentPane();
        lienzo.add(txt_title);
        lienzo.add(txt_ingresa);
        lienzo.add(fld_number);
        lienzo.add(txtar_ordenar);
        lienzo.add(btn_ingresar);
        lienzo.add(btn_ordenar);
        lienzo.add(btn_reset);
        lienzo.add(btn_menu);
        lienzo.add(btn_salir);
        
    }
    /*No funciona
    private void iniciarcomponentes(){
        
        JPanel panel = new JPanel();
        
        panel.setBackground(Color.MAGENTA);
        this.getContentPane().add(panel);
    }
    */
}


