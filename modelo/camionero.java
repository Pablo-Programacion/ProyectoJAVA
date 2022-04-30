package modelo;

/**
 *
 * @author alex
 */
public class camionero {

    String dni;
    String nombre;
    int telefono;
    String poblacion;
    String direccion;
    int salario;

    public camionero(String dni, String poblacion, String nombre, int telefono, String direccion, int salario) {
        this.dni = dni;
        this.nombre = nombre;
        this.telefono = telefono;
        this.poblacion = poblacion;
        this.direccion = direccion;
        this.salario = salario;
    }

    public String getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public int getTelefono() {
        return telefono;
    }

    public String getPoblacion() {
        return poblacion;
    }

    public String getDireccion() {
        return direccion;
    }

    public int getSalario() {
        return salario;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public void setPoblacion(String poblacion) {
        this.poblacion = poblacion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

}
