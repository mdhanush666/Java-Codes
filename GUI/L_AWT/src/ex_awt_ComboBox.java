import java.awt.Frame;
import java.awt.Label;
import java.awt.Font;
import java.awt.FlowLayout;
import java.awt.Choice;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class sampleComboBox extends Frame{

    sampleComboBox(){

        addWindowListener(new WindowAdapter(){
            @Override
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        });

        Label lbl1 = new Label("Select One: ");

        lbl1.setFont(new Font("Arial",Font.PLAIN,18));

        Choice cho1 = new Choice();
        cho1.add("JAVA");
        cho1.add("Python");
        cho1.add("C");
        cho1.add("C++");
        cho1.add("HTML");
        cho1.add("CSS");
        cho1.add("JAVASCRIPT");
        cho1.add("MY-SQL");


        setSize(500,500);
        setTitle("Frame For CheckBox");
        setResizable(true);
        setLocationRelativeTo(null);
        setLayout(new FlowLayout());

        setVisible(true);

        add(lbl1);
        add(cho1);

    }

}



public class ex_awt_ComboBox {
    public static void main(String[] args) {
        new sampleComboBox();
    }
}
