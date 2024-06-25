package ATM;

public class Main {
 
    
    public static void main(String[] args) {
        
        atm acc1 = new atm();
        Hesap hesap = new Hesap("Jhon", "1", 17002.0);
        
        acc1.calis(hesap); 

        System.out.println("Programdan Cikiliyor...");

    }
}
