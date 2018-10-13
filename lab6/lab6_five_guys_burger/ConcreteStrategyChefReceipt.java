import java.text.DecimalFormat;

public class ConcreteStrategyChefReceipt implements Strategy
{
    
    private int x;
      double ans ;

    
    public ConcreteStrategyChefReceipt()
    {
        
    }

    public void printDescription(Composite order){
        System.out.println("\n\nBill receipt for customer\n");
        System.out.println("-------------------------------------");
        DecimalFormat fmt = new DecimalFormat("$0.00");
        order.printDescription();
        ans = order.total();
        System.out.println("  Sub. Total:\t\t" + fmt.format(ans));
        System.out.println("-------------------------------------");
    }
}
