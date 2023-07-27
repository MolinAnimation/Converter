package converterMetters.model;

import java.util.Scanner;

public class AluraConv {
    public static void mostrarMenu() {
        System.out.println("======================");
        System.out.println("Bienvenido al Conversor ONE");
        System.out.println("1 - CM -> Metros");
        System.out.println("2 - Metros -> CM");
        System.out.println("0 - Salir");
        System.out.println("Elija una opcion valida:");
        System.out.println("======================");
    }

    public static void conversion(String origin, String destin, double proporcion, Scanner lector) {
        System.out.println("Elegiste la opcion: " + origin + " ->> " + destin);
        System.out.println("Ingrese el valor a convertir: ");
        double value = lector.nextDouble();
        double valorFinal = value * proporcion;
        System.out.println("El resultado de la conversion es: " + valorFinal);

    }
}
