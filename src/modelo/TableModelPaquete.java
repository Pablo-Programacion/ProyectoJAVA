package modelo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.LinkedList;
import javax.swing.table.AbstractTableModel;

import controller.Conexion;
import javax.swing.JOptionPane;

/**
 *
 * @author MEDAC
 */
public class TableModelPaquete extends AbstractTableModel {

    static Connection con = Conexion.getConnection();
    static ArrayList<paquete> paquetes;
    private static paquete paquete;
    //
    private static TableModelPaquete t3 = new TableModelPaquete(con);
    private static final String[] columnNames = {"codigo", "descripcion", "destinatario", "direccion", "fecha", "dni_camionero", "cod_provincia", "nombre"};
    private final LinkedList<paquete> list;

    public TableModelPaquete(Connection conexion) {
        list = new LinkedList<>();
    }

    public paquete getValueAt(int rowIndex) {
        return list.get(rowIndex);
    }

    public void cargarPaquetes() {
        // Obtiene la lista de provincias de la BD
        try {
            ArrayList<paquete> paquetes = getPaquetes();
            // Borra el contenido anterior y añade el nuevo.
            list.clear();
            list.addAll(paquetes);

            // Notifica a la vista que el contenido ha cambiado para que se refresque.
            fireTableDataChanged();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }

    public static void obtenerPaquetes() throws SQLException {
        paquetes = new ArrayList<paquete>();
        Statement stmt = con.createStatement();
        ResultSet resultado = stmt.executeQuery("SELECT * FROM vistapaquete");
        while (resultado.next()) {
            int codigo = resultado.getInt("codigo");
            String descripcion = resultado.getString("descripcion");
            String destinatario = resultado.getString("destinatario");
            String direccion = resultado.getString("direccion");
            String fecha = resultado.getString("fecha");
            String dni_camionero = resultado.getString("dni_camionero");
            int cod_provincia = resultado.getInt("cod_provincia");
            String nombre_provincia = resultado.getString("nombre");
            paquete = new paquete(codigo, descripcion, destinatario, direccion, fecha, dni_camionero, cod_provincia,nombre_provincia);
            paquetes.add(paquete);
        }
        t3.cargarPaquetes();
    }

    public static int insertarPaquete(int nCodigo, String nDescripcion, String nDestinatario, String nDireccion, String nFecha, String nDni_Camionero, int nCod_Provincia) throws SQLException {
        String insert = "INSERT INTO paquete (codigo, descripcion, destinatario, direccion, fecha, dni_camionero, cod_provincia) values (%s,'%s', '%s','%s','%s','%s',%s)".formatted(nCodigo, nDescripcion, nDestinatario, nDireccion, nFecha, nDni_Camionero, nCod_Provincia);
        Statement stmt = con.createStatement();
        int filas = stmt.executeUpdate(insert);
        obtenerPaquetes();
        t3.cargarPaquetes();
        return filas;
    }

    public static int eliminarPaquete(int nCodigo) throws SQLException {
        JOptionPane.showMessageDialog(null, "Llega Table Model");
        String delete = "DELETE FROM paquete where codigo = " + nCodigo;
        System.out.println(delete);
        Statement stmt = con.createStatement();
        int filas = stmt.executeUpdate(delete);
        obtenerPaquetes();
        t3.cargarPaquetes();
        return filas;
    }

    public static int actualizarPaquete(int nCodigo, String nDescripcion, String nDestinatario, String nDireccion, String nFecha, String nDni_Camionero, int nCod_Provincia, int nCodigo2, String nDescripcion2, String nDestinatario2, String nDireccion2, String nFecha2, String nDni_Camionero2, int nCod_Provincia2) throws SQLException {
        String update = "UPDATE paquete SET codigo =" + nCodigo2 + ", descripcion = '" + nDescripcion2 + "', destinatario = '" + nDestinatario2 + "', direccion = '" + nDireccion2 + "', fecha = '" + nFecha2 + "', dni_camionero = '" + nDni_Camionero2 + "', cod_provincia = " + nCod_Provincia2 + "  where codigo =" + nCodigo;
        System.out.println(update);
        Statement stmt = con.createStatement();
        int filas = stmt.executeUpdate(update);
        obtenerPaquetes();
        t3.cargarPaquetes();
        
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
            case 7:
                return list.get(rowIndex).getNombreProvincia();
        }
        return null;
    }

    public static TableModelPaquete getT3() {
        return t3;
    }

    public static ArrayList<paquete> getPaquetes() {
        return paquetes;
    }

    public static void setPaquetes(ArrayList<paquete> paquetes) {
        TableModelPaquete.paquetes = paquetes;
    }

}
