package exercici2;
import java.util.Scanner;

public class ProgramaDni {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Por favor, ingrese su numero de DNI: ");
        int numero = sc.nextInt();

        CalculoDni dni = new CalculoDni(numero);
        char letra = dni.calcularLetra();

        System.out.println("La letra de su DNI es: " + letra);

        CalculoDniTest test = new CalculoDniTest();
        test.testCalcularLetra(numero, 'J'); //Si numero = 47277732
    }
}

