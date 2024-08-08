
import javax.swing.JOptionPane;

public class OptionPane {
    public static void main(String[] args) {

        String name = JOptionPane.showInputDialog("Enter your Name : ");
        JOptionPane.showMessageDialog(null,"Hello " + name);

        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age : "));
        JOptionPane.showMessageDialog(null,name + " your Age is : " + age);

    }
}
