package controller;

import java.sql.SQLException;

import modelo.TableModelCamion;

public class ControladorCamion {

    public static int insertarCamion(String matricula, int potencia, String Modelo, String tipo) throws SQLException {
        return TableModelCamion.insertarCamion(matricula, potencia, Modelo, tipo);
    }

    public static int actualizar(String matricula, int potencia, String modelo, String tipo, String matricula2, int potencia2, String modelo2, String tipo2) throws SQLException {
        return TableModelCamion.actualizar(matricula, potencia, modelo, tipo, matricula2, potencia2, modelo2, tipo2);
    }

    public static void obtenerCamion() throws SQLException {
        TableModelCamion.obtenerCamiones();
    }

    public static void limpiarCamion() throws SQLException {
        TableModelCamion.limpiarCamion();
    }

    public static void eliminarCamion(String matricula, int potencia, String modelo, String tipo) throws SQLException {
        TableModelCamion.eliminarCamion(matricula, potencia, modelo, tipo);
    }

    public static TableModelCamion getT6() {
        return TableModelCamion.getT6();

    }

}
