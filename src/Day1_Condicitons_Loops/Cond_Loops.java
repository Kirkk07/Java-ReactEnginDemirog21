package Day1_Condicitons_Loops;

public class Cond_Loops {
    public static void main(String[] args){
        String product="Laptop";

        for(int i=0; i<6; i+=2){
            System.out.println(product+" "+i);
        }
        int sayi=2;
        while(sayi<100){
            System.out.println(sayi+" "+product);
            sayi=sayi+50;
        }
        sayi=2;
        do{
            System.out.println("Do While "+product+" "+sayi);
            sayi=sayi+30;
        }while (sayi<100);
        int a =15;
        int b=10;
        int top=0;
        if(a<b){
        for (int i=a;i<=b; i++){

            top=top+i;

        }
        System.out.println("Top "+top);}
        else{
        for (int i=a;i>=b; i--){

            top=top+i;

        }
        System.out.println("Top "+top);}
    }

}
