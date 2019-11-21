import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

/*Example to show Mouse Event Handling .Every time mouse is moved, the coordinates for a new
place is shown in a label.*/

public class EventEx implements MouseMotionListener {
    JFrame frame;
    JLabel coordinates;

    // setting layout
    public void initGUI() {
        // creating event generator
        frame = new JFrame();
        Container cont = frame.getContentPane();

        cont.setLayout(new BorderLayout());
        coordinates = new JLabel();
        cont.add(coordinates, BorderLayout.NORTH);
        // registring mouse event handler with generator
        frame.addMouseMotionListener(this);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(350,350);
        frame.setVisible(true);
    }

    // constructor
    public EventEx() {
        initGUI();
    }

    //MouseMotionListener event handler handling dragging 
    public void mouseDragged(MouseEvent event) {
        int x = event.getX();
        int y = event.getY();
        coordinates.setText("Dragged at [" + x + ",  " + y + "]");
    }

    public void mouseMoved(MouseEvent event) {
        int x = event.getX();
        int y = event.getY();
        coordinates.setText("Moved at " + x + ", " + y + "]");
    }

    public static void main(String[] args) {
        EventEx ex = new EventEx();
    }
} // class