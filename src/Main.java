import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        String line;
        Scanner in = new Scanner(System.in);
        System.out.print("Type something: ");
        line = in.nextLine();
        int x = 5;/*decliring int x*/
        double y = 23;


        String message = "Hello there!";//decliring string
        System.out.println(x);
        System.out.println(y);
        System.out.println(x*y);
        System.out.println(y-x);
        System.out.println(message);
        System.out.println("You typed: " + line);



    }
}