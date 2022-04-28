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
public class TableModelCamionCamionero extends AbstractTableModel {

    static ArrayList<camion> camiones;
    private static camion camion;
    /// ATRIBUTOS DE LA TABLA
    private static TableModelCamionCamionero t7 = new TableModelCamionCamionero(Conexion.getInstance().getConnection());
    private static final String[] columnNames = {"Matricula", "Potencia", "Modelo", "Tipo"};
    private final LinkedList<camion> list;

    public TableModelCamionCamionero(Connection conexion) {
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

    public static void obtenerCamiones(String nDni) throws SQLException {
        camiones = new ArrayList<camion>();
        Statement stmt = (Statement) Conexion.getInstance().getConnection().createStatement();
        ResultSet resultado = stmt.executeQuery("SELECT camion.matricula,camion.modelo,camion.potencia,camion.tipo FROM camion INNER JOIN conduce ON camion.matricula = conduce.matricula_camion where conduce.dni_camionero ='"+nDni+"'");
        while (resultado.next()) {
            String matricula = resultado.getString("matricula");
            int potencia = resultado.getInt("potencia");
            String modelo = resultado.getString("modelo");
            String tipo = resultado.getString("tipo");
            camion = new camion(matricula, potencia, modelo, tipo);
            camiones.add(camion);
        }
        t7.cargarCamion();
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

    public static TableModelCamionCamionero getT7() {
        return t7;
    }

}
