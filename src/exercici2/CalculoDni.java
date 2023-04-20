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

    public char calcularLetra() {
        String letras = "TRWAGMYFPDXBNJZSQVHLCKE";
        char letra = ' ';
        if (String.valueOf(numero).length() != 8) {
            System.out.println("El DNI no es correcto");
        } else {
            letra = letras.charAt(numero % 23);
        }
        return letra;
    }
}



