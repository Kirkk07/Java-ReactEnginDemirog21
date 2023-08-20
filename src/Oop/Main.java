package Oop;

public class Main {
    public static void main(String[] args){
        Product product1=new Product(1,"Lenovo V14",15000,"16 GB RAM",12); // ornek olusturma Referans olusturma Instance creation.
        //Persestancy kalici olarak saklama veri tabninda tutmaya denir.
        // Su an bu bilgiler on bellekte calistirdikca gelir ancak word exel database a atmaya da persistancey kalici olarak tutma

        Product product2=new Product();
        product2.setId(2);
        product2.setName("Lenovo V15");
        product2.setDetail("16 Gb Ram");
        product2.setDiscount(50);
        product2.setUnitPrice(16000);
        System.out.println(product2.getUnitPriceAfterDiscount());


        // genelde boyle kullanilmaz
        Product product3=new Product();



        Product[] products={product1,product2,product3};

        /*for (Product product: products) {
            System.out.println(product.name);
        }
        System.out.println(products.length);*/

        Category category1=new Category();
        category1.setId(1);
        category1.setName("Bilgisayar");
        Category category2=new Category();
        category2.setId(2);
        category2.setName("Ev/Bahce");
        Category[] categories={category1,category2};
        for (Category categori: categories) {
            System.out.println(categori.getId()+" "+categori.getName());
        }

        ProductManager_Service productManagerService=new ProductManager_Service();
        productManagerService.addToCart();
        productManagerService.addToCart();
        productManagerService.addToCort(product1);
        productManagerService.addToCort(product2);
        productManagerService.addToCort(product3);
    }
}
