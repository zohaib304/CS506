import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

// Handling window events
// hand window exit only event.

/**
 * WindowListener interface is defined in the JDK as follows public interface
 * WindowListener { public void windowActivated(WindowEvent we); public void
 * WindowClosed(WindowEvent we); public void windowClosing(WindowEvent we);
 * public void windowDeactivated(WindowEvent we); public void
 * windowDeiconified(WindowEvent we); public void windowIconified(WindowEvent
 * we); public void windowOpened(WindowEvent we); }
 * 
 */

public class EventsEx implements MouseMotionListener, WindowListener {
    JFrame frame;
    JLabel coordinates;

    // setting layout
    public void initGUI() {
        // creating a event generator
        frame = new JFrame();

        Container cont = frame.getContentPane();
        coordinates = new JLabel();
        cont.add(coordinates, BorderLayout.NORTH);

        // registering mouse event handler with generator
        frame.addMouseMotionListener(this);
        // registering window handler with generator
        frame.addWindowListener(this);
        frame.setSize(350, 350);
        frame.setVisible(true);
    }

    public EventsEx() {
        initGUI();
    }

    // MouseMotionListener event handler handling dragging
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

    // window listener event handler

    public void windowActivated(WindowEvent we) {
    }

    public void windowClosed(WindowEvent we) {
    }

    public void windowClosing(WindowEvent we) {
        JOptionPane.showMessageDialog(null, "Good Bye");
        System.exit(0);
    }

    public void windowDeactivated(WindowEvent we) {
    }

    public void windowDeiconified(WindowEvent we) {
    }

    public void windowIconified(WindowEvent we) {
    }

    public void windowOpened(WindowEvent we) {
    }

    public static void main(String[] args) {
        EventsEx ex = new EventsEx();
    }

} // class