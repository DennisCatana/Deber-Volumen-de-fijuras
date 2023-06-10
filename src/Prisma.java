public class Prisma {
    //Atributos Volumen del prisma
    float A_base;
    float h;
    //Atributos Area del prisma
    float Pb;
    //Reusamos la altura del volumen

    //Generacion de constructores
    public Prisma(float a_base, float h, float pb) {
        A_base = a_base;
        this.h = h;
        Pb = pb;
    }

    //Generacion de setters and getters
    public float getA_base() {
        return A_base;
    }
    public void setA_base(float a_base) {
        A_base = a_base;
    }
    public float getH() {
        return h;
    }
    public void setH(float h) {
        this.h = h;
    }
    public float getPb() {
        return Pb;
    }
    public void setPb(float pb) {
        Pb = pb;
    }

//Calculo del volumen del Prisma(V=Area de la base*altura)
    public float volumenPrisma(float a_base, float h){
     return this.A_base*this.h;
    }
//Calculo del area del Prisma(A=Area_base*2+Perimetro_base*altura)
    public float areaPrisma(float a_base, float pb, float h ){
        return this.A_base*2+this.Pb*this.h;
    }
}
