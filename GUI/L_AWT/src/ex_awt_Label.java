import java.awt.*;

import java.awt.event.WindowEvent;
import java.awt.event.WindowAdapter;

class sampleLabel extends Frame{

    sampleLabel(){

        addWindowListener(new WindowAdapter(){
            @Override
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        });

        Label lbl1 = new Label("Name");
        Button btn1 = new Button("Click");
        TextField txt1 = new TextField("Enter");

        lbl1.setFont(new Font("Impact",Font.PLAIN,20));
        lbl1.setLocation(100,50);


        btn1.setSize(80,20);

        setSize(420,420);
        setResizable(false);
        setLocationRelativeTo(null);
        setLayout(new FlowLayout());

        setVisible(true);

        add(lbl1);
        add(btn1);
        add(txt1);
    }


}

public class ex_awt_Label {
    public static void main(String[] args) {

        new sampleLabel();


    }
}
