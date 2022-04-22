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
public class TableModelProvincias extends AbstractTableModel {

    private static final String[] columnNames = { "Código", "Nombre" };
    private final LinkedList<provincia> list;
    private ControladorDB4O conn;

    public TableModelProvincias(ControladorDB4O conexion) {
        list = new LinkedList<>();
        conn = conexion;
    }

    public provincia getValueAt(int rowIndex) {
        return list.get(rowIndex);
    }

    public void cargarProvincias() throws SQLException {
        // Obtiene la lista de provincias de la BD
        ArrayList<provincia> provincias = ControladorDB4Omain.getProvincias();
        System.out.println(provincias.size());

        // Borra el contenido anterior y añade el nuevo.
        list.clear();
        list.addAll(provincias);

        // Notifica a la vista que el contenido ha cambiado para que se refresque.
        fireTableDataChanged();
    }

    public void insertarProvincias(int codigo, String nombre) throws SQLException {
        ControladorDB4O.insertar(codigo, nombre);
        cargarProvincias();
    }

    public void eliminar(int codigo, String nombre) throws SQLException {
        /**
         * * COMPLETAR CÓDIGO **
         */
        cargarProvincias();
    }

    public int actualizar(String tituloOriginal, String titulo, int año, int puntuacion, String sinopsis)
            throws SQLException {
        int nfilas = 0;
        /**
         * * COMPLETAR CÓDIGO **
         */
        cargarProvincias();
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
                return list.get(rowIndex).getCodigo();
            case 1:
                return list.get(rowIndex).getNombre();
        }
        return null;
    }

}
