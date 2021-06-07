package denisenko.homeTask15;

import java.util.Date;

public class Customer{

    private final String name;
    private final String location;

    Customer(String name, String location){
        this.name = name;
        this.location = location;
    }

    public void sendOrder(){
        Order newOrder = new NormalOrder(new Date());
    }

    public void receiveOrder(){

    }

}
