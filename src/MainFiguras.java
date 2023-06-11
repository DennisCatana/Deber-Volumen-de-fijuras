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
                        cono.Radio_Cono = obtenerDatosCono(scanner, "\n\nIngrese el radio del cono: "); // se crea un objeto de la clase cono y se le asigna el valor del radio
                        cono.Altura_Cono = obtenerDatosCono(scanner, "Ingrese la altura del cono: ");
                        cono.Calcular_Volumen_Cono(cono.Radio_Cono, cono.Altura_Cono); // se llama al metodo calcular volumen con los valores del radio y la altura
                        cono.Calcular_Area_Cono(cono.Radio_Cono, cono.Altura_Cono); // se llama al metodo calcular area con los valores del radio y la altura
                        cono.imprimirValores();
                        System.out.print("\n\nDesea continuar en esta sección 1.Si - 2.No: ");
                        op = scanner.nextInt();
                    } while (op == 1);
                    break;
                case 2:
                    do {
                        System.out.println("Volumen y Área del Prisma");
                        Prisma prisma = new Prisma(0, 0, 0);
                        float base = (float) obtenerDatosPrisma(scanner, "\n\nIngrese el valor del área de la base: ");
                        float altura = (float) obtenerDatosPrisma(scanner, "Ingrese el valor de la altura: ");
                        float perimetro = (float) obtenerDatosPrisma(scanner, "Ingrese el valor del perímetro de la base: ");
                        prisma.setA_base(base);
                        prisma.setH(altura);
                        prisma.setPb(perimetro);
                        prisma.imprimirValores();
                        System.out.print("\n\nDesea continuar en esta sección 1.Si - 2.No: ");
                        op = scanner.nextInt();
                    } while (op == 1);
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
                        Cubos cubo = new Cubos(0);
                        double lado = obtenerDatosCubo(scanner, "\n\nIngrese el valor del lado del cubo: ");
                        cubo.setLado(lado);
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

    public static double obtenerDatosPrisma(Scanner scanner, String mensaje) {
        System.out.print(mensaje);
        return scanner.nextDouble();
    }
}
