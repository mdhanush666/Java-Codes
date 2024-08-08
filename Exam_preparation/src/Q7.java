
import java.sql.*;
import java.util.Scanner;

public class Q7 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String url = "jdbc:mysql://localhost:3306/Employee";
        String username = "root";
        String password = "Dhanush!1896$";

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(url,username,password);
            Statement stm = con.createStatement();      //  Database Connection


            String qry = null;
            PreparedStatement pt = null;
            ResultSet rs = null;

            System.out.println("Database Stored Values are : ");

            qry = "SELECT * FROM emp";      //  SQL code to get Stored Data in DATABASE
            rs = stm.executeQuery(qry);

            while (rs.next()){                          //  To print Data that stored in Database
                int id = rs.getInt(1);
                String fname = rs.getString(2);
                String lname = rs.getString(3);
                double esal = rs.getDouble(4);

                System.out.print(id + "| ");
                System.out.print(fname + "| ");
                System.out.print(lname + "| ");
                System.out.println(esal + "| ");
            }

            System.out.println(); // Just a line break

            System.out.print("Enter the Employee  ID to Update : ");    // get employee id from user to update salary
            int eid = scan.nextInt();

            System.out.print("Enter the New Salary : ");        // get the new salary
            double sal = scan.nextDouble();

            qry = "UPDATE emp SET Salary = " + sal + " WHERE empID = " + eid;   // SQL code to update salary

            pt = con.prepareStatement(qry);
            pt.executeUpdate();

            System.out.println("Update Success.");  // confirm the update

            System.out.println();       // just a line break

            qry = "SELECT * FROM emp";  //  SQl code to get all the Data From the DATABASE after the Update
            rs = stm.executeQuery(qry);

            while (rs.next()){                          //  Print all data
                int id = rs.getInt(1);
                String fname = rs.getString(2);
                String lname = rs.getString(3);
                double esal = rs.getDouble(4);

                System.out.print(id + "| ");
                System.out.print(fname + "| ");
                System.out.print(lname + "| ");
                System.out.println(esal + "| ");
            }


        }
        catch (Exception e){
            System.out.println(e);
        }


    }
}
