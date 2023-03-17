package v.c;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import java.io.IOException;

public class start extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(start.class.getResource("convert_tela.fxml"));
        stage.getIcons().add(new Image(start.class.getResourceAsStream("/logo.png")));
        stage.setResizable(false);
        Scene scene = new Scene(fxmlLoader.load());
        stage.setScene(scene);
        stage.show();
    }
    public static void start1(){launch();}
}
