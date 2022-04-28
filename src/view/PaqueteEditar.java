/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import controller.ControladorPaquete;
import javax.swing.JOptionPane;

/**
 *
 * @author Borja Benegas
 */
public class PaqueteEditar extends javax.swing.JFrame {

    
    private int codigo;
    private String descripcion; 
    private String destinatario; 
    private String direccion;
    private String fecha;
    private String dni_camionero; 
    private int cod_provincia;
    
    public PaqueteEditar(int nCodigo, String nDescripcion, String nDestinatario, String nDireccion, String nFecha, String nDni_Camionero, int nCod_Provincia) {
        initComponents();
        this.codigo = nCodigo;
        this.descripcion = nDescripcion;
        this.destinatario = nDestinatario;
        this.direccion = nDireccion;
        this.fecha = nFecha;
        this.dni_camionero = nDni_Camionero;
        this.cod_provincia = nCod_Provincia;
        
        this.codigo2.setText(this.codigo+"");
        this.destinatario22.setText(this.destinatario);
        this.descripcion2.setText(this.descripcion);
        this.direccion2.setText(this.direccion);
        this.fecha2.setText(this.fecha);
        this.dni_camionero2.setText(this.dni_camionero);
        this.cod_provincia2.setText(this.cod_provincia+"");
    }

   

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        codigo2 = new javax.swing.JTextField();
        destinatario2 = new javax.swing.JLabel();
        descripcion2 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        natario = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        destinatario22 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        cod_provincia2 = new javax.swing.JTextField();
        fecha2 = new javax.swing.JTextField();
        direccion2 = new javax.swing.JTextField();
        dni_camionero2 = new javax.swing.JTextField();
        actualizar2 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        actualizar3 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(102, 153, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Codigo:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 30, -1, 20));

        jLabel2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Descripcion:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 100, -1, -1));
        jPanel1.add(codigo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 30, 88, -1));
        jPanel1.add(destinatario2, new org.netbeans.lib.awtextra.AbsoluteConstraints(294, 106, -1, -1));
        jPanel1.add(descripcion2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 100, 88, -1));

        jLabel5.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Dirección:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 100, -1, 20));

        natario.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        natario.setForeground(new java.awt.Color(255, 255, 255));
        natario.setText("Destinatario:");
        natario.setToolTipText("");
        jPanel1.add(natario, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 30, -1, 20));

        jLabel6.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Fecha:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 30, -1, 20));

        jLabel8.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Dni_Camionero:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 30, -1, 20));
        jPanel1.add(destinatario22, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 30, 88, -1));

        jLabel7.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Cod_Provincia:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 100, -1, 20));
        jPanel1.add(cod_provincia2, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 100, 300, -1));
        jPanel1.add(fecha2, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 30, 88, -1));
        jPanel1.add(direccion2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 100, 88, -1));
        jPanel1.add(dni_camionero2, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 30, 111, -1));

        actualizar2.setText("Actualizar");
        actualizar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actualizar2ActionPerformed(evt);
            }
        });
        jPanel1.add(actualizar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 30, -1, -1));

        jLabel9.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Paquete");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 130, 40));

        actualizar3.setText("Cancelar");
        actualizar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actualizar3ActionPerformed(evt);
            }
        });
        jPanel1.add(actualizar3, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 100, 80, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("X");
        jLabel11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 0, 20, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1090, 160));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void actualizar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actualizar2ActionPerformed
         try {
            int cod = Integer.parseInt(codigo2.getText());
            String desc = descripcion2.getText();
            String dest = destinatario22.getText();
            String dir = direccion2.getText();
            String date = fecha2.getText();
            String dcamionero = dni_camionero2.getText();
            int cprovincia = Integer.parseInt(cod_provincia2.getText());
            ControladorPaquete.actualizarPaquete(codigo, destinatario, descripcion, direccion, fecha, dni_camionero, cod_provincia, cod, desc, dest, dir, date,  dcamionero, cprovincia);
            dispose();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_actualizar2ActionPerformed

    private void actualizar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actualizar3ActionPerformed
        dispose();
    }//GEN-LAST:event_actualizar3ActionPerformed

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
        dispose();
    }//GEN-LAST:event_jLabel11MouseClicked

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
            java.util.logging.Logger.getLogger(PaqueteEditar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PaqueteEditar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PaqueteEditar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PaqueteEditar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton actualizar2;
    private javax.swing.JButton actualizar3;
    private javax.swing.JTextField cod_provincia2;
    private javax.swing.JTextField codigo2;
    private javax.swing.JTextField descripcion2;
    private javax.swing.JLabel destinatario2;
    private javax.swing.JTextField destinatario22;
    private javax.swing.JTextField direccion2;
    private javax.swing.JTextField dni_camionero2;
    private javax.swing.JTextField fecha2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel natario;
    // End of variables declaration//GEN-END:variables
}
