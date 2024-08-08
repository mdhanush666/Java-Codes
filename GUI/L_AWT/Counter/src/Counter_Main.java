import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

import javax.swing.ImageIcon;

class counterContainer extends Frame{

    counterContainer(){

        int n;

        addWindowListener(new WindowAdapter(){
            @Override
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        });

        Label count_lbl = new Label("0");


        count_lbl.setBounds(140,80,80,50);
        count_lbl.setFont(new Font("Cooper Black", Font.BOLD,30));

        Button btn_count = new Button("Count");
        Button btn_reset = new Button("Reset");

        btn_count.setFont(new Font("Arial",Font.BOLD,25));
        btn_count.setBounds(100,150,100,50);

        btn_reset.setFont(new Font("Arial",Font.BOLD,25));
        btn_reset.setBounds(100,205,100,50);

        btn_count.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                 count_lbl.setText(String.valueOf(Integer.parseInt(count_lbl.getText())+1));

            }
        });

        btn_reset.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                count_lbl.setText("0");

            }
        });

        setLayout(null);
        setTitle("My Counter");
        setSize(300,300);
        setLocationRelativeTo(null);

        ImageIcon icon = new ImageIcon("C:\\Users\\Dhanush\\Pictures\\OIP.jpg");
        setIconImage(icon.getImage());

        setVisible(true);

        add(count_lbl);

        add(btn_count);
        add(btn_reset);

    }

}

public class Counter_Main {
    public static void main(String[] args) {

        counterContainer c1 = new counterContainer();

    }
}
