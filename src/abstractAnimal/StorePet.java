package abstractAnimal;

public class StorePet {

    public static void main(String[] args) {
        Cat Garfield = new Cat("Garfield", "Naranja",2);
        Dog Firulais = new Dog("Firulais", "Negro", 3);
        Rooster Claudio = new Rooster("Claudio", "Naranja y Negro", 1);

        System.out.println("< Ejemplo de polimorfismo usando clases abstractas >");

        System.out.println("Invocando al método toString: ");
        System.out.println(Garfield.toString());
        System.out.println(Firulais.toString());
        System.out.println(Claudio.toString());



    }
}
