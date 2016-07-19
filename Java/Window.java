import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
 
public class Window{
 
    public static void main(String[] args) {
        JFrame frame = new JFrame( args[ 0 ] );
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
        /* make something to add to the window, why don't you try seeing what happens
         * if you remove this
         */
        JLabel emptyLabel = new JLabel("");
        emptyLabel.setPreferredSize(new Dimension(175, 100));
        frame.getContentPane().add(emptyLabel, BorderLayout.CENTER);
 
        //Display the window.
        frame.pack();
        frame.setVisible(true);
    }
}

