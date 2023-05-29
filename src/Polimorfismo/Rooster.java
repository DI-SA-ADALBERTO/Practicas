package Polimorfismo;

public class Rooster extends Animal {
    public Rooster() {
    }

    public Rooster(String name, String color, int age, String type) { super(name, color, age, type);}

    @Override
    public String talk(){
        return "Kikikirikiii";
    }

    public String toString() {
        return "El animal " + super.getName() +
                " de color " + super.getColor() +
                " tiene " + super.getAge() + " años " +
                " y dice " + this.talk();
    }
}

