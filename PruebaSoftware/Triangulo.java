package PruebaSoftware;

import java.util.Scanner;

public class Triangulo{
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Ingresa el valor de a: ");
            int a = scanner.nextInt();

            System.out.print("Ingresa el valor de b: ");
            int b = scanner.nextInt();

            System.out.print("Ingresa el valor de c: ");
            int c = scanner.nextInt();

            if (a >= 1 && a <= 200 && b >= 1 && b <= 200 && c >= 1 && c <= 200) {
                if (a < b + c && b < a + c && c < a + b) {
                    if (a == b && b == c) {
                        System.out.println("Equilátero");
                    } else if (a == b || b == c || a == c) {
                        System.out.println("Isósceles");
                    } else {
                        System.out.println("Escaleno");
                    }
                } else {
                    System.out.println("No es un Triángulo");
                }
            } else {
                System.out.println("El valor no está dentro del rango permitido");
            }

            scanner.close();
        }
    }