package clases;

public class Main {

    public static void main(String[] argv) {
        // tipo de dato - nombre de variable - = - new - contructor
        Carro carro1 = new Carro("Testla", "morado", 2023, "Model X", 100);
        Carro carro2 = new Carro("Mercedes", "rojo", 2015, "RT43", 50);
        Persona persona1 = new Persona("Juan", 68, 20, 168, "Lopez");
        

        String nombres[] = {"Juan", "Pedro", "Maria", "Luis", "Ana"};
        int edades[] = {20, 30, 40, 50, 60};
        int pesos[] = {70, 80, 90, 100, 110};
        int alturas[] = {160, 170, 180, 190, 200};
        String apellidos[] = {"Lopez", "Perez", "Gomez", "Gonzalez", "Rodriguez"};


        // crea un objeto persona con los datos de los arreglos y guadarlos en un arreglo de Personas
        String[] personas = new String[5];
        for(int i = 0; i < 5; i++){
           String persona = nombres[i] + " " + apellidos[i] + ", edad: " + edades[i] + ", peso: " + pesos[i] + ", altura: " + alturas[i];
           personas[i] = persona;
        }
        System.out.println(personas);
        
        }
        
    }

