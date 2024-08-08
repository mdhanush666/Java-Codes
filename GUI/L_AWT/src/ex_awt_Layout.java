import java.awt.*;
import java.awt.event.*;

class sampleLayout extends Frame{

    sampleLayout(){

        addWindowListener(new WindowAdapter(){
            @Override
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        });

        Label lbl = new Label("Name");
        lbl.setBounds(150,200,50,20);
        lbl.setFont(new Font("Arial",Font.PLAIN,18));

        TextField txt = new TextField("Enter Name");
        txt.setBounds(210,200,200,30);

        Button btn = new Button("Click me");
        btn.setBounds(310,250,100,30);
        btn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        btn.setBackground(Color.BLACK);
        btn.setForeground(Color.WHITE);



        setSize(500,500);
        setTitle("Frame For layout");
        setLayout(null);
        setLocationRelativeTo(null);
        setResizable(false);

        setVisible(true);

        add(btn);
        add(lbl);
        add(txt);

    }

}

public class ex_awt_Layout {
    public static void main(String[] args) {
        sampleLayout l1= new sampleLayout();
    }
}
