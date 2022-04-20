/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author admin
 */
public class paquete {

    int codigo;
    String descripcion;
    int destinatario;
    int direccion;
    date fecha;

    public paquete(int codigo, String descripcion, int destinatario, int direccion) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.destinatario = destinatario;
        this.direccion = direccion;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getDestinatario() {
        return destinatario;
    }

    public int getDireccion() {
        return direccion;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setDestinatario(int destinatario) {
        this.destinatario = destinatario;
    }

    public void setDireccion(int direccion) {
        this.direccion = direccion;
    }

}
