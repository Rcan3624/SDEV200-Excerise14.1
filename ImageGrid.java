package com.example.exercise141;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

// “I love deadlines. I love the whooshing noise they make as they go by.” -Douglas Adams

public class ImageGrid extends Application {

    // TODO Modify example to meet the assignment requirements
    public void start(Stage primaryStage) {
        // Create a pane to hold the image views
        GridPane pane = new GridPane();
        pane.setAlignment(Pos.CENTER);
        pane.setPadding(new Insets(11.5, 12.5, 13.5, 14.5));
        pane.setHgap(5.5);
        pane.setVgap(5.5);

        // Right-click on the image you want and select "copy path". Then paste it in the new Image path below
        Image image = new Image("Insert image filepath here"); // Load American flag

        Image image2 = new Image("Insert image filepath here"); // Load United Kingdom flag
        Image image3 = new Image("Insert image filepath here"); // Load France flag
        Image image4 = new Image("Insert image filepath here"); // Load China flag

        // TODO Space and resize the images now that they can be loaded into the gridpane
        pane.getChildren().add(new ImageView(image));

        ImageView imageView2 = new ImageView(image2);
        imageView2.setFitHeight(100);
        imageView2.setFitWidth(100);
        pane.getChildren().add(imageView2);

        imageView2.setFitHeight(100);
        imageView2.setFitWidth(100);
        ImageView imageView3 = new ImageView(image3);

        pane.getChildren().add(imageView3);

        // Create a scene and place it in the stage
        Scene scene = new Scene(pane);
        primaryStage.setTitle("ShowImage"); // Set the stage title
        primaryStage.setScene(scene); // Place the scene in the stage
        primaryStage.show(); // Display the stage
    }
}

// TODO Bang head against the wall if all else fails

