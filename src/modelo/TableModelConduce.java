package modelo;

import controller.Conexion;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.LinkedList;
import javax.swing.table.AbstractTableModel;
import static modelo.TableModelPaquete.getPaquetes;

/**
 *
 * @author admin
 */
public class TableModelConduce extends AbstractTableModel {

    private static conduce conduce;
    static ArrayList<conduce> conductores;
    static Connection connection = Conexion.getConnection();
    //
    private static TableModelConduce t5 = new TableModelConduce(connection);
    private static final String[] columnNames = {"Dni Camionero", "Matricula Camion"};
    private final LinkedList<conduce> list;

    public TableModelConduce(Connection conexion) {
        list = new LinkedList<>();
    }

    public void cargarConduces() {
        // Obtiene la lista de provincias de la BD
        ArrayList<conduce> conduces = getConductores();

        // Borra el contenido anterior y añade el nuevo.
        list.clear();
        list.addAll(conduces);

        // Notifica a la vista que el contenido ha cambiado para que se refresque.
        fireTableDataChanged();
    }

    public static void obtenerConductores() throws SQLException {
        conductores = new ArrayList<conduce>();
        Statement stmt = (Statement) connection.createStatement();
        ResultSet resultado = stmt.executeQuery("SELECT * FROM conduce");
        while (resultado.next()) {
            String dni_camionero = resultado.getString("dni_camionero");
            String matricula_camion = resultado.getString("matricula_camion");
            conduce = new conduce(dni_camionero, matricula_camion);
            conductores.add(conduce);
        }
        t5.cargarConduces();
    }

    public static int insertarConduce(String dni_camionero, String matricula_camion) throws SQLException {
        String insert = "INSERT INTO conduce(dni_camionero, matricula_camion) values ('%s','%s')".formatted(dni_camionero, matricula_camion);
        Statement stmt = connection.createStatement();
        int filas = stmt.executeUpdate(insert);
        obtenerConductores();
        return filas;

    }

    public static int eliminarConduce(String dni_camionero, String matricula_camion) throws SQLException {
        String delete = "DELETE FROM conduce WHERE dni_camionero = %s and matricula_camion = '%s'".formatted(dni_camionero, matricula_camion);
        Statement stmt = connection.createStatement();
        int filas = stmt.executeUpdate(delete);
        obtenerConductores();
        t5.cargarConduces();
        return filas;
    }

    public static int actualizar(String dni_camionero, String matricula_camion) throws SQLException {
        int filas = 0;
        String update = "UPDATE conduce SET dni_camionero=%s,matricula_camion='%s' where dni_camionero = %s and matricula_camion = '%s'".formatted(dni_camionero, matricula_camion);
        Statement stmt = connection.createStatement();
        filas = stmt.executeUpdate(update);
        obtenerConductores();
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

    public conduce getValueAt(int rowIndex) {
        return list.get(rowIndex);
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

    public static ArrayList<conduce> getConductores() {
        return conductores;
    }

    public static TableModelConduce getT5() {
        return t5;
    }

}
