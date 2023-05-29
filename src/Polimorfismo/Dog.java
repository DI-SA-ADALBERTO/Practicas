package Polimorfismo;

public class Dog extends Animal {
public Dog() {
}

public Dog(String name, String color, int age, String type) { super(name, color, age, type);}

@Override
public String talk(){
    return "guaf, guaf, guaf, guaf";
}

public String toString() {
    return "El animal " + super.getName() +
            " de color " + super.getColor() +
            " tiene " + super.getAge() + " años " +
            " y dice " + this.talk();
}
}




