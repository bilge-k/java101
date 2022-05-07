import java.util.Scanner;

public class GirilenSayiyaKadar4ve5KuvvetleriniBulma {
    public static void main(String[] args) {
        int sayi;
        Scanner input=new Scanner(System.in);
        System.out.println("Bir sayı giriniz: ");
        sayi= input.nextInt();
        for (int i = 1; i <sayi ; i*=4) {
            System.out.println(i+" 4'ün kuvvetidir");

        }
        for (int j = 1; j <sayi ; j*=5) {
            System.out.println(j+" 5!in kuvvetidir");

        }
    }
}
