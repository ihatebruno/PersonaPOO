import java.util.Scanner;

public class MainPersona {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Crear un objeto Scanner para leer la entrada del usuario.
        Persona objeto=new Persona(); // Crear un objeto Persona.

        // Solicitar al usuario que ingrese el nombre, la edad y la altura para el primer objeto Persona.
        System.out.println("Ingresa el nombre: ");
        objeto.setNombre(sc.next());

        System.out.println("Ingresa la edad: ");
        objeto.setEdad(sc.nextInt());

        System.out.println("Ingresa la altura: ");
        objeto.setAltura(sc.nextDouble());

        System.out.println(objeto.toString() ); // Imprimir la representación en cadena del primer objeto Persona.

        // Llamar a los métodos getter, pero no se hace nada con los valores de retorno.
        objeto.getAltura();
        objeto.getEdad();
        objeto.getNombre();


        Persona objeto2=new Persona(); // Crear un segundo objeto Persona.

        // Solicitar al usuario que ingrese el nombre, la edad y la altura para el segundo objeto Persona.
        System.out.println("Ingresa el nombre: ");
        objeto2.setNombre(sc.next());

        System.out.println("Ingresa la edad: ");
        objeto2.setEdad(sc.nextInt());

        System.out.println("Ingresa la altura: ");
        objeto2.setAltura(sc.nextDouble());

        System.out.println(objeto2.toString() ); // Imprimir la representación en cadena del segundo objeto Persona.

        // Llamar a los métodos getter, pero no se hace nada con los valores de retorno.
        objeto2.getAltura();
        objeto2.getEdad();
        objeto2.getNombre();
    }
}
