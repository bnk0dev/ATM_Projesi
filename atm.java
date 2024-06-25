package ATM;

import java.util.Scanner;

public class atm {
    public void calis(Hesap hesap){
        Scanner scan = new Scanner(System.in);
        Login Login = new Login();

        int giris_Hakki = 3;
        
        System.out.println("BANKAMIZA HOSGELDİNİZ....");

        
        while(true){
            if(Login.login(hesap)){
                System.out.println("Giris Basarili...");
                break;
            }else{
                System.out.println("Giris basarisiz. Kalan Giris Hakki: " + --giris_Hakki);

            }

            if(giris_Hakki == 0){
                System.out.println("Giris Hakkiniz Bitti...");

                return;
            }
        }

        System.out.println("************************************************");
        String i = "(1) - Bakiye Ogrenme\n"
                    +"(2) - Para Yatirma\n"
                    +"(3) - Para Cekme\n"
                    +"(4) - Parola Degistirme\n"
                    +"(q) - Hesaptan Cikis Yap";

        System.out.println(i);
        System.out.println("************************************************");

        while(true){
            System.out.println("Isleminizi Seciniz...");
            String islem = scan.nextLine();

            if(islem.equals("q")){
                break;
            }else if(islem.equals("1")){

                System.out.println("Bakiyeniz: " + hesap.getBakiye());
                
            }else if(islem.equals("2")){

                System.out.println("Yatirmak istedginiz Tutar: ");
                int tutar = scan.nextInt();
                scan.nextLine();
                hesap.paraYatir(tutar);


            }else if(islem.equals("3")){

                System.out.println("Cekmek Istediginiz Tutari Giriniz: ");
                int tutar = scan.nextInt();
                scan.nextLine();
                hesap.paraCek(tutar);
            }else{                          
                System.out.println("Gecersiz Islem Tuslamasi...");
            }
            
        }

    scan.close();

    }

}
