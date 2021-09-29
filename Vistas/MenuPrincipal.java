/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import java.util.*;
import practico7.*;

/**
 *
 * @author Win10
 */
public class MenuPrincipal extends javax.swing.JFrame {
    HashSet<Alumno> listaAlumnos = new HashSet<>();
    HashSet<Materia> listaMaterias = new HashSet<>();
    
    /**
     * Creates new form MenuPrincipal
     */
    public MenuPrincipal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu3 = new javax.swing.JMenu();
        escritorio = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jmAgregarMateria = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jmAgregarAlumno = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jmInscripcion = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jmSalir = new javax.swing.JMenuItem();

        jMenu3.setText("jMenu3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setText("¡BIENVENIDO AL GESTOR DE COLEGIO!");

        escritorio.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(escritorioLayout.createSequentialGroup()
                .addGap(106, 106, 106)
                .addComponent(jLabel1)
                .addContainerGap(107, Short.MAX_VALUE))
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(escritorioLayout.createSequentialGroup()
                .addGap(216, 216, 216)
                .addComponent(jLabel1)
                .addContainerGap(267, Short.MAX_VALUE))
        );

        jMenu1.setText("Materia");

        jmAgregarMateria.setText("Agregar materia");
        jmAgregarMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmAgregarMateriaActionPerformed(evt);
            }
        });
        jMenu1.add(jmAgregarMateria);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Alumno");
        jMenu2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu2ActionPerformed(evt);
            }
        });

        jmAgregarAlumno.setText("Altas Alumnos");
        jmAgregarAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmAgregarAlumnoActionPerformed(evt);
            }
        });
        jMenu2.add(jmAgregarAlumno);

        jMenuBar1.add(jMenu2);

        jMenu4.setText("Registro");

        jmInscripcion.setText("Inscripcion");
        jmInscripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmInscripcionActionPerformed(evt);
            }
        });
        jMenu4.add(jmInscripcion);

        jMenuBar1.add(jMenu4);

        jMenu5.setText("Salir");

        jmSalir.setText("Cerrar programa");
        jmSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmSalirActionPerformed(evt);
            }
        });
        jMenu5.add(jmSalir);

        jMenuBar1.add(jMenu5);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jmInscripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmInscripcionActionPerformed
        // TODO add your handling code here:
        escritorio.removeAll();
        escritorio.repaint();
        inscripcion ins = new inscripcion(listaAlumnos, listaMaterias);
        
        ins.setVisible(true);
        escritorio.add(ins);
        escritorio.moveToFront(ins);
    }//GEN-LAST:event_jmInscripcionActionPerformed

    private void jmSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmSalirActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jmSalirActionPerformed

    private void jmAgregarMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmAgregarMateriaActionPerformed
        // TODO add your handling code here:
        escritorio.removeAll();
        escritorio.repaint();
        viewAgregarMateria ins = new viewAgregarMateria(listaMaterias);
        
        ins.setVisible(true);
        escritorio.add(ins);
        escritorio.moveToFront(ins);
    }//GEN-LAST:event_jmAgregarMateriaActionPerformed

    private void jMenu2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu2ActionPerformed

    private void jmAgregarAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmAgregarAlumnoActionPerformed
        // TODO add your handling code here:
        escritorio.removeAll();
        escritorio.repaint();
        viewAgregarAlumno ins = new viewAgregarAlumno(listaAlumnos);
        
        ins.setVisible(true);
        escritorio.add(ins);
        escritorio.moveToFront(ins);
    }//GEN-LAST:event_jmAgregarAlumnoActionPerformed

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
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jmAgregarAlumno;
    private javax.swing.JMenuItem jmAgregarMateria;
    private javax.swing.JMenuItem jmInscripcion;
    private javax.swing.JMenuItem jmSalir;
    // End of variables declaration//GEN-END:variables
}