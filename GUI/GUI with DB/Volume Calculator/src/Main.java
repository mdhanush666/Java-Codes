import javax.swing.*;
import java.awt.*;

import java.awt.event.*;

import java.sql.*;

class containerV extends JFrame implements ActionListener {

    String qry = null;
    Connection con = null;
    Statement stm = null;
    ResultSet rs = null;

    PreparedStatement pt = null;

    void connector(){

        String url = "jdbc:mysql://localhost:3306/Container_Volume_Calculator";
        String username = "root";
        String password = "Dhanush!1896$";

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url,username,password);
            stm = con.createStatement();
            rs  = stm.executeQuery(qry);

        }
        catch (Exception e){
            System.out.println("Error in Connector Method");
        }


    }

    JLabel cCode_lbl,mName_lbl,rC_lbl,hC_lbl;
    JTextField cCode_txt,mName_txt,rC_txt,hC_txt,cV_txt;
    JButton cV_btn,in_btn,clear_btn,srh_btn;

    Font lbl_Font = new Font("Arial",Font.BOLD,16);
    Font txt_Font = new Font("Arial",Font.PLAIN,16);
    Font btn_Font = new Font("Arial",Font.BOLD,14);

    GridLayout layout = new GridLayout(7,2);


    containerV(){

        connector();

        setTitle("Container Volume Calculator");
        setSize(450,500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(layout);
        layout.setHgap(10);
        layout.setVgap(5);
        setLocationRelativeTo(null);


        cCode_lbl = new JLabel("Container Code :");
        cCode_lbl.setFont(lbl_Font);

        cCode_txt = new JTextField();
        cCode_txt.setFont(txt_Font);

        mName_lbl = new JLabel("Model Name :");
        mName_lbl.setFont(lbl_Font);

        mName_txt = new JTextField();
        mName_txt.setFont(txt_Font);

        rC_lbl = new JLabel("Radius of the Container :");
        rC_lbl.setFont(lbl_Font);

        rC_txt = new JTextField("0");
        rC_txt.setFont(txt_Font);

        hC_lbl = new JLabel("Height of the Container :");
        hC_lbl.setFont(lbl_Font);

        hC_txt = new JTextField("0");
        hC_txt.setFont(txt_Font);

        cV_btn = new JButton("Calculate Volume");
        cV_btn.setFont(btn_Font);
        cV_btn.addActionListener(this);

        cV_txt = new JTextField("0");
        cV_txt.setEditable(false);
        cV_txt.setFont(txt_Font);

        in_btn = new JButton("Insert");
        in_btn.setFont(btn_Font);
        in_btn.addActionListener(this);

        clear_btn = new JButton("Clear");
        clear_btn.setFont(btn_Font);
        clear_btn.addActionListener(this);

        srh_btn = new JButton("Search");
        srh_btn.setFont(btn_Font);
        srh_btn.addActionListener(this);

        add(cCode_lbl);
        add(cCode_txt);

        add(mName_lbl);
        add(mName_txt);

        add(rC_lbl);
        add(rC_txt);

        add(hC_lbl);
        add(hC_txt);

        add(cV_btn);
        add(cV_txt);

        add(in_btn);
        add(clear_btn);
        add(srh_btn);

        setVisible(true);


    }

    @Override
    public void actionPerformed(ActionEvent cE){

        if (cE.getSource().equals(in_btn)){

            try {

                if (cCode_txt.getText().equals("") || mName_txt.getText().equals("") ||
                        rC_txt.getText().equals("") || hC_txt.getText().equals("") ){

                    JOptionPane.showMessageDialog(null,"Empty Fields are can't Store",
                            "Insert Information",JOptionPane.ERROR_MESSAGE);
                }
                else {
                    qry = "INSERT INTO CylinderModel (Container_Code,Model_Name, Radius, Height)" +
                            "VALUES (?,?,?,?)";
                    pt = con.prepareStatement(qry);

                    pt.setInt(1,Integer.parseInt(cCode_txt.getText()));
                    pt.setString(2,mName_txt.getText());
                    pt.setDouble(3,Double.parseDouble(rC_txt.getText()));
                    pt.setDouble(4,Double.parseDouble(hC_txt.getText()));

                    pt.executeUpdate();

                    JOptionPane.showMessageDialog(null,"Data Saved Success",
                            "Insert Information",JOptionPane.INFORMATION_MESSAGE);

                    cCode_txt.setText(null);
                    mName_txt.setText(null);
                    rC_txt.setText("0");
                    hC_txt.setText("0");
                    cV_txt.setText("0");
                }

            }
            catch (Exception e){
                System.out.println("Error in Insert Button Action Listener");
            }

        }


        if(cE.getSource().equals(srh_btn) ){

            if (cCode_txt.getText().equals("")){
                JOptionPane.showMessageDialog(null,"Container Code must be entered!",
                        "Search Information",JOptionPane.ERROR_MESSAGE);
            }
            else {
                try {
                    qry = "SELECT Container_Code,Model_Name, Radius, Height FROM CylinderModel " +
                            "WHERE Container_Code = " + Integer.parseInt(cCode_txt.getText());
                    rs = stm.executeQuery(qry);

                    if(rs.next()){
                        cCode_txt.setText(String.valueOf(rs.getInt("Container_Code")));
                        mName_txt.setText(rs.getString("Model_Name"));
                        rC_txt.setText(rs.getString("Radius"));
                        hC_txt.setText(rs.getString("Height"));
                    }
                }
                catch (Exception e){
                    System.out.println("Error in Search Button Action Listener");
                }
            }
        }

        if(cE.getSource().equals(cV_btn)){

            if (rC_txt.getText().equals("")&& hC_txt.getText().equals("")){
                JOptionPane.showMessageDialog(null,"Radius and Height Fields are empty",
                        "Invalid Operation",JOptionPane.ERROR_MESSAGE);
            }
            else{
                cV_txt.setText(String.valueOf((Math.PI *
                        (Double.parseDouble(rC_txt.getText()) * Double.parseDouble(rC_txt.getText())) *
                        Double.parseDouble(hC_txt.getText()))));
            }

        }

        if(cE.getSource().equals(clear_btn)){
            cCode_txt.setText(null);
            mName_txt.setText(null);
            rC_txt.setText("0");
            hC_txt.setText("0");
            cV_txt.setText("0");

            JOptionPane.showMessageDialog(null,"Data Reset Success",
                    "Data Clear Information", JOptionPane.INFORMATION_MESSAGE);


        }

    }
}

public class Main {
    public static void main(String[] args) {
        new containerV();
    }
}
