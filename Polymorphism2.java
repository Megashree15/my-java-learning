
class Wild {
    void Sound() {
        System.out.println("Animals make different sounds!");
    }
}

class Dog extends Wild {
    @Override
    void Sound() {
        System.out.println("A DOG Barks");
    }
}

class Cat extends Wild {
    @Override
    void Sound() {
        System.out.println("A CAT meows");
    }
}

class Lion extends Wild {
    @Override
    void Sound() {
        System.out.println("A LION Roars");
    }
}

public class Polymorphism2 {
    public static void main(String[] args) {
        Wild a = new Dog();
        a.Sound();

        a = new Cat();
        a.Sound();

        a = new Lion();
        a.Sound();
    }
}
