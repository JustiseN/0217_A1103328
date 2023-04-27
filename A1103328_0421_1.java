import java.util.*;

public class A1103328_0421_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("請輸入電子郵件地址：");
        String email = scanner.nextLine();
        String regex = "^[a-z]{1,}*@[a-z]+\\.[a-z]{2,}$";
        if (email.matches(regex)) {
            System.out.println("輸入的電子郵件地址格式正確。");
        } else {
            System.out.println("輸入的電子郵件地址格式不正確。");
        }
    }
}
