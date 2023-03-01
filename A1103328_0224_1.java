import java.util.Scanner;

public class A1103328_0224_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a integer: ");
        int number = scanner.nextInt();

        if (number % 2 == 0) {
            System.out.println(number + " is a even number.");
        } else {
            System.out.println(number + " is a odd number.");
        }
    }
}
