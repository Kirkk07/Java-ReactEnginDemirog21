package Day1_Condicitons_Loops;

import java.text.Format;

public class Methods {
    public static void main(String[] args){
        System.out.println("Hi Kirk");
        String[] isim={"Hasan","Daniel","Esma"};
        for (int i=0; i<isim.length;i++){
            giveAmessage(isim[i]);
        }
        Hi();
        calculate();
        add(12,19);
        perc(15,29);
    }
    public static void perc(int sayi1, int sayi2){

        double result = add(sayi1,sayi2)*100/10;
        System.out.println(result);
    }
    public static int add(int sayi1, int sayi2){

        int toplam= sayi1+sayi2;
        System.out.println("Toplam: "+toplam);
        return toplam;
    }
    public static void giveAmessage(String isim){
        System.out.println("Hii " +isim);

    }
    public static void Hi(){
        System.out.println("Hi Kirk Methodu");
        //Onlarca satir oldugunu dusun
    }
    public static void calculate(){
        System.out.println("Already Calculated");
    }
    //DRY - Do Not Repeat Yourself  CLEAN CODE

}
