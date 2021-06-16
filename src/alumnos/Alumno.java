package alumnos;

/**
 * Clase Alumno
 *
 * @author Jose Antonio
 * @version 221.06.16
 *
 */
public class Alumno {
    private String nombre;
    private int anioNacimiento;

    public Alumno(String nombre, int anioNacimiento) {
        this.nombre = nombre;
        this.anioNacimiento = anioNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAnioNacimiento() {
        return anioNacimiento;
    }

    public void setAnioNacimiento(int anioNacimiento) {
        this.anioNacimiento = anioNacimiento;
    }

    /**
     * Método para obtener la edad del alumno
     *
     * @param anioActual año actual
     * @return edad del alumno
     */
    public int calcularEdad(int anioActual) {
        return anioActual - anioNacimiento;
    }
}
