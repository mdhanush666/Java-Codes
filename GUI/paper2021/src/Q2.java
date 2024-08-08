
import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

import java.sql.*;

class containerMain extends JFrame implements ActionListener{

    JLabel lbl_h,lbl_nic,lbl_name,lbl_address;
    JTextField txt_nic,txt_name,txt_address;
    JButton btn_save,btn_clear;

    Font lblH_font = new Font("Cooper Black",Font.PLAIN,30);
    Font lbl_font = new Font("Arial",Font.BOLD,18);

    String qry = null;
    Connection con;
    Statement stm;
    PreparedStatement pst;

    boolean chk_nic_no;

    void connector(){

        String url = "jdbc:mysql://localhost:3306/paper2021";
        String username = "root";
        String password = "Dhanush!1896$";

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url,username,password);
            stm = con.createStatement();

        }
        catch (Exception e){
            System.out.println(e);
            System.out.println("Error in Connector");
        }

    }

    containerMain() {

        connector();

        setTitle("Form 1");
        setSize(500,400);
        setLocationRelativeTo(null);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        lbl_h = new JLabel("Add User");
        lbl_h.setFont(lblH_font);
        lbl_h.setBounds(180,50,200,30);

        lbl_nic = new JLabel("NIC NO :");
        lbl_nic.setFont(lbl_font);
        lbl_nic.setBounds(50,100,100,20);

        lbl_name = new JLabel("NAME :");
        lbl_name.setFont(lbl_font);
        lbl_name.setBounds(50,150,100,20);

        lbl_address = new JLabel("ADDRESS :");
        lbl_address.setFont(lbl_font);
        lbl_address.setBounds(50,190,100,20);

        txt_nic = new JTextField();
        txt_nic.setFont(lbl_font);
        txt_nic.setBounds(160,100,210,30);

        txt_name = new JTextField();
        txt_name.setFont(lbl_font);
        txt_name.setBounds(160,145,210,30);

        txt_address = new JTextField();
        txt_address.setFont(lbl_font);
        txt_address.setBounds(160,185,210,30);


        btn_save = new JButton("Save");
        btn_save.setBounds(160,250,100,30);
        btn_save.addActionListener(this);

        btn_clear= new JButton("Clear");
        btn_clear.setBounds(270,250,100,30);
        btn_clear.addActionListener(this);

        add(lbl_h);
        add(lbl_nic);
        add(lbl_name);
        add(lbl_address);

        add(txt_nic);
        add(txt_name);
        add(txt_address);

        add(btn_save);
        add(btn_clear);

        setVisible(true);

    }


    @Override
    public void actionPerformed(ActionEvent cE){

        if (cE.getSource().equals(btn_save)){



            for (int i = 0; i < txt_nic.getText().length(); i++) {
                if (txt_nic.getText().charAt(i) >= 48 && txt_nic.getText().charAt(i) <= 57){
                    chk_nic_no = true;
                }
                else {
                    chk_nic_no = false;
                }
            }


            if (txt_nic.getText().equals("") || txt_name.getText().equals("")
                    || txt_address.getText().equals("")){

                JOptionPane.showMessageDialog(null,"All Fields Must Be Filled"
                ,"Save Information",JOptionPane.ERROR_MESSAGE);
            }
            else if(!chk_nic_no){
                JOptionPane.showMessageDialog(null,"NIC Field Must Contain Only Numbers"
                        ,"Save Information",JOptionPane.ERROR_MESSAGE);
            }
            else {
                try {

                    String getNic = String.valueOf(txt_nic.getText());
                    String getName = String.valueOf(txt_name.getText());
                    String getAddress = String.valueOf(txt_address.getText());

                    qry = "INSERT INTO User_infor (NIC_NO,NAME,ADDRESS) VALUES (?,?,?)";
                    pst = con.prepareStatement(qry);

                    pst.setString(1,getNic);
                    pst.setString(2,getName);
                    pst.setString(3,getAddress);

                    pst.executeUpdate();

                    JOptionPane.showMessageDialog(null,"Data Saved Success",
                            "Save Information",JOptionPane.INFORMATION_MESSAGE);

                    con.close();

                    txt_nic.setText(null);
                    txt_name.setText(null);
                    txt_address.setText(null);

                }
                catch (Exception e){
                    System.out.println(e);
                    System.out.println("Error in Saving");
                }
            }

        }

        if (cE.getSource().equals(btn_clear)){

            JOptionPane.showMessageDialog(null,"Data Cleared Success",
                    "Clear Information",JOptionPane.INFORMATION_MESSAGE);
            txt_nic.setText(null);
            txt_name.setText(null);
            txt_address.setText(null);
        }

    }

}


public class Q2 {

    public static void main(String[] args) {

        new containerMain();


    }

}
