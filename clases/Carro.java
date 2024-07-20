package clases;

public class Carro {
    // atributos
    private String marca;
    private String color;
    private int año;
    private String modelo;
    private double velocidad;

    public Carro(String marcaRecibida, String colorRecibido, int añoRecibido, String modeloRecbido,
            double velocidadRecibida) {
        this.marca = marcaRecibida;
        this.color = colorRecibido;
        this.año = añoRecibido;
        this.modelo = modeloRecbido;
        this.velocidad = velocidadRecibida;
    }

    // set
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // get
    public String getMarca() {
        return this.marca;
    }

    public void acelerar(double aceleracion) {
        this.velocidad += aceleracion;
    }

    public void frenar(double freando) {
        this.velocidad -= freando;
        this.mostrarInfo();
    }

    public String mostrarInfo() {
        String info = "Carro marca " + this.marca + " color " + this.color + " año " + this.año + " modelo "
                + this.modelo;
        this.acelerar(100);
        return info;
    }


}