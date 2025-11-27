package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class DashBoardController {

    @FXML
    private Button btnAddTask;

    @FXML
    private Button btnCompleted;

    @FXML
    private TableColumn<?, ?> colDate;

    @FXML
    private TableColumn<?, ?> colID;

    @FXML
    private TableColumn<?, ?> colTask;

    @FXML
    private TableView<?> tblCompleteTask;

    @FXML
    private DatePicker txtDate;

    @FXML
    private TextField txtId;

    @FXML
    private TextField txtTask;

    @FXML
    void btnAddTaskOnAction(ActionEvent event) {

    }

    @FXML
    void btnCompletedOnAction(ActionEvent event) {

    }

}
