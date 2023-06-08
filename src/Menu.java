import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        int opcion = 0;
        Scanner ingreso = new Scanner(System.in);

        while (opcion != 1 & opcion != 2 & opcion != 3 & opcion != 4) {
            System.out.println("Bienvenidos\n");
            System.out.println("Seleccione una figura y vea su volumen");
            System.out.println("1) Cono");
            System.out.println("2) Prisma");
            System.out.println("3) Cilindro");
            System.out.println("4) Cubo");
            System.out.print("Ingrese su opción: ");
            opcion = ingreso.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Ha seleccionado la opción 1");
                    break;
                case 2:
                    System.out.println("Ha seleccionado la opción 2");
                    break;
                case 3:
                    System.out.println("Ha seleccionado la opción 3");
                    break;
                case 4:
                    System.out.println("Ha seleccionado la opción 4");
                    break;
                default:
                    System.out.println("Opción inválida\n");
                    break;
            }
        }
    }
}
