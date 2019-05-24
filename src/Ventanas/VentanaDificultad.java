/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;

import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author patri
 */
public class VentanaDificultad extends javax.swing.JFrame {

    /**
     * Creates new form Dificultad
     */
    static String dificultad;

    public VentanaDificultad() {
        initComponents();

        this.getContentPane().setBackground(Color.darkGray);
        buttonGroupDificultad.add(botonBaja);
        buttonGroupDificultad.add(botonMedia);
        buttonGroupDificultad.add(botonAlta);
        buttonGroupDificultad.add(botonImposible);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupDificultad = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        botonBaja = new javax.swing.JRadioButton();
        botonMedia = new javax.swing.JRadioButton();
        botonAlta = new javax.swing.JRadioButton();
        botonImposible = new javax.swing.JRadioButton();
        botonAJugar = new javax.swing.JButton();
        botonAtras = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Courier New", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Elige la dificultad:");

        botonBaja.setBackground(new java.awt.Color(102, 102, 102));
        botonBaja.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        botonBaja.setForeground(new java.awt.Color(255, 255, 255));
        botonBaja.setText("BAJA (5 zombies)");
        botonBaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBajaActionPerformed(evt);
            }
        });

        botonMedia.setBackground(new java.awt.Color(102, 102, 102));
        botonMedia.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        botonMedia.setForeground(new java.awt.Color(255, 255, 255));
        botonMedia.setText("MEDIA (15 zombies)");
        botonMedia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonMediaActionPerformed(evt);
            }
        });

        botonAlta.setBackground(new java.awt.Color(102, 102, 102));
        botonAlta.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        botonAlta.setForeground(new java.awt.Color(255, 255, 255));
        botonAlta.setText("ALTA (25 zombies)");
        botonAlta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAltaActionPerformed(evt);
            }
        });

        botonImposible.setBackground(new java.awt.Color(102, 102, 102));
        botonImposible.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        botonImposible.setForeground(new java.awt.Color(255, 255, 255));
        botonImposible.setText("IMPOSIBLE (50 zombies)");
        botonImposible.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonImposibleActionPerformed(evt);
            }
        });

        botonAJugar.setBackground(new java.awt.Color(102, 102, 102));
        botonAJugar.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        botonAJugar.setForeground(new java.awt.Color(255, 255, 255));
        botonAJugar.setText("¡A JUGAR!");
        botonAJugar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAJugarActionPerformed(evt);
            }
        });

        botonAtras.setBackground(new java.awt.Color(102, 102, 102));
        botonAtras.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        botonAtras.setForeground(new java.awt.Color(255, 255, 255));
        botonAtras.setText("ATRÁS");
        botonAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAtrasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(botonMedia)
                            .addComponent(botonBaja, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botonAlta)
                            .addComponent(botonImposible)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(botonAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 477, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(53, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botonAJugar, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(botonBaja)
                .addGap(18, 18, 18)
                .addComponent(botonMedia)
                .addGap(18, 18, 18)
                .addComponent(botonAlta)
                .addGap(18, 18, 18)
                .addComponent(botonImposible)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonAJugar, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonAJugarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAJugarActionPerformed
        // TODO add your handling code here:
        if (!(this.botonBaja.isSelected()) && !(this.botonMedia.isSelected())
                && !(this.botonMedia.isSelected()) && !(this.botonAlta.isSelected())) {
            JOptionPane.showMessageDialog(this, "ERROR: Selecciona una dificultad", "Mensaje de Error", JOptionPane.ERROR_MESSAGE);
        } else {
            new VentanaTablero().setVisible(true);
            dispose();
        }

    }//GEN-LAST:event_botonAJugarActionPerformed

    private void botonAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAtrasActionPerformed
        // TODO add your handling code here:
        new VentanaInicio().setVisible(true);
        dispose();
    }//GEN-LAST:event_botonAtrasActionPerformed

    private void botonBajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBajaActionPerformed
        // TODO add your handling code here:
        dificultad = "BAJA";
    }//GEN-LAST:event_botonBajaActionPerformed

    private void botonMediaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonMediaActionPerformed
        // TODO add your handling code here:
        dificultad = "MEDIA";
    }//GEN-LAST:event_botonMediaActionPerformed

    private void botonAltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAltaActionPerformed
        // TODO add your handling code here:
        dificultad = "ALTA";
    }//GEN-LAST:event_botonAltaActionPerformed

    private void botonImposibleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonImposibleActionPerformed
        // TODO add your handling code here:
        dificultad = "IMPOSIBLE";
    }//GEN-LAST:event_botonImposibleActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAJugar;
    private javax.swing.JRadioButton botonAlta;
    private javax.swing.JButton botonAtras;
    private javax.swing.JRadioButton botonBaja;
    private javax.swing.JRadioButton botonImposible;
    private javax.swing.JRadioButton botonMedia;
    private javax.swing.ButtonGroup buttonGroupDificultad;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
