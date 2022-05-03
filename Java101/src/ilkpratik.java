import java.util.Scanner;

public class ilkpratik {
    public static void main(String[] args) {
     int mat,fizik,kimya,turkce,tarih,müzik;
     Scanner input= new Scanner(System.in);
        System.out.println("Math notunuzu giriniz:") ;
        mat=input.nextInt();
        System.out.println("Fizik notunuzu giriniz:") ;
        fizik=input.nextInt();
        System. out.println("Kimya notunuzu giriniz:") ;
        kimya=input.nextInt();
        System.out.println("Türkçe notunuzu giriniz:") ;
        turkce=input.nextInt();
        System.out.println("Tarih notunuzu giriniz:") ;
        tarih=input.nextInt();
        System.out.println("Müzik notunuzu giriniz:") ;
        müzik=input.nextInt();
        int toplam=mat+fizik+kimya+turkce+tarih+müzik;
        float ortalama=toplam/6;
        System.out.println("Ortalamanız: "+ortalama);
        boolean gecmeNotu=ortalama>=60;

        String gecis= gecmeNotu? "Sınıfı geçtiniz":"Sınıfta kaldınız";
        System.out.println(gecis);


    }
}
