import java.util.Scanner;

public class HesapMakinesi {
    public static void main(String[] args) {
        int sayi1,sayi2,secim;

        Scanner input=new Scanner(System.in);

        System.out.println("Birinci sayıyı giriniz: ");
        sayi1=input.nextInt();

        System.out.println("2.sayıyı giriniz: ");
        sayi2=input.nextInt();

        System.out.println("1-toplama\n2-çıkarma\n3-çarpma\n3-bölme");
        secim=input.nextInt();
        switch (secim){
            case 1:
                secim=sayi1+sayi2;
                System.out.println("Toplama işleminin sonucu: "+secim);
                break;
            case 2:
                secim=sayi1-sayi2;
                System.out.println("Çıkarma işleminin sonucu: "+secim);
                break;
            case 3:
                secim=sayi1*sayi2;
                System.out.println("Çarpma işleminin sonucu: "+secim);
                break;
            case 4:
                secim=sayi1/sayi2;
                System.out.println("Bölme işleminin sonucu: "+secim);
                break;
            default:

        }




    }
}
