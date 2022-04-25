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
public class TableModelPaquete extends AbstractTableModel {
    private static paquete paquete;
    static ArrayList<paquete> paquetes;
    static Connection connection = Conexion.getConnection();
    private static Conexion conn;
    //
    private static TableModelPaquete t3 = new TableModelPaquete(conn);
    private static final String[] columnNames = {"codigo", "descripcion", "destinatario", "direccion", "fecha", "dni_camionero", "cod_provincia"};
    private final LinkedList<paquete> list;

    public TableModelPaquete(Conexion conexion) {
        list = new LinkedList<>();
        conn = conexion;
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

    public static void obtenerPaquetes() throws SQLException {
        paquetes = new ArrayList<paquete>();
        Statement stmt = (Statement) connection.createStatement();
        ResultSet resultado = stmt.executeQuery("SELECT * FROM paquete");
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
        t3.cargarPaquetes();
    }

    public static int insertarPaquete(int nCodigo, String nDescripcion, String nDestinatario, String nDireccion, String nFecha, String nDni_Camionero, int nCod_Provincia) throws SQLException {
        String insert = "INSERT INTO paquete (codigo, descripcion, destinatario, direccion, fecha, dni_camionero, cod_provincia) values (%s,'%s', '%s','%s','%s','%s',%s)".formatted(nCodigo, nDescripcion,  nDestinatario, nDireccion,nFecha, nDni_Camionero, nCod_Provincia);
        Statement stmt = connection.createStatement();
        int filas = stmt.executeUpdate(insert);
        t3.obtenerPaquetes();
        t3.cargarPaquetes();
        return filas;
    }

    public void eliminar(String titulo) throws SQLException {
        /**
         * * COMPLETAR CÓDIGO **
         */
        cargarPaquetes();
    }

    public int actualizar(String tituloOriginal, String titulo, int año, int puntuacion, String sinopsis)
            throws SQLException {
        int nfilas = 0;
        /**
         * * COMPLETAR CÓDIGO **
         */
        cargarPaquetes();
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
