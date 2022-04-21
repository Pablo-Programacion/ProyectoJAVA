/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.ArrayList;

import modelo.TableModelProvincias;
import modelo.provincia;
import view.Provincia;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.TimeZone;

/**
 *
 * @author Admin
 */
public class ControladorDB4Omain {

    // private static ObjectContainer bd;
    private static String BD = "paqueteria";
    private static String USUARIO = "root";
    private static String PASS = "";
    private static String HOST = "localhost";
    private static Connection connection = null;
    private static provincia provincia;
    Calendar now = null;
    TimeZone zonahoraria = null;
    Statement stmt = null;

    public static void datosMySQL(String bd, String user, String pass, String host) {
        ControladorDB4Omain.BD = BD;
        ControladorDB4Omain.USUARIO = user;
        ControladorDB4Omain.PASS = pass;
        ControladorDB4Omain.HOST = host;
    }

    public static Connection conectarMySQL() throws SQLException {
        Calendar now = Calendar.getInstance();
        TimeZone zonahoraria = now.getTimeZone();
        connection = (Connection) DriverManager.getConnection("jdbc:mysql://" + HOST + "/" + BD + "?user=" + USUARIO
                + "&password" + PASS + "&useLegacyDatetimeCode=false&serverTimezone=" + zonahoraria.getID());
        return connection;
    }

    public static ArrayList<provincia> obtenerProvincias() throws SQLException {
        ArrayList<provincia> provincias = new ArrayList<provincia>();

        Statement stmt = (Statement) connection.createStatement();
        ResultSet resultado = stmt.executeQuery("SELECT * FROM provincia");
        while (resultado.next()) {
            int codigo = resultado.getInt("codigo");
            String nombre = resultado.getString("nombre");
            provincia = new provincia(codigo, nombre);
            provincias.add(provincia);
        }
        return provincias;
    }

    /* Insertar datos a la tabla */
    public static int insertar(int codigo, String nombre) throws SQLException {
        String insert = "INSERT INTO provincia (codigo,nombre) values (%s,'%s')".formatted(codigo, nombre);
        System.out.println(insert);
        Statement stmt = connection.createStatement();
        int filas = stmt.executeUpdate(insert);
        return filas;
    }

    /* Borra todos los registros de la base de datos */
    public static int limpiarTabla() throws SQLException {
        String insert = "DELETE FROM provincia WHERE 1 = 1";
        System.out.println(insert);
        Statement stmt = connection.createStatement();
        int filas = stmt.executeUpdate(insert);
        return filas;
    }

    /* Dexconexion de la base de datos */
    public static boolean desconectar() throws SQLException {
        if (connection != null && !connection.isClosed()) {
            connection.close();
        }
        return true;
    }

    public String getBD() {
        return BD;
    }

    public String getUSUARIO() {
        return USUARIO;
    }

    public String getPASS() {
        return PASS;
    }

    public String getHOST() {
        return HOST;
    }

    public static Connection getConnection() {
        return connection;
    }

}
