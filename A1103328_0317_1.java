import java.util.Scanner;

public class A1103328_0317_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("請輸入行數(n): ");
        int n = input.nextInt();

        System.out.print("請輸入列數(m): ");
        int m = input.nextInt();

        int[][] array = new int[n][m];

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                array[i][j] = (i+1) * (j+1);
            }
        }

        System.out.println("在二維陣列中的資料:");

        for(int[] row : array) {
            for(int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }

    }
}
