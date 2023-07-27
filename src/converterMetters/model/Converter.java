package converterMetters.model;

import java.util.Scanner;

public class Converter {
    public static Scanner sc = new Scanner(System.in);

    public static void showMenu() {
        System.out.println("======================");
        System.out.println("Bienvenido al Conversor ONE");
        System.out.println("1 - CM -> Metros");
        System.out.println("2 - Metros -> CM");
        System.out.println("0 - Salir");
        System.out.println("Elija una opcion valida:");
        System.out.println("======================");

    }

    public static void converter(String arg1, String arg2, double input, double value) {

        System.out.println("El resultado de convertir " + arg1 + " a " + arg2 + " es: " + input * value);
    }

    public static double convertMenu() {
        System.out.println("Ingrese el dato");
        double response = sc.nextDouble();
        System.out.println("User response  " + response);

        return response;

    }

    public static void againMenu() {
        System.out.println("1 - Nueva conversion ");
        System.out.println("2 - LogOut");

        int response = sc.nextInt();
        switch (response) {
            case 1:
                showMenu();
                break;
            default:
                System.out.println("Saliendo");
                sc.close();
                break;
        }
    }
}
