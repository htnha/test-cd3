import java.util.Scanner;

public class TranSinhDuc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao mot so: ");
        int n = sc.nextInt();
        int s = 0;
        for (int i = 1; i <= n; i++) {
            s += i;
        }
        System.out.println("Tong cac so tu 1 den " + n + " la: " + s);
    }
}
