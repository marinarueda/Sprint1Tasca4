package exercici2;

public class CalculoDni {

    public char calcularLetra(String numero) {
        String letras = "TRWAGMYFPDXBNJZSQVHLCKE";
        char letra = ' ';
        if (numero.length() == 9 && letras.indexOf(numero.charAt(8)) != -1) {
            int numeroDNI = Integer.parseInt(numero.substring(0, 8));
            letra = letras.charAt(numeroDNI % 23);
        } else {
            System.out.println("El DNI no es correcto");

        }
        return letra;
    }


}


