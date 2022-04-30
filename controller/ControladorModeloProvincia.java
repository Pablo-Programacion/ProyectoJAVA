package controller;

import java.util.ArrayList;
import modelo.ModeloProvincia;
import modelo.provincia;

import java.sql.SQLException;

public class ControladorModeloProvincia {
    static ArrayList<provincia> provincias;

    public static void obtenerProvincias(int nCodigo) throws SQLException {
        ModeloProvincia.obtenerProvincias(nCodigo);
    }
}
