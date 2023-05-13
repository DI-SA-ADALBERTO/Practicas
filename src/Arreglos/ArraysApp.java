package Arreglos;


import java.util.Scanner;

public class ArraysApp {



    public static void main(String[] args) {
        String [] zoo = new String [3];

        Scanner sc= new Scanner(System.in);

        for (int i = 0; i<3; i++) {
            System.out.println("Ingresa un animal en la jaula " + (i+1));
            zoo [i] = sc.nextLine();
        }



        System.out.println("Estos son los animales del zoo: ");
        for (int i = 0;i <zoo.length;i++){
            System.out.println(zoo[i]);
        }
        for (int i = 0;i <zoo.length;i++){
            if(zoo[i].equals("Donkey")){
                System.out.println("Hay un Donkey en el zoo..");

            }

    }

    }
}
