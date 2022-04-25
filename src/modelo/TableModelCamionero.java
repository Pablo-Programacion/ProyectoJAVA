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
    /// ATRIBUTOS DE LA TABLA
    private static TableModelCamionero t2 = new TableModelCamionero(connection);
    private static final String[] columnNames = { "Dni", "Poblacion", "Nombre", "Telefono", "Direccion", "Salario" };
    private final LinkedList<camionero> list;

    public TableModelCamionero(Connection conexion) {
        list = new LinkedList<>();
    }

    public camionero getValueAt(int rowIndex) {
        return list.get(rowIndex);
    }

    public void cargarCamionero() throws SQLException {
        // Obtiene la lista de camionero de la BD
        ArrayList<camionero> camioneros = getCamioneros();

        // Borra el contenido anterior y añade el nuevo.
        list.clear();
        list.addAll(camioneros);

        // Notifica a la vista que el contenido ha cambiado para que se refresque.
        fireTableDataChanged();
    }

    public static int insertarCamionero(String dni, String poblacion, String nombre, int telefono, String direccion,
            int salario) throws SQLException {
        String insert = "INSERT INTO camionero (dni, poblacion, nombre, telefono, direccion, salario) values ('%s','%s','%s',%s,'%s',%s)"
                .formatted(dni, poblacion, nombre, telefono, direccion, salario);
        Statement stmt = connection.createStatement();
        int filas = stmt.executeUpdate(insert);
        obtenerCamioneros();
        return filas;
    }

    public static int eliminarCamionero(String dni, String poblacion, String nombre, int telefono, String direccion,
            int salario) throws SQLException {
        String delete = "DELETE FROM camionero where dni = '%s' and poblacion = '%s' and nombre = '%s' and telefono = %s and direccion = '%s' and salario = %s"
                .formatted(dni, poblacion, nombre, telefono, direccion, salario);
        Statement stmt = connection.createStatement();
        int filas = stmt.executeUpdate(delete);
        obtenerCamioneros();
        return filas;

    }

    public static int actualizar(String dni, String poblacion, String nombre, int telefono, String direccion,
            int salario, String dni2, String poblacion2, String nombre2, int telefono2, String direccion2,
            int salario2)
            throws SQLException {
        String update = "UPDATE camionero SET dni='%s',poblacion='%s',nombre='%s',telefono=%s,direccion = '%s',salario = %s where dni='%s'and poblacion='%s'and nombre='%s'and telefono=%s and direccion = '%s' and salario = %s"
                .formatted(dni, poblacion, nombre, telefono, direccion,
                        salario, dni2, poblacion2, nombre2, telefono2, direccion2,
                        salario2);
        Statement stmt = connection.createStatement();
        int filas = stmt.executeUpdate(update);
        System.out.println(filas + " asdasdasdasdasdasd");
        obtenerCamioneros();
        return filas;
    }

    public static void obtenerCamioneros() throws SQLException {
        camioneros = new ArrayList<camionero>();
        Statement stmt = (Statement) connection.createStatement();
        ResultSet resultado = stmt.executeQuery("SELECT * FROM camion");
        while (resultado.next()) {
            String dni = resultado.getString("Matricula");
            String poblacion = resultado.getString("Potencia");
            String nombre = resultado.getString("Modelo");
            int telefono = resultado.getInt("Tipo");
            String direccion = resultado.getString("Direccion");
            int salario = resultado.getInt("Salario");
            camionero = new camionero(dni, poblacion, nombre, telefono, direccion, salario);
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

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:
                return list.get(rowIndex).getDni();
            case 1:
                return list.get(rowIndex).getPoblacion();
            case 2:
                return list.get(rowIndex).getNombre();
            case 3:
                return list.get(rowIndex).getTelefono();
            case 4:
                return list.get(rowIndex).getDireccion();
            case 5:
                return list.get(rowIndex).getSalario();
        }
        return null;
    }

}
