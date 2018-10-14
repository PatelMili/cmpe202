
import java.text.DecimalFormat;
import java.util.ArrayList;
public class Burger extends Composite
{
    private int x;
    private double price;
    private int quantity;
    public double total_amt=0.0;
    public ArrayList<Component> component_sub = new ArrayList<Component>()  ;

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

    public void printDescription(int i) {
        DecimalFormat fmt = new DecimalFormat("0.00");
        int flag=0;

        System.out.println( "\n " + quantity + " " + description + " " + fmt.format(getPrice()) + "\n");
        if(i==1){

            for (Component obj  : components)
            {

                //System.out.println("classes name is"+obj.getClass().getName());

                if(obj.getClass().getName().equalsIgnoreCase("Bacon")){
                    flag=1;
                    obj.printDescription();
                }
            }
            //component_sub.get(0).printDescription(1);
            for (Component obj  : components)
            {
                
                if(!obj.getClass().getName().equalsIgnoreCase("Bacon")){
                     obj.printDescription();
                }else{
                    //System.out.println("here");
                   
                }
            }

        }else if(i==2){

            for (Component obj  : components)
            {
                obj.printDescription();
            }

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
