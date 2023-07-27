package converterMetters.test;

import java.util.Scanner;

import converterMetters.model.Converter;

public class ConverterApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int userResponse = 0;

        Converter.showMenu();
        userResponse = sc.nextInt();

        switch (userResponse) {
            case 1:
                System.out.println("Convirtiendo de " + "CM" + " a " + "Metros");
                Converter.converter("CM", "Metros", Converter.convertMenu(), 0.01);
                Converter.againMenu();
                break;
            case 2:
                System.out.println("Convirtiendo de " + "Metros" + " a " + "Cm");
                Converter.converter(("Metros"), "Cm", Converter.convertMenu(), 100);
                Converter.againMenu();

                break;
            default:
                System.out.println("Porfavor ingrese una opcion valida e intente nuevamente.");
                break;
        }

        sc.close();
    }
}
