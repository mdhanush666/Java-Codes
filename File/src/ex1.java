import java.io.File;
import java.io.FileWriter;
import java.io.IOError;
import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {

        try{
            File f1 = new File("D:\\Intellij Workplace\\File\\Example.txt");
            Scanner scan = new Scanner(f1);
            while(scan.hasNextLine()){
                System.out.println(scan.nextLine());
            }
        }
        catch (Exception e){
            System.out.println(e);
        }

    }
}
