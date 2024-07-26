import java.util.Scanner;
public class ContarParesImpares {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
int[] numeros = new int[10];
int conteoPares = 0;
int conteoImpares = 0;
for (int i = 0; i < numeros.length; i++) {
System.out.print("Ingrese el numero " + (i + 1) + ": ");
numeros[i] = scanner.nextInt();
}
for (int numero : numeros) {
if (numero % 2 == 0) {
conteoPares++;
} else {
conteoImpares++;
}
}
System.out.println("Cantidad de numeros pares: " + conteoPares);
System.out.println("Cantidad de numeros impares: " + conteoImpares);
}
}