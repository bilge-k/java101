import java.util.Scanner;

public class UsluSayıHesaplama {
    public static void main(String[] args) {
        float n,k;
        Scanner input=new Scanner(System.in);

        System.out.println("Üssü alınacak sayıyı girin: ");
        n=input.nextFloat();

        System.out.println("Üs olacak sayıyı girin: ");
        k=input.nextFloat();
         float total=1;
        for (int i = 1; i <= k; i++) {
            total*=n;

            
        }
        System.out.println("SONUÇ: "+total);

    }
}
