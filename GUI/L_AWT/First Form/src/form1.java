import java.awt.*;
import java.awt.event.*;

class sampleForm1 extends Frame{

    sampleForm1(){

        addWindowListener(new WindowAdapter(){
            @Override
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        });

        Label head_lbl= new Label("My First Form..");
        Label fName_lbl = new Label("First Name : ");
        Label lName_lbl = new Label("Last Name  : ");
        Label age_lbl = new Label("Age             : ");
        Label subs_lbl = new Label("Subjects     : ");
        Label sub_error_lbl = new Label();

        TextField fName_txt = new TextField();
        TextField lName_txt = new TextField();
        TextField age_txt = new TextField();

        Choice subs_cho = new Choice();
        subs_cho.add("Select One");
        subs_cho.add("JAVA");
        subs_cho.add("Python");
        subs_cho.add("C");
        subs_cho.add("C++");
        subs_cho.add("HTML");
        subs_cho.add("CSS");
        subs_cho.add("JAVASCRIPT");
        subs_cho.add("MY-SQL");

        head_lbl.setBounds(70,70,250,50);
        head_lbl.setFont(new Font("Cooper Black", Font.BOLD,30));
        head_lbl.setForeground(Color.BLUE);

        fName_lbl.setBounds(50,150,90,20);
        fName_lbl.setFont(new Font("Arial", Font.BOLD,14));
        fName_txt.setBounds(150,150,150,20);

        lName_lbl.setBounds(50,180,90,20);
        lName_lbl.setFont(new Font("Arial", Font.BOLD,14));
        lName_txt.setBounds(150,180,150,20);

        age_lbl.setBounds(50,210,90,20);
        age_lbl.setFont(new Font("Arial", Font.BOLD,14));
        age_txt.setBounds(150,210,150,20);

        subs_lbl.setBounds(50,240,90,20);
        subs_lbl.setFont(new Font("Arial", Font.BOLD,14));
        subs_cho.setBounds(150,240,150,20);
        subs_cho.setFont(new Font("Arial", Font.ITALIC,14));

        sub_error_lbl.setBounds(150,260,150,20);
        sub_error_lbl.setForeground(Color.red);


        Button btn_submit = new Button("Submit");
        Button btn_exit = new Button("Close");
        Button btn_clear = new Button("Clear");

        btn_clear.setBounds(50,300,70,30);
        btn_clear.setFont(new Font("san-serif", Font.BOLD,16));
        btn_clear.setForeground(Color.DARK_GRAY);

        btn_submit.setBounds(150,300,70,30);
        btn_submit.setFont(new Font("san-serif", Font.BOLD,16));
        btn_submit.setForeground(Color.DARK_GRAY);

        btn_exit.setBounds(230,300,70,30);
        btn_exit.setFont(new Font("san-serif", Font.BOLD,16));
        btn_exit.setForeground(Color.DARK_GRAY);

        btn_submit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (subs_cho.getSelectedItem() == "Select One"){
                    sub_error_lbl.setText("Enter a Valid Subject");
                }
                else {
                    System.out.println("First Name is       : " + fName_txt.getText());
                    System.out.println("Last Name is        : " + lName_txt.getText());
                    System.out.println("Age is              : " + age_txt.getText());
                    System.out.println("Selected Subject is : " + subs_cho.getSelectedItem());
                    sub_error_lbl.setText("");
                }

                System.out.println();
            }
        });

        btn_exit.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                System.exit(0);
            }
        });

        btn_clear.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                fName_txt.setText("");
                lName_txt.setText("");
                age_txt.setText("");
                sub_error_lbl.setText("");
                subs_cho.select(0);
            }
        });




        setSize(400,400);
        setResizable(false);
        setTitle("My Form 1");
        setLocationRelativeTo(null);
        setLayout(null);

        setVisible(true);

        add(head_lbl);

        add(fName_lbl);
        add(fName_txt);

        add(lName_lbl);
        add(lName_txt);

        add(age_lbl);
        add(age_txt);
        add(subs_lbl);
        add(subs_cho);
        add(sub_error_lbl);

        add(btn_submit);
        add(btn_exit);
        add(btn_clear);


    }

}


public class form1 {
    public static void main(String[] args) {

        new sampleForm1();

    }
}
