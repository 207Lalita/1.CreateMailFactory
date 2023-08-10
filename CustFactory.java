public class CustFactory {
    public static Customer createCustomerType(String type) {
        switch(type) {
            case "Regular":
                return new RegularCustomer();
            case "Mountain":
                return new MountainCustomer();
            case "Delinquent":
                return new DelinquentCustomer();
                
            }
        return null;
    }
}
    
