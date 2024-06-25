package ATM;

public class Hesap {
 
    
    private String isim;
    private String parola;
    private double bakiye;

    
    public Hesap(String isim, String parola, double bakiye) {
        this.isim = isim;
        this.parola = parola;
        this.bakiye = bakiye;
    }

    public void paraYatir(int tutar){

        bakiye += tutar;
        System.out.println("Güncel Bakiyeniz: " + bakiye);
    }

    public void paraCek(int tutar){
        if(tutar > bakiye){
            System.out.println("Yetersiz Bakiye");

        }else{
            bakiye -= tutar;
            System.out.println("Güncel Bakiyeniz: " + bakiye);

        }
    }

    public String getIsim() {
        return isim;
    }


    public void setIsim(String isim) {
        this.isim = isim;
    }


    public String getParola() {
        return parola;
    }


    public void setParola(String parola) {
        this.parola = parola;
    }


    public double getBakiye() {
        return bakiye;
    }


    public void setBakiye(double bakiye) {
        this.bakiye = bakiye;
    }

}
