import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

import java.awt.event.WindowAdapter;
//import java.awt.event.ActionListener;


class cal1 extends Frame implements ActionListener{

    Label lblH;

    TextArea txt_out;
    TextField btnBack;

    Button btn_clear;
    Button btn_mul;
    Button btn_plus;
    Button btn_div;
    Button btn_sub;
    Button btn_equal;


    Button btn_0; Button btn_1; Button btn_2; Button btn_3; Button btn_4;
    Button btn_5; Button btn_6; Button btn_7; Button btn_8; Button btn_9;

    Label tempLbl = new Label();

    Font Hfont = new Font("Cooper Black",Font.BOLD,30);

    cal1(){

        JFrame exF = new JFrame();

        Label lbl_eF_msg;

        Button btn_eF_yes;
        Button btn_eF_no;

        Font eLfont = new Font("Times New Roman",Font.PLAIN,18);
        Font eFfont = new Font("Times New Roman",Font.PLAIN,20);

        Font txtFont = new Font("Times New Roman",Font.PLAIN,40);

        Font numsFont = new Font("Arial",Font.PLAIN,18);
        Font OperatorsFont = new Font("Cooper Black",Font.BOLD,22);

        lbl_eF_msg = new Label("Are you sure to close");
        lbl_eF_msg.setBounds(150,30,200,50);
        lbl_eF_msg.setFont(eFfont);

        btn_eF_yes = new Button("Yes");
        btn_eF_no = new Button("No");

        btn_eF_yes.setBounds(80,100,150,30);
        btn_eF_yes.setFont(eLfont);

        btn_eF_no.setBounds(240,100,150,30);
        btn_eF_no.setFont(eLfont);

        btn_eF_yes.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e_yes) {
                System.exit(0);
            }
        });

        btn_eF_no.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e_no) {
                exF.setVisible(false);
            }
        });

        exF.add(lbl_eF_msg);
        exF.add(btn_eF_yes);
        exF.add(btn_eF_no);

        exF.setTitle("Exit");
        exF.setSize(500,200);
        exF.setResizable(false);
        exF.setLayout(null);
        exF.setLocationRelativeTo(null);
        exF.setDefaultCloseOperation(exF.HIDE_ON_CLOSE);

        exF.setVisible(false);


        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent winE) {
                exF.setVisible(true);
            }
        });

        // Top Heading
        lblH = new Label("My Calculator");
        lblH.setBounds(100,60,250,50);
        lblH.setFont(Hfont);
        lblH.setForeground(Color.BLACK);

        // OutPut Text Box
        txt_out = new TextArea();
        txt_out.setBounds(40,130,320,75);
        txt_out.setFont(txtFont);
        txt_out.setEditable(false);
        txt_out.setFocusable(false);
        txt_out.setForeground(Color.black);


        // Buttons Background
        btnBack = new TextField();
        btnBack.setBounds(40,230,320,230);
        btnBack.setBackground(null);
        btnBack.setEditable(false);
        btnBack.setFocusable(false);

        // Button 7
        btn_7 = new Button("7");
        btn_7.setBounds(50, 250, 70, 40);
        btn_7.setFont(numsFont);
        btn_7.setBackground(Color.black);
        btn_7.setFocusable(false);
        btn_7.addActionListener(this);

        // Button 8
        btn_8 = new Button("8");
        btn_8.setBounds(130, 250, 70, 40);
        btn_8.setFont(numsFont);
        btn_8.setBackground(Color.black);
        btn_8.setFocusable(false);
        btn_8.addActionListener(this);

        // Button 9
        btn_9 = new Button("9");
        btn_9.setBounds(210, 250, 70, 40);
        btn_9.setFont(numsFont);
        btn_9.setBackground(Color.black);
        btn_9.setFocusable(false);
        btn_9.addActionListener(this);

        // Button Divide
        btn_div = new Button("/");
        btn_div.setBounds(290,250,60,40);
        btn_div.setFont(OperatorsFont);
        btn_div.setBackground(Color.darkGray);
        btn_div.setFocusable(false);
        btn_div.addActionListener(this);

        // Button 4
        btn_4 = new Button("4");
        btn_4.setBounds(50, 300, 70, 40);
        btn_4.setFont(numsFont);
        btn_4.setBackground(Color.black);
        btn_4.setFocusable(false);
        btn_4.addActionListener(this);

        // Button 5
        btn_5 = new Button("5");
        btn_5.setBounds(130, 300, 70, 40);
        btn_5.setFont(numsFont);
        btn_5.setBackground(Color.black);
        btn_5.setFocusable(false);
        btn_5.addActionListener(this);

        // Button 6
        btn_6 = new Button("6");
        btn_6.setBounds(210, 300, 70, 40);
        btn_6.setFont(numsFont);
        btn_6.setBackground(Color.black);
        btn_6.setFocusable(false);
        btn_6.addActionListener(this);

        // Button Multiply
        btn_mul = new Button("x");
        btn_mul.setBounds(290,300,60,40);
        btn_mul.setFont(OperatorsFont);
        btn_mul.setBackground(Color.darkGray);
        btn_mul.setFocusable(false);
        btn_mul.addActionListener(this);

        // Button 1
        btn_1 = new Button("1");
        btn_1.setBounds(50, 350, 70, 40);
        btn_1.setFont(numsFont);
        btn_1.setBackground(Color.black);
        btn_1.setFocusable(false);
        btn_1.addActionListener(this);

        // Button 2
        btn_2 = new Button("2");
        btn_2.setBounds(130, 350, 70, 40);
        btn_2.setFont(numsFont);
        btn_2.setBackground(Color.black);
        btn_2.setFocusable(false);
        btn_2.addActionListener(this);

        // Button 3
        btn_3 = new Button("3");
        btn_3.setBounds(210, 350, 70, 40);
        btn_3.setFont(numsFont);
        btn_3.setBackground(Color.black);
        btn_3.setFocusable(false);
        btn_3.addActionListener(this);

        // Button Addition
        btn_plus = new Button("+");
        btn_plus.setBounds(290,350,60,40);
        btn_plus.setFont(OperatorsFont);
        btn_plus.setBackground(Color.darkGray);
        btn_plus.setFocusable(false);
        btn_plus.addActionListener(this);

        // Button Clear
        btn_clear = new Button("C");
        btn_clear.setBounds(50, 400, 70, 40);
        btn_clear.setFont(OperatorsFont);
        btn_clear.setBackground(Color.darkGray);
        btn_clear.setFocusable(false);
        btn_clear.addActionListener(this);

        // Button 0
        btn_0 = new Button("0");
        btn_0.setBounds(130, 400, 70, 40);
        btn_0.setFont(numsFont);
        btn_0.setBackground(Color.black);
        btn_0.setFocusable(false);
        btn_0.addActionListener(this);

        // Button Equal
        btn_equal = new Button("=");
        btn_equal.setBounds(210,400,70,40);
        btn_equal.setFont(OperatorsFont);
        btn_equal.setBackground(Color.darkGray);
        btn_equal.setFocusable(false);
        btn_equal.addActionListener(this);

        // Button subtraction
        btn_sub = new Button("-");
        btn_sub.setBounds(290,400,60,40);
        btn_sub.setFont(OperatorsFont);
        btn_sub.setBackground(Color.darkGray);
        btn_sub.setFocusable(false);
        btn_sub.addActionListener(this);


        // Buttons Mouse Listeners
        btn_7.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent mce) {
                btn_7.setBackground(Color.white);
                btn_7.setForeground(Color.black);
            }
            public void mouseReleased(MouseEvent mce) {
                btn_7.setBackground(Color.black);
                btn_7.setForeground(Color.white);
            }
        });

        btn_8.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent mce) {
                btn_8.setBackground(Color.white);
                btn_8.setForeground(Color.black);
            }
            public void mouseReleased(MouseEvent mce) {
                btn_8.setBackground(Color.black);
                btn_8.setForeground(Color.white);
            }
        });

        btn_9.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent mce) {
                btn_9.setBackground(Color.white);
                btn_9.setForeground(Color.black);
            }
            public void mouseReleased(MouseEvent mce) {
                btn_9.setBackground(Color.black);
                btn_9.setForeground(Color.white);
            }
        });

        btn_6.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent mce) {
                btn_6.setBackground(Color.white);
                btn_6.setForeground(Color.black);
            }
            public void mouseReleased(MouseEvent mce) {
                btn_6.setBackground(Color.black);
                btn_6.setForeground(Color.white);
            }
        });

        btn_5.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent mce) {
                btn_5.setBackground(Color.white);
                btn_5.setForeground(Color.black);
            }
            public void mouseReleased(MouseEvent mce) {
                btn_5.setBackground(Color.black);
                btn_5.setForeground(Color.white);
            }
        });

        btn_4.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent mce) {
                btn_4.setBackground(Color.white);
                btn_4.setForeground(Color.black);
            }
            public void mouseReleased(MouseEvent mce) {
                btn_4.setBackground(Color.black);
                btn_4.setForeground(Color.white);
            }
        });

        btn_3.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent mce) {
                btn_3.setBackground(Color.white);
                btn_3.setForeground(Color.black);
            }
            public void mouseReleased(MouseEvent mce) {
                btn_3.setBackground(Color.black);
                btn_3.setForeground(Color.white);
            }
        });

        btn_2.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent mce) {
                btn_2.setBackground(Color.white);
                btn_2.setForeground(Color.black);
            }
            public void mouseReleased(MouseEvent mce) {
                btn_2.setBackground(Color.black);
                btn_2.setForeground(Color.white);
            }
        });

        btn_1.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent mce) {
                btn_1.setBackground(Color.white);
                btn_1.setForeground(Color.black);
            }
            public void mouseReleased(MouseEvent mce) {
                btn_1.setBackground(Color.black);
                btn_1.setForeground(Color.white);
            }
        });

        btn_0.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent mce) {
                btn_0.setBackground(Color.white);
                btn_0.setForeground(Color.black);
            }
            public void mouseReleased(MouseEvent mce) {
                btn_0.setBackground(Color.black);
                btn_0.setForeground(Color.white);
            }
        });

        btn_mul.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent mce) {
                btn_mul.setBackground(Color.black);
                btn_mul.setForeground(Color.white);
            }
            public void mouseReleased(MouseEvent mce) {
                btn_mul.setBackground(Color.DARK_GRAY);
                btn_mul.setForeground(Color.white);
            }
        });

        btn_div.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent mce) {
                btn_div.setBackground(Color.black);
                btn_div.setForeground(Color.white);
            }
            public void mouseReleased(MouseEvent mce) {
                btn_div.setBackground(Color.DARK_GRAY);
                btn_div.setForeground(Color.white);
            }
        });

        btn_plus.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent mce) {
                btn_plus.setBackground(Color.black);
                btn_plus.setForeground(Color.white);
            }
            public void mouseReleased(MouseEvent mce) {
                btn_plus.setBackground(Color.DARK_GRAY);
                btn_plus.setForeground(Color.white);
            }
        });

        btn_sub.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent mce) {
                btn_sub.setBackground(Color.black);
                btn_sub.setForeground(Color.white);
            }
            public void mouseReleased(MouseEvent mce) {
                btn_sub.setBackground(Color.DARK_GRAY);
                btn_sub.setForeground(Color.white);
            }
        });

        btn_equal.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent mce) {
                btn_equal.setBackground(Color.black);
                btn_equal.setForeground(Color.white);
            }
            public void mouseReleased(MouseEvent mce) {
                btn_equal.setBackground(Color.DARK_GRAY);
                btn_equal.setForeground(Color.white);
            }
        });

        btn_clear.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent mce) {
                btn_clear.setBackground(Color.black);
                btn_clear.setForeground(Color.white);
            }
            public void mouseReleased(MouseEvent mce) {
                btn_clear.setBackground(Color.DARK_GRAY);
                btn_clear.setForeground(Color.white);
            }
        });


        btn_clear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent bce) {

            }
        });

        add(lblH);
        add(txt_out);

        add(btn_7); add(btn_8); add(btn_9);
        add(btn_4); add(btn_5); add(btn_6);
        add(btn_1); add(btn_2); add(btn_3);
        add(btn_0);

        add(btn_div);
        add(btn_mul);
        add(btn_plus);
        add(btn_sub);
        add(btn_clear);
        add(btn_equal);

        add(btnBack);

        setSize(400,490);
        setTitle("My Cal");
        setResizable(false);
        setLayout(null);
        setLocationRelativeTo(null);
        setForeground(Color.WHITE);

        setVisible(true);

    }

    String num1="",num2="";
    char operator;
    int totalM=1;
    int totalA;
    int total;
    double totalD;

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == btn_0){
            txt_out.setText(txt_out.getText() + "0");
            num1 += "0";
            num2 += "0";
        }
        else if (e.getSource() == btn_1){
            txt_out.setText(txt_out.getText() + "1");
            num1 += "1";
            num2 += "1";
        }
        else if (e.getSource() == btn_2){
            txt_out.setText(txt_out.getText() + "2");
            num1 += "2";
            num2 += "2";
        }
        else if (e.getSource() == btn_3){
            txt_out.setText(txt_out.getText() + "3");
            num1 += "3";
            num2 += "3";
        }
        else if (e.getSource() == btn_4){
            txt_out.setText(txt_out.getText() + "4");
            num1 += "4";
            num2 += "4";
        }
        else if (e.getSource() == btn_5){
            txt_out.setText(txt_out.getText() + "5");
            num1 += "5";
            num2 += "5";
        }
        else if (e.getSource() == btn_6){
            txt_out.setText(txt_out.getText() + "6");
            num1 += "6";
            num2 += "6";
        }
        else if (e.getSource() == btn_7){
            txt_out.setText(txt_out.getText() + "7");
            num1 += "7";
            num2 += "7";
        }
        else if (e.getSource() == btn_8){
            txt_out.setText(txt_out.getText() + "8");
            num1 += "8";
            num2 += "8";
        }
        else if (e.getSource() == btn_9){
            txt_out.setText(txt_out.getText() + "9");
            num1 += "9";
            num2 += "9";
        }
        else if (e.getSource() == btn_plus){
            operator = '+';
            totalA += Integer.parseInt(num1);
            num1 = "";
            txt_out.setText(txt_out.getText() + operator);
        }
        else if (e.getSource() == btn_sub){
            operator = '-';
            total = Integer.parseInt(String.valueOf(totalA));
            num1 = "";

            txt_out.setText(txt_out.getText() + operator);
        }
        else if (e.getSource() == btn_mul){
            operator = 'x';
            totalM *= Integer.parseInt(num1);
            num1 = "";

            txt_out.setText(txt_out.getText() + operator);
        }
        else if (e.getSource() == btn_div){
            operator = '/';
            totalD /= Double.parseDouble(num1);
            System.out.println("t : " + totalD);
            System.out.println("n1 : " + num1);
            num1 = "";

            txt_out.setText(txt_out.getText() + operator);
        }
        else if (e.getSource() == btn_equal){
            switch (operator){

                case '+':
                    txt_out.setText(String.valueOf(totalA + Integer.parseInt(num1)));
                    break;

                case '-':
                    txt_out.setText(String.valueOf(total - Integer.parseInt(num1)));
                    num1 = String.valueOf(total - Integer.parseInt(num1));
                    break;

                case 'x':
                    txt_out.setText(String.valueOf(totalM * Integer.parseInt(num1)));
                    num1 = String.valueOf(totalM * Integer.parseInt(num1));
                    break;

                case '/':
//                    txt_out.setText(String.valueOf(totalD / Integer.parseInt(num1)));
//                    num1 = String.valueOf(totalD / Integer.parseInt(num1));
                    txt_out.setText(String.valueOf(totalD / Double.parseDouble(num1)));
                    num1 = String.valueOf(totalD / Double.parseDouble(num1));
                    break;

            }

        }



    }


}


public class cal2 {

    public static void main(String[] args) {

        new cal1();

    }

}
