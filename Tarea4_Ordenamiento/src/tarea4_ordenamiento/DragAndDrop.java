package tarea4_ordenamiento;

import java.io.*;
import javax.swing.*;
import java.util.*;
import clases.ListaNumero;

public class DragAndDrop extends javax.swing.JFrame {

    //Menu mn = new Menu();
    
    public DragAndDrop() {
        initComponents();
        //this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setTitle("Drag And Drop, Menu de ordenamiento");
        this.setBounds(350, 200, 450, 550);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
    }
    
    private int Number;
    public ListaNumero lista = new ListaNumero();
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txt_title = new javax.swing.JLabel();
        txt_ingresa = new javax.swing.JLabel();
        btn_ordenar = new javax.swing.JButton();
        btn_ingresar = new javax.swing.JButton();
        btn_reset = new javax.swing.JButton();
        fld_number = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt_ordenar = new javax.swing.JTextArea();
        btn_menu = new javax.swing.JButton();
        btn_salir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txt_title.setFont(new java.awt.Font("Candara", 1, 28)); // NOI18N
        txt_title.setForeground(new java.awt.Color(88, 102, 92));
        txt_title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt_title.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/menu.png"))); // NOI18N
        txt_title.setText("Menu de Ordenamiento");

        txt_ingresa.setFont(new java.awt.Font("Candara Light", 0, 18)); // NOI18N
        txt_ingresa.setForeground(new java.awt.Color(88, 102, 92));
        txt_ingresa.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt_ingresa.setText("¡Ingresa valores numericos!");

        btn_ordenar.setBackground(new java.awt.Color(235, 255, 240));
        btn_ordenar.setFont(new java.awt.Font("Candara", 1, 24)); // NOI18N
        btn_ordenar.setForeground(new java.awt.Color(88, 102, 92));
        btn_ordenar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ordenar.png"))); // NOI18N
        btn_ordenar.setText("Ordenar");
        btn_ordenar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ordenarActionPerformed(evt);
            }
        });

        btn_ingresar.setBackground(new java.awt.Color(235, 255, 240));
        btn_ingresar.setFont(new java.awt.Font("Candara", 1, 24)); // NOI18N
        btn_ingresar.setForeground(new java.awt.Color(88, 102, 92));
        btn_ingresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ingresar.png"))); // NOI18N
        btn_ingresar.setText("Ingresar");
        btn_ingresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ingresarActionPerformed(evt);
            }
        });

        btn_reset.setBackground(new java.awt.Color(235, 255, 240));
        btn_reset.setFont(new java.awt.Font("Candara", 1, 24)); // NOI18N
        btn_reset.setForeground(new java.awt.Color(88, 102, 92));
        btn_reset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/reset.png"))); // NOI18N
        btn_reset.setText("Resetear");
        btn_reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_resetActionPerformed(evt);
            }
        });

        fld_number.setFont(new java.awt.Font("Candara", 0, 12)); // NOI18N

        txt_ordenar.setColumns(20);
        txt_ordenar.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        txt_ordenar.setRows(5);
        txt_ordenar.setText("Ingrese numeros para ordenar");
        jScrollPane1.setViewportView(txt_ordenar);

        btn_menu.setBackground(new java.awt.Color(235, 255, 240));
        btn_menu.setFont(new java.awt.Font("Candara", 1, 24)); // NOI18N
        btn_menu.setForeground(new java.awt.Color(88, 102, 92));
        btn_menu.setText("Menu");
        btn_menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_menuActionPerformed(evt);
            }
        });

        btn_salir.setBackground(new java.awt.Color(235, 255, 240));
        btn_salir.setFont(new java.awt.Font("Candara", 1, 24)); // NOI18N
        btn_salir.setForeground(new java.awt.Color(88, 102, 92));
        btn_salir.setText("Salir");
        btn_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txt_title, javax.swing.GroupLayout.DEFAULT_SIZE, 383, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(55, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_ingresa, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btn_ordenar, javax.swing.GroupLayout.DEFAULT_SIZE, 265, Short.MAX_VALUE)
                                    .addComponent(btn_ingresar, javax.swing.GroupLayout.DEFAULT_SIZE, 265, Short.MAX_VALUE)
                                    .addComponent(btn_reset, javax.swing.GroupLayout.DEFAULT_SIZE, 265, Short.MAX_VALUE)
                                    .addComponent(fld_number))))
                        .addGap(66, 66, 66))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btn_menu, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_salir, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txt_title, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txt_ingresa)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fld_number, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_ingresar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_ordenar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_reset)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_menu)
                    .addComponent(btn_salir))
                .addGap(173, 173, 173))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_ordenarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ordenarActionPerformed
            
        try{
            txt_ordenar.setText(fld_number.getText()); 
            System.out.println("\n");
            System.out.println("Lista desordenada:");
            lista.Mostrar();
            System.out.println("\n");
            System.out.println("Lista ordenada:");
            lista.Ordenar();
            fld_number.setText("");
            txt_ordenar.setText(lista.lista_mostrar);
            JOptionPane.showMessageDialog(null, "Se han ordenado los datos","Ordenamiento",3);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error, aun no has ingresado ningun dato " + e.getMessage(),"Error",1);
            fld_number.setText("");
        }
    }//GEN-LAST:event_btn_ordenarActionPerformed

    private void btn_resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_resetActionPerformed
        lista.Reseterar();
        fld_number.setText("");
        txt_ordenar.setText("Ingrese numeros para ordenar");
        JOptionPane.showMessageDialog(null, "Acabas de reiniciar los numeros, vuelve a ingresar de cero","Reiniciar",3);
    }//GEN-LAST:event_btn_resetActionPerformed

    private void btn_ingresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ingresarActionPerformed
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
    }//GEN-LAST:event_btn_ingresarActionPerformed

    private void btn_menuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_menuActionPerformed
        lista.Reseterar();
        setVisible(false);
        JOptionPane.showMessageDialog(null, "Por favor vuelve a iniciar el programa, no pude lograr que se volviera a abrir el menu.\n"
            + "Cometia un error de recursividad la cual no pude solucionar, una disculpa.","Error",3);
       System.exit(0);
    }//GEN-LAST:event_btn_menuActionPerformed

    private void btn_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salirActionPerformed
        JOptionPane.showMessageDialog(null, "Cerraste el programa, nos vemos pronto","Salir",3);
        System.exit(0);
    }//GEN-LAST:event_btn_salirActionPerformed

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DragAndDrop().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_ingresar;
    private javax.swing.JButton btn_menu;
    private javax.swing.JButton btn_ordenar;
    private javax.swing.JButton btn_reset;
    private javax.swing.JButton btn_salir;
    private javax.swing.JTextField fld_number;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel txt_ingresa;
    private javax.swing.JTextArea txt_ordenar;
    private javax.swing.JLabel txt_title;
    // End of variables declaration//GEN-END:variables
}
