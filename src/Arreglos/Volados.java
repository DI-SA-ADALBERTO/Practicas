package Arreglos;

import java.security.SecureRandom;

public class Volados {
    static int echarVolado(){
        SecureRandom random = new SecureRandom();
        return 1 + random.nextInt (2);


    }
    public static void main(String[] args) {
        final int LANZAMIENTOS = 100;
        int[] Volados = new int[3]; // 1 = aguila, 2 = sol
        Volados[1]=0;
        Volados[2]=0;

        for (int i = 0; i < LANZAMIENTOS; i++){
          ++Volados[echarVolado()];
            }


        System.out.println("Cayó Aguila: " + Volados[1] + " Veces ");
        System.out.println("Cayó Sol: " + Volados[2] + " Veces ");





    }

}
