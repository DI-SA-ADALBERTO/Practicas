package Interfaces;

import Arreglos.Sumatoria;

public class InterfacesApp {
    public static void main(String[] args) {
       Estudiante estudiante = new Estudiante(
                "Alejandro",
                "Carranza",
                20,
                "TecNM",
                "Informatica",
                "2do"
        );

        Empleado empleado = new Empleado(
                "Arnoldo",
                "Martínez",
                22,
                "Hotel las Brisas",
                "Recepcionist",
                "15000"
        );

        EstudianteTrabajador estudianteTrabajador = new EstudianteTrabajador(
                "Martha",
                "Padilla",
                25,
                "UNLP",
                "Informatica",
                "9no",
                "Facebook",
                "Junior Programmer",
                "100000"
        );

        System.out.println(estudiante.toString());
        System.out.println(empleado.toString());
        System.out.println(estudianteTrabajador.toString());

    }
}
