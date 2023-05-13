package Arreglos;

public class ArrayType {
    public static void main(String[] args) {

        String [] bugs = {"cricket", "beetle", "ladybugs"};
        String [] alias = bugs;
        System.out.println(bugs.equals(alias)); //true
        System.out.println(bugs.toString());
        System.out.println(bugs[0]); // De esta forma se va imprimiendo de uno por uno
        System.out.println(bugs[1]);// De esta forma se va imprimiendo de uno por uno
        System.out.println(bugs[2]);// De esta forma se va imprimiendo de uno por uno

        for (int i = 0; i <bugs.length; i++){ // Ahorra, evitas escribir uno por uno
            System.out.println(bugs[i]);
        }
    }
}
