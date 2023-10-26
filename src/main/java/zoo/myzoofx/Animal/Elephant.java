package zoo.myzoofx.Animal;

public class Elephant extends Animal {
    public Elephant(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("Та-дааааааааа");

    }
}
