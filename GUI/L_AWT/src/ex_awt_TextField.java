import java.awt.Frame;
import java.awt.TextField;
import java.awt.Label;
import java.awt.FlowLayout;
import java.awt.TextArea;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class sampleTextField extends Frame{

    sampleTextField(){

        addWindowListener(new WindowAdapter(){
            @Override
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        });

        Label lbl = new Label("Name :");
        TextField txt = new TextField("Enter your text");
        TextArea txtA= new TextArea("Enter your Big text");


        setSize(420,420);
        setTitle("Frame");
        setResizable(true);
        setLocationRelativeTo(null);
        setLayout(new FlowLayout());
        setVisible(true);

        add(lbl);
        add(txt);
        add(txtA);
    }

}

public class ex_awt_TextField {
    public static void main(String[] args) {

        new sampleTextField();

    }
}
