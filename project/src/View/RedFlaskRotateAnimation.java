package View;

import javafx.animation.RotateTransition;
import javafx.scene.layout.Pane;
import javafx.util.Duration;

import java.io.FileNotFoundException;

public class RedFlaskRotateAnimation extends Pane {
    private final RedFlask flask = new RedFlask();

    public RedFlaskRotateAnimation() throws FileNotFoundException {
        super();
        this.getChildren().add(flask);
    }

    public void animate(){
        RotateTransition rt = new RotateTransition(Duration.millis(3000), flask);
        rt.setByAngle(90);
        rt.setCycleCount(2);
        rt.setAutoReverse(true);
        rt.play();
    }
}
