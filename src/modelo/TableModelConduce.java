/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import controller.ControladorDB4O;
import controller.ControladorDB4Omain;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.LinkedList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author admin
 */
public class TableModelConduce extends AbstractTableModel {

    private static final String[] columnNames = { "DNI Camionero", "Matricula Camion" };
    private final LinkedList<conduce> list;
    private ControladorDB4O conn;

    public TableModelConduce(ControladorDB4O conexion) {
        list = new LinkedList<>();
        conn = conexion;
    }

    public conduce getValueAt(int rowIndex) {
        return list.get(rowIndex);
    }

    public void cargarConduce() throws SQLException {
        // Obtiene la lista de provincias de la BD
        ArrayList<conduce> conduces = ControladorDB4Omain.getConduces();
        System.out.println(conduces.size());

        // Borra el contenido anterior y añade el nuevo.
        list.clear();
        list.addAll(conduces);

        // Notifica a la vista que el contenido ha cambiado para que se refresque.
        fireTableDataChanged();
    }

    public void insertarProvincias(String dni_camionero, String matricula_camion) throws SQLException {
        ControladorDB4O.insertar(dni_camionero, matricula_camion);
        cargarConduces();
    }

    public void eliminar(String dni_camionero, String matricula_camion) throws SQLException {
        /**
         * * COMPLETAR CÓDIGO **
         */
        cargarConduces();
    }

    public int actualizar(String tituloOriginal, String titulo, int año, int puntuacion, String sinopsis)
            throws SQLException {
        int nfilas = 0;
        /**
         * * COMPLETAR CÓDIGO **
         */
        cargarConduces();
        return nfilas;
    }

    @Override
    public int getColumnCount() {
        return columnNames.length;
    }

    @Override
    public String getColumnName(int column) {
        return columnNames[column];
    }

    @Override
    public int getRowCount() {
        return list.size();
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:
                return list.get(rowIndex).getDni_camionero();
            case 1:
                return list.get(rowIndex).getMatricula_camion();
        }
        return null;
    }

    private void cargarConduces() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
