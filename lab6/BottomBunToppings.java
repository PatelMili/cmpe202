
public class BottomBunToppings extends Leaf
{
    private String[] options ;

    public BottomBunToppings( String description )
    {
        super(description) ;
    }

    public void printDescription(){

        System.out.println(" =>"+description);

    }
    

    public double getPrice(){
        return 0.0;
    }

}