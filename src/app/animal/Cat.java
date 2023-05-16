package app.animal;

public class Cat extends Animal {
    private static int animalCount = 0;

    public Cat(String name, int age) {
        super(name, age);
    }

    public void run(int distance) {
        if (distance <= 200) {
            animalCount++;
            System.out.print(getName() + " is cat age " + getAge() + " years run " + distance + " meters");
        } else {
            animalCount++;
            System.out.print(getName() + " is cat age " + getAge() + " cannot run such a distance");
        }
    }

    public void swim(int distance) {
        System.out.println(" and can't swim");
        System.out.println();
    }
    public static int getAnimalCount() {
        return animalCount;
    }
}
