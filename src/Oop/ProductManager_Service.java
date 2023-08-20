package Oop;

public class ProductManager_Service {
    public void addToCart(){
        System.out.println("Sepete ekleme kodu cagirildi");
    } public void addToCort(Product product){
        System.out.println( product.getName()+" "+ product.getUnitPrice()+ " " +" Eklendi");
    }


}
