package controller;

import java.sql.SQLException;

import modelo.TableModelCamion;
import modelo.TableModelConduce;
import modelo.TableModelProvincias;

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

    public static void eliminarCamionero(String dni, String poblacion, String nombre, int telefono, String direccion, int salario) throws SQLException {

    }

    public static TableModelCamion getT6() {
        return TableModelCamion.getT6();

    }

}
