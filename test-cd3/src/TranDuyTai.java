import java.util.Scanner;

public class TranDuyTai {
    public static void main (String[] args){
        Scanner nhap = new Scanner(System.in);
        System.out.println("Nhap n: ");
        int n = nhap.nextInt();
        int s = 0;
        for (int i = 1; i <= n; i++){
            s +=i;
        }
        System.out.println("Tong 1->n: "+s);
    }
}