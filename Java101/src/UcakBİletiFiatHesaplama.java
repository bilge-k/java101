import java.util.Scanner;

public class UcakBİletiFiatHesaplama {
    public static void main(String[] args) {
        int yas,yolculukTipi;
        float kmYol,ilkTutar,ilkIndirimliTutar  ,ikinciIndirimliTutar ,mesafeBasınaUcret=0.10f,indirim;
        boolean isError= false;
        String hataMesajı="Hatalı Veri Girdiniz !";

        Scanner input=new Scanner(System.in);

        System.out.println("Uçuş Mesafesfesini km cinsinden giriniz: ");
        kmYol= input.nextFloat();

        System.out.println("Yaşınızı giriniz: ");
        yas=input.nextInt();

        System.out.println("Yolculuk tipinizi seçiniz\n1-Tek Yön\n2-Çift Yön\n->");
        yolculukTipi=input.nextInt();

        ilkTutar=kmYol*mesafeBasınaUcret;

        if ((kmYol>0)&&(yas>0)) {
            if ((yolculukTipi ==1)||(yolculukTipi==2)) {
                if (yas<12){
                    ilkIndirimliTutar=ilkTutar*0.5f;
                } else if ((yas>=12)&&(yas<=24)) {
                    indirim=ilkTutar*0.1f;
                    ilkIndirimliTutar=ilkTutar-indirim;
                } else if (yas>65) {
                    indirim=ilkTutar*0.3f;
                    ilkIndirimliTutar=ilkTutar-indirim;
                } else{
                    ilkIndirimliTutar=ilkTutar;
                }
                if (yolculukTipi == 2) {
                    indirim=ilkIndirimliTutar*0.2f;
                    ikinciIndirimliTutar=(ilkIndirimliTutar-indirim)*2;
                    System.out.println("Biletinizin fiyatı: "+ikinciIndirimliTutar);
                }else {

                    ikinciIndirimliTutar=ilkTutar;
                    System.out.println("Biletinizin fiyatı: "+ikinciIndirimliTutar);
                }


            }else {
                isError=true;
            }
            
        }else {
            isError=true;
        }

        if (isError == true) {
            System.out.println(hataMesajı);
        }


    }
}
