package controller;

import java.sql.SQLException;
import java.util.ArrayList;

import modelo.TableModelCamionero;
import modelo.camionero;

public class ControladorCamionero {

    public static int insertarCamionero(String dni, String poblacion, String nombre, int telefono, String direccion, int salario) throws SQLException {
        return TableModelCamionero.insertarCamionero(dni, poblacion, nombre, telefono, direccion, salario);
    }

    public static ArrayList<camionero> obtenerCamioneros() throws SQLException {
        return TableModelCamionero.obtenerCamioneros();
    }

    public static void eliminarCamionero(String dni, String poblacion, String nombre, int telefono, String direccion, int salario) throws SQLException {
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

    public static void limpiarCamionero() throws SQLException {
        TableModelCamionero.limpiarCamionero();
    }
}
