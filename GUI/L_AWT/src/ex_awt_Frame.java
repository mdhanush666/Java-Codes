import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

// Frame learn...
class sample1 extends Frame{



    sample1(){

        setSize(420,420);
        setResizable(false);
        setLocationRelativeTo(null);
        setTitle("My First Frame");

        setVisible(true);

        addWindowListener(new WindowAdapter(){
            @Override
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        });

    }

}

public class ex_awt_Frame {
    public static void main(String[] args) {

        new sample1();

    }
}
