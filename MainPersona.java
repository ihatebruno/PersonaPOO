import java.util.Scanner;
public class MainPersona {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Persona objeto=new Persona();
    System.out.println("Ingresa el nombre: ");
    objeto.setNombre(sc.next());

    System.out.println("Ingresa la edad: ");
    objeto.setEdad(sc.nextInt());

    System.out.println("Ingresa la altura: ");
    objeto.setAltura(sc.nextDouble());

    System.out.println(objeto.toString() );

    objeto.getAltura();
    objeto.getEdad();
    objeto.getNombre();

    Persona objeto2=new Persona();
    System.out.println("Ingresa el nombre: ");
    objeto2.setNombre(sc.next());

    System.out.println("Ingresa la edad: ");
    objeto2.setEdad(sc.nextInt());

    System.out.println("Ingresa la altura: ");
    objeto2.setAltura(sc.nextDouble());

    System.out.println(objeto2.toString() );

    objeto2.getAltura();
    objeto2.getEdad();
    objeto2.getNombre();
}
}