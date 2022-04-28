package controller;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.TimeZone;

public class Conexion {

    private static String BD = "paqueteria";
    private static String USUARIO = "";
    private static String PASS = "";
    private static String HOST = "localhost";
    public static Conexion conexion;
    private static Connection connection = null;

    public Conexion() {
        try {
            Calendar now = Calendar.getInstance();
            TimeZone zonahoraria = now.getTimeZone();
            connection = (Connection) DriverManager.getConnection("jdbc:mysql://" + HOST + "/" + BD + "?user=" + USUARIO
                    + "&password" + PASS + "&useLegacyDatetimeCode=false&serverTimezone=" + zonahoraria.getID());
        } catch (Exception e) {
        }
    }

    public static Conexion getConexion() {
        return conexion;
    }

    public static Connection getConnection() {
        return connection;
    }

    public static void datosMySQL(String user, String pass) {
        Conexion.USUARIO = user;
        Conexion.PASS = pass;
    }

    public static Conexion getInstance() {
        if (conexion == null) {
            conexion = new Conexion();
        }
        return conexion;
    }

    public static boolean desconectar() throws SQLException {
        if (connection != null && !connection.isClosed()) {
            connection.close();
        }
        return true;
    }

    public static String getBD() {
        return BD;
    }

    public static void setBD(String bD) {
        BD = bD;
    }

    public static String getUSUARIO() {
        return USUARIO;
    }

    public static void setUSUARIO(String uSUARIO) {
        USUARIO = uSUARIO;
    }

    public static String getPASS() {
        return PASS;
    }

    public static void setPASS(String pASS) {
        PASS = pASS;
    }

    public static String getHOST() {
        return HOST;
    }

    public static void setHOST(String hOST) {
        HOST = hOST;
    }

    public static void setConnection(Connection connection) {
        Conexion.connection = connection;
    }

}
