package FoodOrderingSystem;

import javax.swing.*;

public class FoodOrderingSystem extends JFrame {


    private JPanel panel1;
    private JButton btnOrder;
    private JCheckBox cPizza;
    private JRadioButton rb5;
    private JCheckBox cBurger;
    private JCheckBox cFries;
    private JCheckBox cSoftDrinks;
    private JCheckBox cTea;
    private JCheckBox cSundae;
    private JRadioButton rbNone;
    private JRadioButton rb10;
    private JRadioButton rb15;

    public FoodOrderingSystem(){
        btnOrder.addActionListener(e-> {
            int P = 100;
            int B = 80;
            int F = 65;
            int D = 55;
            int T = 50;
            int S = 40;
            float total = 0;

            if(cPizza.isSelected()){
                total += P;
            }
            if(cBurger.isSelected()){
                total += B;
            }
            if(cFries.isSelected()){
                total += F;
            }
            if(cSoftDrinks.isSelected()){
                total += D;
            }
            if(cTea.isSelected()){
                total+= T;
            }
            if(cSundae.isSelected()){
                total+= S;
            }

            if(rbNone.isSelected()){
                JOptionPane.showMessageDialog(this,"The total price is Php"+ String.format("%.2f", total) );
            }
            if(rb5.isSelected()){
                total = (float) (total - (total*.05));
                JOptionPane.showMessageDialog(this,"The total price is Php"+ String.format("%.2f", total) );
            }
            if(rb10.isSelected()){
                total = (float) (total - (total*.10));
                JOptionPane.showMessageDialog(this,"The total price is Php"+ String.format("%.2f", total) );
            }
            if(rb15.isSelected()){
                total = (float) (total - (total*.15));
                JOptionPane.showMessageDialog(this,"The total price is Php"+ String.format("%.2f", total) );
            }

        });

        }

    public static void main(String[] args) {
        FoodOrderingSystem app = new FoodOrderingSystem();
        app.setContentPane(app.panel1);
        app.setSize(300, 300);
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
        app.setVisible(true);
        app.setTitle("Food Ordering System");
    }
}
