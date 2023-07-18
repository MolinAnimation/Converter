package converterMetters.test;

import java.util.Scanner;

import converterMetters.model.Converter;

public class ConverterApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int response = 0;

        do {
            Converter.showMenu();
            response = sc.nextInt();

            switch (response) {
                case 1:
                    System.out.println("Convirtiendo de " + "CM" + " a " + "Metros");
                    Converter.converter("CM", "Metros", Converter.convertMenu(), 0.01);
                    break;
                case 2:
                    System.out.println("Convirtiendo de " + "Metros" + " a " + "Cm");
                    Converter.converter(("Metros"), "Cm", Converter.convertMenu(), 100);
                    break;
                default:
                    System.out.println("Porfavor ingrese una opcion valida e intente nuevamente.");
                    break;
            }
        } while (response != 0);
        sc.close();
    }
}
