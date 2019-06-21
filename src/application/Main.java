package application;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.scene.text.Text;
import javafx.stage.Stage;
public class Main extends Application
{

public void start(Stage primaryStage)
{
Rectangle rect1 = new Rectangle(60, 70, 512, 512);
rect1.setStrokeWidth(2);
rect1.setFill(Color.WHITE); 

Rectangle rect2 = new Rectangle(70, 80, 50, 50);
rect2.setStrokeWidth(2);
rect2.setFill(Color.BLACK);

Rectangle rect3 = new Rectangle(75, 85, 40, 40);
rect3.setStrokeWidth(2);
rect3.setFill(Color.WHITE);

Rectangle rect4 = new Rectangle(80, 90, 30, 30);
rect4.setStrokeWidth(2);
rect4.setFill(Color.BLACK);



Rectangle qr = new Rectangle(70, 250, 50, 50);
qr.setStrokeWidth(2);
qr.setFill(Color.BLACK);

Rectangle qr2 = new Rectangle(75, 255, 40, 40);
qr2.setStrokeWidth(2);
qr2.setFill(Color.WHITE);

Rectangle qr3 = new Rectangle(80, 260, 30, 30);
qr3.setStrokeWidth(2);
qr3.setFill(Color.BLACK);


Rectangle qr4 = new Rectangle(250, 80, 50, 50);
qr4.setStrokeWidth(2);
qr4.setFill(Color.BLACK);

Rectangle qr5 = new Rectangle(255, 85, 40, 40);
qr5.setStrokeWidth(2);
qr5.setFill(Color.WHITE);

Rectangle qr6 = new Rectangle(260, 90, 30, 30);
qr6.setStrokeWidth(2);
qr6.setFill(Color.BLACK);

Group root = new Group(rect1, rect2, rect3, rect4, qr, qr2, qr3, qr4, qr5, qr6);
Scene scene = new Scene(root, 400, 200);

primaryStage.setTitle("QR Code Generator");
primaryStage.setScene(scene);
primaryStage.show();;
}

    
}
