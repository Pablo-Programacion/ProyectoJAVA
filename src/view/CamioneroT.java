/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view;

import controller.ControladorCamionero;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;
import modelo.TableModelCamionero;

/**
 *
 * @author FER
 */
public class CamioneroT extends javax.swing.JPanel {

    static String dni;
    static String poblacion;
    static String nombre;
    static int telefono;
    static String direccion;
    static int salario;
    TableModelCamionero t2 = ControladorCamionero.getT2();

    /**
     * Creates new form CamioneroT
     */
    public CamioneroT() {
        try {
            initComponents();
            ControladorCamionero.obtenerCamioneros();
            popupMetodo();
            TextPrompt dni2 = new TextPrompt("Dni", jTextField6);
            jTextField6.setBackground(new java.awt.Color(0, 0, 0, 1));

            TextPrompt nombre2 = new TextPrompt("Nombre", jTextField4);
            jTextField4.setBackground(new java.awt.Color(0, 0, 0, 1));

            TextPrompt salario2 = new TextPrompt("Salario", jTextField1);
            jTextField1.setBackground(new java.awt.Color(0, 0, 0, 1));

            TextPrompt direccion2 = new TextPrompt("Dirección", jTextField2);
            jTextField2.setBackground(new java.awt.Color(0, 0, 0, 1));

            TextPrompt poblacion2 = new TextPrompt("Población", jTextField5);
            jTextField5.setBackground(new java.awt.Color(0, 0, 0, 1));

            TextPrompt telef2 = new TextPrompt("Teléfono", jTextField3);
            jTextField3.setBackground(new java.awt.Color(0, 0, 0, 1));

            jTable2.getTableHeader().setFont(new Font("Segoe UI", Font.PLAIN, 12));
            jTable2.getTableHeader().setOpaque(false);
            jTable2.getTableHeader().setBackground(new Color(32, 136, 203));
            jTable2.getTableHeader().setForeground(new Color(0, 0, 0));
            jTable2.setRowHeight(25);
            
            
        } catch (Exception e) {
        }
    }

    public void popupMetodo() {
        JPopupMenu popupMenu = new JPopupMenu();
        JMenuItem menuItem1 = new JMenuItem("Editar");
        JMenuItem menuItem2 = new JMenuItem("Eliminar");
        JMenuItem menuItem3 = new JMenuItem("Ver Camiones a Conducir");
        // EDITAR: Al hacer click se cogera esa fila selecionada y con los getters
        // extraigo los datos
        menuItem1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int index = jTable2.getSelectedRow();
                    dni = jTable2.getValueAt(index, 0).toString();
                    poblacion = jTable2.getValueAt(index, 1).toString();
                    nombre = jTable2.getValueAt(index, 2).toString();
                    telefono = Integer.parseInt(
                            jTable2.getValueAt(index, 3).toString());
                    direccion = jTable2.getValueAt(index, 4).toString();
                    salario = Integer.parseInt(
                            jTable2.getValueAt(index, 5).toString());

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
                    JOptionPane.showMessageDialog(null, "Registro Eliminado");
                } catch (Exception y) {
                    JOptionPane.showMessageDialog(null, y);
                }
            }
        });
        menuItem3.addActionListener(
                new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int index = jTable2.getSelectedRow();
                    String dni = jTable2.getValueAt(index, 0).toString();
                    new CamionCamionero(dni).setVisible(true);
                    
                } catch (Exception y) {
                    JOptionPane.showMessageDialog(null, y);
                }
            }
        });
        // Añadir los addActionListener al menu creado
        popupMenu.add(menuItem1);
        popupMenu.add(menuItem2);
        popupMenu.add(menuItem3);
        // Los añadimos a la tabla
        jTable2.setComponentPopupMenu(popupMenu);
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
        jPanel3 = new javax.swing.JPanel();
        jTextField6 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(102, 153, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField6.setForeground(new java.awt.Color(255, 255, 255));
        jTextField6.setBorder(null);
        jPanel3.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 20, 180, 20));

        jTextField2.setForeground(new java.awt.Color(255, 255, 255));
        jTextField2.setBorder(null);
        jPanel3.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 60, 178, 20));

        jTextField5.setForeground(new java.awt.Color(255, 255, 255));
        jTextField5.setBorder(null);
        jPanel3.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 100, 180, 20));

        jTextField4.setForeground(new java.awt.Color(255, 255, 255));
        jTextField4.setBorder(null);
        jPanel3.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 20, 180, 20));

        jTextField1.setForeground(new java.awt.Color(255, 255, 255));
        jTextField1.setBorder(null);
        jPanel3.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 60, 180, 20));

        jTextField3.setForeground(new java.awt.Color(255, 255, 255));
        jTextField3.setBorder(null);
        jPanel3.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 100, 180, 20));

        jButton2.setText("Limpiar");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        jPanel3.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 80, 120, -1));

        jButton1.setText("Añadir");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jPanel3.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 40, 120, -1));
        jPanel3.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 40, 180, 10));
        jPanel3.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 120, 180, 10));
        jPanel3.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 40, 180, 10));
        jPanel3.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 80, 180, 10));
        jPanel3.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 80, 180, 10));
        jPanel3.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 120, 180, 10));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 930, 140));

        jTable2.setModel(t2);
        jScrollPane2.setViewportView(jTable2);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 930, 520));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 930, 660));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 930, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 660, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        try {
            ControladorCamionero.insertarCamionero(jTextField6.getText(), jTextField5.getText(), jTextField4.getText(), Integer.parseInt(jTextField3.getText()), jTextField2.getText(), Integer.parseInt(jTextField1.getText()));
            JOptionPane.showMessageDialog(null, "Nuevo Trabajor Insertado");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }//GEN-LAST:event_jButton1MouseClicked

    public static String getDni() {
        return dni;
    }

    public static String getPoblacion() {
        return poblacion;
    }

    public static String getNombre() {
        return nombre;
    }

    public static int getTelefono() {
        return telefono;
    }

    public static String getDireccion() {
        return direccion;
    }

    public static int getSalario() {
        return salario;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    // End of variables declaration//GEN-END:variables
}
