package controller;

import java.sql.SQLException;

import modelo.TableModelCamion;

public class ControladorCamion {

    public static int insertarCamion(String matricula, int potencia, String Modelo, String tipo) throws SQLException {
        return TableModelCamion.insertarCamion(matricula, potencia, Modelo, tipo);
    }

    public static void obtenerCamion() throws SQLException {
        TableModelCamion.obtenerCamiones();
    }

    public static void eliminarCamionero(String dni, String poblacion, String nombre, int telefono, String direccion, int salario) throws SQLException {

    }

    public static TableModelCamion getT6() {
        return TableModelCamion.getT6();

    }

    public static int actualizar(String dni, String poblacion, String nombre, int telefono, String direccion,
            int salario, String dni2, String poblacion2, String nombre2, int telefono2, String direccion2,
            int salario2)
            throws SQLException {
        return 1;
    }

}
