
import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

class sForm extends JFrame implements ActionListener{

    JLabel h_lbl, fName_lbl, lName_lbl, address_lbl, sex_lbl, dob_lbl, email_lbl, sub_lbl;

    JTextField fName_txt, lName_txt, email_txt;
    TextArea address_txt;
    JRadioButton gender_rdbM = new JRadioButton("Male");
    JRadioButton gender_rdbF = new JRadioButton("Female");
    ButtonGroup rdb_grp = new ButtonGroup();

    JComboBox sub_cmb,dob_cmbD,dob_cmbM,dob_cmbY;
    String date,sub;

    JButton btn_submit,btn_clear;

    Font lblFont = new Font("san serif", Font.BOLD, 16);
    Font txtFont = new Font("san serif", Font.PLAIN, 16);
    Font btnFont = new Font("Arial", Font.PLAIN, 16);

    String qry1 = null;
    Connection con = null;
    Statement stm = null;
    ResultSet rs = null;
    PreparedStatement st = null;

    void connector(){

        try{

            String url = "jdbc:mysql://localhost:3306/secondFormDB";
            String username = "root";
            String password = "Dhanush!1896$";

            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url,username,password);
            stm = con.createStatement();
            rs = stm.executeQuery(qry1);

        }
        catch (Exception e){
            System.out.println(e);
        }

    }

    sForm() {

        connector();

        h_lbl = new JLabel("Second Form");
        h_lbl.setBounds(50, 30, 300, 50);
        h_lbl.setFont(new Font("Cooper Black", Font.PLAIN, 40));

        fName_lbl = new JLabel("First Name  :");
        fName_lbl.setBounds(20, 110, 100, 30);
        fName_lbl.setFont(lblFont);

        fName_txt = new JTextField();
        fName_txt.setBounds(140, 110, 200, 30);
        fName_txt.setFont(txtFont);

        lName_lbl = new JLabel("Last Name  :");
        lName_lbl.setBounds(20, 150, 100, 30);
        lName_lbl.setFont(lblFont);

        lName_txt = new JTextField();
        lName_txt.setBounds(140, 150, 200, 30);
        lName_txt.setFont(txtFont);

        address_lbl = new JLabel("Address      :");
        address_lbl.setBounds(20, 190, 100, 30);
        address_lbl.setFont(lblFont);

        address_txt = new TextArea();
        address_txt.setBounds(140, 190, 200, 50);
        address_txt.setFont(txtFont);

        sex_lbl = new JLabel("Sex               :");
        sex_lbl.setBounds(20, 250, 100, 30);
        sex_lbl.setFont(lblFont);

        gender_rdbM.setBounds(140, 250, 80, 30);
        gender_rdbM.setFont(txtFont);
        gender_rdbM.addActionListener(this);

        rdb_grp.add(gender_rdbM);

        gender_rdbF.setBounds(230, 250, 80, 30);
        gender_rdbF.setFont(txtFont);
        gender_rdbF.addActionListener(this);

        rdb_grp.add(gender_rdbF);

        dob_lbl = new JLabel("DOB             :");
        dob_lbl.setBounds(20, 290, 100, 30);
        dob_lbl.setFont(lblFont);

        dob_cmbD = new JComboBox();
        dob_cmbM = new JComboBox();
        dob_cmbY = new JComboBox();

        dob_cmbD.addItem("DD");
        for (int i = 1; i < 32 ; i++) {
            dob_cmbD.addItem(i);
        }
        dob_cmbD.setBounds(140,290,50,30);

        dob_cmbM.addItem("MM");
        for (int i = 1; i < 13 ; i++) {
            dob_cmbM.addItem(i);
        }
        dob_cmbM.setBounds(200,290,50,30);

        dob_cmbY.addItem("YYYY");
        for (int i = 1950; i < 2025 ; i++) {
            dob_cmbY.addItem(i);
        }
        dob_cmbY.setBounds(260,290,80,30);

        email_lbl = new JLabel("Email            :");
        email_lbl.setBounds(20, 330, 100, 30);
        email_lbl.setFont(lblFont);

        email_txt = new JTextField();
        email_txt.setBounds(140, 330, 200, 30);
        email_txt.setFont(txtFont);

        sub_lbl = new JLabel("Subjects      :");
        sub_lbl.setBounds(20, 370, 100, 30);
        sub_lbl.setFont(lblFont);

        sub_cmb = new JComboBox();

        sub_cmb.addItem("Select One");
        sub_cmb.addItem("C");
        sub_cmb.addItem("C++");
        sub_cmb.addItem("Java");
        sub_cmb.addItem("Python");
        sub_cmb.addItem("HTML");
        sub_cmb.addItem("CSS");
        sub_cmb.addItem("JAVASCRIPT");
        sub_cmb.addItem("MYSQL");

        sub_cmb.setBounds(140,370,200,30);

        btn_submit = new JButton("Submit");
        btn_submit.setBounds(140,430,90,30);
        btn_submit.setFont(btnFont);
        btn_submit.setVisible(true);
        btn_submit.addActionListener(this);

        btn_clear = new JButton("Clear");
        btn_clear.setBounds(250,430,90,30);
        btn_clear.setFont(btnFont);
        btn_clear.setVisible(true);
        btn_clear.addActionListener(this);


        setTitle("My Form");
        setSize(400, 550);
        setLocationRelativeTo(null);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        add(h_lbl);

        add(fName_lbl);
        add(lName_lbl);
        add(address_lbl);
        add(sex_lbl);
        add(dob_lbl);
        add(email_lbl);
        add(sub_lbl);

        add(fName_txt);
        add(lName_txt);
        add(address_txt);

        add(gender_rdbM);
        add(gender_rdbF);

        add(dob_cmbD);
        add(dob_cmbM);
        add(dob_cmbY);

        add(email_txt);

        add(sub_cmb);

        add(btn_submit);
        add(btn_clear);



        setVisible(true);


    }

    public void actionPerformed(ActionEvent cE){
//        if (cE.getSource().equals(gender_rdbM)){
//            gender_rdbF.setSelected(false);
//        }
//        else if (cE.getSource().equals(gender_rdbF)) {
//            gender_rdbM.setSelected(false);
//        }
        if (cE.getSource().equals(btn_submit)){

            if (sub_cmb.getSelectedIndex() == 0){
                sub_cmb.setForeground(Color.red);
            }
            else {
                sub_cmb.setForeground(Color.black);

                try {

                    qry1 = "INSERT INTO details " +
                            "(fName,lName,address,sex,DOB,email,subjects) VALUES (?,?,?,?,?,?,?)";

                    st = con.prepareStatement(qry1);

                    st.setString(1, fName_txt.getText());
                    st.setString(2, lName_txt.getText());
                    st.setString(3, address_txt.getText());

                    if (gender_rdbM.isSelected()) {
                        st.setString(4, "M");
                    } else if (gender_rdbF.isSelected()) {
                        st.setString(4, "F");
                    }

                    date = String.valueOf(dob_cmbY.getSelectedItem() + "-" + dob_cmbM.getSelectedItem()
                    + "-" + dob_cmbD.getSelectedItem());

                    st.setString(5,date);

                    st.setString(6, email_txt.getText());

                    sub = String.valueOf(sub_cmb.getSelectedItem());

                    st.setString(7, sub);
                    st.executeUpdate();

                    fName_txt.setText(null);
                    lName_txt.setText(null);
                    address_txt.setText(null);
                    email_txt.setText(null);
                    rdb_grp.clearSelection();
                    dob_cmbD.setSelectedIndex(0);
                    dob_cmbM.setSelectedIndex(0);
                    dob_cmbY.setSelectedIndex(0);
                    sub_cmb.setSelectedIndex(0);

                    qry1 = "SELECT * FROM details";
                    rs = stm.executeQuery(qry1);

                    while (rs.next()){
                        System.out.print(rs.getString(1) + "| ");
                        System.out.print(rs.getString(2)+ "| ");
                        System.out.print(rs.getString(3)+ "| ");

                        System.out.print(rs.getString(4)+ "| ");
                        System.out.print(rs.getString(5)+ "| ");
                        System.out.print(rs.getString(6)+ "| ");
                        System.out.println(rs.getString(7)+ "| ");
                    }

                    con.close();


                } catch (Exception e) {
                    System.out.println(e);
                }
            }

        }

        if (cE.getSource().equals(btn_clear)){
            fName_txt.setText(null);
            lName_txt.setText(null);
            address_txt.setText(null);
            email_txt.setText(null);
            rdb_grp.clearSelection();
            dob_cmbD.setSelectedIndex(0);
            dob_cmbM.setSelectedIndex(0);
            dob_cmbY.setSelectedIndex(0);
            sub_cmb.setSelectedIndex(0);
        }

    }


}

public class secFmain {
    public static void main(String[] args) {
        new sForm();
    }
}
