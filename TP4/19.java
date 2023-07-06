import java.util.Random;

public class NumerosAleatoriosWhile {
    public static void main(String[] args) {
        Random random = new Random();
        int contador = 1;
        int suma = 0;

        while (contador <= 10) {
            int numero = random.nextInt(100);
            System.out.println("Número " + contador + ": " + numero);
            suma += numero;
            contador++;
        }

        double promedio = (double) suma / 10;
        System.out.println("Suma: " + suma);
        System.out.println("Promedio: " + promedio);
    }
}
