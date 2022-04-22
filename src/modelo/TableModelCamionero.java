package modelo;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.LinkedList;
import javax.swing.table.AbstractTableModel;
import controller.ControladorDB4O;
import controller.ControladorDB4Omain;

/**
 *
 * @author MEDAC
 */
public class TableModelCamionero extends AbstractTableModel {

    private static final String[] columnNames = {"Dni", "Nombre", "Telefono", "Poblacion", "Direccion", "Salario"};
    private final LinkedList<camionero> list;
    private ControladorDB4O conn;

    public TableModelCamionero(ControladorDB4O conexion) {
        list = new LinkedList<>();
        conn = conexion;
    }

    public camionero getValueAt(int rowIndex) {
        return list.get(rowIndex);
    }

    public void cargarCamionero() throws SQLException {
        // Obtiene la lista de provincias de la BD
        ArrayList<camionero> camioneros = ControladorDB4Omain.getCamioneros();
        System.out.println(camioneros.size());

        // Borra el contenido anterior y añade el nuevo.
        list.clear();
        list.addAll(camioneros);

        // Notifica a la vista que el contenido ha cambiado para que se refresque.
        fireTableDataChanged();
    }

    public void insertarProvincias(int codigo, String nombre) throws SQLException {
        ControladorDB4O.insertar(codigo, nombre);
        cargarCamionero();
    }

    public void eliminar(String titulo) throws SQLException {
        /**
         * * COMPLETAR CÓDIGO **
         */
        cargarCamionero();
    }

    public int actualizar(String tituloOriginal, String titulo, int año, int puntuacion, String sinopsis)
            throws SQLException {
        int nfilas = 0;
        /**
         * * COMPLETAR CÓDIGO **
         */
        cargarCamionero();
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
                return list.get(rowIndex).getDni();
            case 1:
                return list.get(rowIndex).getNombre();

            case 2:
                return list.get(rowIndex).getTelefono();
            case 3:
                return list.get(rowIndex).getPoblacion();
            case 4:
                return list.get(rowIndex).getDireccion();
            case 5:
                return list.get(rowIndex).getSalario();
        }
        return null;
    }

}
