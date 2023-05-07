import java.util.*;

public class A1103328_0505 {
    public static void main(String[] args) {
        int[] winningNumbers = generateWinningNumbers();

        
        int[] userNumbers = getUserNumbers();

        
        int numMatches = getNumMatches(winningNumbers, userNumbers);

        
        System.out.println("當期號碼: " + Arrays.toString(winningNumbers));
        System.out.println("你的號碼: " + Arrays.toString(userNumbers));
        if (numMatches == 6) {
            System.out.println("恭喜你獲得了頭獎");
        } else if (numMatches >= 3) {
            System.out.println("你中獎了!");
        } else {
            System.out.println("對不起!你沒有中獎。");
        }
    }

    
    private static int[] generateWinningNumbers() {
        int[] numbers = new int[6];
        for(int n=0;n<=5;n++){
            numbers[n] = n+1; 
        }
        
        /*Random random = new Random();
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(49) + 1;
        }*/
        return numbers;
    }

    
    private static int[] getUserNumbers() {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[6];
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("輸入整數" + (i + 1) + ": ");
            try {
                int num = scanner.nextInt();
                if (num < 1 || num > 49) {
                    throw new Exception("數字要在1-49之間。");
                }
                numbers[i] = num;
            } catch (InputMismatchException e) {
                System.out.println("請輸入整數!");
                scanner.nextLine(); 
                i--; 
            } catch (Exception e) {
                System.out.println(e.getMessage());
                System.exit(1); 
            }
        }
        return numbers;
    }

    private static int getNumMatches(int[] a, int[] b) {
        int count = 0;
        for (int numA : a) {
            for (int numB : b) {
                if (numA == numB) {
                    count++;
                    break;
                }
            }
        }
        return count;
    }
}
