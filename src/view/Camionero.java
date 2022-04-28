/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import javax.swing.JOptionPane;

import controller.ControladorCamionero;
import java.awt.Color;
import java.awt.Font;
import modelo.TableModelCamionero;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;

/**
 *
 * @author HP
 */
public class Camionero extends javax.swing.JFrame {

    static String dni;
    static String poblacion;
    static String nombre;
    static int telefono;
    static String direccion;
    static int salario;
    static TableModelCamionero t2 = ControladorCamionero.getT2();

    /**
     * Creates new form Camionero
     */
    public Camionero() {
        try {
            initComponents();
            jTable2.getTableHeader().setFont(new Font("Segoe UI", Font.PLAIN, 12));
            jTable2.getTableHeader().setOpaque(false);
            jTable2.getTableHeader().setBackground(new Color(32, 136, 203));
            jTable2.getTableHeader().setForeground(new Color(0, 0, 0));
            jTable2.setRowHeight(25);
            popupMetodo();
            ControladorCamionero.obtenerCamioneros();
        } catch (Exception e) {
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jTextField6 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();

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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(102, 153, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, 180, -1));

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("DNI:");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, 30, 30));
        jPanel2.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 70, 178, -1));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Dirección:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, -1, 20));

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Población:");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 70, -1, 20));
        jPanel2.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 70, 170, -1));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Nombre:");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 20, -1, 30));
        jPanel2.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 30, 170, -1));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Salario:");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 20, -1, 30));
        jPanel2.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 30, 190, -1));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Teléfono:");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 70, -1, 26));
        jPanel2.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 70, 191, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("X");
        jLabel11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 0, 20, 30));

        jButton2.setText("Limpiar");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 110, 90, -1));

        jButton1.setText("Añadir");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 110, 90, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1140, 140));

        jTable2.setModel(t2);
        jScrollPane2.setViewportView(jTable2);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 930, 550));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 930, 690));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_jButton2MouseClicked
        try {
            ControladorCamionero.limpiarCamionero();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }// GEN-LAST:event_jButton2MouseClicked

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_jLabel11MouseClicked
        dispose();
    }// GEN-LAST:event_jLabel11MouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_jButton1MouseClicked
        try {
            String dni = jTextField6.getText();
            String nombre = jTextField4.getText();
            int telefono = Integer.parseInt(jTextField3.getText());
            String poblacion = jTextField5.getText();
            String direccion = jTextField2.getText();
            int salario = Integer.parseInt(jTextField1.getText());

            ControladorCamionero.insertarCamionero(dni, poblacion, nombre, telefono, direccion, salario);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }// GEN-LAST:event_jButton1MouseClicked

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
            java.util.logging.Logger.getLogger(Camionero.class.getName())
                    .log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Camionero.class.getName())
                    .log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Camionero.class.getName())
                    .log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Camionero.class.getName())
                    .log(java.util.logging.Level.SEVERE, null, ex);
        }
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Camionero().setVisible(true);
            }
        });
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
                    String nombre = jTable2.getValueAt(index, 2).toString();
                    CamionCamionero AppVisor = new CamionCamionero(dni, nombre);
                    AppVisor.setVisible(true);
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

    public static String getDni() {
        return dni;
    }

    public static void setDni(String dni) {
        Camionero.dni = dni;
    }

    public static String getPoblacion() {
        return poblacion;
    }

    public static void setPoblacion(String poblacion) {
        Camionero.poblacion = poblacion;
    }

    public static String getNombre() {
        return nombre;
    }

    public static void setNombre(String nombre) {
        Camionero.nombre = nombre;
    }

    public static int getTelefono() {
        return telefono;
    }

    public static void setTelefono(int telefono) {
        Camionero.telefono = telefono;
    }

    public static String getDireccion() {
        return direccion;
    }

    public static void setDireccion(String direccion) {
        Camionero.direccion = direccion;
    }

    public static int getSalario() {
        return salario;
    }

    public static void setSalario(int salario) {
        Camionero.salario = salario;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    // End of variables declaration//GEN-END:variables
}
