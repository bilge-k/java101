import java.util.Scanner;

public class Recursive5Cıkarma5Ekleme {
    static void desen(int number) {

        System.out.print(number + " ");
        if (number <= 0) {
            return;
        }
        desen(number-5);
        System.out.print(number + " ");
    }
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        System.out.print("Bir sayı giriniz : ");
        int number = inp.nextInt();
        desen(number);
    }
}
