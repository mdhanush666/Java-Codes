import java.awt.*;
import java.awt.event.*;

class containerCal extends Frame{

    containerCal(){

        addWindowListener(new WindowAdapter(){
           @Override
           public void windowClosing(WindowEvent e){
               System.exit(0);
           }
        });


        Choice cmb = new Choice();
        cmb.addItem(" *");
        cmb.addItem(" /");
        cmb.addItem(" +");
        cmb.addItem(" -");

        Label no1_lbl = new Label("Number 1");
        Label no2_lbl = new Label("Number 2");

        TextField in1_txt = new TextField();
        TextField in2_txt = new TextField();
        TextField out_txt = new TextField();

        TextArea his_txt = new TextArea();

        Button btn_clear = new Button("Clear");
        Button btn_Cal = new Button("Calculate");
        Button btn_Exit = new Button("Exit");

        Label show_his_lbl = new Label("Show History");
        Label clear_his_lbl = new Label("Clear History");

        no1_lbl.setBounds(60,75,80,20);
        no1_lbl.setFont(new Font("Arial", Font.BOLD,16));

        no2_lbl.setBounds(300,75,80,20);
        no2_lbl.setFont(new Font("Arial", Font.BOLD,16));

        in1_txt.setBounds(60,100,180,30);
        in1_txt.setFont(new Font("Arial", Font.ITALIC,16));

        cmb.setBounds(245,100,50,30);
        cmb.setFont(new Font("Times New Roman", Font.ITALIC,20));

        in2_txt.setBounds(300,100,180,30);
        in2_txt.setFont(new Font("Arial", Font.ITALIC,16));

        out_txt.setBounds(100,180,300,40);
        out_txt.setFont(new Font("Arial", Font.PLAIN,24));
        out_txt.setEditable(false);
        out_txt.setFocusable(false);

        btn_clear.setBounds(50,280,80,30);
        btn_clear.setFont(new Font("Arial", Font.PLAIN,18));

        btn_Cal.setBounds(150,280,100,30);
        btn_Cal.setFont(new Font("Arial", Font.PLAIN,18));

        btn_Exit.setBounds(270,280,80,30);
        btn_Exit.setFont(new Font("Arial", Font.PLAIN,18));

        show_his_lbl.setBounds(500,75,80,20);
        show_his_lbl.setFont(new Font("Times New Roman", Font.PLAIN,12));
        show_his_lbl.setForeground(Color.BLUE);

        clear_his_lbl.setBounds(670,75,80,20);
        clear_his_lbl.setFont(new Font("Times New Roman", Font.PLAIN,12));
        clear_his_lbl.setForeground(Color.BLUE);

        his_txt.setBounds(500,100,250,220);
        his_txt.setFont(new Font("Times New Roman", Font.PLAIN,18));
        his_txt.setVisible(false);

        add(no1_lbl);
        add(no2_lbl);
        add(in1_txt);
        add(cmb);
        add(in2_txt);
        add(out_txt);

        add(btn_clear);
        add(btn_Cal);
        add(btn_Exit);

        add(show_his_lbl);
        add(clear_his_lbl);

        add(his_txt);

        setSize(800,380);
        setTitle("sample Calculator");
        setResizable(false);
        setLayout(null);
        setLocationRelativeTo(null);
        setVisible(true);

        btn_Exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        btn_Cal.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (cmb.getSelectedItem().equals(" *") ){
                    int n1 = Integer.parseInt(in1_txt.getText());
                    int n2 = Integer.parseInt(in2_txt.getText());

                    his_txt.setText(his_txt.getText() + String.valueOf(n1) + " " + cmb.getSelectedItem() + " "
                            + String.valueOf(n2) + "\n");

                    out_txt.setText(String.valueOf(n1 * n2));
                }
                else if (cmb.getSelectedItem().equals(" /")){
                    int n1 = Integer.parseInt(in1_txt.getText());
                    int n2 = Integer.parseInt(in2_txt.getText());

                    his_txt.setText(his_txt.getText() + String.valueOf(n1) + " " + cmb.getSelectedItem() + " "
                            + String.valueOf(n2) + "\n");

                    out_txt.setText(String.valueOf(n1 / n2));
                }
                else if (cmb.getSelectedItem().equals(" +") ){
                    int n1 = Integer.parseInt(in1_txt.getText());
                    int n2 = Integer.parseInt(in2_txt.getText());

                    his_txt.setText(his_txt.getText() + String.valueOf(n1) + " " + cmb.getSelectedItem() + " "
                            + String.valueOf(n2) + "\n");

                    out_txt.setText(String.valueOf(n1 + n2));
                }
                else if (cmb.getSelectedItem().equals(" -") ){
                    int n1 = Integer.parseInt(in1_txt.getText());
                    int n2 = Integer.parseInt(in2_txt.getText());

                    his_txt.setText(his_txt.getText() + String.valueOf(n1) + " " + cmb.getSelectedItem() + " "
                            + String.valueOf(n2) + "\n");

                    out_txt.setText(String.valueOf(n1 - n2));
                }
            }
        });

        btn_clear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                out_txt.setText("");
                in1_txt.setText("");
                in2_txt.setText("");
            }
        });

        show_his_lbl.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent c){
                his_txt.setVisible(true);
            }
            public void mousePressed(MouseEvent c){
                show_his_lbl.setForeground(Color.red);
            }
            public void mouseReleased(MouseEvent c){
                show_his_lbl.setForeground(Color.BLUE);
            }
        });

        clear_his_lbl.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent c){
                his_txt.setText("");
                his_txt.setVisible(false);
            }
            public void mousePressed(MouseEvent c){
                clear_his_lbl.setForeground(Color.red);
            }
            public void mouseReleased(MouseEvent c){
                clear_his_lbl.setForeground(Color.BLUE);
            }

        });

    }

}

public class calSample1 {
    public static void main(String[] args) {

        new containerCal();

    }
}
