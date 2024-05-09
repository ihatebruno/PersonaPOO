public class Persona {
    private String nombre; // Variable para almacenar el nombre de la persona.
    private int edad; // Variable para almacenar la edad de la persona.
    private double altura; // Variable para almacenar la altura de la persona.

    // Constructor vacío.
    public Persona(){
    }

    // Constructor que inicializa el nombre, la edad y la altura de la persona.
    public Persona(String nombre, int edad, double altura){
        this.nombre = nombre;
        this.edad = edad;
        this.altura = altura;
    }

    // Métodos getter y setter para el nombre.
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Métodos getter y setter para la edad.
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }

    // Métodos getter y setter para la altura.
    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }

    // Método toString para representar el objeto Persona como una cadena de texto.
    @Override
    public String toString() {
        return "Persona [Nombre=" + nombre + ", Edad=" + edad + ", Altura=" + altura + "]";
    }
    
}
