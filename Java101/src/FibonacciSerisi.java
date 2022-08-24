public class FibonacciSerisi {
    public static void main(String[] args) {
        int a=0,b=1 ,toplam;

        for (int i = 0; i <10 ; i++) {
            toplam=a+b;
            a=b;
            b=toplam;
            System.out.println(" "+toplam);

        }
    }
}
