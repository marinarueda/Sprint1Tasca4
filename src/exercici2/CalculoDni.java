package exercici2;

public class CalculoDni {
    private int numero;

    public CalculoDni(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public char calcularLetra(int[] numero) {
        String letras = "TRWAGMYFPDXBNJZSQVHLCKE";
        char letra = ' ';
        if (numero == 8) {
            letra = letras.charAt(numero % 23);
        } else {
            System.out.println("El DNI no es correcto");
        }
        return letra;
    }
}



