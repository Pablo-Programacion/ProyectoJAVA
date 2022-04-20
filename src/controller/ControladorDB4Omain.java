/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.TimeZone;
import modelo.provincia;

/**
 *
 * @author Admin
 */
public class ControladorDB4Omain {

    private static ObjectContainer bd;
    private static String BD = "paqueteria";
    private static String USUARIO = "pablo";
    private static String PASS = "";
    private static String HOST = "10.192.82.253";
    private static Connection connection = null;

    public void datosMySQL(String bd, String user, String pass, String host) {
        this.BD = BD;
        this.USUARIO = user;
        this.PASS = pass;
        this.HOST = host;
    }

    public static Connection conectarMySQL() throws SQLException {
        Calendar now = Calendar.getInstance();
        TimeZone zonahoraria = now.getTimeZone();
        connection = (Connection) DriverManager.getConnection("jdbc:mysql://" + HOST + "/" + BD + "?user=" + USUARIO
                + "&password" + PASS + "&useLegacyDatetimeCode=false&serverTimezone=" + zonahoraria.getID());
        return connection;
    }

    public static ArrayList<provincia> obtenerProvincias() {
        ArrayList<provincia> peliculas = new ArrayList<provincia>();
        provincia ejemplo = new provincia(0, null);
        ObjectSet res = bd.queryByExample(ejemplo);
        while (res.hasNext()) {
            peliculas.add((provincia) res.next());
        }
        return peliculas;
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

    public boolean desconectar() throws SQLException {
        if (connection != null && !connection.isClosed()) {
            connection.close();
        }
        return true;
    }
}
