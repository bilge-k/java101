import java.util.Scanner;

public class VucutKitleIndexi {
    public static void main(String[] args) {
        float kilo,boy,mBoy,vucutKitleIndexi;
        Scanner input=new Scanner(System.in);

        System.out.println("Kionuzu giriniz:");
        kilo=input.nextFloat();

        System.out.println("Boyunuzu metre cinsinden giriniz:");
        boy=input.nextFloat();

        vucutKitleIndexi= (kilo/(boy*boy));
        System.out.println("Vücut kitle endeksiniz: "+vucutKitleIndexi);

    }
}
