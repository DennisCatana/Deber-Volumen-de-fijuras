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
    public double cuboArea(double lado){ //Calculo del area del cubo
        return 6*this.lado*this.lado;
    }
    public double cuboVolumen(){ //Calculo del volumen del cubo
        return Math.pow(this.lado, 3);
    }
    public void imprimirValores() {
        System.out.println("Volumen del Cubo " + String.format("%.2f",cuboArea(lado)));
        System.out.println("Area Total del Cubo: " + String.format("%.2f",cuboVolumen()));
    }
}
