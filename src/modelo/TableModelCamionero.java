package modelo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.LinkedList;
import javax.swing.table.AbstractTableModel;

import controller.Conexion;

/**
 *
 * @author MEDAC
 */
public class TableModelCamionero extends AbstractTableModel {
    static ArrayList<camionero> camioneros;
    private static camionero camionero;
    static Connection connection = Conexion.getConnection();
    private static Conexion conn;
    /// ATRIBUTOS DE LA TABLA
    private static TableModelCamionero t2 = new TableModelCamionero(conn);
    private static final String[] columnNames = { "Dni", "Nombre", "Telefono", "Poblacion", "Direccion", "Salario" };
    private final LinkedList<camionero> list;

    public TableModelCamionero(Conexion conexion) {
        list = new LinkedList<>();
        conn = conexion;
    }

    public camionero getValueAt(int rowIndex) {
        return list.get(rowIndex);
    }

    public void cargarCamionero() throws SQLException {
        // Obtiene la lista de camionero de la BD
        ArrayList<camionero> camioneros = getCamioneros();
        System.out.println(camioneros.size());

        // Borra el contenido anterior y añade el nuevo.
        list.clear();
        list.addAll(camioneros);

        // Notifica a la vista que el contenido ha cambiado para que se refresque.
        fireTableDataChanged();
    }

    public static int insertarCamionero(String dni, String nombre, int telefono, String poblacion, String direccion,
            int salario) throws SQLException {
        String insert = "INSERT INTO provincia (dni,nombre,telefono,,poblacion,direccionn,salario) values ('%s','%s',%s,'%s','%s',%s)"
                .formatted(dni, nombre, telefono, poblacion, direccion, salario);
        Statement stmt = connection.createStatement();
        int filas = stmt.executeUpdate(insert);
        obtenerCamioneros();
        return filas;
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

    public static void obtenerCamioneros() throws SQLException {
        camioneros = new ArrayList<camionero>();
        Statement stmt = (Statement) connection.createStatement();
        ResultSet resultado = stmt.executeQuery("SELECT * FROM camionero");
        while (resultado.next()) {
            String dni = resultado.getString("Dni");
            String nombre = resultado.getString("Nombre");
            int telefono = resultado.getInt("Telefono");
            String poblacion = resultado.getString("Poblacion");
            String direccion = resultado.getString("Direccion");
            int salario = resultado.getInt("Salario");
            camionero = new camionero(dni, nombre, telefono, poblacion, direccion, salario);
            camioneros.add(camionero);
        }
        t2.cargarCamionero();
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

    public static ArrayList<camionero> getCamioneros() {
        return camioneros;
    }

    public static void setCamioneros(ArrayList<camionero> camioneros) {
        TableModelCamionero.camioneros = camioneros;
    }

    public static TableModelCamionero getT2() {
        return t2;
    }

    public static void setT2(TableModelCamionero t2) {
        TableModelCamionero.t2 = t2;
    }

}
