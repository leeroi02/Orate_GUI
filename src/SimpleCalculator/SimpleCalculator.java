package SimpleCalculator;

import LeapYear.LeapYear;

import javax.swing.*;

public class SimpleCalculator extends JFrame{
    private JPanel panelCalc;
    private JTextField tfNumber1;
    private JTextField tfNumber2;
    private JComboBox cbOperations;
    private JButton btnCompute;
    private JTextArea textArea1;

    public SimpleCalculator(){
        btnCompute.addActionListener(e->{
            Integer Num1 = Integer.valueOf(tfNumber1.getText());
            Integer Num2 = Integer.valueOf(tfNumber2.getText());
            Integer Result = 0;


            if(cbOperations.getSelectedIndex()==0){
                Result = Num1+Num2;
                textArea1.append(String.valueOf(Result));
            }else if (cbOperations.getSelectedIndex()==1) {
                Result = Num1 - Num2;
                textArea1.append(String.valueOf(Result));
            }else if (cbOperations.getSelectedIndex()==2) {
                    Result = Num1 * Num2;
                textArea1.append(String.valueOf(Result));
            }else if(cbOperations.getSelectedIndex()==3) {
                Result = Num1 / Num2;
                textArea1.append(String.valueOf(Result));
            }
        });
    }

    public static void main(String[] args) {
        SimpleCalculator app = new SimpleCalculator();
        app.setContentPane(app.panelCalc);
        app.setSize(700, 500);
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
        app.setVisible(true);
        app.setTitle("Simple Calculator");
    }

}

