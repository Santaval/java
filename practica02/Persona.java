package practica02;

public class Persona{
    private String nombre;
    private int edad;

    public Persona(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setEdad(int edad){
        this.edad = edad;
    }
    public String getNombre(){
        return this.nombre;
    }
    public int getEdad(){
        return this.edad;
    }

    public String mostrarInfo(){
        String info = "Nombre: [" + this.nombre + "]" + ", Edad: [" + this.edad + "]";
        return info;
    }

    public boolean verificarEdad(int edad){
        boolean mayorDeEdad = true;
        if (edad < 18){
            mayorDeEdad = false;
        }
        return mayorDeEdad;
    }
}