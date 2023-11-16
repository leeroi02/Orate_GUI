package LeapYear;

import javax.swing.*;

public class LeapYear extends JFrame {
    private JPanel panel1;
    private JButton btnCheckYear;
    private JTextField tfYear;

public LeapYear() {

btnCheckYear.addActionListener(e->{
    Integer Year = Integer.valueOf(tfYear.getText());

    if (Year%4 == 0 && (Year%100!=0) || (Year % 400 == 0)){
        JOptionPane.showMessageDialog(this,"Leap year" );
    }else{
        JOptionPane.showMessageDialog(this,"Not A leap year" );
    }
});


};
    public static void main(String[] args) {
        LeapYear app = new LeapYear();
        app.setContentPane(app.panel1);
        app.setSize(500, 500);
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
        app.setVisible(true);
        app.setTitle("Leap Year Checker");
    }


}
