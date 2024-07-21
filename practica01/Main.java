package practica01;

public class Main {
    public static void main(String[] argv){
        Persona persona1 = new Persona("Pedro", 20);
        Persona persona2 = new Persona("Maria", 30); 

        persona1.setEdad(25);
        persona2.setEdad(32);

        System.out.println(persona1.mostrarInfo());
        System.out.println(persona2.mostrarInfo());  
    }
}
