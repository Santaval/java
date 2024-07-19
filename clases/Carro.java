package clases;

public class Carro {
    // atributos
    String marca;
    String color;
    int año;
    String modelo;
    double velocidad; // m/s

    public Carro(String marcaRecibida, String colorRecibido, int añoRecibido, String modeloRecbido, double velocidadRecibida) {
        this.marca = marcaRecibida;
        this.color = colorRecibido;
        this.año = añoRecibido; 
        this.modelo = modeloRecbido;
        this.velocidad = velocidadRecibida;

    }

    public Carro(String marcaRecibida, double velocidad) {
        this.marca = marcaRecibida;
        this.velocidad = velocidad;
    }

    public Carro() {
        System.out.println("No hago nada");
    }

}