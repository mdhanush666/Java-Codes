
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class containerM extends JFrame implements ActionListener {

    JLabel lbl_n1,lbl_n2;
    JTextField txt_n1,txt_n2;
    JButton btn_ok,btn_clear,btn_exit;
    JTextPane txtPane;

    Font lbl_Font = new Font("Arial",Font.BOLD,20);

    int arr[];

    containerM(){

        setSize(400,500);
        setTitle("Number Range");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);

        lbl_n1 = new JLabel("Number 1 :");
        lbl_n1.setBounds(20,30,120,20);
        lbl_n1.setFont(lbl_Font);

        lbl_n2 = new JLabel("Number 2 :");
        lbl_n2.setBounds(230,30,120,20);
        lbl_n2.setFont(lbl_Font);

        txt_n1 = new JTextField();
        txt_n1.setBounds(20,60,120,30);
        txt_n1.addActionListener(this);

        txt_n2 = new JTextField();
        txt_n2.setBounds(230,60,120,30);
        txt_n2.addActionListener(this);

        btn_ok = new JButton("Ok");
        btn_ok.setBackground(Color.white);
        btn_ok.setBounds(150,100,70,30);

        btn_ok.addActionListener(this);

        txtPane = new JTextPane();
        txtPane.setBounds(20,150,330,220);
        txtPane.setFont(lbl_Font);
        txtPane.setBackground(Color.white);
        txtPane.setEditable(false);


        btn_clear = new JButton("Clear");
        btn_clear.setBounds(170,400,80,30);
        btn_clear.setBackground(Color.white);

        btn_clear.addActionListener(this);

        btn_exit = new JButton("Exit");
        btn_exit.setBackground(Color.white);
        btn_exit.setBounds(270,400,80,30);

        btn_exit.addActionListener(this);


        add(lbl_n1);
        add(lbl_n2);

        add(txt_n1);
        add(txt_n2);

        add(btn_ok);
        add(btn_clear);
        add(btn_exit);

        add(txtPane);

        setVisible(true);


    }

    @Override
    public void actionPerformed(ActionEvent cE){

        if (cE.getSource().equals(btn_ok)){

            int lenNum = Integer.parseInt(txt_n2.getText());
            int startNum = Integer.parseInt(txt_n1.getText());

            int c=0;

            for (int i = startNum+1; i < lenNum; i++) {
                c++;
            }

            arr = new int[c];
            int tempC = 0;

            for (int j = startNum+1; j < lenNum; j++) {
                arr[tempC] = j;
                tempC++;
            }


        }

        for (int ele : arr){
            txtPane.setText(txtPane.getText() + ele + ", ");
        }

        if (cE.getSource().equals(btn_clear)){
            txtPane.setText(null);
            txt_n1.setText(null);
            txt_n2.setText(null);
        }

        if (cE.getSource().equals(btn_exit)){
            System.exit(0);
        }

    }


}

public class Q1 {
    public static void main(String[] args) {

        new containerM();

    }
}
