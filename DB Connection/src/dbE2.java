
import java.sql.*;

class DB1{

    String url = "jdbc:mysql://localhost:3306/abc_institute";
    String username = "root";
    String password = "Dhanush!1896$";

    DB1(){

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(url,username,password);
            Statement stm = con.createStatement();

            ResultSet rs = stm.executeQuery("SELECT First_Name FROM student");

            while (rs.next()){

                System.out.println(rs.getString(1));
                System.out.println("-------------|");
            }

            con.close();

        }
        catch (Exception e){
            System.out.println(e);
        }

    }

}

public class dbE2 {
    public static void main(String[] args) {

        new DB1();

    }
}
