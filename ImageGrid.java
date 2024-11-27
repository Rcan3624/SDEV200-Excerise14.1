package com.example.exercise141;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

// “I love deadlines. I love the whooshing noise they make as they go by.” -Douglas Adams

public class ImageGrid extends Application {


    public void start(Stage primaryStage) {
        // Create a pane to hold the image views
        GridPane imagePane = new GridPane();
        imagePane.setAlignment(Pos.CENTER);
        imagePane.setPadding(new Insets(50, 50, 50, 50));
        imagePane.setHgap(5.5);
        imagePane.setVgap(5.5);

        // Load images and place the image nodes in the pane
        imagePane.add(new ImageView(new Image("Insert image filepath here")), 0, 0); // Load American flag
        imagePane.add(new ImageView(new Image("Insert image filepath here")), 1, 0); // Load United Kingdom flag
        imagePane.add(new ImageView(new Image("Insert image filepath here")), 0, 1); // Load France flag
        imagePane.add(new ImageView(new Image("Insert image filepath here")), 1, 1); // Load China flag




//        imagePane.getChildren().add(new ImageView(image));
//
//        ImageView imageView2 = new ImageView(image)  ;
//        imageView2.setFitHeight(20);
//        imageView2.setFitWidth(20);
//        imagePane.getChildren().add(imageView2);
//
//        imageView2.setFitHeight(40);
//        imageView2.setFitWidth(40);
//        ImageView imageView3 = new ImageView(image3);
//
//        imagePane.getChildren().add(imageView3);
//
//        imageView2.setFitHeight(60);
//        imageView2.setFitWidth(60);
//        ImageView imageView4 = new ImageView(image4);
//
//        imagePane.getChildren().add(imageView4);



        // Create a scene and place it in the stage
        Scene scene = new Scene(imagePane);
        primaryStage.setTitle("ShowImage"); // Set the stage title
        primaryStage.setScene(scene); // Place the scene in the stage
        primaryStage.show(); // Display the stage
    }
}

