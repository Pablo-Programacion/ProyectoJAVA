package controller;

import java.util.ArrayList;

import modelo.TableModelProvincias;
import modelo.provincia;
import java.sql.SQLException;

public class ControladorProvincia {
    static ArrayList<provincia> provincias;
    private static provincia provincia;

    public static void obtenerProvincias() throws SQLException {
        TableModelProvincias.obtenerProvincias();
    }

    public static int eliminarProvincia(int codigo, String nombre) throws SQLException {
        return TableModelProvincias.insertarProvincias(codigo, nombre);
    }

    public static int actualizarProvincia(int codigo, String nombre) throws SQLException {
        int codigoTabla = provincia.getCodigo();
        String nombreTabla = provincia.getNombre();
        return TableModelProvincias.actualizar(codigo, nombre, codigoTabla, nombreTabla);
    }

    public static void limpiarTablaProvincia() throws SQLException {
        TableModelProvincias.limpiarTablaProvincia();
    }

    public static int insertarProvincias(int codigo, String nombre) throws SQLException {
        return TableModelProvincias.insertarProvincias(codigo, nombre);
    }

    public static TableModelProvincias getT1() {
        return TableModelProvincias.getT1();
    }

}
