package zoo.myzoofx;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import zoo.myzoofx.Animal.*;

public class HelloController {
    Animal a = new Cat("cat");
    @FXML
    private Button botCat;
    @FXML
    private Button botDelf;
    @FXML
    private Button botDog;
    @FXML
    private Button botEle;
    @FXML
    private Button grandBlueBottom;
    @FXML
    private Label labelContent;

    @FXML
    void makeSoundAnimal() {


        labelContent.setText(a.makeSound());
    }
    @FXML
    void switchAnimal()
    {
        if (botCat.isArmed()) { a = new Cat("cat");}
        if (botDog.isArmed()) { a = new Dog("dog");}
        if (botDelf.isArmed()){ a = new Dolfin("delfy");}
        if (botEle.isArmed()) { a = new Elephant("ele");}
    }
}
