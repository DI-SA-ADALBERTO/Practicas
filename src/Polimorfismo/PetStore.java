package Polimorfismo;

public class PetStore {

        public static void main(String[] args) {
            Dog Firulais = new Dog("Firulais", "Blanco", 2, "Perro");
            Cat Garfield = new Cat("Garfield", "Amarillo", 1, "Gato");
            Rooster Claudio = new Rooster("Claudio", "Negro", 1, "Ave");

            System.out.println("Ejemplo de Polimorfismo: ");
            System.out.println(Firulais.talk());
            System.out.println(Garfield.talk());
            System.out.println(Claudio.talk());

            System.out.println("Invocando al método toString de la clase Polimorfismo.Animal: ");
            System.out.println(Firulais.toString());
            System.out.println(Garfield.toString());
            System.out.println(Claudio.toString());


        }
    }
