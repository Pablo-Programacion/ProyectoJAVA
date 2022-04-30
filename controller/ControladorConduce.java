package controller;

import java.sql.SQLException;

import modelo.TableModelConduce;

public class ControladorConduce {

    public static int insertarConductores(String dni_camionero,String matricula) throws SQLException {
        return TableModelConduce.insertarConduce(dni_camionero, matricula);
    }

    public static void obtenerConductores() throws SQLException {
        TableModelConduce.obtenerConductores();
    }

    public static void eliminarCamionero(String dni, String poblacion, String nombre, int telefono, String direccion, int salario) throws SQLException {

    }

    public static int actualizar(String dni, String poblacion, String nombre, int telefono, String direccion,
            int salario, String dni2, String poblacion2, String nombre2, int telefono2, String direccion2,
            int salario2)
            throws SQLException {
        return 1;
    }

    public static TableModelConduce getT5() {
        return TableModelConduce.getT5();

    }
}
