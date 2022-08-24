import java.util.Scanner;

public class TersUucgen {
    public static void main(String[] args) {
        int sayi;
        Scanner input =  new Scanner(System.in);

        System.out.println("Bir sayı giriniz: ");
        sayi= input.nextInt();
        for (int m = sayi-1; m >=-1; m--) {
            for (int s = 1; s <=sayi-m; s++) {
                System.out.print(" ");
            }
            for (int a = (2*m); a >=0; a--) {
                System.out.print("*");

            }
            System.out.println(" ");
        }
    }
}
