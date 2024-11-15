import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.Logger;

public class Main {

    public final static Logger logger = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Please provide a number.");
            int num = scanner.nextInt();
            System.out.println("Your number is: " + num);
        } catch (InputMismatchException e) {
            logger.warning(e.toString());
            System.out.println("Please input a valid number");
        } finally {
            scanner.close();
        }

    }

}
