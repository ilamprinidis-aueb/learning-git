import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        String name;
        Scanner scanner = new Scanner(System.in);
        name = scanner.next();
        System.out.println("Hello " + name + "!");
    }
}
