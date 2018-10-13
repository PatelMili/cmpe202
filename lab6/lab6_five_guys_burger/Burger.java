
import java.text.DecimalFormat;
public class Burger extends Composite
{
    private int x;
    private double price;
    private int quantity;
    public double total_amt=0.0;
    public Burger ( String d, int quantity )
    {
        super(d) ;
        this.quantity = quantity;
        setPrice();
    }

    private void setPrice(){
        switch(description){
            case"HB":
            this.price = 6.39;
            break;
            case"CB":
            this.price = 7.19;
            break;
            case"BB":
            this.price = 7.19;
            break;
            case"BCB":
            this.price = 7.79;
            break;
            case"LHB":
            this.price = 4.59;
            break;
            case"LCB":
            this.price = 5.29;
            break;
            case"LBB":
            this.price = 5.59;
            break;
            case"LBCB":
            this.price = 6.19;
            break;
            default:
            this.price = 0.00;
        }
    }

    public void printDescription() {
        DecimalFormat fmt = new DecimalFormat("0.00");
        System.out.println( "\n " + quantity + " " + description + " " + fmt.format(getPrice()) + "\n");
        for (Component obj  : components)
        {
            obj.printDescription();
        }
    }

    public double getPrice() {
        return this.quantity*this.price;

    }

    public double total(){
        for (Component obj  : components)
        {
            total_amt= this.getPrice()+obj.getPrice();
        }
        return total_amt;
    }

}
