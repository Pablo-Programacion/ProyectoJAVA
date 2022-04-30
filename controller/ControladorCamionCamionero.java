/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.sql.SQLException;
import modelo.TableModelCamionCamionero;

/**
 *
 * @author Borja Benegas
 */
public class ControladorCamionCamionero {
    
    public static void obtenerCamion(String nDni) throws SQLException {
        TableModelCamionCamionero.obtenerCamiones(nDni);
    }

    public static TableModelCamionCamionero getT7() {
        return TableModelCamionCamionero.getT7();
    }
}
