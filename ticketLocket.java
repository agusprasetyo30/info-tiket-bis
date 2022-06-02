package Locket;

public class ticketLocket {
    private Customer[] customer;
    private int amountCustomer;
    private int customerId=0;
    
    public ticketLocket(){
        customer = new Customer[10];
        amountCustomer=0;
    }
    public void addCustomer(String username, String password){
        int i = amountCustomer++;
        customer[i] = new Customer (username, password);
    }
    public void addCustomer(String username, String password, String phone){
        int i = amountCustomer++;
        customer[i] = new Customer (username, password);
    }
    public int getAmountCustomer(){
        return amountCustomer;
    }
    public void logout(){
        customer[customerId].logout();
        customerId=0;
    }
    public Customer loginCustomer(String username, String password){
        for(int i=0; i<amountCustomer;i++){
            if(customer[i].login(username,password)){
                customerId=i;
                return customer[i];
            }
        }
        customerId=0;
        return customer[0];
    }
    public Customer getCustomer(int indeks){
        if(indeks<amountCustomer)
            return customer[indeks];
        else return customer[0];
    }
    public int getCustomerId(){
        return customerId;
    }
}
