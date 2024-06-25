package ATM;

import java.util.Scanner;

public class Login {
 
    public boolean login(Hesap hesap){
        
        Scanner scan = new Scanner(System.in);
        String k_Adi, k_Parola;

        System.out.println("Kullanici Adi: ");
        k_Adi = scan.nextLine();

        System.out.println("Parola: ");
        k_Parola = scan.nextLine();

        if(hesap.getIsim().equals(k_Adi) && hesap.getParola().equals(k_Parola)){

            return true;

        }else if(hesap.getIsim().equals(k_Adi) && ! hesap.getParola().equals(k_Parola)){

            return false;

        }else if(! hesap.getIsim().equals(k_Adi) && hesap.getParola().equals(k_Parola)){

            return false;

        }else{

            return false;

        }
        
 }
    
}