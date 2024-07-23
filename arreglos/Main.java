package arreglos;

import java.util.Scanner;

public class Main {
    public static void main() {

        // arreglo de enteros
        // literal
        int[] arregloEnterosLiteral = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        // dinamico
        int[] arregloEnterosDinamico = new int[10];

        // arreglo de decimales
        // literal
        double[] arregloDecimalLiteral = { 1.0, 2.0, 3.0 };
        // dinamico
        double[] arregloDecimalDinamico = new double[10];

        // arreglo de clase Persona
        Persona persona1 = new Persona("Ale", 50);
        Persona persona2 = new Persona("Juan", 10);
        // literal
        Persona[] personasLiteral = { persona1, persona2 };

        // dinamico
        Persona[] personasDinamico = new Persona[10];

        Main.ejemplo();

    }

    public static void ejemplo() {
        Scanner scanner = new Scanner(System.in);
        // crear arreglo de enteros
        // leer de la entrada el tamaño del arreglo, inicializarlo y llenarlo con los
        // datos de la entrada
        System.out.println("Ingrese  el tamaño del arreglo: ");
        if (scanner.hasNextInt()) {
            int tamanoArreglo = scanner.nextInt();
            if (tamanoArreglo >= 0) {
                int[] arreglo = new int[tamanoArreglo];
                // inicializa el contador

                // evalua la condicion
                // ejecuta
                // aumenta el contador

                for (int contador = 0; contador < tamanoArreglo; contador++) {
                    System.out.println("Digite el valor #" + contador + ":");

                    if (scanner.hasNextInt()) {
                        arreglo[contador] = scanner.nextInt();
                    } else {
                        arreglo[contador] = 0;
                    }

                }

                System.out.println("Arreglo: ");
                for (int contador = 0; contador < arreglo.length; contador++) {

                    System.out.print(arreglo[contador]);
                }

            } else {
                System.out.println("Baboso, el entero no puede ser negativo");
            }

        } else {
            System.out.println("Baboso");
        }

    }
}
