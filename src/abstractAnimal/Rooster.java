package abstractAnimal;

public class Rooster extends Animal {

    public Rooster() {

    }

    public Rooster(String name, String color, int age) {
        super(name, color, age);
    }

    @Override
    public String talk() {
        return "kikirikikiii";
    }


    public String toString() {
        return super.name + " es un gato " +
                " de color " + super.color +
                " tiene " + super.age+ " años " +
                " y dice " + this.talk();
    }
}
