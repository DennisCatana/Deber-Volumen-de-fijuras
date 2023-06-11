public class Cilindro {
    //Atributos para la clase cilidro
    private double radio;
    private double altura;

    //Constructores

    public Cilindro(double radio, double altura) {
        this.radio = radio;
        this.altura = altura;
    }

    //Setters & Getters

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    //Calculos
    public double volumenCindro(double radio, double altura){
        return Math.PI * Math.pow(this.radio, 2) * this.altura;
    }
    public  double areaCilidro(double radio, double altura){
        return (2 * Math.PI * this.radio * this.altura) + (2 * Math.PI * Math.pow(this.radio, 2));
    }
    public void imprimirValores() {
        System.out.println("Volumen del Cilindro " + String.format("%.2f",volumenCindro(radio, altura)));
        System.out.println("Area Total del Cilindro: " + String.format("%.2f",areaCilidro(radio, altura)));
    }
}
