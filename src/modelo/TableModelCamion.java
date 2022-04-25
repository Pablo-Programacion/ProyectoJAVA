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
import static modelo.TableModelCamionero.camioneros;
import static modelo.TableModelCamionero.connection;

/**
 *
 * @author MEDAC
 */
public class TableModelCamion extends AbstractTableModel {

    static Connection connection = Conexion.getConnection();
    static ArrayList<camion> camiones;
    private static camion camion;
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
            String Matriucula = resultado.getString("Matricula");
            String Potencia = resultado.getString("Potencia");
            int Modelo = resultado.getInt("Modelo");
            String Tipo = resultado.getString("Tipo");
            camion = new camion(Matriucula, Potencia, Modelo, Tipo);
            camiones.add(camion);
        }
        t6.cargarCamion();
    }

    public static int insertarCamion(String matricula, int potencia, String modelo, String tipo) throws SQLException {
         String insert = "INSERT INTO camion (matricula,potencia,modelo,tipo) values ('%s',%s,'%s',%s)".formatted(matricula,potencia,modelo,tipo);
        Statement stmt = connection.createStatement();
        int filas = stmt.executeUpdate(insert);
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
