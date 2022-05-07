import java.util.Scanner;

public class GirilenSayiyaKadarOlan4ve5inKatları {
    public static void main(String[] args) {
        int  sayi;
        Scanner input=new Scanner(System.in);
        System.out.println("Bir sayı giriniz: ");
        sayi=input.nextInt();

        for (int i = 1; i <=sayi ; i++) {
            if (i%4==0) {
                System.out.println(i+" 4'ünkatı.");
            } else if (i%5==0) {
                System.out.println(i+" 5'in katı.");
            }

        }
    }
}
