
import java.text.DecimalFormat;
public class Fries extends Leaf
{
    private double price;
    private int quantity;
    private int size;
    
    public Fries(String description, int size, int quantity)
    {
        super(description);
        this.size = size;
        this.quantity = quantity;
        this.setPrice();
    }

    private void setPrice(){
        switch(this.size){
            case 1:
            this.price = 2.79;
            break;
            case 2:
            this.price = 3.39;
            break;
            case 3:
            this.price = 5.59;
            break;
            default:
            this.price = 0.00;
        }
    }

    public void printDescription() {
        DecimalFormat fmt = new DecimalFormat("0.00");
        System.out.println("\n "+quantity+" "+ description + " " + fmt.format(getPrice()));

    }

    public double getPrice(){
        return this.price * this.quantity;
        
    }

}