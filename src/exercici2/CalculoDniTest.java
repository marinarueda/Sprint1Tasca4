package exercici2;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

    public class CalculoDniTest {

        @ParameterizedTest
        @ValueSource(ints = {12345678, 87654321, 47277732, 54857896, 87458965, 12547852, 63598452, 56985632, 41258965, 45289652})
        public void testCalcularLetra(int numero, char j) {
            CalculoDni dni = new CalculoDni(numero);
            char letraCalculada = dni.calcularLetra();
            char letraEsperada = obtenerLetraEsperada(numero);
            assertEquals(letraEsperada, letraCalculada);
        }

        private char obtenerLetraEsperada(int numero) {
            String letras = "TRWAGMYFPDXBNJZSQVHLCKE";
            return letras.charAt(numero % 23);
        }
    }






