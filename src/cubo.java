import java.util.Scanner;

public class cubo {
    private float lado;
    private double volumenCubo;
    private double areaCubo;
    //Generando el constructor
    public cubo(float lado) {
        this.lado = lado;
    }


    //Creando los metodos para calcular el volumen y area
    public double calcularVolumen(float lado) {
        volumenCubo = Math.pow(lado, 3);
        return volumenCubo;
    }

    public double calcularArea(float lado ) {
        areaCubo = 6 * Math.pow(lado, 2);
        return areaCubo;
    }
}
