package zoo.myzoofx.Animal;

public class Delfine extends Animal {
    public Delfine(String name) {
        super(name);
    }

    @Override
    public String makeSound() {
        return "Свист да и только";
    }
}

