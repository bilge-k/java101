import java.util.Scanner;

public class Daire {
    public static void main(String[] args) {
        float yariCap,cevre,pi= 3.14f;
        double merkezAcisi,alan;
        Scanner input =new Scanner(System.in);
        System.out.println("Dairenin yarıçapını giriniz: ");
        yariCap=input.nextFloat();
        System.out.println("Dairenin merkez açısını giriniz: ");
        merkezAcisi=input.nextDouble();
        cevre=2*pi*yariCap;
        alan=(pi*(yariCap*yariCap)*merkezAcisi)/360;
        System.out.println("Çecre: "+cevre);
        System.out.println("Alan: "+alan);

    }
}
