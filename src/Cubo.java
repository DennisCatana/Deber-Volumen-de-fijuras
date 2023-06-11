public class Cubo {
    float lado;
    double volumenCubo;
    double areaCubo;

    //Generando el constructor
    public Cubo(float lado) {
        this.lado = lado;
    }


    //Creando los metodos para calcular el volumen y area
    public double calcularVolumen(float lado) {
        volumenCubo = Math.pow(lado, 3);
        return volumenCubo;
    }

    public double calcularArea(float lado) {
        areaCubo = 6 * Math.pow(lado, 2);
        return areaCubo;
    }

    public void imprimirValores() {
        System.out.println("Volumen del Cubo: " + volumenCubo);
        System.out.println("Area Total del Cubo: " + areaCubo);
    }
}
