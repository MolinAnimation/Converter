package converterMetters.model;

import java.util.Scanner;

public class Converter {
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
        Scanner sc = new Scanner(System.in);
        double response = sc.nextDouble();
        return response;

    }
}
