package utility;

public class RegCustomer extends Customer {
     
    public double giveDiscount(double price) {
    	double discount=(double)price*0.95;
    	return discount;
    }
}
