import java.util.Scanner;

public class A1103328_0421_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("請輸入日期（YYYY/MM/DD 或 MM/DD/YYYY）：");
        String inputDate = scanner.nextLine();

        String[] dateParts = inputDate.split("/");
        if (dateParts.length == 3) {
            String year = dateParts[2].length() == 4 ? dateParts[2] : dateParts[0];
            String month = dateParts[1];
            String day = dateParts[0].length() == 4 ? dateParts[2] : dateParts[1];
            System.out.printf("輸入的日期是：%s年%s月%s日", year, month, day);
        } else {
            System.out.println("輸入的日期格式不正確。");
        }
    }
}
