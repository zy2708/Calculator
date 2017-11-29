import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

public class CalculatorGUI extends JFrame{

    private JTextField textfield1;
    private JLabel label;
    private JTextField textfield2;

    public CalculatorGUI(){
        textfield1=new JTextField("10");
        label=new JLabel("0.0");
        textfield2=new JTextField("10");
        JButton button=new JButton("SUM");
        button.addActionListener(new CalculatorHandle());

        FlowLayout layout=new FlowLayout();
        JPanel panel=new JPanel(layout);
        panel.add(label);
        panel.add(textfield1);
        panel.add(textfield2);
        panel.add(button);
        setContentPane(panel);
    }
    public static void main(String[] args){
        CalculatorGUI calculator=new CalculatorGUI();
        calculator.setSize(1000,1000);
        calculator.setTitle("Calculator");
        calculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        calculator.pack();
        calculator.setVisible(true);
        System.out.println(calculator.getInsets());
    }
    private class CalculatorHandle implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            double input1=Double.parseDouble(textfield1.getText());
            double input2=Double.parseDouble(textfield2.getText());
            double result=input1+input2;
            DecimalFormat format=new DecimalFormat("####.00");

            label.setText(String.valueOf(format.format(result)));

            System.out.println("You just clicked SUM button. "+input1+"+"+input2+"="+result+".");
        }

    }
}

