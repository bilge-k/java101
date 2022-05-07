import java.util.Scanner;

public class TekSayiGireneKadarGirisiKabulEtmeyenProgram {
    public static void main(String[] args) {
        int sayi, toplam=0;


        do {
            Scanner input = new Scanner(System.in);
            System.out.println("Sayı giriniz:");
            sayi = input.nextInt();
            if (sayi % 4 == 0) {
                toplam += sayi;
            }
        } while (sayi % 2 == 0);

        System.out.println("Toplam:" + toplam);
    }


}

