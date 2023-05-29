package Arreglos;
import java.util.Random;

public class Dado {

        public static void main(String[] args) {
            Random rand = new Random();
            int resultado = rand.nextInt(6) + 1; // Genera un número aleatorio entre 1 y 6
            System.out.println("El resultado del dado es: " + resultado);
        }
    }

