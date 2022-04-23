package controller;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.TimeZone;

public class Conexion {
    private static String BD = "";
    private static String USUARIO = "";
    private static String PASS = "";
    private static String HOST = "";
    Calendar now = null;
    TimeZone zonahoraria = null;
    Statement stmt = null;
    private static Connection connection = null;

    public static void datosMySQL(String bd, String user, String pass, String host) {
        Conexion.BD = bd;
        Conexion.USUARIO = user;
        Conexion.PASS = pass;
        Conexion.HOST = host;
    }

    public static Connection conectarMySQL() throws SQLException {
        Calendar now = Calendar.getInstance();
        TimeZone zonahoraria = now.getTimeZone();
        connection = (Connection) DriverManager.getConnection("jdbc:mysql://" + HOST + "/" + BD + "?user=" + USUARIO
                + "&password" + PASS + "&useLegacyDatetimeCode=false&serverTimezone=" + zonahoraria.getID());
        return connection;
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

    public static Connection getConnection() {
        return connection;
    }

    public static void setConnection(Connection connection) {
        Conexion.connection = connection;
    }

}
