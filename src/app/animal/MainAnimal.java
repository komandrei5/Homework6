package app.animal;

public class MainAnimal {
    public static void main(String[] args) {

        Dog dog = new Dog("Rex", 7);
        dog.run(350);
        dog.swim(9);

        Dog dog1 = new Dog("Zeus", 1);
        dog1.run(700);
        dog1.swim(15);

        Cat cat = new Cat("Tom", 6);
        cat.run(120);
        cat.swim(788);

        Animal animal = new Animal("Jerry", 1);
        animal.run(333);
        animal.swim(2);

        System.out.println("Number of animals created: " + Animal.getAnimalCount());
        System.out.println("Number of cats created: " + Cat.getAnimalCount());
        System.out.println("Number of dogs created: " + Dog.getAnimalCount());


    }
}
