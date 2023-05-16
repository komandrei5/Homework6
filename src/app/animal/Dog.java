package app.animal;

public class Dog extends Animal {
    private static int animalCount = 0;

    public Dog(String name, int age) {
        super(name, age);
    }

    public void run(int distance) {
        if (distance <= 500) {
            animalCount++;
            System.out.print(getName() + " is dog age " + getAge() + " years run " + distance + " meters");
        } else {
            animalCount++;
            System.out.print(getName() + " is dog age " + getAge() + " cannot run such a distance" );
        }
    }

    public void swim(int distance) {
        if (distance <= 10) {
            System.out.println(" and swim " + distance + " meters");
            System.out.println();
        } else {
            System.out.println(" and cannot swim such a distance" );
            System.out.println();
        }
    }
    public static int getAnimalCount() {
        return animalCount;
    }
}
