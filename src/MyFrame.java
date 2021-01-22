import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {
    MyFrame(){
        this.setTitle("JFrame title goes here");//sets title of the frame
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//exit out of the application
        this.setResizable(false);//prevents the frame from being resized
        this.setSize(400,400);//sets the x-dimension and y-dimension of the frame
        this.setVisible(true);//make frame visible

        ImageIcon image = new ImageIcon("logo.png"); //creates an ImageIcon
        this.setIconImage(image.getImage()); //this will change icon of the frame
        this.getContentPane().setBackground(new Color(123,50,250)); //this changes the color of the background
    }
}
