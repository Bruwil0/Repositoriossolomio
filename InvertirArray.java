import java.util.Scanner;

public class InvertirArray {

    public static void main(String[] args) {
        int[] numeros = new int[6];
        
        // Crear un objeto para luego leerlo
        Scanner scanner = new Scanner(System.in);
        
        // Leer 6 numeros y luego almacenalos en el array
        System.out.println("Ingrese 6 numeros enteros:");

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Numero " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }
        
        int[] invertido = new int[numeros.length];
        for (int i = 0; i < numeros.length; i++) {
            invertido[i] = numeros[numeros.length - 1 - i];
        }
        
        // Mostrar el array invertido 
        System.out.println("El array invertido es:");
        for (int num : invertido) {
            System.out.print(num + " ");
        }
        
        scanner.close();
    }
}