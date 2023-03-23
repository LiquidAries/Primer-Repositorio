/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cambiomoneda_clase5;

import java.util.Scanner;

public class CambioMoneda_Clase5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de euros a convertir: ");
        double euros = scanner.nextDouble();

        scanner.nextLine();

        System.out.println("Ingrese la moneda a la que desea convertir (libras, dólares o yenes): ");
        String moneda = scanner.nextLine();

        convertirMoneda(euros, moneda);
    }

    public static void convertirMoneda(double euros, String moneda) {
        double cambio = 0;

        switch (moneda) {
            case "libras":
                cambio = euros * 0.86;
                System.out.println(euros + " euros son " + cambio + " libras.");
                break;
            case "dólares":
                cambio = euros * 1.28611;
                System.out.println(euros + " euros son " + cambio + " dólares.");
                break;
            case "yenes":
                cambio = euros * 129.852;
                System.out.println(euros + " euros son " + cambio + " yenes.");
                break;
            default:
                System.out.println("La moneda ingresada no es válida.");
                break;
        }
    }
 
}
