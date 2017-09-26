import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.FlowPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;


public class Main extends Application{
    public static void main(String args[]){
        launch(args);
    }

    public void start(Stage primarystage){
        primarystage.setTitle("InterfaceTest");


        MakeSquare ms = new MakeSquare(50, 50, 100, 100, Color.BLUE);

        FlowPane root = new FlowPane(ms.getObj());
        primarystage.setScene(new Scene(root, 1280, 720, Color.DARKRED));
        primarystage.show();
    }
}
