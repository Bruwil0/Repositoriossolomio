import java.util.Scanner;

public class SumaArray {

    public static void main(String[] args) {
        // Crear un array para almacenar los 5 números enteros
        int[] numeros = new int[5];
        
        // Crear un objeto Scanner para leer datos desde el teclado
        Scanner scanner = new Scanner(System.in);
        
        // Leer 5 números enteros desde el teclado y almacenarlos en el array
        System.out.println("Ingrese 5 numeros enteros:");

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Numero " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }
        
        // Calcula la suma de os elementos del array
        int suma = 0;
        for (int num : numeros) {
            suma += num;
        }
        
        // Mostrar la suma en la consola
        System.out.println("La suma de todos los numeros es: " + suma);
        
        // Cerrar el scanner
        scanner.close();
    }
}