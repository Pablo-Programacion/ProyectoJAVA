package modelo;

import java.util.Date;

/**
 *
 * @author alex
 */
public class paquete {

    int codigo;
    String descripcion;
    int destinatario;
    String direccion;
    Date fecha;
    camionero c1;
    provincia p1;

    public paquete(int codigo, String descripcion, int destinatario, String direccion, Date fecha, camionero c1, provincia p1) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.destinatario = destinatario;
        this.direccion = direccion;
        this.fecha = fecha;
        this.c1 = c1;
        this.p1 = p1;
    }

    public camionero getC1() {
        return c1;
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

    public String getDireccion() {
        return direccion;
    }

    public Date getFecha() {
        return fecha;
    }

    public provincia getP1() {
        return p1;
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

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public void setC1(camionero c1) {
        this.c1 = c1;
    }

    public void setP1(provincia p1) {
        this.p1 = p1;
    }

}
