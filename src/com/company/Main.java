package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int cuenta_a = 0, cuenta_e = 0, cuenta_i = 0, cuenta_o = 0, cuenta_u = 0;

        System.out.print("Escribe una frase (intro para terminar): ");
        String texto = entrada.nextLine();

        for (int i = 0; i < texto.length(); i++) {
            switch (texto.charAt(i)) {
                case 'a':
                case 'A':
                case 'á':
                case 'Á':
                    cuenta_a++;
                    break;

                case 'e':
                case 'E':
                case 'é':
                case 'É':
                    cuenta_e++;
                    break;

                case 'i':
                case 'I':
                case 'í':
                case 'Í':
                    cuenta_i++;
                    break;

                case 'o':
                case 'O':
                case 'ó':
                case 'Ó':
                    cuenta_o++;
                    break;

                case 'u':
                case 'U':
                case 'ú':
                case 'Ú':
                    cuenta_u++;
                    break;
            }
        }

        System.out.println("Estadísticas: ");
        System.out.println("- Número de a: " + cuenta_a);
        System.out.println("- Número de e: " + cuenta_e);
        System.out.println("- Número de i: " + cuenta_i);
        System.out.println("- Número de o: " + cuenta_o);
        System.out.println("- Número de u: " + cuenta_u);

    }
}
