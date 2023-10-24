package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Product product1 = new Product();
        product1.setName("Delogi Kahve Makinesi");
        product1.setUnitPirce(7500);
        product1.setDiscount(7);
        product1.setUnitsInStock(3);
        product1.setImgUrl("imege.jpg");


        Product product2 = new Product();
        product2.setName("Smeg Kahve Makinesi");
        product2.setUnitPirce(7500);
        product2.setDiscount(7);
        product2.setUnitsInStock(3);
        product2.setImgUrl("imege2.jpg");


        Product product3 = new Product();
        product3.setName("Kitchen Kahve Makinesi");
        product3.setUnitPirce(7500);
        product3.setDiscount(7);
        product3.setUnitsInStock(3);
        product3.setImgUrl("imege3.jpg");


        Product[] products ={product1,product2,product3};

        for (Product productLoop :products){

            System.out.println(productLoop.getName());
        }

        IndividualCustomer individualCustomer = new IndividualCustomer();
        individualCustomer.setId(1);
        individualCustomer.setPhone("123456789");
        individualCustomer.setCustomerNumber("12345");
        individualCustomer.setFirstName("Yunus Emre");
        individualCustomer.setLastName("Cenan");

        CorporateCustomers corporateCustomers = new CorporateCustomers();
        corporateCustomers.setId(2);
        corporateCustomers.setCompanyName("Tobeto");
        corporateCustomers.setPhone("05333333333");
        corporateCustomers.setTaxNumber("1111111111");
        corporateCustomers.setCustomerNumber("54321");

        Customer [] customers ={individualCustomer,corporateCustomers};



    }
}