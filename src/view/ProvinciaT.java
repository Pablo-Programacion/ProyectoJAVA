/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view;

import modelo.TableModelProvincias;
import controller.ControladorProvincia;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;


/**
 *
 * @author FER
 */
public class ProvinciaT extends javax.swing.JPanel {

    static int codigoTabla;
    static String nombreTabla;
    TableModelProvincias t1 = ControladorProvincia.getT1();

    /**
     * Creates new form ProvinciaT
     */
    public ProvinciaT() {
        try {
            initComponents();
            TextPrompt nombre = new TextPrompt("Código", jTextField1);
            TextPrompt contrasena = new TextPrompt("Nombre de la provincia", jTextField2);
            jTextField1.setBackground(new java.awt.Color(0, 0, 0, 1));
            jTextField2.setBackground(new java.awt.Color(0, 0, 0, 1));
            popupMetodo();
            jTable133.getTableHeader().setFont(new Font("Segoe UI", Font.PLAIN, 12));
            jTable133.getTableHeader().setOpaque(false);
            jTable133.getTableHeader().setBackground(new Color(32, 136, 203));
            jTable133.getTableHeader().setForeground(new Color(0, 0, 0));
            jTable133.setRowHeight(25);
            ControladorProvincia.obtenerProvincias();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
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
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable133 = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jTextField2 = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();

        setMaximumSize(new java.awt.Dimension(930, 540));
        setMinimumSize(new java.awt.Dimension(930, 540));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable133.setModel(t1);
        jScrollPane1.setViewportView(jTable133);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 930, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 566, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 930, 560));

        jPanel4.setBackground(new java.awt.Color(51, 153, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setText("Añadir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 20, 90, -1));

        jButton2.setText("Limpiar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 60, 90, -1));

        jTextField2.setForeground(new java.awt.Color(255, 255, 255));
        jTextField2.setBorder(null);
        jPanel4.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 60, 260, 20));

        jTextField1.setBackground(new java.awt.Color(0, 0, 1));
        jTextField1.setForeground(new java.awt.Color(255, 255, 255));
        jTextField1.setBorder(null);
        jPanel4.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 20, 260, 20));
        jPanel4.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 40, 260, 10));
        jPanel4.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 80, 260, 10));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 930, 100));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 930, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 660, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            ControladorProvincia.insertarProvincias(Integer.parseInt(jTextField1.getText()), jTextField2.getText());
            JOptionPane.showMessageDialog(null, "Nueva Provincia Insertada");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    public static int getCodigoTabla() {
        return codigoTabla;
    }

    public static String getNombreTabla() {
        return nombreTabla;
    }

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        jTextField1.setText(" ");
        jTextField2.setText(" ");
    }//GEN-LAST:event_jButton2ActionPerformed
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
                    int index = jTable133.getSelectedRow();
                    codigoTabla = Integer.parseInt(jTable133.getValueAt(index, 0).toString());
                    nombreTabla = jTable133.getValueAt(index, 1).toString();

                    // Hacer visible el JFrame de editar
                    ProvinciaEditar PE = new ProvinciaEditar(codigoTabla,nombreTabla);
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
                    int index = jTable133.getSelectedRow();
                    int codigo = Integer.parseInt(jTable133.getValueAt(index, 0).toString());
                    String nombre = jTable133.getValueAt(index, 1).toString();
                    ControladorProvincia.eliminarProvincia(codigo, nombre);
                    JOptionPane.showMessageDialog(null, "Provincia Eliminada");
                } catch (SQLException r) {
                    JOptionPane.showMessageDialog(null, r);
                }
            }
        });
        // Añadir los addActionListener al menu creado
        popupMenu.add(menuItem1);
        popupMenu.add(menuItem2);
        // Los añadimos a la tabla
        jTable133.setComponentPopupMenu(popupMenu);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable jTable133;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
