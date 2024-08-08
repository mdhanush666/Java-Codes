
import java.util.Random;

public class ran_Ex1 {
    public static void main(String[] args) {

        Random r1 = new Random();

        int x = r1.nextInt(10);
        Boolean b = r1.nextBoolean();

        System.out.println(x);
        System.out.println(b);

    }
}
