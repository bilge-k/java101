public class ArmstrogSayiBulma3Basamaklı {
    public static void main(String[] args) {
      for (int i = 1; i <= 299; i++) {

            int basNumber=0,tempNumber=i,basValue,result=0,basPow;
            while (tempNumber!=0){
                tempNumber/=10;
                basNumber++;
            }
            tempNumber=i;
          while (tempNumber != 0) {
              basValue = tempNumber % 10;

              basPow = 1;
              for (int j = 1; j <= basNumber; j++) {
                  basPow *= basValue;
              }
              result += basPow;
              tempNumber /= 10;

          }
          if (result == i) {
              System.out.println(i + " sayısı bir Armstrong sayıdır.");
          } else {
              System.out.println(i + " sayısı bir Armstrong sayısı değildir.");
          }
      }

    }
}
