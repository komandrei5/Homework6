package app.animal;

public class Animal {
    private static int animalCount = 0;
    private final String name;
    private final int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void run(int distance) {
        animalCount++;
        System.out.print(name + " is animal age " + age + " years run " + distance + " meters");
    }
    public void swim(int distance) {
        System.out.println(name + " is animal age " + age + " swim " + distance + " meters");
        System.out.println();
    }
    public static int getAnimalCount() {
        return animalCount;
    }
}
