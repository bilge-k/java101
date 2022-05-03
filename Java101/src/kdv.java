import java.util.Scanner;

public class kdv {
    public static void main(String[] args) {
        float tutar,kdvOrani=0.18f,kdvOrani2=  0.08f;
        Scanner input=new Scanner(System.in);
        System.out.println("ürün fiyatını yazınız");
        tutar=input.nextFloat();
        float tutar1= tutar*kdvOrani;
        float sonFiat= tutar+tutar1;
        float tutar2=tutar*kdvOrani2;
        float sonFiat1=tutar+tutar2;
        System.out.println(tutar2);
        boolean kosul=tutar>1000;
        String sonFiat2= String.valueOf(kosul? sonFiat1:sonFiat);
        System.out.println("Son fiat: "+sonFiat2);



    }
}
