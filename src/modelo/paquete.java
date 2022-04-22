package modelo;



/**
 *
 * @author alex
 */
public class paquete {

    int codigo;
    String descripcion;
    String destinatario;
    String direccion;
    String fecha;
    String dni_camionero;
    int cod_provincia;

    public paquete(int codigo, String descripcion, String destinatario, String direccion, String fecha, String c1, int p1) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.destinatario = destinatario;
        this.direccion = direccion;
        this.fecha = fecha;
        this.dni_camionero = c1;
        this.cod_provincia = p1;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getDestinatario() {
        return destinatario;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getFecha() {
        return fecha;
    }


    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setDestinatario(String destinatario) {
        this.destinatario = destinatario;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }  

    public String getDni_camionero() {
        return dni_camionero;
    }

    public void setDni_camionero(String dni_camionero) {
        this.dni_camionero = dni_camionero;
    }

    public int getCod_provincia() {
        return cod_provincia;
    }

    public void setCod_provincia(int cod_provincia) {
        this.cod_provincia = cod_provincia;
    }
}
