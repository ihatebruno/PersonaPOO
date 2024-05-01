public class Persona {
    private String nombre;
    private int edad;
    private double altura;

    @Override
    public String toString() {
        return "Persona [Nombre=" + nombre + ", Edad=" + edad + ", Altura=" + altura + "]";
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public Persona(){
    }

    public Persona(String nombre, int edad, double altura){

    }
}