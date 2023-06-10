import java.util.Scanner;

public class Menu {
    static Scanner scanner = new Scanner(System.in);
    static int opcion = 0;
    public static void main(String[] args) {

        while (opcion != 5) {
            opcion=MenuPrincipal();

            switch (opcion) {
                case 1:
                    System.out.println("\nHa seleccionado la opción 1");
                    break;
                case 2:
                    System.out.println("\nHa seleccionado la opción 2");
                    break;
                case 3:
                    System.out.println("\nHa seleccionado la opción 3");
                    break;
                case 4:
                    System.out.println("\nHa seleccionado la opción 4");
                    break;
                case 5:
                    System.out.println("Saliendo del programa...");
                    break;
                default:

            }
        }
    }
    public static int MenuPrincipal() {
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
}
