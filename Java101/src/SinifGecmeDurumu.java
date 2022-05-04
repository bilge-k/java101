import java.util.Scanner;

public class SinifGecmeDurumu {
    public static void main(String[] args) {
        int mat,fizik,turkce,kimya, muzik,toplam = 0;

        Scanner input=new Scanner(System.in);

        System.out.println("Mat notunuzu giriniz:");
        mat=input.nextInt();
        if (mat <= 100 && mat >= 0)
            toplam += mat;

        System.out.println("fizik notunuzu giriniz:");
        fizik=input.nextInt();
        if (fizik <= 100 && fizik >= 0)
            toplam += fizik;

        System.out.println("türkçe notunuzu giriniz:");
        turkce=input.nextInt();
        if (turkce <= 100 && turkce >= 0)
            toplam += turkce;

        System.out.println("kimya notunuzu giriniz:");
        kimya=input.nextInt();
        if (kimya <= 100 && kimya >= 0)
            toplam += kimya;

        System.out.println("müzik notunuzu giriniz:");
        muzik=input.nextInt();
        if (muzik <= 100 && muzik >= 0)
            toplam += muzik;

        float ortalama=toplam/5;

        if(ortalama<55){
            System.out.println("Sınıfta Kaldınız!!!");
        }else {
            System.out.println("Tebrikler geçtiniz");
        }

        System.out.println("Ortalamanız: "+ortalama);



    }
}
