import java.util.Scanner;

public class CustomerMailApplication {
    

    public static void main(String[] args) {

        Customer cus = CustFactory.createCustomerType("Regular");
        System.out.println(cus.createMail());      
        }
}



