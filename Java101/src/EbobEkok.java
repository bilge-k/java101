import java.util.Scanner;

public class EbobEkok {
    public static void main(String[] args){
    int ebob=1,ekok,n1,n2,i=1;
    Scanner input=new Scanner(System.in);
    String ıstek1="1.sayıyı giriniz:";
    String ıstek2="2.sayıyı giriniz:";

    System.out.println(ıstek1);
    n1=input.nextInt();

    System.out.println(ıstek2);
    n2=input.nextInt();


    while (i<=n1 && i<=n2){
        if(n1%i==0&&n2%i==0){
            ebob=i;}
        i++;
        }
    System.out.println("ebob= "+ebob);
    ekok=(n1*n2)/ebob;
        System.out.println("ekok= "+ekok);

}
}
