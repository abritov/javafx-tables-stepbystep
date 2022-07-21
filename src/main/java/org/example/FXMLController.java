package org.example;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableView;
import org.example.model.Post;

import java.net.URL;
import java.util.ResourceBundle;

public class FXMLController implements Initializable {

    @FXML
    private TableView<Post> postsTable;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        postsTable.getItems().add(new Post(1, "hello world", 1));
        System.out.println("stop");
    }
}
