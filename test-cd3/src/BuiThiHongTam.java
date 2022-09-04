import java.util.Scanner;

public class BuiThiHongTam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập n: ");
        int n = scanner.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; ++i) {
            sum += i;
        }
        System.out.println("Tổng các số tự nhiên từ 1 đến " + n + " là: " + sum);
    }
}