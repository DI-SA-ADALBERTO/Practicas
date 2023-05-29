package Arreglos;

public class Sumatoria2 {
    public static void main(String[] args) {
        int[] numeros = {87, 68, 94, 100, 83, 78, 85, 91, 76, 87};
        int[] ordenados = numeros;
        int sumatoria = 0;




        for (int i = 0; i < numeros.length; i++) {
            sumatoria += numeros[i];
        }
        System.out.println("Se sumaron " + numeros.length + " elementos,");
        System.out.println("La sumatoria de los elementos del arreglo es: " +
                sumatoria);

    }
}
