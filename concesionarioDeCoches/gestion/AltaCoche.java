/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestion;

import concesionarioCoches.Coche;
import concesionarioCoches.CocheYaExisteException;
import concesionarioCoches.Color;
import concesionarioCoches.ColorNoValidoException;
import concesionarioCoches.Modelo;
import concesionarioCoches.Gestion;
import concesionarioCoches.Marca;
import concesionarioCoches.MatriculaNoValidaException;
import concesionarioCoches.ModeloNoValidoException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;


import javax.swing.JOptionPane;

/**
 *
 * @author Jaime
 */
public class AltaCoche extends javax.swing.JDialog {

    /**
     * Creates new form AltaCoche
     */
    public AltaCoche(JFrame parent) {
        //super(parent);
        initComponents();
        this.setLocationRelativeTo(parent);
        this.setModal(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        matricula = new javax.swing.JTextField();
        plata = new javax.swing.JRadioButton();
        rojo = new javax.swing.JRadioButton();
        azul = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        modelo = new javax.swing.JList();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        marca = new javax.swing.JList();
        jLabel5 = new javax.swing.JLabel();
        add = new javax.swing.JButton();
        add1 = new javax.swing.JButton();

        jLabel1.setText("Estas dando de alta un coche...");

        jLabel2.setText("Introduce una matricula");

        matricula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                matriculaActionPerformed(evt);
            }
        });
        matricula.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                matriculaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                matriculaFocusLost(evt);
            }
        });

        buttonGroup1.add(plata);
        plata.setText("Plata");
        plata.setActionCommand("plata");
        plata.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        plata.setFocusCycleRoot(true);
        plata.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plataActionPerformed(evt);
            }
        });

        buttonGroup1.add(rojo);
        rojo.setText("Rojo");
        rojo.setActionCommand("rojo");

        buttonGroup1.add(azul);
        azul.setText("Azul");
        azul.setActionCommand("azul");
        azul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                azulActionPerformed(evt);
            }
        });

        jLabel3.setText("Escogiendo Color");

        modelo.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        modelo.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Serie1", "Serie2", "Serie3", "Serie5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(modelo);

        jLabel4.setText("Modelos");

        marca.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "BMW", "Seat" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        marca.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        marca.setRequestFocusEnabled(false);
        marca.setSelectedIndex(0);
        marca.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                marcaValueChanged(evt);
            }
        });
        jScrollPane2.setViewportView(marca);

        jLabel5.setText("Marca");

        add.setText("Añadir");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });

        add1.setText("Salir");
        add1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(213, 213, 213))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rojo)
                                    .addComponent(plata)
                                    .addComponent(azul))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(25, 25, 25))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(matricula, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(106, 106, 106)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(add)
                .addGap(18, 18, 18)
                .addComponent(add1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(matricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(plata)
                        .addGap(4, 4, 4)
                        .addComponent(rojo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(azul))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(add1)
                    .addComponent(add, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private Color getColor(){
           if(plata.isSelected()){
               return Color.PLATA;
           }
           if(rojo.isSelected()){
            return Color.ROJO;
            }
           if(azul.isSelected()){
               return Color.AZUL;
           }
          return null;
           
       
    }
    private  Modelo getModelo(){
        String strMarca =(String)marca.getSelectedValue();
        String strModelo =(String) modelo.getSelectedValue();
        Marca m = Marca.getMarca(strMarca);
        
        Modelo model = null;
        try {
            model = Modelo.getModelo(m, strModelo);
        } catch (ModeloNoValidoException ex) {
            Logger.getLogger(AltaCoche.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return model;
  
    }
    private void plataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plataActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_plataActionPerformed

    private void matriculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_matriculaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_matriculaActionPerformed

    private void azulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_azulActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_azulActionPerformed

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
          String matriculaCoche = matricula.getText();
         
          try{
              Gestion.darDeAlta(getModelo(), getColor(), matriculaCoche);
              JOptionPane.showMessageDialog(this, "Coche añadido correctamente","Coche introducido", JOptionPane.INFORMATION_MESSAGE);
             // this.setVisible(false);
          }catch(ColorNoValidoException ex){
                //Logger.getLogger(AltaCoche.class.getName()).log(Level.SEVERE, null, ex)
              JOptionPane.showMessageDialog(this, ex.getMessage(),"Error en el color", JOptionPane.ERROR_MESSAGE);
          
           } catch (MatriculaNoValidaException ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage(),"Error en la matricula", JOptionPane.ERROR_MESSAGE);
            } catch (ModeloNoValidoException ex) {
               JOptionPane.showMessageDialog(this, ex.getMessage(),"Error en el modelo", JOptionPane.ERROR_MESSAGE);
            } catch (CocheYaExisteException ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage(),"Coche ya existe", JOptionPane.ERROR_MESSAGE);
            }

    
    }//GEN-LAST:event_addActionPerformed

    private void matriculaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_matriculaFocusLost
        // TODO add your handling code here:
        if (!Coche.esValida(matricula.getText())) {
            matricula.setBackground(java.awt.Color.red);
        }
    }//GEN-LAST:event_matriculaFocusLost

    private void matriculaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_matriculaFocusGained
        // TODO add your handling code here:
         matricula.setBackground(java.awt.Color.WHITE);
    }//GEN-LAST:event_matriculaFocusGained

    private void marcaValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_marcaValueChanged
        // TODO add your handling code here:
        String valor = (String) marca.getSelectedValue();
        Marca m =  Marca.getMarca(valor);  
        String[] modelos = Modelo.getValuesForMarca(m);
        modelo.setListData(modelos);
        
    }//GEN-LAST:event_marcaValueChanged

    private void add1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add1ActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_add1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AltaCoche.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AltaCoche.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AltaCoche.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AltaCoche.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AltaCoche(null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add;
    private javax.swing.JButton add1;
    private javax.swing.JRadioButton azul;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList marca;
    private javax.swing.JTextField matricula;
    private javax.swing.JList modelo;
    private javax.swing.JRadioButton plata;
    private javax.swing.JRadioButton rojo;
    // End of variables declaration//GEN-END:variables
}
