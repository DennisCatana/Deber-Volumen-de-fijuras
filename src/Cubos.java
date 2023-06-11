//Calcular el volumen y area de un cubo
public class Cubos {
    //Atributos
    private double lado;

    //Constructores

    public Cubos(double lado) {
        this.lado = lado;
    }

    //Setters y Getters

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    //Sobrecarga de Metodos
    public double cubo(double lado){ //Calculo del area del cubo
        return 6*this.lado*this.lado;
    }
    public double cubo(){ //Calculo del volumen del cubo
        return Math.pow(this.lado, 3);
    }
}
