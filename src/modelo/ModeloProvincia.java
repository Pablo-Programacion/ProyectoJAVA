package modelo;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import controller.Conexion;
import javax.swing.JOptionPane;

/**
 *
 * @author MEDAC
 */
public class ModeloProvincia{

    static Connection connection = Conexion.getConnection();
    static ArrayList<provincia> provincias;
    private static provincia provincia;
    /// ATRIBUTOS DE LA TABLA
    private static TableModelProvincias t1 = new TableModelProvincias(connection);
    private static final String[] columnNames = {"Código", "Nombre"};
    private final LinkedList<provincia> list;

    public ModeloProvincia(Connection conexion) {
        list = new LinkedList<>();
    }

    public static void obtenerProvincias(int nCodigo) throws SQLException {
        provincias = new ArrayList<provincia>();
        Statement stmt = (Statement) connection.createStatement();
        ResultSet resultado = stmt.executeQuery("SELECT * FROM provincia where codigo ="+nCodigo);
        while (resultado.next()) {
            int codigo = resultado.getInt("codigo");
            String nombre = resultado.getString("nombre");
            JOptionPane.showMessageDialog(null, "La provincia de este Paquete es: " + nombre);
        }
    }
}

