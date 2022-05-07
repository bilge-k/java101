import java.util.Scanner;

public class GirilenSayının3ve4TamBölünenSayilarininOrtalaması {
    public static void main(String[] args) {
        int sayi,j = 0;
        Scanner input=new Scanner(System.in);
        System.out.println("bir sayı giriniz: ");
        sayi=input.nextInt();
        int toplami = 0,sayaci=0,toplam=0,sayac=0;


        for (int i = 0; i < sayi; i++) {
            if ((i%3==0)&&(i%4==0)) {
                System.out.println(i);
                toplami+=i;
                sayaci++;
            }


        }
        float sonuci= (toplami/sayaci);
        System.out.println("sonuc: "+sonuci);

        System.out.println("-----------------");
       while (j<sayi){
           if ((j%3==0)&&(j%4==0)) {
               System.out.println(j);
               toplam+=j;
               sayac++;
           }
           j++;

       }
        float sonuc= (toplam/sayac);
        System.out.println("sonuc: "+sonuc);


    }

}
