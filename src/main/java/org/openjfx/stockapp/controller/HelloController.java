package org.openjfx.stockapp.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import org.controlsfx.control.action.Action;
import org.openjfx.stockapp.HelloApplication;
import java.io.IOException;

public class HelloController {
    @FXML
    private Stage stage;
    @FXML
    private Scene scene;
    @FXML
    private HBox hbox;

    private double x = 0;
    private double y = 0;

    @FXML
    protected void switchToMenu(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("dashboard_view.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(fxmlLoader.load(), 947, 548);
        stage.setScene(scene);
        stage.getIcons().add(new Image("file:@../../../resources/img/nooun.png"));
        stage.show();
    }

    @FXML
    public void anchorPane_dragged(MouseEvent event) throws IOException{
        stage = (Stage)hbox.getScene().getWindow();
        stage.setX(event.getScreenX() - x);
        stage.setY(event.getScreenY() - y);
    }

    @FXML
    public void anchorPane_clicked(MouseEvent event) throws IOException{
        x = event.getX();
        y = event.getY();
    }

    public void closeButton_clicked(ActionEvent event) throws IOException{
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        javafx.application.Platform.exit();
    }

    public void minimiseButton_clicked(ActionEvent event){
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setIconified(true);
    }
}