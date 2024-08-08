import java.awt.*;
import java.awt.event.*;

class cal_Container extends Frame{

    String n = "",temp = "";
    int output = 0;
    String sym = "";

    cal_Container(){

        addWindowListener(new WindowAdapter(){
            @Override
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        });

        TextField out_txt = new TextField();

        out_txt.setBounds(50,80,300,50);
        out_txt.setForeground(Color.GRAY);
        out_txt.setFont(new Font("Cooper Black",Font.PLAIN,30));

        Choice txt_history = new Choice();

        txt_history.setBounds(50,350,300,50);
        txt_history.setForeground(Color.GRAY);
        txt_history.setFont(new Font("Times New Roman",Font.PLAIN,20));
        txt_history.setVisible(false);


        Button btn_1 = new Button("1");
        Button btn_2 = new Button("2");
        Button btn_3 = new Button("3");
        Button btn_4 = new Button("4");
        Button btn_5 = new Button("5");
        Button btn_6 = new Button("6");
        Button btn_7 = new Button("7");
        Button btn_8 = new Button("8");
        Button btn_9 = new Button("9");
        Button btn_0 = new Button("0");

        Button btn_plus = new Button("+");
        Button btn_equal = new Button("=");
        Button btn_clear = new Button("Clear");

        Button btn_history = new Button("History");
        Button btn_clear_his = new Button("Clear History");

        btn_7.setBounds(50,150,70,40);
        btn_7.setFont(new Font("Cooper Black",Font.PLAIN,16));

        btn_8.setBounds(130,150,70,40);
        btn_8.setFont(new Font("Cooper Black",Font.PLAIN,16));

        btn_9.setBounds(210,150,70,40);
        btn_9.setFont(new Font("Cooper Black",Font.PLAIN,16));

        btn_plus.setBounds(290,150,60,40);
        btn_plus.setFont(new Font("Arial",Font.PLAIN,20));


        btn_4.setBounds(50,195,70,40);
        btn_4.setFont(new Font("Cooper Black",Font.PLAIN,16));

        btn_5.setBounds(130,195,70,40);
        btn_5.setFont(new Font("Cooper Black",Font.PLAIN,16));

        btn_6.setBounds(210,195,70,40);
        btn_6.setFont(new Font("Cooper Black",Font.PLAIN,16));

        btn_equal.setBounds(290,195,60,40);
        btn_equal.setFont(new Font("Arial",Font.PLAIN,20));


        btn_1.setBounds(50,240,70,40);
        btn_1.setFont(new Font("Cooper Black",Font.PLAIN,16));

        btn_2.setBounds(130,240,70,40);
        btn_2.setFont(new Font("Cooper Black",Font.PLAIN,16));

        btn_3.setBounds(210,240,70,40);
        btn_3.setFont(new Font("Cooper Black",Font.PLAIN,16));

        btn_clear.setBounds(290,240,60,40);
        btn_clear.setFont(new Font("Arial",Font.PLAIN,16));

        btn_0.setBounds(130,285,70,40);
        btn_0.setFont(new Font("Cooper Black",Font.PLAIN,16));

        btn_history.setBounds(50,285,70,40);
        btn_history.setFont(new Font("Cooper Black",Font.PLAIN,16));

        btn_clear_his.setBounds(210,285,140,40);
        btn_clear_his.setFont(new Font("Cooper Black",Font.PLAIN,16));

        setSize(400,450);
        setTitle("My Calculator");
        setResizable(false);
        setLocationRelativeTo(null);
        setLayout(null);

        setVisible(true);

        add(btn_9);
        add(btn_8);
        add(btn_7);
        add(btn_6);
        add(btn_5);
        add(btn_4);
        add(btn_3);
        add(btn_2);
        add(btn_1);
        add(btn_0);

        add(btn_plus);
        add(btn_equal);
        add(btn_clear);

        add(btn_history);
        add(btn_clear_his);

        add(out_txt);
        add(txt_history);

        btn_0.addActionListener(new ActionListener(){       // 0
            @Override
            public void actionPerformed(ActionEvent e){
                temp += "0";
                n +=  "0" + sym;
                out_txt.setText(n);
                sym = "";

            }
        });

        btn_1.addActionListener(new ActionListener(){       // 1
            @Override
            public void actionPerformed(ActionEvent e){
                temp += "1";
                n +=  sym + "1";
                out_txt.setText(n);
                sym = "";
            }
        });

        btn_2.addActionListener(new ActionListener(){       // 2
            @Override
            public void actionPerformed(ActionEvent e){
                temp += "2";
                n +=  sym + "2";
                out_txt.setText(n);
                sym = "";
            }
        });

        btn_3.addActionListener(new ActionListener(){      // 3
            @Override
            public void actionPerformed(ActionEvent e){
                temp += "3";
                n += sym + "3";
                out_txt.setText(n);
                sym = "";

            }
        });

        btn_4.addActionListener(new ActionListener(){       // 4
            @Override
            public void actionPerformed(ActionEvent e){
                temp += "4";
                n += sym + "4";
                out_txt.setText(n);
                sym = "";
            }
        });

        btn_5.addActionListener(new ActionListener(){       // 5
            @Override
            public void actionPerformed(ActionEvent e){
                temp += "5";
                n += sym + "5";
                out_txt.setText(n);
                sym = "";
            }
        });

        btn_6.addActionListener(new ActionListener(){       // 6
            @Override
            public void actionPerformed(ActionEvent e){
                temp += "6";
                n += sym + "6";
                out_txt.setText(n);
                sym = "";
            }
        });

        btn_7.addActionListener(new ActionListener(){       // 7
            @Override
            public void actionPerformed(ActionEvent e){
                temp += "7";
                n += sym + "7";
                out_txt.setText(n);
                sym = "";

            }
        });

        btn_8.addActionListener(new ActionListener(){       // 8
            @Override
            public void actionPerformed(ActionEvent e){
                temp += "8";
                n += sym + "8";
                out_txt.setText(n);
                sym = "";
            }
        });

        btn_9.addActionListener(new ActionListener(){       // 9
            @Override
            public void actionPerformed(ActionEvent e){
                temp += "9";
                n += sym + "9";
                out_txt.setText(n);
                sym = "";
            }
        });

        btn_history.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                txt_history.setVisible(true);
            }
        });

        btn_plus.addActionListener(new ActionListener(){        // +
           public void actionPerformed(ActionEvent e){

               sym = " + ";
               out_txt.setText(n + sym);
               output += Integer.valueOf(temp);
               txt_history.addItem(temp);
               temp = "";

           }
        });

        btn_clear.addActionListener(new ActionListener(){       // " "
            @Override
            public void actionPerformed(ActionEvent e){
                out_txt.setText(" ");
                n = "";
                sym = "";
                temp = "";
                output = 0;
            }
        });

        btn_equal.addActionListener(new ActionListener(){       // =
            @Override
            public void actionPerformed(ActionEvent e){

                output += Integer.valueOf(temp);
                out_txt.setText(String.valueOf(output));
                txt_history.addItem(temp);
                temp = "";
                n = String.valueOf(output);
            }
        });

        btn_clear_his.addActionListener(new ActionListener(){       // =
            @Override
            public void actionPerformed(ActionEvent e){

                txt_history.removeAll();

            }
        });

    }

}

public class calMain {
    public static void main(String[] args) {

        cal_Container c1 = new cal_Container();

    }
}
