package Day1_Condicitons_Loops;

public class ArrayList2 {
    public static void main(String[] args){
        int[ ]sayilar=new int[]{1,2,3,4,5,6};
        Product product1=new Product();

        product1.setName("Laptop");
        System.out.println(product1.getName());
        Product product2=new Product();
        product2.setName("Mouse");
        System.out.println(product2.getName());


        Product[] urunler= new Product[]{ product1, product2};

        for (int i=0; i< urunler.length;i++){
            System.out.println(urunler[i].getName());
        }

    }
}
