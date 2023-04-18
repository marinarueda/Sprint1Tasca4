package exercici2;
import java.util.Scanner;

public class Programa{
    static Scanner sc = new Scanner(System.in);
    public static void Programa(String[] args){

        System.out.print("Por favor, ingrese su numero de DNI: ");
        String numero = sc.nextLine();

        CalculoDni dni = new CalculoDni(numero);
        char letra = dni.calcularLetra(numero);

        System.out.println("La letra de su DNI es: " + letra);

    }
}

