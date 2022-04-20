/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import modelo.TableModelProvincias;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import modelo.provincia;

/**
 *
 * @author Admin
 */
public class ControladorDB4O {

    private ControladorDB4Omain controladorMain;
    private static TableModelProvincias tabla;
    private static Connection conexion;

    public void datosMySQL(String bd, String user, String pass, String host) throws SQLException {
        controladorMain.datosMySQL(bd, user, pass, host);
    }

    public static void conectarMySQL() throws SQLException {

        ControladorDB4Omain.conectarMySQL();
    }

    public static ArrayList<provincia> obtenerProvincias() throws SQLException {
        return ControladorDB4Omain.obtenerProvincias();
    }

    public static int insertar(int codigo, String nombre) throws SQLException {
        return ControladorDB4Omain.insertar(codigo, nombre);
    }

    public static int limpiarTabla() throws SQLException {
        return ControladorDB4Omain.limpiarTabla();
    }

}
