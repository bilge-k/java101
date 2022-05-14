import java.util.Scanner;

public class YildizlarİleElmas {
    public static void main(String[] args) {
        Scanner klavye = new Scanner(System.in);
        System.out.println("Bir Sayı Giriniz :");
        int n = klavye.nextInt();

        for (int i = 0; i <= n ; i++) {
            for (int j = 0; j < (n - i); j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i + 1); k++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }

        for (int m = n-1; m >=-1; m--) {
            for (int s = 1; s <=n-m; s++) {
                System.out.print(" ");
            }
            for (int a = (2*m); a >=0; a--) {
                System.out.print("*");

            }
            System.out.println(" ");
        }

    }
}
