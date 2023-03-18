package ID_Lab1_1;
/*
 Write by sila siangchin Ex4_HelloDraphicsWorld
*/
import java.awt.*;
import javax.swing.*;


public class HelloDraphicsWorld {
    public static void main(String[] args) {
        JFrame frame = new JFrame(){
            public void paint(Graphics g){
                g.drawString("Hello, World!", 110, 150);//method
                g.drawOval(100, 130, 90, 30);//method
            }
        };

        frame.setSize(300,300);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    
}
