package controller;

import java.sql.SQLException;
import javax.swing.JOptionPane;
import modelo.TableModelPaquete;

public class ControladorPaquete {

    public static TableModelPaquete getT3() {
        return TableModelPaquete.getT3();
    }
    
     public static int insertarPaquete(int nCodigo, String nDescripcion, String nDestinatario, String nDireccion, String nFecha, String nDni_Camionero, int nCod_Provincia) throws SQLException {
        return TableModelPaquete.insertarPaquete(nCodigo, nDescripcion,  nDestinatario, nDireccion,nFecha, nDni_Camionero, nCod_Provincia);
    }

    public static void obtenerPaquete() throws SQLException {
        TableModelPaquete.obtenerPaquetes();
    }

    public static void eliminarPaquete(int nCodigo) throws SQLException {
        JOptionPane.showMessageDialog(null, "Llega Controlador");
        TableModelPaquete.eliminarPaquete(nCodigo);
    }

    public static int actualizarPaquete(int nCodigo, String nDescripcion, String nDestinatario, String nDireccion, String nFecha, String nDni_Camionero, int nCod_Provincia,
        int nCodigo2, String nDescripcion2, String nDestinatario2, String nDireccion2, String nFecha2, String nDni_Camionero2, int nCod_Provincia2)
        throws SQLException {
        return TableModelPaquete.actualizarPaquete(nCodigo, nDescripcion, nDestinatario, nDireccion, nFecha, nDni_Camionero, nCod_Provincia, nCodigo2, nDescripcion2, nDestinatario2, nDireccion2, nFecha2, nDni_Camionero2, nCod_Provincia2);
    }
}
