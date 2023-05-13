package Arreglos;

public class EjemploArreglos {
    public static void main(String[] args) {
        System.out.println("Mi zoológico tiene 10: ");
        String[] bugs = {"monkey", "chim", "donkey", "lion", "rhinoceros", "giraffe", "snake", "zebra", "bear", "penguin"};

        for (int i = 0; i < bugs.length; i++) { // Ahorra, evitas escribir uno por uno
            System.out.println(bugs[i]);
        }
    }
}



