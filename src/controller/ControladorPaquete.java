package controller;

import java.sql.SQLException;
import modelo.TableModelCamionero;
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

    public static void eliminarPaquete(String dni, String poblacion, String nombre, int telefono, String direccion, int salario) throws SQLException {
        TableModelCamionero.eliminarCamionero(dni, poblacion, nombre, telefono, direccion, salario);
    }

    public static TableModelCamionero getT2() {
        return TableModelCamionero.getT2();
    }

    public static int actualizar(String dni, String poblacion, String nombre, int telefono, String direccion,
            int salario, String dni2, String poblacion2, String nombre2, int telefono2, String direccion2,
            int salario2)
            throws SQLException {
        return TableModelCamionero.actualizar(dni, poblacion, nombre, telefono, direccion, salario, dni2, poblacion2, nombre2, telefono2, direccion2, salario2);
    }
}
