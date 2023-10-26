package zoo.myzoofx.Animal;

public abstract class Animal {
    String name;

    public Animal(String name) {
        this.name = name;
    }

    protected Animal() {
    }

    public abstract String makeSound();

    @Override
    public String toString() {
        return "zoo.myzoofx.Animal.Animal{" +
                "name='" + name + '\'' +
                '}';
    }
}
