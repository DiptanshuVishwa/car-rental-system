package customers;

public class Customer {
    private String customer_Id;
    private String name;
    public Customer(String customer_Id,String name){
        this.customer_Id = customer_Id;
        this.name = name;
    }
    public String getCustomerId(){
        return customer_Id;
    }
    public String getName(){
        return name;
    }
}
