import java.util.Scanner;

public class HarmonikSeri {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n;
        System.out.println("Bir sayı giriniz: ");
        n= input.nextInt();
        double result=0;
        for (int i = 1; i <=n; i++) {
            result+=(1.0/i);

        }
        System.out.println(n+" Sayısının harmonik seri sonucu "+result);
    }
}
