package Inheritance;

public class Main {
    public static void main(String[] args){
        IndividualCustumer hasan=new IndividualCustumer();
        hasan.customerNumber="12345";
        CooperateCostumer hepsiBurada=new CooperateCostumer();
        hepsiBurada.customerNumber="78910";
        SendikaCustomer sendikaCustomer=new SendikaCustomer();
        sendikaCustomer.customerNumber="99999";
        CustomerManager customerManager=new CustomerManager();
       // customerManager.add(hepsiBurada);
       // customerManager.add(hasan);
       // customerManager.add(sendikaCustomer);
        Customer[] customers={hasan, sendikaCustomer,hepsiBurada};
        customerManager.addMultiple(customers);

    }
}
