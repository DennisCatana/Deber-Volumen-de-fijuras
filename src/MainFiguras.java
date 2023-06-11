import java.util.Scanner;

public class MainFiguras {
    static Scanner scanner = new Scanner(System.in);
    static int opcion = 0, op = 0;

    public static void main(String[] args) {
        while (opcion != 5) {
            opcion = mostrarMenuPrincipal();
            switch (opcion) {
                case 1:
                    do {
                        System.out.println("Área y Volumen del cono"); //
                        Cono cono = new Cono(0, 0, 0);
                        cono.Radio_Cono = obtenerDatosCono(scanner, "\n\nIngrese el radio del cono: ");
                        cono.Altura_Cono = obtenerDatosCono(scanner, "Ingrese la altura del cono: ");
                        cono.Calcular_Volumen_Cono(cono.Radio_Cono, cono.Altura_Cono);
                        cono.Calcular_Area_Cono(cono.Radio_Cono, cono.Altura_Cono);
                        cono.imprimirValores();
                        System.out.print("\n\nDesea continuar en esta sección 1.Si - 2.No: ");
                        op = scanner.nextInt();
                    } while (op == 1);
                    break;
                case 2:

                    break;
                case 3:
                    do {
                        System.out.println("Área y Volumen del Cilindro");
                        Cilindro cilindro = new Cilindro(0, 0);
                        float radio = (float) obtenerDatosCilindro(scanner, "\n\nIngrese el radio del cilindro: ");
                        float altura = (float) obtenerDatosCilindro(scanner, "Ingrese la altura del cilindro: ");
                        cilindro.setRadio(radio);
                        cilindro.setAltura(altura);
                        cilindro.imprimirValores();
                        System.out.print("\n\nDesea continuar en esta sección 1.Si - 2.No: ");
                        op = scanner.nextInt();
                    } while (op == 1);
                    break;
                case 4:
                    do {
                        System.out.println("Área y Volumen del Cubo");
                        Cubo cubo = new Cubo(0);
                        float lado = (float) obtenerDatosCubo(scanner, "\nIngrese el valor del lado del cubo: ");
                        double volumen = cubo.calcularVolumen(lado);
                        double area = cubo.calcularArea(lado);
                        cubo.volumenCubo = volumen;
                        cubo.areaCubo = area;
                        cubo.imprimirValores();
                        System.out.print("\n\nDesea continuar en esta sección 1.Si - 2.No: ");
                        op = scanner.nextInt();
                    } while (op == 1);
                    break;
                case 5:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
            }
        }
    }

    public static int mostrarMenuPrincipal() {
        System.out.println("\n\tBIENVENIDOS");
        System.out.println("========================================");
        System.out.println("\nSeleccione una figura y vea su volumen");
        System.out.println("1) Cono");
        System.out.println("2) Prisma");
        System.out.println("3) Cilindro");
        System.out.println("4) Cubo");
        System.out.println("5) Salir del programa");
        System.out.print("\n Ingrese una opción: ");
        opcion = scanner.nextInt();
        while (opcion < 1 || opcion > 5) {
            System.out.println("=================================================================================");
            System.out.println("\n¡¡ Ingrese una opción válida !!");
            System.out.println("\n=================================================================================");
            System.out.print("\nDígite la opción: ");
            opcion = scanner.nextInt();
        }
        return opcion;
    }

    public static double obtenerDatosCono(Scanner scanner, String mensaje) {
        System.out.print(mensaje);
        return scanner.nextDouble();
    }

    public static double obtenerDatosCubo(Scanner scanner, String mensaje) {
        System.out.print(mensaje);
        return scanner.nextDouble();
    }

    public static double obtenerDatosCilindro(Scanner scanner, String mensaje) {
        System.out.print(mensaje);
        return scanner.nextDouble();
    }
}
