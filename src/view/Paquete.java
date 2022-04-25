/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;



import controller.ControladorCamionero;
import javax.swing.JOptionPane;
import modelo.TableModelPaquete;
import controller.ControladorPaquete;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;

/**
 *
 * @author HP
 */
public class Paquete extends javax.swing.JFrame {

        TableModelPaquete t3 = ControladorPaquete.getT3();

        /**
         * Creates new form Paquete
         */
        public Paquete() {
                initComponents();
                try{
                ControladorPaquete.obtenerPaquete();
                } catch (Exception e){
                    System.out.println(e.getMessage());
                }
                    
        }

        /**
         * This method is called from within the constructor to initialize the form.
         * WARNING: Do NOT modify this code. The content of this method is always
         * regenerated by the Form Editor.
         */
        @SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        codigo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        descripcion = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        limpiar = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        fecha = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        cod_provincia = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        dni_camionero = new javax.swing.JTextField();
        destinatario = new javax.swing.JTextField();
        direccion = new javax.swing.JTextField();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Código: ");

        jLabel3.setText("Descripción: ");

        jLabel4.setText("Destinatario:");

        jLabel5.setText("Dirección:");

        jButton1.setText("Añadir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        limpiar.setText("Limpiar");
        limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiarActionPerformed(evt);
            }
        });

        tabla.setModel(t3);
        jScrollPane3.setViewportView(tabla);

        jLabel6.setText("Fecha:");

        fecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fechaActionPerformed(evt);
            }
        });

        jLabel7.setText("Cod_Provincia:");

        jLabel8.setText("Dni_Camionero:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel7)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel2)
                        .addComponent(jLabel1)))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(dni_camionero)
                    .addComponent(codigo, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(descripcion, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fecha, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cod_provincia, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(destinatario)
                    .addComponent(direccion, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addComponent(limpiar))
                .addGap(18, 18, 18))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(descripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(limpiar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(destinatario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(14, 14, 14)
                        .addComponent(jLabel5))
                    .addComponent(direccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(fecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(cod_provincia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37)
                        .addComponent(jLabel8))
                    .addComponent(dni_camionero, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            int cod = Integer.parseInt(codigo.getText());
            String desc = descripcion.getText();
            String dest = destinatario.getText();
            String dir = direccion.getText();
            String date = fecha.getText();
            String dcamionero = dni_camionero.getText();
            int cprovincia = Integer.parseInt(cod_provincia.getText());
            ControladorPaquete.insertarPaquete(cod, desc, dest, dir, date,  dcamionero, cprovincia);
        } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void fechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fechaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fechaActionPerformed

    private void limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarActionPerformed
        codigo.setText("");
        descripcion.setText("");
        destinatario.setText("");
        direccion.setText("");
        fecha.setText("");
        cod_provincia.setText("");
        dni_camionero.setText("");
    }//GEN-LAST:event_limpiarActionPerformed
    
    public void popupMetodo() {
                JPopupMenu popupMenu = new JPopupMenu();
                JMenuItem menuItem1 = new JMenuItem("Editar");
                JMenuItem menuItem2 = new JMenuItem("Eliminar");
                // EDITAR: Al hacer click se cogera esa fila selecionada y con los getters
                // extraigo los datos
                menuItem1.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                                try {
                                    int index = tabla.getSelectedRow();
                                    int codigo = Integer.parseInt(tabla.getValueAt(index, 0).toString());
                                    String descripcion = tabla.getValueAt(index, 1).toString();
                                    String destinatario = tabla.getValueAt(index, 2).toString();
                                    String direccion = tabla.getValueAt(index, 3).toString();
                                    String fecha = tabla.getValueAt(index, 4).toString();
                                    String dni_camionero = tabla.getValueAt(index, 5).toString();
                                    int cod_provincia = Integer.parseInt(tabla.getValueAt(index, 6).toString());
                                        // Hacer visible el JFrame de editar
                                        new CamioneroEditar().setVisible(true);
                                } catch (Exception t) {
                                        JOptionPane.showMessageDialog(null, t);
                                }
                        }
                });
                // ELIMINAR: Lo mismo que editar solo que aqui no hay jFrame le paso el metodo
                // de eliminar y recargar la tabla
                menuItem2.addActionListener(
                                new ActionListener() {
                                        @Override
                                        public void actionPerformed(ActionEvent e) {
                                                try {
                                                        int index = jTable2.getSelectedRow();
                                                        String dni = jTable2.getValueAt(index, 0).toString();
                                                        String poblacion = jTable2.getValueAt(index, 1).toString();
                                                        String nombre = jTable2.getValueAt(index, 2).toString();
                                                        int telefono = Integer.parseInt(
                                                                        jTable2.getValueAt(index, 3).toString());
                                                        String direccion = jTable2.getValueAt(index, 4).toString();
                                                        int salario = Integer.parseInt(
                                                                        jTable2.getValueAt(index, 5).toString());
                                                        ControladorCamionero.eliminarCamionero(dni, poblacion, nombre,
                                                                        telefono, direccion,
                                                                        salario);
                                                } catch (Exception y) {
                                                        JOptionPane.showMessageDialog(null, y);
                                                }
                                        }
                                });
                // Añadir los addActionListener al menu creado
                popupMenu.add(menuItem1);
                popupMenu.add(menuItem2);
                // Los añadimos a la tabla
                jTable2.setComponentPopupMenu(popupMenu);
        }
        /**
         * @param args the command line arguments
         */
        public static void main(String args[]) {
                /* Set the Nimbus look and feel */
                // <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
                // (optional) ">
                /*
                 * If Nimbus (introduced in Java SE 6) is not available, stay with the default
                 * look and feel.
                 * For details see
                 * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
                 */
                try {
                        for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager
                                        .getInstalledLookAndFeels()) {
                                if ("Nimbus".equals(info.getName())) {
                                        javax.swing.UIManager.setLookAndFeel(info.getClassName());
                                        break;
                                }
                        }
                } catch (ClassNotFoundException ex) {
                        java.util.logging.Logger.getLogger(Paquete.class.getName()).log(java.util.logging.Level.SEVERE,
                                        null, ex);
                } catch (InstantiationException ex) {
                        java.util.logging.Logger.getLogger(Paquete.class.getName()).log(java.util.logging.Level.SEVERE,
                                        null, ex);
                } catch (IllegalAccessException ex) {
                        java.util.logging.Logger.getLogger(Paquete.class.getName()).log(java.util.logging.Level.SEVERE,
                                        null, ex);
                } catch (javax.swing.UnsupportedLookAndFeelException ex) {
                        java.util.logging.Logger.getLogger(Paquete.class.getName()).log(java.util.logging.Level.SEVERE,
                                        null, ex);
                }
                // </editor-fold>

                /* Create and display the form */
                java.awt.EventQueue.invokeLater(new Runnable() {
                        public void run() {
                                new Paquete().setVisible(true);
                        }
                });
        }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField cod_provincia;
    private javax.swing.JTextField codigo;
    private javax.swing.JTextField descripcion;
    private javax.swing.JTextField destinatario;
    private javax.swing.JTextField direccion;
    private javax.swing.JTextField dni_camionero;
    private javax.swing.JTextField fecha;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JButton limpiar;
    private javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables
}
