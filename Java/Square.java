import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
 
import java.awt.*;
import java.awt.event.*;

public class Square extends Frame {
  /**
   * Instantiates an Square object.
   **/
  public static void main( String args[] ) 
  {
    new Square();
  }

  /**
   * The Square constructor sets the frame's size, adds the
   * visual components, and then makes them visible to the user.
   * It uses an adapter class to deal with the user closing
   * the frame.
   **/
  public Square() {
    //Title our frame, try adding your own title here, just be sure 
    //to use quotes like "Awesome Square"
    super("I'm a Square");

    //Set the size for the frame.
    setSize(400,300);

    //We need to turn on the visibility of our frame
    //by setting the Visible parameter to true.
    setVisible(true);

    //Now, we want to be sure we properly dispose of resources
    //this frame is using when the window is closed.  We use
    //an anonymous inner class adapter for this.
    addWindowListener(new WindowAdapter()
      {public void windowClosing(WindowEvent e)
         {dispose(); System.exit(0);}
      }
    );
  }

  public void paint(Graphics g) {
    //Here is how we used to draw a square with width
    //of 200, height of 200, and starting at x=50, y=50.
    
    /*
     * color options:
     * blue, gray, green, magenta, orange, pink, red, white, yellow
     */
    g.setColor(Color.red /** Try changing color here **/ );
    g.drawRect(50,50,200,200);

    //Let's set the Color to blue and then use the Graphics2D
    //object to draw a rectangle, offset from the square.
    //So far, we've not done anything using Graphics2D that
    //we could not also do using Graphics.  (We are actually
    //using Graphics2D methods inherited from Graphics.)
    Graphics2D g2d = (Graphics2D)g;
    g2d.setColor(Color.blue /** change color here **/ );
    
    g2d.drawRect(75,75,300,200);

  }
}
