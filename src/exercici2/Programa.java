package exercici2;
import java.util.Scanner;

public class Programa{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Por favor, ingrese su numero de DNI: ");
        int numero = sc.nextInt();

        CalculoDni dni = new CalculoDni(numero);
        char letra = dni.calcularLetra(numero);

        System.out.println("La letra de su DNI es: " + letra);
    }
}

