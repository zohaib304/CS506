import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


public class ActionEventTest implements ActionListener {
    JFrame frame;
    JButton bHello;

    public void initGUI() {
        frame = new JFrame();
        // Event Generator 
        bHello = new JButton("Hello");

        Container con = frame.getContentPane();
        con.add(bHello);
        frame.setSize(200, 200);
        frame.setVisible(true);

        // EVENT
        bHello.addActionListener(this);
    } // end initGUI

    // constructor
    public ActionEventTest() {
        initGUI();
    }

    public void actionPerformed(ActionEvent event) {
        JOptionPane.showMessageDialog(null, "Hello is pressed");
    }

    public static void main(String[] args) {
        ActionEventTest aeTest = new ActionEventTest();
    }
}