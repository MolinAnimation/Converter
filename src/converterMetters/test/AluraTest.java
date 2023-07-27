package converterMetters.test;

import java.util.Scanner;

import converterMetters.model.AluraConv;

public class AluraTest {
    public static void main(String[] args) {
        // scanner
        Scanner sc = new Scanner(System.in);
        int userInput = 0;

        while (userInput != 9) {
            AluraConv.mostrarMenu();
            userInput = sc.nextInt();

            switch (userInput) {
                case 1:
                    AluraConv.conversion("Cm", "Metros", 0.001, sc);
                    break;
                case 2:
                    AluraConv.conversion("Metros", "CM", 100, sc);

                    break;
                case 9:
                    System.out.println("Saliendo del sistema");
                    break;
                default:
                    System.out.println("Elija una opcion valida");
                    break;
            }
            System.out.println();
        }
        sc.close();
    }
}
