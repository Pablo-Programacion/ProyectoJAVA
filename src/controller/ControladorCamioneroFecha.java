package controller;

import java.sql.SQLException;
import modelo.TableModelCamioneroFecha;

public class ControladorCamioneroFecha {

    public static TableModelCamioneroFecha getT8() {
        return TableModelCamioneroFecha.getT8();
    }
    
    public static void obtenerPaquete(String nDni, String nFecha) throws SQLException {
        TableModelCamioneroFecha.obtenerPaquetes(nDni,nFecha);
    }
    
    public static void obtenerPaqueteDni(String nDni) throws SQLException {
        TableModelCamioneroFecha.obtenerPaquetesDni(nDni);
    }
    
    public static void obtenerPaqueteFecha(String nFecha) throws SQLException {
        TableModelCamioneroFecha.obtenerPaquetesFecha(nFecha);
    }
}