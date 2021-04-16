package org.example;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import org.example.Classes.MainThread;


public class Controller {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField aX;

    @FXML
    private TextField aY;

    @FXML
    private TextField aZ;

    @FXML
    private TextField bX;

    @FXML
    private TextField bY;

    @FXML
    private TextField bZ;

    @FXML
    private Label rX=new Label();

    @FXML
    private Label rY=new Label();

    @FXML
    private Label rZ=new Label();

    @FXML
    void buttonResult(ActionEvent event) throws InterruptedException {

        if(valuesCheck()){
            ArrayList<Double> vectorA = new ArrayList<Double>();
            ArrayList<Double> vectorB = new ArrayList<Double>();
            ArrayList<Double> vectorResult = new ArrayList<Double>();

            vectorA.add(Double.parseDouble(aX.getText()));
            vectorA.add(Double.parseDouble(aY.getText()));
            vectorA.add(Double.parseDouble(aZ.getText()));

            vectorB.add(Double.parseDouble(bX.getText()));
            vectorB.add(Double.parseDouble(bY.getText()));
            vectorB.add(Double.parseDouble(bZ.getText()));

            MainThread main_thread = new MainThread(vectorA, vectorB);
            main_thread.calculate();

            vectorResult=main_thread.getVectorResult();

            rX.setText(String.valueOf(vectorResult.get(0)));
            rY.setText(String.valueOf(vectorResult.get(1)));
            rZ.setText(String.valueOf(vectorResult.get(2)));

        }
        else{
           Util.messageBox("Ошибка", "Введите значения векторов");
        }
    }

    @FXML
    void initialize() { }

    boolean valuesCheck (){

        try {
            Double.parseDouble(aX.getText());
            Double.parseDouble(aY.getText());
            Double.parseDouble(aZ.getText());
            Double.parseDouble(bX.getText());
            Double.parseDouble(bY.getText());
            Double.parseDouble(bZ.getText());
        }
        catch (Exception e){
            return false;
        }
        return true;
    }
}