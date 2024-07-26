import java.util.Scanner;

public class MinMaxArray {

    public static void main(String[] args) {
        int[] numeros = new int[8];

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese 8 numeros enteros:");

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Numero " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }
        

        int mayor = numeros[0];
        int menor = numeros[0];
        
        // Determinar el número mayor y menor en el array
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > mayor) {
                mayor = numeros[i];
            }
            if (numeros[i] < menor) {
                menor = numeros[i];
            }
        }
        
        // Mostrar el número mayor y el número menor en la consola
        System.out.println("El numero mayor es: " + mayor);
        System.out.println("El numero menor es: " + menor);

        scanner.close();
    }
}