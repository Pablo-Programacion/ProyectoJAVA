/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.sql.Connection;
import controller.Conexion;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Image;
import java.text.SimpleDateFormat;

import java.util.Date;

import javax.swing.Icon;
import javax.swing.ImageIcon;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import view.Inicio;

/**
 *
 * @author HP
 */
public class Paquetería extends javax.swing.JFrame {

    int valor = 0;
    static pbThead t1;

    /**
     * Creates new form Paquetería
     */
    public Paquetería() {
        initComponents();
        Date dia = new Date();
        SimpleDateFormat formato = new SimpleDateFormat("dd");
        Date mes = new Date();
        SimpleDateFormat formato2 = new SimpleDateFormat("MM");
        Date anio = new Date();
        SimpleDateFormat formato3 = new SimpleDateFormat("YYYY");
        jLabel7.setText("Hoy es " + formato.format(dia) + " del " + "Marzo" + " de " + formato3.format(anio));
        ImageIcon imagen = new ImageIcon("src/img/person.png");
        Icon icono = new ImageIcon(imagen.getImage().getScaledInstance(jLabel5.getWidth(),
                jLabel5.getHeight(), Image.SCALE_SMOOTH));
        jLabel5.setIcon(icono);
        ImageIcon imagen2 = new ImageIcon("src/img/paquete.jpg");
        Icon icono2 = new ImageIcon(imagen2.getImage().getScaledInstance(jLabel23.getWidth(),
                jLabel23.getHeight(), Image.SCALE_SMOOTH));
        jLabel23.setIcon(icono2);

        ImageIcon imagen3 = new ImageIcon("src/img/vehiculo.png");
        Icon icono3 = new ImageIcon(imagen3.getImage().getScaledInstance(jLabel12.getWidth(),
                jLabel12.getHeight(), Image.SCALE_SMOOTH));
        jLabel12.setIcon(icono3);

        ImageIcon imagen4 = new ImageIcon("src/img/user.png");
        Icon icono4 = new ImageIcon(imagen4.getImage().getScaledInstance(jLabel17.getWidth(),
                jLabel17.getHeight(), Image.SCALE_SMOOTH));
        jLabel17.setIcon(icono4);

        ImageIcon imagen5 = new ImageIcon("src/img/envios.png");
        Icon icono5 = new ImageIcon(imagen5.getImage().getScaledInstance(jLabel18.getWidth(),
                jLabel18.getHeight(), Image.SCALE_SMOOTH));
        jLabel18.setIcon(icono5);

        ImageIcon imagen6 = new ImageIcon("src/img/codigo.png");
        Icon icono6 = new ImageIcon(imagen6.getImage().getScaledInstance(jLabel19.getWidth(),
                jLabel19.getHeight(), Image.SCALE_SMOOTH));
        jLabel19.setIcon(icono6);

        ImageIcon imagen7 = new ImageIcon("src/img/home.png");
        Icon icono7 = new ImageIcon(imagen7.getImage().getScaledInstance(jLabel20.getWidth(),
                jLabel20.getHeight(), Image.SCALE_SMOOTH));
        jLabel20.setIcon(icono7);
        t1 = new pbThead(jProgressBar2);

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

        jLabel13 = new javax.swing.JLabel();
        jProgressBar2 = new javax.swing.JProgressBar();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setBackground(new java.awt.Color(0, 0, 0));
        jLabel13.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 660, 240, 20));

        jProgressBar2.setBackground(new java.awt.Color(0, 0, 0));
        jProgressBar2.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        getContentPane().add(jProgressBar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 680, 930, 10));

        jPanel4.setBackground(new java.awt.Color(12, 68, 140));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Almacenes");
        jPanel4.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 40, 100, 50));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 190, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        jPanel4.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 80, 190, 2));

        jLabel14.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("HispaTrans");
        jPanel4.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, -1, 70));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("ENVIOS");
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 270, 70));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("PERSONAL");
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 270, 70));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("INICIAR SESIÓN");
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 620, 270, 70));

        jLabel15.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("INICIO");
        jLabel15.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel15MouseClicked(evt);
            }
        });
        jPanel4.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 270, 70));

        jLabel16.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("PROVINCIAS");
        jLabel16.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel16MouseClicked(evt);
            }
        });
        jPanel4.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 270, 70));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("FLOTA DE VEHÍCULOS");
        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 370, 270, 70));
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 638, 30, 30));
        jPanel4.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 383, 30, 30));
        jPanel4.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(64, 318, 30, 30));
        jPanel4.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(74, 251, 30, 30));
        jPanel4.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(57, 181, 30, 30));
        jPanel4.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(77, 111, 30, 30));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 270, 690));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(102, 153, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel7.setBackground(new java.awt.Color(51, 153, 255));

        jLabel7.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));

        jLabel9.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(687, Short.MAX_VALUE))
            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel7Layout.createSequentialGroup()
                    .addGap(245, 245, 245)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(245, Short.MAX_VALUE)))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE))
            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel7Layout.createSequentialGroup()
                    .addGap(5, 5, 5)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jLabel8.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));

        jLabel23.setForeground(new java.awt.Color(102, 102, 102));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(245, 245, 245)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(245, Short.MAX_VALUE)))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 930, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(559, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(270, 270, 270)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(300, Short.MAX_VALUE)))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 660, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 930, 660));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 30, 930, 660));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        jLabel11.setBackground(new java.awt.Color(0, 0, 0));
        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("X");
        jLabel11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 930, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 673, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 0, 930, 690));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 690));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        if (Conexion.getConnection() == null || valor == 0) {
            System.out.println(valor);
            try {
                IniciarSesion sesion = new IniciarSesion();
                sesion.show();

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e, "Error", JOptionPane.WARNING_MESSAGE);
            }
        } else if (Conexion.getConnection() != null || valor == 110) {
            try {
                jLabel3.setText("INICIAR SESIÓN");
                Conexion.desconectar();
                this.valor = 0;
                jPanel3.removeAll();
                jPanel3.revalidate();
                jPanel3.repaint();
                ImageIcon imagen2 = new ImageIcon("src/img/paquete.jpg");
                Icon icono2 = new ImageIcon(imagen2.getImage().getScaledInstance(jLabel23.getWidth(),
                        jLabel23.getHeight(), Image.SCALE_SMOOTH));
                jLabel23.setIcon(icono2);
                JOptionPane.showMessageDialog(null, "Desconectado");
            } catch (Exception y) {
                JOptionPane.showMessageDialog(null, y, "Error", JOptionPane.WARNING_MESSAGE);
            }
        }

    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseClicked
        try {
            if (valor < 110 && Conexion.getConnection() != null) {
                JOptionPane.showMessageDialog(null, "Espere a que cargue la sesion");
            }
            if (Conexion.getConnection() == null) {
                JOptionPane.showMessageDialog(null, "Necesitas iniciar sesion");
            }
            if (Conexion.getConnection() != null && valor == 110) {
                Inicio p1 = new Inicio();
                p1.setSize(930, 660);
                p1.setLocation(0, 0);

                jPanel3.removeAll();
                jPanel3.add(p1, BorderLayout.CENTER);
                jPanel3.revalidate();
                jPanel3.repaint();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e, "Error", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jLabel15MouseClicked

    private void jLabel16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseClicked
        try {
            if (valor < 110 && Conexion.getConnection() != null) {
                JOptionPane.showMessageDialog(null, "Espere a que cargue la sesion");
            }
            if (Conexion.getConnection() == null) {
                JOptionPane.showMessageDialog(null, "Necesitas iniciar sesion");
            }
            if (Conexion.getConnection() != null && valor == 110) {
                ProvinciaT p1 = new ProvinciaT();
                p1.setSize(930, 6660);
                p1.setLocation(0, 0);

                jPanel3.removeAll();
                jPanel3.add(p1, BorderLayout.CENTER);
                jPanel3.revalidate();
                jPanel3.repaint();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e, "Error", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jLabel16MouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        try {
            if (valor < 110 && Conexion.getConnection() != null) {
                JOptionPane.showMessageDialog(null, "Espere a que cargue la sesion");
            }
            if (Conexion.getConnection() == null) {
                JOptionPane.showMessageDialog(null, "Necesitas iniciar sesion");
            }
            if (Conexion.getConnection() != null && valor == 110) {
                CamionT p1 = new CamionT();
                p1.setSize(930, 660);
                p1.setLocation(0, 0);

                jPanel3.removeAll();
                jPanel3.add(p1, BorderLayout.CENTER);
                jPanel3.revalidate();
                jPanel3.repaint();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
        dispose();
    }//GEN-LAST:event_jLabel11MouseClicked
    public void setColor(JPanel p) {
        p.setBackground(new Color(255, 105, 0));
    }

    public void resColor(JPanel p2) {
        p2.setBackground(new Color(255, 153, 0));
    }

    // GEN-LAST:event_jLabel11MouseClicked
    class pbThead extends Thread {

        JProgressBar pbar;

        pbThead(JProgressBar pbar) {
            pbar = jProgressBar2;
        }

        public void run() {
            int min = 0;
            int max = 110;
            jProgressBar2.setMaximum(min);
            jProgressBar2.setMaximum(max);
            jProgressBar2.setValue(0);

            for (int i = min; i < max; i++) {
                jProgressBar2.setValue(i);
                try {
                    sleep(22);
                    valor++;
                    switch (valor) {
                        case 1:
                            jLabel13.setText("Comprobando datos");
                            break;
                        case 10:
                            jLabel13.setText("Estableciendo conexión");
                            break;
                        case 20:
                            jLabel13.setText("Instalando modulos");
                            break;
                        case 30:
                            jLabel13.setText("Instalando dependencias");
                            break;
                        case 40:
                            jLabel13.setText("Instalando librerias");
                            break;
                        case 70:
                            Thread.sleep(200);
                            jLabel13.setText("Ejecutando Base de Datos");
                            break;
                        case 80:
                            Thread.sleep(300);
                            jLabel13.setText("Iniciando Aplicacion");
                            break;
                        case 100:
                            Thread.sleep(400);
                            jLabel3.setText("CERRAR SESIÓN");
                            Inicio p1 = new Inicio();
                            p1.setSize(930, 660);
                            p1.setLocation(0, 0);

                            jPanel3.removeAll();
                            jPanel3.add(p1, BorderLayout.CENTER);
                            jPanel3.revalidate();
                            jPanel3.repaint();
                            break;
                    }

                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, e, "Error", JOptionPane.WARNING_MESSAGE);
                }
            }
            try {
                jLabel13.setVisible(false);
                jProgressBar2.setVisible(false);

                Conexion.conectarMySQL();

                JOptionPane.showMessageDialog(null, "Conectado");

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e, "Error", JOptionPane.WARNING_MESSAGE);
            }
        }
    }

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_jLabel12MouseClicked

    }// GEN-LAST:event_jLabel5MouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_jLabel4MouseClicked
        try {
            if (valor < 110 && Conexion.getConnection() != null) {
                JOptionPane.showMessageDialog(null, "Espere a que cargue la sesion");
            }
            if (Conexion.getConnection() == null) {
                JOptionPane.showMessageDialog(null, "Necesitas iniciar sesion");
            }
            if (Conexion.getConnection() != null && valor == 110) {
                PaqueteT p1 = new PaqueteT();
                p1.setSize(930, 660);
                p1.setLocation(0, 0);

                jPanel3.removeAll();
                jPanel3.add(p1, BorderLayout.CENTER);
                jPanel3.revalidate();
                jPanel3.repaint();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }// GEN-LAST:event_jLabel4MouseClicked

    public static void start() {
        t1.start();
    }

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_jLabel2MouseClicked
        try {
            if (valor < 110 && Conexion.getConnection() != null) {
                JOptionPane.showMessageDialog(null, "Espere a que cargue la sesion");
            }
            if (Conexion.getConnection() == null) {
                JOptionPane.showMessageDialog(null, "Necesitas iniciar sesion");
            }
            if (Conexion.getConnection() != null && valor == 110) {
                CamioneroT p1 = new CamioneroT();
                p1.setSize(930, 660);
                p1.setLocation(0, 0);

                jPanel3.removeAll();
                jPanel3.add(p1, BorderLayout.CENTER);
                jPanel3.revalidate();
                jPanel3.repaint();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }// GEN-LAST:event_jLabel2MouseClicked

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
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Paquetería.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Paquetería.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Paquetería.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Paquetería.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        }
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Paquetería().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JProgressBar jProgressBar2;
    // End of variables declaration//GEN-END:variables
}
