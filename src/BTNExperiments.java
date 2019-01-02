import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import java.util.Timer;
import java.util.TimerTask;

public class BTNExperiments extends Application  {

    int count = 0;

    @Override
    public void start(Stage primaryStage) throws Exception
    {

        primaryStage.setTitle("HBox Experiment 1");

        Label label = new Label("Learn to click. See if you can do it ten times over.");
        Button button = new Button("Click");

        if (count != 10) {
            button.setOnAction(value -> {

                if (count == 1) {
                    button.setText("Clicked once!");
                } else if (count == 2) {
                    button.setText("Clicked twice!");
                } else if (count == 3) {
                    button.setText("Clicked thrice!");
                } else if (count == 4) {
                    button.setText("Clicked with three previous attempts!");
                } else if (count == 5) {
                    button.setText("Clicked with four previous attempts!");
                } else if (count == 6) {
                    button.setText("Clicked six times!");
                } else if (count == 7) {
                    button.setText("Clicked seven times!");
                } else if (count == 8) {
                    button.setText("Clicked eight times!");
                } else if (count == 9) {
                    button.setText("Clicked nine times!");
                } else if (count == 10) {
                    button.setText("Tenfold!");
                }
                count++;
                System.out.println(count);
            });
        }

        HBox hbox = new HBox(button, label);

        Scene scene = new Scene(hbox, 200, 100);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}