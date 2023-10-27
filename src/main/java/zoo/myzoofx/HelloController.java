package zoo.myzoofx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import zoo.myzoofx.Animal.*;

public class HelloController {
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
    void getSoundCat() {    }
    @FXML
    void getSoundDelf() {    }
    @FXML
    void getSoundDog() {    }
    @FXML
    void getSoundEle() {    }
    @FXML
    void makeSoundAnimal() {
        Animal a = null;
        if (botCat.isArmed()) { a = new Cat("cat");}
        if (botDog.isArmed()) { a = new Dog("dog");}
        if (botDelf.isArmed()){ a = new Delfine("delfy");}
        if (botEle.isArmed()) { a = new Elephant("ele");}
        labelContent.setText(a.makeSound());
    }
}
