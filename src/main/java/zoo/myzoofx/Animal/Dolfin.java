package zoo.myzoofx.Animal;

public class Dolfin extends Animal {
    public Dolfin(String name) {
        super(name);
    }

    @Override
    public String makeSound() {
        return "Свист да и только";
    }
}

