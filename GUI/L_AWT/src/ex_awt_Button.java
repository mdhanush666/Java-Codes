//import java.awt.event.*;
//import java.awt.*;
import java.awt.Frame;
import java.awt.Button;
import java.awt.FlowLayout;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class sampleButton extends Frame{

    sampleButton(){

        addWindowListener(new WindowAdapter(){
            @Override
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        });

        Button btn1 = new Button();
        Button btn2 = new Button("Btn 2");

        btn1.setSize(100,20);
        btn1.setLabel("Hii");
        //btn1.setLocation(50,210);

        btn2.setSize(50,20);
        //btn2.setLocation(170,210);

        setSize(420,420);
        setResizable(false);
        setLocationRelativeTo(null);
        setTitle("My First Frame");
        setLayout(new FlowLayout());

        setVisible(true);

        add(btn1);
        add(btn2);


    }

}

public class ex_awt_Button {
    public static void main(String[] args) {

        new sampleButton();

    }
}
