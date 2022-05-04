import java.util.Scanner;

public class Taksimetre {
    public static void main(String[] args) {
        float km,taksimetreAcilisUcreti=10,kmBasinaUcret=2.20f;
        Scanner input=new Scanner(System.in);
        System.out.println("Kaç km gittiğini giriniz: ");
        km=input.nextFloat();
        float odenecekTutar=10+(km*kmBasinaUcret);
   
        int sonOdenecekTutar=odenecekTutar<20? 20: (int) odenecekTutar;
        System.out.println("Ödemeniz gereken ücret: "+sonOdenecekTutar);

    }
}
