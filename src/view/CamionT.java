/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view;

import controller.ControladorCamion;
import controller.ControladorProvincia;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;
import modelo.TableModelCamion;
import modelo.TableModelCamion;

/**
 *
 * @author FER
 */
public class CamionT extends javax.swing.JPanel {

    static int potencia;
    static String matricula;
    static String modelo;
    static String tipo;
    TableModelCamion t9 = ControladorCamion.getT6();

    /**
     * Creates new form CamionT
     */
    public CamionT() {
        try {
            initComponents();
            popupMetodo();
            jTable4.getTableHeader().setFont(new Font("Segoe UI", Font.PLAIN, 12));
            jTable4.getTableHeader().setOpaque(false);
            jTable4.getTableHeader().setBackground(new Color(32, 136, 203));
            jTable4.getTableHeader().setForeground(new Color(0, 0, 0));
            jTable4.setRowHeight(25);
            ControladorCamion.obtenerCamion();
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
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(102, 153, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Potencia:");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 30, -1, 20));
        jPanel2.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 30, 230, -1));

        jLabel3.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Modelo:");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 90, -1, 20));
        jPanel2.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 90, 233, -1));

        jLabel4.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Tipo:");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 90, -1, 20));
        jPanel2.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 30, 230, -1));
        jPanel2.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 90, 230, -1));

        jLabel2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Matrícula:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, -1, 20));

        jButton1.setText("Añadir");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 30, 90, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("X");
        jLabel11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 0, 20, 30));

        jButton2.setText("Limpiar");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 90, 90, -1));

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable4.setModel(t9);
        jScrollPane4.setViewportView(jTable4);

        jPanel3.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 930, 470));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, -1, 530));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 930, 630));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 930, 630));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        try {
            ControladorCamion.insertarCamion(jTextField2.getText(), Integer.parseInt(jTextField1.getText()), jTextField3.getText(), jTextField4.getText());
            JOptionPane.showMessageDialog(null, "Insertado");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jButton1MouseClicked

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked

    }//GEN-LAST:event_jLabel11MouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        try {
            ControladorCamion.limpiarCamion();
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jButton2MouseClicked
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
                    int index = jTable4.getSelectedRow();
                    matricula = jTable4.getValueAt(index, 0).toString();
                    potencia = Integer.parseInt(jTable4.getValueAt(index, 1).toString());
                    modelo = jTable4.getValueAt(index, 2).toString();
                    tipo = jTable4.getValueAt(index, 3).toString();
                    // Hacer visible el JFrame de editar
                    new CamionEditar().setVisible(true);
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

                    int index = jTable4.getSelectedRow();
                    String matricula = jTable4.getValueAt(index, 0).toString();
                    int potencia = Integer.parseInt(jTable4.getValueAt(index, 1).toString());
                    String modelo = jTable4.getValueAt(index, 2).toString();
                    String tipo = jTable4.getValueAt(index, 3).toString();
                    ControladorCamion.eliminarCamion(matricula, potencia, modelo, tipo);
                } catch (SQLException r) {
                    JOptionPane.showMessageDialog(null, r);
                }
            }
        });
        // Añadir los addActionListener al menu creado
        popupMenu.add(menuItem1);
        popupMenu.add(menuItem2);
        // Los añadimos a la tabla
        jTable4.setComponentPopupMenu(popupMenu);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables
}
