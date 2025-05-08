package olamundojavafxs;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class OlaMundoJavaFXS extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        // Carregar o FXML
        Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        
        // Definir a cena e exibir a janela
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("Olá Mundo JavaFX");
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
