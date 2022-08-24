import java.util.Scanner;

public class MukemmelSayiSorgulama {
    public static void main(String[] args) {
        int girilenSayi,toplam=0;
        Scanner input = new Scanner(System.in);

        System.out.println("Bir sayı giriniz :");
        girilenSayi= input.nextInt();
        for (int i = girilenSayi-1; i >=1 ; i--) {
            if (girilenSayi%i==0){
                toplam+=i;
            }

        }
        if (toplam==girilenSayi){
            System.out.println(girilenSayi +" Bir mükemmel sayıdır.");
        }else {
            System.out.println(girilenSayi+" Bir mükemmel sayi değildir.");
        }
    }
}
