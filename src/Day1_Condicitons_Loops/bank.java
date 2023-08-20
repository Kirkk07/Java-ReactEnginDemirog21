package Day1_Condicitons_Loops;

import java.util.ArrayList;

public class bank {
    //SOLID
    //O harfi yazilimia yeni bir talep gelirse mevcut kodlarinizin degismemsi gerekir
    public static void main(String[] args){
  // //     CreditManager creditManager =new CreditManager();
  //      creditManager.calculate();
  //      creditManager.add();
        MortgageManager mortgageManager=new MortgageManager();
   //     mortgageManager.add();
   //     mortgageManager.add();
        ArrayList<CreditManager> credits= new ArrayList<CreditManager>();
        credits.add(new MemurKredisi());
        credits.add(new vehickeManager());
        credits.add(new MortgageManager());
     //   CreditManager[] credits=new CreditManager[3];
     //   credits[0]=new MortgageManager();
     //   credits[1]=new vehickeManager();
     //   credits[2]=new MemurKredisi();
        for (CreditManager credit: credits){
             credit.calculate();

        }
     }
}
