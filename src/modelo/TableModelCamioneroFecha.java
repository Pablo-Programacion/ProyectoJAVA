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
public class TableModelCamioneroFecha extends AbstractTableModel {

    static ArrayList<paquete> paquetes;
    private static paquete paquete;
    static Connection con = Conexion.getConnection();

    //
    private static TableModelCamioneroFecha t8 = new TableModelCamioneroFecha(con);
    private static final String[] columnNames = {"codigo", "descripcion", "destinatario", "direccion", "fecha", "dni_camionero", "cod_provincia"};
    private final LinkedList<paquete> list;

    public TableModelCamioneroFecha(Connection conexion) {
        list = new LinkedList<>();

    }

    public paquete getValueAt(int rowIndex) {
        return list.get(rowIndex);
    }

    public void cargarPaquetes() {
        // Obtiene la lista de provincias de la BD
        ArrayList<paquete> paquetes = getPaquetes();
        System.out.println(paquetes.size());

        // Borra el contenido anterior y añade el nuevo.
        list.clear();
        list.addAll(paquetes);

        // Notifica a la vista que el contenido ha cambiado para que se refresque.
        fireTableDataChanged();
    }

    public static void obtenerPaquetes(String nDni, String nFecha) throws SQLException {
        paquetes = new ArrayList<paquete>();
        Statement stmt = con.createStatement();
        String consulta = "SELECT * FROM paquete where dni_camionero='" + nDni + "' and fecha ='" + nFecha + "'";
        System.out.println(consulta);
        ResultSet resultado = stmt.executeQuery("SELECT * FROM paquete where dni_camionero='" + nDni + "' and fecha ='" + nFecha + "'");
        while (resultado.next()) {
            int codigo = resultado.getInt("codigo");
            String descripcion = resultado.getString("descripcion");
            String destinatario = resultado.getString("destinatario");
            String direccion = resultado.getString("direccion");
            String fecha = resultado.getString("fecha");
            String dni_camionero = resultado.getString("dni_camionero");
            int cod_provincia = resultado.getInt("cod_provincia");
            paquete = new paquete(codigo, descripcion, destinatario, direccion, fecha, dni_camionero, cod_provincia);
            paquetes.add(paquete);
        }
        t8.cargarPaquetes();
    }

    public static void obtenerPaquetesDni(String nDni) throws SQLException {
        paquetes = new ArrayList<paquete>();
        Statement stmt = con.createStatement();
        ResultSet resultado = stmt.executeQuery("SELECT * FROM paquete where dni_camionero='" + nDni + "'");
        while (resultado.next()) {
            int codigo = resultado.getInt("codigo");
            String descripcion = resultado.getString("descripcion");
            String destinatario = resultado.getString("destinatario");
            String direccion = resultado.getString("direccion");
            String fecha = resultado.getString("fecha");
            String dni_camionero = resultado.getString("dni_camionero");
            int cod_provincia = resultado.getInt("cod_provincia");
            paquete = new paquete(codigo, descripcion, destinatario, direccion, fecha, dni_camionero, cod_provincia);
            paquetes.add(paquete);
        }
        t8.cargarPaquetes();
    }

    public static void obtenerPaquetesFecha(String nFecha) throws SQLException {
        paquetes = new ArrayList<paquete>();
        Statement stmt = con.createStatement();
        ResultSet resultado = stmt.executeQuery("SELECT * FROM paquete where fecha ='" + nFecha + "'");
        while (resultado.next()) {
            int codigo = resultado.getInt("codigo");
            String descripcion = resultado.getString("descripcion");
            String destinatario = resultado.getString("destinatario");
            String direccion = resultado.getString("direccion");
            String fecha = resultado.getString("fecha");
            String dni_camionero = resultado.getString("dni_camionero");
            int cod_provincia = resultado.getInt("cod_provincia");
            paquete = new paquete(codigo, descripcion, destinatario, direccion, fecha, dni_camionero, cod_provincia);
            paquetes.add(paquete);
        }
        t8.cargarPaquetes();
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
                return list.get(rowIndex).getDescripcion();

            case 2:
                return list.get(rowIndex).getDestinatario();
            case 3:
                return list.get(rowIndex).getDireccion();
            case 4:
                return list.get(rowIndex).getFecha();
            case 5:
                return list.get(rowIndex).getDni_camionero();
            case 6:
                return list.get(rowIndex).getCod_provincia();
        }
        return null;
    }

    public static TableModelCamioneroFecha getT8() {
        return t8;
    }

    public static ArrayList<paquete> getPaquetes() {
        return paquetes;
    }

    public static void setPaquetes(ArrayList<paquete> paquetes) {
        TableModelPaquete.paquetes = paquetes;
    }

}
