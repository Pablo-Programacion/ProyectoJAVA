package modelo;

/**
 *
 * @author alex
 */
public class conduce {
    String dni_camionero;
    String matricula_camion;

    public conduce(String dni_camionero, String matricula_camion) {
        this.dni_camionero = dni_camionero;
        this.matricula_camion = matricula_camion;
    }

    public String getDni_camionero() {
        return dni_camionero;
    }

    public String getMatricula_camion() {
        return matricula_camion;
    }

    public void setDni_camionero(String dni_camionero) {
        this.dni_camionero = dni_camionero;
    }

    public void setMatricula_camion(String matricula_camion) {
        this.matricula_camion = matricula_camion;
    }
    
}
