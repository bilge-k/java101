import java.util.Scanner;

public class HavaSicakligineGoreEtkinlikOnerme {
    public static void main(String[] args) {
        float havaScakligi;
        Scanner input=new Scanner(System.in);
        System.out.println("Hava sıcaklığını giriniz: ");
        havaScakligi=input.nextFloat();
        if(havaScakligi<5){
            System.out.println("kayak yapabilirsiniz");
        }else if(havaScakligi<=15&&havaScakligi>=5){
            System.out.println("sinemaya gidebilirsiniz");
        }else if(havaScakligi<=25&&havaScakligi>=15){
            System.out.println("pikniğe  gidebilirsiniz");
        }else if(havaScakligi>25){
            System.out.println("yüzmeye gidebilirsiniz");
        }




    }
}
