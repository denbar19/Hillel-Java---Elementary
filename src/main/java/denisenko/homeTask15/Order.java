package denisenko.homeTask15;

import java.util.Date;

public abstract class Order {

    protected final Date date;
    protected String number = "0";

    protected Order(Date date) {
        this.date = date;
        this.number = String.valueOf(Integer.parseInt(this.number) + 1);
    }

    public void confirm(){

    }

    public void close(){

    }

}
