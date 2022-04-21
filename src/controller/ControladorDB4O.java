/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import modelo.TableModelProvincias;
import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author Admin
 */
public class ControladorDB4O {

    private static TableModelProvincias tabla;
    private static Connection conexion;

    public static void datosMySQL(String bd, String user, String pass, String host) throws SQLException {
        ControladorDB4Omain.datosMySQL(bd, user, pass, host);
    }

    public static void conectarMySQL() throws SQLException {
        ControladorDB4Omain.conectarMySQL();
    }

    public static void obtenerProvincias() throws SQLException {
        ControladorDB4Omain.obtenerProvincias();
    }

    public static int insertar(int codigo, String nombre) throws SQLException {
        return ControladorDB4Omain.insertar(codigo, nombre);
    }

    public static int limpiarTabla() throws SQLException {
        return ControladorDB4Omain.limpiarTabla();
    }

    public static void eliminarProvincia(int codigo, String nombre) throws SQLException {
        ControladorDB4Omain.eliminarProvincia(codigo, nombre);

    }

    public static void actualizar(int codigo, String nombre) throws SQLException {
        ControladorDB4Omain.actualizar(codigo, nombre);
    }
}
