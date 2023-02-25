import java.util.Scanner;

public class RecursiveAsal {
    static int asal(int sayi, int i){

        if (i==1){
            return 1;
        }else {
            if (sayi%i==0) {
                return 0;
            }else{
                return asal(sayi,i-1);
            }
        }

    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("1 adet sayı gireceksiniz :");
        int sayi = scan.nextInt();
        int i=sayi/2;
        int a=asal(sayi,i);
        if (a==1){
            System.out.println(sayi+" sayisi asaldir");
        }else {
            System.out.println(sayi+" sayisi asal değildir");
        }

    }
}

