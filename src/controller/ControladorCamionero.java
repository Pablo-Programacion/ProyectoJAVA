package controller;

import java.sql.SQLException;

import modelo.TableModelCamionero;

public class ControladorCamionero {

    public static int insertarCamionero(String dni, String poblacion, String nombre, int telefono, String direccion, int salario) throws SQLException {
        return TableModelCamionero.insertarCamionero(dni, poblacion, nombre, telefono, direccion, salario);
    }

    public static void obtenerCamioneros() throws SQLException {
        TableModelCamionero.obtenerCamioneros();
    }

    public static void eliminarCamionero(String dni, String poblacion, String nombre, int telefono, String direccion, int salario) throws SQLException {
        TableModelCamionero.eliminarCamionero(dni, poblacion, nombre, telefono, direccion, salario);
    }

    public static TableModelCamionero getT2() {
        return TableModelCamionero.getT2();
    }

}
