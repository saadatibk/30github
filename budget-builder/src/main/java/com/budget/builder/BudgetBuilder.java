package main.java.com.budget.builder;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class BudgetBuilder extends Application {
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Budget Builder");


        Label welcomeLabel = new Label("Welcome to Budget Builder");
        Button addExpenseButton = new Button("Add Expense");
        Button addIncomeButton = new Button("Add Income");
        Button viewSummaryButton = new Button("View Summary");


        VBox layout = new VBox(10);
        layout.getChildren().addAll(welcomeLabel, addExpenseButton, addIncomeButton, viewSummaryButton);


        Scene scene = new Scene(layout, 300, 200);
        primaryStage.setScene(scene);
        primaryStage.show();
        
    }

    public static void main(String[] args) {
        launch(args);
    }
}
