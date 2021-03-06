package modelo;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.LinkedList;
import javax.swing.table.AbstractTableModel;
import modelo.camion;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import controller.Conexion;

/**
 *
 * @author MEDAC
 */
public class TableModelCamion extends AbstractTableModel {

    static ArrayList<camion> camiones;
    private static camion camion;
    static Connection connection = Conexion.getConnection();
    /// ATRIBUTOS DE LA TABLA
    private static TableModelCamion t6 = new TableModelCamion(connection);
    private static final String[] columnNames = {"Matricula", "Potencia", "Modelo", "Tipo"};
    private final LinkedList<camion> list;

    public TableModelCamion(Connection conexion) {
        list = new LinkedList<>();
    }

    public void cargarCamion() throws SQLException {
        // Obtiene la lista de provincias de la BD
        ArrayList<camion> camiones = getCamiones();

        // Borra el contenido anterior y añade el nuevo.
        list.clear();
        list.addAll(camiones);

        // Notifica a la vista que el contenido ha cambiado para que se refresque.
        fireTableDataChanged();
    }

    public static void obtenerCamiones() throws SQLException {
        camiones = new ArrayList<camion>();
        Statement stmt = (Statement) connection.createStatement();
        ResultSet resultado = stmt.executeQuery("SELECT * FROM camion");
        while (resultado.next()) {
            String matricula = resultado.getString("matricula");
            int potencia = resultado.getInt("potencia");
            String modelo = resultado.getString("modelo");
            String tipo = resultado.getString("tipo");
            camion = new camion(matricula, potencia, modelo, tipo);
            camiones.add(camion);
        }
        t6.cargarCamion();
    }

    public static int insertarCamion(String matricula, int potencia, String modelo, String tipo) throws SQLException {
        String insert = "INSERT INTO camion (matricula,potencia,modelo,tipo) values ('%s',%s,'%s','%s')".formatted(matricula, potencia, modelo, tipo);
        Statement stmt = (Statement) connection.createStatement();
        int filas = stmt.executeUpdate(insert);
        obtenerCamiones();
        return filas;
    }

    public static int actualizar(String matricula, int potencia, String modelo, String tipo, String matricula2, int potencia2, String modelo2, String tipo2)
            throws SQLException {
        int filas = 0;
        String update = "UPDATE camion SET matricula='%s',potencia=%s,modelo='%s',tipo='%s' where matricula = '%s' and potencia = %s and modelo = '%s' and tipo = '%s'"
                .formatted(matricula, potencia, modelo, tipo, matricula2, potencia2, modelo2, tipo2);
        Statement stmt = (Statement) connection.createStatement();
        filas = stmt.executeUpdate(update);
        obtenerCamiones();
        return filas;
    }

    public static void limpiarCamion() throws SQLException {
        String delete = "DELETE FROM camion WHERE 1 = 1";
        Statement stmt = (Statement) connection.createStatement();
        int filas = stmt.executeUpdate(delete);
        obtenerCamiones();
    }

    public static int eliminarCamion(String matricula, int potencia, String modelo, String tipo) throws SQLException {
        String delete = "DELETE FROM camion where matricula = '%s' and potencia = %s and modelo = '%s' and tipo = '%s'".formatted(matricula, potencia, modelo, tipo);
        Statement stmt = (Statement) connection.createStatement();
        int filas = stmt.executeUpdate(delete);
        obtenerCamiones();
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

    public camion getValueAt(int rowIndex) {
        return list.get(rowIndex);
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:
                return list.get(rowIndex).getMatricula();
            case 1:
                return list.get(rowIndex).getPotencia();
            case 2:
                return list.get(rowIndex).getModelo();
            case 3:
                return list.get(rowIndex).getTipo();
        }
        return null;
    }

    public static ArrayList<camion> getCamiones() {
        return camiones;
    }

    public static camion getCamion() {
        return camion;
    }

    public static TableModelCamion getT6() {
        return t6;
    }

}
