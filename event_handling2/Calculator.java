import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Calculator implements ActionListener {
    JFrame frame;
    JLabel firstOP, secondOP, answer;

    JTextField f_op, s_op, ans;
    JButton plus, mul;

    // setting layout
    public void initGUI() {
        frame = new JFrame();
        firstOP = new JLabel("First Operand");
        secondOP = new JLabel("Second Operand");
        answer = new JLabel("Answer");
        f_op = new JTextField(15);
        s_op = new JTextField(15);
        ans = new JTextField(15);
        plus = new JButton(" + ");
        plus.setPreferredSize(new Dimension(70, 25));
        mul = new JButton(" * ");
        mul.setPreferredSize(new Dimension(70, 25));
        Container cont = frame.getContentPane();
        cont.setLayout(new FlowLayout());
        cont.add(firstOP);
        cont.add(f_op);
        cont.add(secondOP);
        cont.add(s_op);
        cont.add(plus);
        cont.add(mul);
        cont.add(answer);
        cont.add(ans);

        plus.addActionListener(this);
        mul.addActionListener(this);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(200, 400);
        frame.setVisible(true);

    }

    // constructor
    public Calculator() {
        initGUI();
    }

    public void actionPerformed(ActionEvent event) {
        String op, res;
        int num1, num2, r;

        if (event.getSource() == plus) {
            op = f_op.getText();
            num1 = Integer.parseInt(op);
            op = s_op.getText();
            num2 = Integer.parseInt(op);
            r = num1 + num2;
            res = r + "";
            ans.setText(res);
        } else if (event.getSource() == mul) {
            op = f_op.getText();
            num1 = Integer.parseInt(op);
            op = s_op.getText();
            num2 = Integer.parseInt(op);
            r = num1 * num2;
            res = r + "";
            ans.setText(res);
        }

    }

    public static void main(String[] args) {
        Calculator c = new Calculator();
    }
}