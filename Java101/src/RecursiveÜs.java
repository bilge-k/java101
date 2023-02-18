import java.util.Scanner;

public class RecursiveÜs {
    static int us(int a, int b){
        if(a==0){
            return 0;
        } else if (b==0) {
            return 1;
        }

        return a*us(a,b-1) ;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("bir sayı giriniz :");
        int a=scan.nextInt();
        System.out.println("bir sayı giriniz :");
        int b=scan.nextInt();
        int c=us(a,b);
        System.out.println(c);
    }
}
