package modelo;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.LinkedList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author MEDAC
 */
public class TableModelPeliculas extends AbstractTableModel {

    private static final String[] columnNames = {"Titulo", "Año", "Puntuación", "Sinopsis"};
    private final LinkedList<Pelicula> list;
    private controller.ControladorDB4O conn;

    public TableModelPeliculas(controller.ControladorDB4O conexion) {
        list = new LinkedList<>();
        conn = conexion;
    }

    public Pelicula getValueAt(int rowIndex) {
        return list.get(rowIndex);
    }

    public void cargarPeliculas() throws SQLException {
        // Obtiene la lista de peliculas de la BD
        ArrayList<Pelicula> peliculas = conn.obtenerPeliculas();
        System.out.println(peliculas.size());

        // Borra el contenido anterior y añade el nuevo.
        list.clear();
        list.addAll(peliculas);

        // Notifica a la vista que el contenido ha cambiado para que se refresque.
        fireTableDataChanged();
    }

    public void insertar(String titulo, int año, int puntuacion, String sinopsis) throws SQLException {
        /*** COMPLETAR CÓDIGO ***/
        cargarPeliculas();
    }

    public void eliminar(String titulo) throws SQLException {
        /*** COMPLETAR CÓDIGO ***/
        cargarPeliculas();
    }

    public int actualizar(String tituloOriginal, String titulo, int año, int puntuacion, String sinopsis) throws SQLException {
        int nfilas =0;
        /*** COMPLETAR CÓDIGO ***/
        cargarPeliculas();
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
                return list.get(rowIndex).getTitulo();
            case 1:
                return list.get(rowIndex).getAño();
            case 2:
                return list.get(rowIndex).getPuntuacion();
            case 3:
                return list.get(rowIndex).getSinopsis();
        }
        return null;
    }

}
