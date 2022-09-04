import java.util.Scanner;

public class Phovilay {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap n:");
        int n = sc.nextInt();
        int s = 0;
        for (int i = 1; i <= n; i++){
            s +=i;
        }
        System.out.println("tong cua s:"+s);
    }
}
