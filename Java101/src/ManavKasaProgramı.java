import java.util.Scanner;

public class ManavKasaProgramı {
    public static void main(String[] args) {
        float armut,elma ,domates,muz,patlıcan,toplam;
        float armutKgFiat=2.14f,elmaKgFiat=3.67f,domatesKgFiat=1.11f,muzKgFiat=0.95f,patlıcanKgFiat=5.00f;
        float armutFiat,elmaFiat,domatesFiat,domatesfiat,muzFiat,patlıcanFiat;

        Scanner input=new Scanner(System.in);

        System.out.println("Kaç kilogram armut aldığınızı giriniz: ");
        armut=input.nextFloat();
        armutFiat=armut*armutKgFiat;

        System.out.println("Kaç kilogram elma aldığınızı giriniz: ");
        elma=input.nextFloat();
        elmaFiat=elma*elmaKgFiat;

        System.out.println("Kaç kilogram domates aldığınızı giriniz: ");
        domates=input.nextFloat();
        domatesFiat=domates*domatesKgFiat;

        System.out.println("Kaç kilogram muz aldığınızı giriniz: ");
        muz=input.nextFloat();
        muzFiat=muz*muzKgFiat;

        System.out.println("Kaç kilogram patlıcan aldığınızı giriniz: ");
        patlıcan=input.nextFloat();
        patlıcanFiat=patlıcan*patlıcanKgFiat;

        toplam=armutFiat+elmaFiat+domatesFiat+muzFiat+patlıcanFiat;
        System.out.println("Ödenecek toplam tutar: "+toplam);
    }
}
