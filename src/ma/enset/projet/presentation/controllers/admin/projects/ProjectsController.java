package ma.enset.projet.presentation.controllers.admin.projects;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class ProjectsController implements Initializable {
    private Parent fxml;
    @FXML
    private AnchorPane root;
    @FXML
    void addProject(ActionEvent event) {
        try {
            fxml = FXMLLoader.load(getClass().getResource("../../../views/admin/projects/AddView.fxml"));
            root.getChildren().removeAll();
            root.getChildren().setAll(fxml);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
}
