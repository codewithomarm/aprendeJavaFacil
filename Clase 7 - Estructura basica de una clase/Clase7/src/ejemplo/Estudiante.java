package ejemplo;

public class Estudiante {
    //Atributos
    private String nombre;
    private String apellido;
    private char genero;
    private int edad;

    //Constructor
    public Estudiante(String nombre, String apellido, char genero, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.genero = genero;
        this.edad = edad;
    }

    //Getter atributo nombre
    public String getNombre(){
        return nombre;
    }

    //Getter atributo apellido
    public String getApellido() {
        return apellido;
    }

    //Getter atributo genero
    public char getGenero() {
        return genero;
    }

    //Getter atributo edad
    public int getEdad() {
        return edad;
    }

    //Setter atributo nombre
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    //Setter atributo apellido
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    //Setter atributo genero
    public void setGenero(char genero) {
        this.genero = genero;
    }

    //Setter atributo edad
    public void setEdad(int edad) {
        this.edad = edad;
    }

    //ToString
    @Override
    public String toString() {
        return "Estudiante{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", genero=" + genero +
                ", edad=" + edad +
                '}';
    }
}
