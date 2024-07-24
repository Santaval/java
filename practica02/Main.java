package practica02;
import java.util.Scanner;

public class Main {
    public static void main(String[] argv){
        Persona persona1 = new Persona("", 0);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite cuántas personas quiere inicializar:");
        int cantidadPersonas = scanner.nextInt();
        Persona[] personas = new Persona[cantidadPersonas];

        for(int i = 0; i < cantidadPersonas; i++){
            scanner.nextLine();

            System.out.println("Nombre de la persona #" + i + ":");
            String nombre = scanner.nextLine();
            persona1.setNombre(nombre);
            
            System.out.println("Edad de la persona #" + i + ":");
            if (scanner.hasNextInt()){
                int edad = scanner.nextInt();
                persona1.setEdad(edad);
            } else {
                System.out.println("Edad no válida");
                scanner.next();
            }
            personas[i] = new Persona(persona1.getNombre(), persona1.getEdad());
        }
        for (int i = 0; i < personas.length; i++){
            System.out.print(personas[i] + " ");
        }
    }
}
