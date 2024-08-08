import java.sql.*;

public class dbEx1 {
    public static void main(String[] args) {

        try{
            String url = "jdbc:mysql://localhost:3306/dbjava1";
            String username = "root";
            String password = "Dhanush!1896$";

            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(url,username,password);
            Statement stm = con.createStatement();

            ResultSet rs = stm.executeQuery("SELECT * FROM ex1");

            while(rs.next()){
                System.out.print(rs.getInt(1) + " ");
                System.out.print(rs.getString(2) + " ");
                System.out.println(rs.getInt(3) + " ");
            }
            con.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
