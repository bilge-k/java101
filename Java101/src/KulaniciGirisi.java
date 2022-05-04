import java.util.Scanner;

public class KulaniciGirisi {
    public static void main(String[] args) {
        String userName,password;

        Scanner input=new Scanner(System.in);
        System.out.println("Kullanıcı adınızı giriniz: ");
        userName=input.nextLine();

        System.out.println("Şifrenizi giriniz: ");
        password=input.nextLine();

        if(userName.equals("patika")&&password.equals("java123")){
            System.out.println("Sisteme giriş yaptınız!");
        }else {
            System.out.println("Şifre veya kullanıcı adı yanlış");
            System.out.println("Şifrenizi sıfırlamak ister misiniz?  ");
            System.out.println("1-sıfırla 2-sıfırlama  ");
            int secim;
            secim=input.nextInt();
            switch (secim){
                case 1:

                    System.out.println("Yeni bir şifre giriniz: "+input.nextLine());
                    String newPassword  = input.nextLine();

                    if(newPassword.equals("java123")||newPassword.equals(password)){
                        System.out.println("Şifreniz oluşturulamadı");
                    }else {
                        System.out.println("Şifreniz başarı ile oluşturuldu");
                        password=newPassword;
                    }
                    break;
                case 2:
                    System.out.println("Şifrenizi sıfırlamak istemediniz!");
            }

        }


    }
}
