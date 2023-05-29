package Polimorfismo;

public class Cat extends Animal {
        public Cat() {
        }

        public Cat(String name, String color, int age, String type) { super(name, color, age, type);}

        @Override
        public String talk(){
            return "miauuuu";
        }

        public String toString() {
            return "El animal " + super.getName() +
                    " de color " + super.getColor() +
                    " tiene " + super.getAge() + " años " +
                    " y dice " + this.talk();
        }
    }

