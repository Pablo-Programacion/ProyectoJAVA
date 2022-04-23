package controller;

import java.sql.SQLException;

import modelo.TableModelCamionero;

public class ControladorCamionero {

    public static int insertarCamionero(String dni, String nombre, int telefono, String poblacion, String direccion,
            int salario) throws SQLException {
        return TableModelCamionero.insertarCamionero(dni, nombre, telefono, poblacion, direccion, salario);
    }

    public static void obtenerCamioneros() throws SQLException {
        TableModelCamionero.obtenerCamioneros();
    }

    public static TableModelCamionero getT2() {
        return TableModelCamionero.getT2();
    }
    
}
