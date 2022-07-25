package org.example;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TabPane;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.input.MouseEvent;
import org.example.model.Comment;
import org.example.model.Post;
import org.example.model.User;

import java.net.URL;
import java.util.ResourceBundle;

public class FXMLController implements Initializable {
    @FXML
    private TabPane tabs;


    @FXML
    private TableView<Post> postsTable;
    @FXML
    private TableColumn<Integer, Void> postAuthorIdColumn;

    @FXML
    private TableView<User> usersTable;

    @FXML
    private TableView<Comment> commentsTable;
    @FXML
    private TableColumn<Integer, Void> commentsPostIdColumn;
    @FXML
    private TableColumn<Integer, Void> commentsAuthorIdColumn;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        postsTable.getItems().add(new Post(1, "hello world", 1));
        usersTable.getItems().add(new User(1, "Chloe"));
        usersTable.getItems().add(new User(2, "Jackson"));
        commentsTable.getItems().add(new Comment(1, 1, 2, "comment"));
    }

    @FXML
    protected void switchTables(MouseEvent event) {
        String target = event.getTarget().toString();
        if (target.contains("postAuthorIdColumn")) {
            Integer selectedUserId = postsTable.getSelectionModel().getSelectedItem().getAuthorId();
            User selectedUser = usersTable.getItems().stream()
                    .filter(user -> user.getUserId().equals(selectedUserId))
                    .findFirst()
                    .orElseThrow();
            usersTable.getSelectionModel().select(selectedUser);
            tabs.getSelectionModel().select(1);
        }
    }
}
