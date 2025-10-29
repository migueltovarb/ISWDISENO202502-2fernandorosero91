package Animal;

public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Michi");
        cat1.greets();

        Dog dog1 = new Dog("Firulais");
        Dog dog2 = new Dog("Rocky");

        dog1.greets();
        dog1.greets(dog2);

        System.out.println(cat1);
        System.out.println(dog1);
    }
}
