package Sklep.CustomerData;

public class Customer {

    protected String userShoeSize;
    protected String userName;
    protected Payout userPayout = new Payout();
    protected Payment userPayment = new Payment();
    protected Address userAddress = new Address();
    protected Offer userOffer = new Offer();
    protected Order userOrder = new Order();



    public void displayOrders(){

    }
    public void displayAccount(){

    }
    public void changePassword(){

    }
    public void changeShoeSize(){

    }
    public boolean signUp(String userEmail, String userName, String password, Address userAddress){

        return true;
    }
}
