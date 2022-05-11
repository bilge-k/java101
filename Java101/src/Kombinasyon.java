import java.util.Scanner;

public class Kombinasyon {
    public static void main(String[] args) {
        int n,r,total=1,total1=1,total2=1;
        Scanner input=new Scanner(System.in);

        System.out.println("n'i giriniz: ");
        n= input.nextInt();
        System.out.println("r'yi giriniz: ");
        r= input.nextInt();

        for (int i = 1; i <=n ; i++) {
            total=total*i;
        }
        System.out.println(total);
        for (int j = 1; j <=r ; j++) {
            total1=total1*j;
        }
        System.out.println(total1);
        for (int x = 1; x <= (n-r); x++) {
            total2=total2*x;
        }


        float c=total/(total1*total2);
        System.out.println(n+"'li "+r+"'li kombinasyonu: "+c);

    }
}
