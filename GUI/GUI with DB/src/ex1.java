
import java.sql.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class app1 extends JFrame{

    JLabel lbl_h;
    JLabel lbl_Uname;
    JLabel lbl_pass;
    JLabel lbl_db_success;

    TextField txt_Uname;
    TextField txt_pass;

    Button btn_submit;
    Button btn_clear;

    Font lbl_font = new Font("Arial",Font.BOLD,18);
    Font txt_font = new Font("Times New Roman",Font.PLAIN,18);
    Font lbl_h_font = new Font("Cooper Black",Font.BOLD,40);

    Connection con = null;
    Statement stm = null;
    ResultSet rs = null;

    PreparedStatement st = null;

    String qry1 = null;

    void connector(){
        String url = "jdbc:mysql://localhost:3306/app1";
        String username = "root";
        String pass = "Dhanush!1896$";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url,username,pass);
            stm = con.createStatement();
            rs = stm.executeQuery(qry1);


        }
        catch (Exception e){
            System.out.println(e);
        }
    }

    app1(){

        connector();

        lbl_h = new JLabel("Simple App");
        lbl_h.setFont(lbl_h_font);
        lbl_h.setBounds(60,30,250,40);

        lbl_Uname = new JLabel("Username : ");
        lbl_Uname.setFont(lbl_font);
        lbl_Uname.setBounds(20,100,120,30);

        txt_Uname = new TextField();
        txt_Uname.setFont(txt_font);
        txt_Uname.setBounds(140,100,200,30);

        lbl_pass = new JLabel("Password  : ");
        lbl_pass.setFont(lbl_font);
        lbl_pass.setBounds(20,140,120,30);

        txt_pass = new TextField();
        txt_pass.setFont(txt_font);
        txt_pass.setBounds(140,140,200,30);

        btn_clear = new Button("Clear");
        btn_clear.setBounds(140,190,90,30);
        btn_clear.setFont(txt_font);

        btn_submit = new Button("Submit");
        btn_submit.setBounds(250,190,90,30);
        btn_submit.setFont(txt_font);

        lbl_db_success = new JLabel("Update Success");
        //lbl_db_success.setFont(lbl_font);
        lbl_db_success.setBounds(20,190,120,30);
        lbl_db_success.setVisible(false);


        setTitle("Login");
        setSize(400,300);
        setLocationRelativeTo(null);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        add(lbl_h);

        add(lbl_Uname);
        add(txt_Uname);

        add(lbl_pass);
        add(txt_pass);

        add(btn_clear);
        add(btn_submit);
        add(lbl_db_success);

        setVisible(true);

        btn_clear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txt_Uname.setText(null);
                txt_pass.setText(null);
                lbl_db_success.setVisible(false);
            }
        });

        btn_submit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    qry1 = "INSERT INTO login_details (userName,password)VALUES (?,?)";
                    st = con.prepareStatement(qry1);

                    st.setString(1,txt_Uname.getText());
                    st.setString(2,txt_pass.getText());
                    st.executeUpdate();
                    txt_Uname.setText(null);
                    txt_pass.setText(null);
                    //lbl_db_success.setVisible(true);
                }
                catch (Exception ex) {
                    System.out.println(ex);
                }

                lbl_db_success.setVisible(true);
            }
        });

        txt_Uname.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                lbl_db_success.setVisible(false);
            }
        });

        txt_pass.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                lbl_db_success.setVisible(false);
            }
        });

    }
}

public class ex1 {
    public static void main(String[] args) {

        new app1();

    }
}
