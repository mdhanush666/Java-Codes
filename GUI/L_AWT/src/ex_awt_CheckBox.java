import java.awt.Frame;
import java.awt.Label;
import java.awt.Checkbox;
import java.awt.FlowLayout;
import java.awt.Font;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class sampleCheckBox extends Frame{

    sampleCheckBox(){

        addWindowListener(new WindowAdapter(){
            @Override
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        });

        Label skill_lbl = new Label("Language Skills : ");
        Checkbox chk1 = new Checkbox("Tamil");
        Checkbox chk2 = new Checkbox("English");
        Checkbox chk3 = new Checkbox("Sinhala");

        skill_lbl.setFont(new Font("san-serif",Font.BOLD,18));

        setSize(500,500);
        setTitle("Frame For CheckBox");
        setResizable(true);
        setLocationRelativeTo(null);
        setLayout(new FlowLayout());

        setVisible(true);

        add(skill_lbl);
        add(chk1);
        add(chk2);
        add(chk3);

    }

}



public class ex_awt_CheckBox {
    public static void main(String[] args) {
        new sampleCheckBox();
    }
}
