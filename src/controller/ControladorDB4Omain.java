/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.ArrayList;

import modelo.TableModelProvincias;
import modelo.provincia;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.TimeZone;
import javax.swing.JOptionPane;

import modelo.TableModelCamionero;
import modelo.camionero;

import modelo.TableModelPaquete;
import modelo.paquete;


/**
 *
 * @author Admin
 */
public class ControladorDB4Omain {

    Calendar now = null;
    TimeZone zonahoraria = null;
    Statement stmt = null;
    private static TableModelProvincias t1 = new TableModelProvincias(
            (ControladorDB4O) ControladorDB4Omain.getConnection());
    private static TableModelCamionero t2 = new TableModelCamionero((ControladorDB4O) ControladorDB4Omain.getConnection());
    private static TableModelPaquete t3 = new TableModelPaquete((ControladorDB4O) ControladorDB4Omain.getConnection());
    private static String BD = "paqueteria";
    private static String USUARIO = "root";
    private static String PASS = "";
    private static String HOST = "localhost";

    
    private static Connection connection = null;
    private static provincia provincia;
    private static camionero camionero;
    private static paquete paquete;
    
    static ArrayList<provincia> provincias;
    static ArrayList<camionero> camioneros;
    static ArrayList<paquete> paquetes;

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

    public static void obtenerProvincias() throws SQLException {
        provincias = new ArrayList<provincia>();
        Statement stmt = (Statement) connection.createStatement();
        ResultSet resultado = stmt.executeQuery("SELECT * FROM provincia");
        while (resultado.next()) {
            int codigo = resultado.getInt("codigo");
            String nombre = resultado.getString("nombre");
            provincia = new provincia(codigo, nombre);
            provincias.add(provincia);
        }
        t1.cargarProvincias();
    }

    public static int eliminarProvincia(int codigo, String nombre) throws SQLException {
        String delete = "DELETE FROM provincia where codigo = %s and nombre = '%s'".formatted(codigo, nombre);
        Statement stmt = connection.createStatement();
        int filas = stmt.executeUpdate(delete);
        ControladorDB4Omain.obtenerProvincias();
        t1.cargarProvincias();
        return filas;
    }

    public static int actualizarProvincia(int codigo, String nombre) throws SQLException {
        int filas = 0;
        try {
            int codigoTabla = provincia.getCodigo();
            String nombreTabla = provincia.getNombre();

            String update = "UPDATE provincia SET codigo=%s,nombre='%s' where codigo = %s and nombre = '%s'"
                    .formatted(codigo, nombre, codigoTabla, nombreTabla);
            Statement stmt = connection.createStatement();
            filas = stmt.executeUpdate(update);
            ControladorDB4Omain.obtenerProvincias();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return filas;
    }

    public static ArrayList<provincia> getProvincias() {
        return provincias;
    }

    public static void setProvincia(provincia provincia) {
        ControladorDB4Omain.provincia = provincia;
    }

    public static void setProvincias(ArrayList<provincia> provincias) {
        ControladorDB4Omain.provincias = provincias;
    }

    /* Insertar datos a la tabla */
    public static int insertarProvincia(int codigo, String nombre) throws SQLException {
        String insert = "INSERT INTO provincia (codigo,nombre) values (%s,'%s')".formatted(codigo, nombre);
        Statement stmt = connection.createStatement();
        int filas = stmt.executeUpdate(insert);
        ControladorDB4Omain.obtenerProvincias();
        return filas;
    }

    /* Borra todos los registros de la base de datos */
    public static int limpiarTablaProvincia() throws SQLException {
        String insert = "DELETE FROM provincia WHERE 1 = 1";
        Statement stmt = connection.createStatement();
        int filas = stmt.executeUpdate(insert);
        ControladorDB4Omain.obtenerProvincias();
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

    public static TableModelProvincias getT1() {
        return t1;
    }

    // CAMIONEROS
    public static void obtenerCamioneros() throws SQLException {
        camioneros = new ArrayList<camionero>();
        Statement stmt = (Statement) connection.createStatement();
        ResultSet resultado = stmt.executeQuery("SELECT * FROM camionero");
        while (resultado.next()) {
            String dni = resultado.getString("Dni");
            String nombre = resultado.getString("Nombre");
            int telefono = resultado.getInt("Telefono");
            String poblacion = resultado.getString("Poblacion");
            String direccion = resultado.getString("Direccion");
            int salario = resultado.getInt("Salario");
            camionero = new camionero(dni, nombre, telefono, poblacion, direccion, salario);
            camioneros.add(camionero);
        }
        t2.cargarCamionero();
    }

    public static ArrayList<camionero> getCamioneros() {
        return camioneros;
    }
    
    public static TableModelCamionero getT2() {
        return t2;
    }
    
    /*Paquete*/
    public static TableModelPaquete getT3() {
        return t3;
    }

    public static ArrayList<paquete> getPaquetes() {
        return paquetes;
    }
    
    public static void obtenerPaquetes() throws SQLException {
        paquetes = new ArrayList <paquete>();
        Statement stmt = (Statement) connection.createStatement();
        ResultSet resultado = stmt.executeQuery("SELECT * FROM paquete");
        while (resultado.next()) {
            int codigo = resultado.getInt("codigo");
            String descripcion = resultado.getString("descripcion");
            String destinatario = resultado.getString("destinatario");
            String direccion = resultado.getString("direccion");
            String fecha = resultado.getString("fecha");
            String dni_camionero = resultado.getString("dni_camionero");
            int cod_provincia = resultado.getInt("cod_provincia");
            paquete = new paquete(codigo, descripcion, destinatario, direccion, fecha, dni_camionero, cod_provincia);
            paquetes.add(paquete);
        }
        t3.cargarPaquetes();
    }
}
