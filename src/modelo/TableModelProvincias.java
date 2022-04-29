package modelo;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.LinkedList;
import javax.swing.table.AbstractTableModel;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import controller.Conexion;

/**
 *
 * @author MEDAC
 */
public class TableModelProvincias extends AbstractTableModel {

    static Connection connection = Conexion.getConnection();
    static ArrayList<provincia> provincias;
    private static provincia provincia;
    /// ATRIBUTOS DE LA TABLA
    private static TableModelProvincias t1 = new TableModelProvincias(connection);
    private static final String[] columnNames = {"Código", "Nombre"};
    private final LinkedList<provincia> list;

    public TableModelProvincias(Connection conexion) {
        list = new LinkedList<>();
    }

    public void cargarProvincias() throws SQLException {
        // Obtiene la lista de provincias de la BD
        ArrayList<provincia> provincias = getProvincias();

        // Borra el contenido anterior y añade el nuevo.
        list.clear();
        list.addAll(provincias);

        // Notifica a la vista que el contenido ha cambiado para que se refresque.
        fireTableDataChanged();
    }

    public static void obtenerProvincias() throws SQLException {
        provincias = new ArrayList<provincia>();
        Statement stmt = connection.createStatement();
        ResultSet resultado = stmt.executeQuery("SELECT * FROM provincia");
        while (resultado.next()) {
            int codigo = resultado.getInt("codigo");
            String nombre = resultado.getString("nombre");
            provincia = new provincia(codigo, nombre);
            provincias.add(provincia);
        }

        t1.cargarProvincias();
    }

    public static int insertarProvincias(int codigo, String nombre) throws SQLException {
        String insert = "INSERT INTO provincia (codigo,nombre) values (%s,'%s')".formatted(codigo, nombre);
        Statement stmt = connection.createStatement();
        int filas = stmt.executeUpdate(insert);
        obtenerProvincias();
        return filas;
    }

    public static int eliminarProvincia(int codigo, String nombre) throws SQLException {
        String delete = "DELETE FROM provincia where codigo = %s and nombre = '%s'".formatted(codigo, nombre);
        Statement stmt = connection.createStatement();
        int filas = stmt.executeUpdate(delete);
        obtenerProvincias();
        t1.cargarProvincias();
        return filas;
    }

    public static int actualizar(int codigo, String nombre, int codigoTabla, String nombreTabla)
            throws SQLException {
        int filas = 0;
        String update = "UPDATE provincia SET codigo=%s,nombre='%s' where codigo = %s and nombre = '%s'"
                .formatted(codigo, nombre, codigoTabla, nombreTabla);
        Statement stmt = connection.createStatement();
        filas = stmt.executeUpdate(update);
        obtenerProvincias();
        return filas;
    }

    public static int limpiarTablaProvincia() throws SQLException {
        String insert = "DELETE FROM provincia WHERE 1 = 1";
        Statement stmt = connection.createStatement();
        int filas = stmt.executeUpdate(insert);
        obtenerProvincias();
        return filas;
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

    public provincia getValueAt(int rowIndex) {
        return list.get(rowIndex);
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

    public static ArrayList<provincia> getProvincias() {
        return provincias;
    }

    public static void setProvincias(ArrayList<provincia> provincias) {
        TableModelProvincias.provincias = provincias;
    }

    public static TableModelProvincias getT1() {
        return t1;
    }

    public static void setT1(TableModelProvincias t1) {
        TableModelProvincias.t1 = t1;
    }

}
