package zoo.myzoofx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import zoo.myzoofx.Animal.Animal;
import zoo.myzoofx.Animal.Cat;

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
    void getSoundCat() {
       // labelContent.setText(Cat.makeSound());
    }
    @FXML
    void getSoundDelf() {
    }
    @FXML
    void getSoundDog() {

    }

    @FXML
    void getSoundEle() {

    }

    @FXML
    void makeSoundAnimal() {
        Animal a = null;
        if (botCat.isArmed()){ a = new Cat("dsdsd");}
      //  if (botDog.isArmed()){ labelContent.getSoundDog();}
       // if (botEle.isArmed()){ labelContent.getSoundEle();}
        //if (botDelf.isArmed()){ labelContent.getSoundDelf();}


        labelContent.setText(a.makeSound());

    }

}
