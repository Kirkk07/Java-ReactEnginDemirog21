package Day1_Condicitons_Loops;

public class Loops_Exercise {
    public static void main(String[] args){
        int [] sayilar=new int[]{1,2,4,5,6,9,8,7,3};
        int searchedNum=11;
        boolean varmi=checkNum(sayilar,searchedNum);
        System.out.println(message(varmi,searchedNum));

    }
    public static boolean checkNum(int[] arr,int num){
        boolean flag=false;
        for (int nums:arr) {
            if (nums==num){
                flag=true;
                break;
            }
        }
        return flag;
    }
    public static String message(boolean varmi,int num ){
        String mesaj="";
        if (varmi){
            mesaj=("Arananan "+num+" Arrayde Var");
        }else{
           mesaj=("Arananan "+num+" Arrayde Yok");
        }
        return mesaj;
    }


}
