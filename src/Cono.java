//Clase Cono        Calcular el Volumen y un Area dado ciertos parámetros
public class Cono {

//********************************************************************************************************************//

    //Variables Volumen Cono
    double Volumen_Cono;
    double Radio_Cono;
    double Altura_Cono;

    //Variables Area Cono
    double Generatriz;
    double Area_Cono_Lateral;
    double Area_Cono_Base;
    double Area_Cono_Total;

//********************************************************************************************************************//
    //Constructores con Sobrecarga

    //Constructor Volumen
    public Cono(double volumen_Cono, double radio_Cono, double altura_Cono) {
        Volumen_Cono = volumen_Cono;
        Radio_Cono = radio_Cono;
        Altura_Cono = altura_Cono;
    }

    //Constructor Area
    public Cono(double generatriz, double area_Cono_Lateral, double area_Cono_Base, double area_Cono_Total) {
        Generatriz = generatriz;
        Area_Cono_Lateral = area_Cono_Lateral;
        Area_Cono_Base = area_Cono_Base;
        Area_Cono_Total = area_Cono_Total;
    }

//********************************************************************************************************************//
    //Métodos con Sobrecarga

    //Calcular el Volumen de un Cono
    public void Calcular_Volumen_Cono(double Radio_Cono, double Altura_Cono) {
        Volumen_Cono = (Math.PI * Radio_Cono * Radio_Cono * Altura_Cono) / 3; //(pi * r^2 * h)/3
    }

    //Calcular el Area de un Cono
    public void Calcular_Area_Cono(double Radio_Cono, double Altura_Cono) {
        Generatriz = Math.sqrt(Radio_Cono * Radio_Cono + Altura_Cono * Altura_Cono); //Pitagoras con radio y altura
        Area_Cono_Base = Math.PI * Radio_Cono * Radio_Cono; //pi * r^2
        Area_Cono_Lateral = Math.PI * Radio_Cono * Generatriz; //pi * r * g
        Area_Cono_Total = Area_Cono_Base + Area_Cono_Lateral; // Area Lateral + Area Base
    }
//********************************************************************************************************************//
}
