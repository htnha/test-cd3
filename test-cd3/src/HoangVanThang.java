import java.util.Scanner;

public class HoangVanThang {
    public static void main (String[] args){
        int s = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap so n: ");
        int n = scanner.nextInt();
        for (int i = 1; i <= n; i++){
            s +=i;
        }
        System.out.println("tong cac so tu 1 -> n: "+s);
    }
}
