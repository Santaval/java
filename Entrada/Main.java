package Entrada;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // leer una linea
        System.out.println("Ingrese algo de texto: ");
        String lineaTexto = scanner.nextLine();
        System.out.println(lineaTexto);

        // leer entero
        System.out.println("Ingrese un numero entero");

        if (scanner.hasNextInt()) {
            int numeroEntero = scanner.nextInt();
            System.out.println(numeroEntero);
        } else {
            System.out.println("Error, entero incorrecto");
            scanner.next();
        }

        // leer decimal
        System.out.println("Ingrese un numero decimal");

        if (scanner.hasNextDouble()) {
            double numeroDecimal = scanner.nextDouble();
            System.out.println(numeroDecimal);
        } else {
            System.out.println("Error, decimal incorrecto");
            scanner.next();
        }

        // leer boolean
        System.out.println("Ingrese un boolean");

        if (scanner.hasNextBoolean()) {
            boolean booleanValue = scanner.nextBoolean();
            System.out.println(booleanValue);
        } else {
            System.out.println("Error, boolean incorrecto");
            scanner.next();
        }

    }
}
