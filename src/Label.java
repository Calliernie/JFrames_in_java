import javax.swing.*;

public class Label {
    public static void main(String [] args){
        //JLabel = a GUI display area for a string of text, an image or booth
JLabel label = new JLabel(); //this will create a label
label.setText("Bro, do you even code"); //set text for a label

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setVisible(true);
    }
}
