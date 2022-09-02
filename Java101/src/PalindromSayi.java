public class PalindromSayi {
    static boolean isPalindrom(int numberr){
        String palidrom=" BİR POLİDROM SAYIDIR";
        String palidromDegil=" BİR POLİDROM SAYI DEGİLDİR";
        int temp= numberr,reversNumber=0,lastNumber;
        while (temp!=0){
            lastNumber=temp%10;
            reversNumber=(reversNumber*10)+lastNumber;
            temp/=10;
        }
        if (numberr == reversNumber) {
            System.out.println(numberr+palidrom);
            return true;
        }else {
            System.out.println(numberr+ palidromDegil);
            return false;
        }
    }
    public static void main(String[] args) {
        isPalindrom(747);

    }
}
