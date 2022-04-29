/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view;

import javax.swing.JOptionPane;
import modelo.TableModelPaquete;
import controller.ControladorPaquete;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import modelo.ModeloProvincia;

/**
 *
 * @author FER
 */
public class PaqueteT extends javax.swing.JPanel {

    TableModelPaquete tabla2 = ControladorPaquete.getT3();

    /**
     * Creates new form PaqueteT
     */
    public PaqueteT() {

        try {
            initComponents();
            ControladorPaquete.obtenerPaquete();
            TextPrompt codigo2 = new TextPrompt("Código", codigo);
            codigo.setBackground(new java.awt.Color(0, 0, 0, 1));

            TextPrompt destinatario2 = new TextPrompt("Destinatario", destinatario);
            destinatario.setBackground(new java.awt.Color(0, 0, 0, 1));

            TextPrompt descripcion2 = new TextPrompt("Descripcion", descripcion);
            descripcion.setBackground(new java.awt.Color(0, 0, 0, 1));

            TextPrompt direccion2 = new TextPrompt("Dirección", direccion);
            direccion.setBackground(new java.awt.Color(0, 0, 0, 1));

            tabla.getTableHeader().setFont(new Font("Segoe UI", Font.PLAIN, 12));
            tabla.getTableHeader().setOpaque(false);
            tabla.getTableHeader().setBackground(new Color(32, 136, 203));
            tabla.getTableHeader().setForeground(new Color(0, 0, 0));
            tabla.setRowHeight(25);
            this.popupMetodo();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
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
        jPanel2 = new javax.swing.JPanel();
        descripcion = new javax.swing.JTextField();
        codigo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        limpiar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        cod_provincia = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        dni_camionero = new javax.swing.JTextField();
        direccion = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        destinatario = new javax.swing.JTextField();
        bAvanzada = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        jComboBox1 = new javax.swing.JComboBox<>();

        jPanel2.setBackground(new java.awt.Color(51, 153, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        descripcion.setBorder(null);
        jPanel2.add(descripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 120, 190, 20));

        codigo.setBorder(null);
        jPanel2.add(codigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, 190, 20));
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(117, 110, -1, -1));

        limpiar.setText("Limpiar");
        limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiarActionPerformed(evt);
            }
        });
        jPanel2.add(limpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 150, -1, -1));

        jButton1.setText("Añadir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 150, -1, -1));
        jPanel2.add(cod_provincia, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 70, 90, -1));

        jLabel8.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Dni_Camionero:");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 70, -1, 20));
        jPanel2.add(dni_camionero, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 90, 91, -1));

        direccion.setBorder(null);
        jPanel2.add(direccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 20, 190, 20));

        jLabel7.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Cod_Provincia:");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 50, -1, 20));

        destinatario.setBorder(null);
        jPanel2.add(destinatario, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 70, 190, 20));

        bAvanzada.setText("Búsqueda Avanzada");
        bAvanzada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAvanzadaActionPerformed(evt);
            }
        });
        jPanel2.add(bAvanzada, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 150, 160, -1));

        tabla.setModel(tabla2);
        jScrollPane2.setViewportView(tabla);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 930, 480));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 40, 190, 10));
        jPanel2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 40, 190, 10));
        jPanel2.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 90, 190, 10));
        jPanel2.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 140, 190, 10));
        jPanel2.add(jDateChooser2, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 20, 190, -1));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel2.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 70, 120, 30));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 930, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 660, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarActionPerformed
        codigo.setText("");
        descripcion.setText("");
        destinatario.setText("");
        direccion.setText("");
     
        cod_provincia.setText("");
        dni_camionero.setText("");
    }//GEN-LAST:event_limpiarActionPerformed

    public void popupMetodo() {
        JPopupMenu popupMenu = new JPopupMenu();
        JMenuItem menuItem1 = new JMenuItem("Editar");
        JMenuItem menuItem2 = new JMenuItem("Eliminar");
        JMenuItem menuItem3 = new JMenuItem("Ver Provincia");
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
                    PaqueteEditar PE = new PaqueteEditar(codigo, descripcion, destinatario, direccion, fecha, dni_camionero, cod_provincia);
                    PE.setVisible(true);
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
                    int index = tabla.getSelectedRow();
                    int codigo = Integer.parseInt(tabla.getValueAt(index, 0).toString());
                    String descripcion = tabla.getValueAt(index, 1).toString();
                    String destinatario = tabla.getValueAt(index, 2).toString();
                    String direccion = tabla.getValueAt(index, 3).toString();
                    String fecha = tabla.getValueAt(index, 4).toString();
                    String dni_camionero = tabla.getValueAt(index, 5).toString();
                    int cod_provincia = Integer.parseInt(tabla.getValueAt(index, 5).toString());

                    ControladorPaquete.eliminarPaquete(codigo);

                } catch (Exception y) {
                    JOptionPane.showMessageDialog(null, y);
                }
            }
        });
        menuItem3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int index = tabla.getSelectedRow();
                    int cod_provincia = Integer.parseInt(tabla.getValueAt(index, 6).toString());
                    ModeloProvincia.obtenerProvincias(cod_provincia);
                } catch (Exception t) {
                    JOptionPane.showMessageDialog(null, t);
                }
            }
        });
        // Añadir los addActionListener al menu creado
        popupMenu.add(menuItem1);
        popupMenu.add(menuItem2);
        popupMenu.add(menuItem3);
        // Los añadimos a la tabla
        tabla.setComponentPopupMenu(popupMenu);
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            int cod = Integer.parseInt(codigo.getText());
            String desc = descripcion.getText();
            String dest = destinatario.getText();
            String dir = direccion.getText();

            SimpleDateFormat ff = new SimpleDateFormat("dd-MM-YYYY");
            String date = ff.format(jDateChooser2.getDate());

            String dcamionero = dni_camionero.getText();
            int cprovincia = Integer.parseInt(cod_provincia.getText());
            ControladorPaquete.insertarPaquete(cod, desc, dest, dir, date, dcamionero, cprovincia);
            JOptionPane.showMessageDialog(null, "Paquete almacenado");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void bAvanzadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAvanzadaActionPerformed
        CamioneroFecha VE = new CamioneroFecha();
        VE.setVisible(true);
    }//GEN-LAST:event_bAvanzadaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bAvanzada;
    private javax.swing.JTextField cod_provincia;
    private javax.swing.JTextField codigo;
    private javax.swing.JTextField descripcion;
    private javax.swing.JTextField destinatario;
    private javax.swing.JTextField direccion;
    private javax.swing.JTextField dni_camionero;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JButton limpiar;
    private javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables
}
