package Day1_Condicitons_Loops;

import java.util.Arrays;

public class Array_List {
    public static void main(String[] args) {

        String[] sehirler1 = new String[]{"Ankara", "Istanbul", "Izmir"};
        String[] sehirler2 = new String[]{"Antep", "Diyarbakir", "Urfa","Van"};

        sehirler1=sehirler2;
        sehirler1[0] = "adana";
        System.out.println(sehirler2[0]);
        System.out.println(Arrays.toString(sehirler1)); //[null, null, null, Ankara]
//Normalde yazmasini bekledigimiz deger antep olmali
        // fakat sehirler1 in referansini sehirler2 nin referansina yani ayni referansa esitledigimiz icin
        // sehirler 1 de yaptigimiz degisiklik ayni referansa bagli olan sehirler 2 yi de etkileyecektir.
        // 0 indexi de dolayisiyla Adana olacaktir.



        sehirler1 = new String[4]; // Heap memory de ust arrayi tutmuyor artik
        sehirler1[3] = "Ankara";
        System.out.println(sehirler1[3]);
        /*
        Stack memory deki Sehirler arrayine ustte yeni bir new array atamasi yaptik,
        bu arrayin[3] indexine atama yaptigimiz icin olusan yeni arrayin atanan elemani sadece  o degeri verri gerisi null degerini verir.
        garbage collecorde ust ilk atanan arrayi heap memory den toplar
         */
        System.out.println(sehirler1[1]);
        System.out.println(Arrays.toString(sehirler1)); //[null, null, null, Ankara]


        int s1=10;
        int s2=20;
        s1=s2;
        s2=30;
        System.out.println(s1); // En son ne aldiysa odur.
        // Value types: Boolean int double float hersey stack memory de oluyor
        // Reference Types: array, class, abstract, interface
    }
}