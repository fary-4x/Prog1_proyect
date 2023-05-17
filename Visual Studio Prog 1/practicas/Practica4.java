package practicas;
//4-Hacer un programa que permita escribir 10 nombres.
//Y que los imprima mientras lo vayan escribiendo, una vez llegue al nombre numero 10 salga un mensaje que diga que ya no hay más cupos disponibles.

import java.util.Scanner;

public class Practica4 {
    
    public static void main(String[] args) {
         String[] nombres = new String[10];
        Scanner scanner = new Scanner(System.in);
        
        for (int i = 0; i < 10; i++) {
            System.out.print("Ingresa un nombre: ");
            String nombre = scanner.nextLine();
            nombres[i] = nombre;
            System.out.println(nombre);
        }
        
        if (nombres.length >= 10) {
            System.out.println("No hay más cupos disponibles");
        }
        
        scanner.close();
    }
}
