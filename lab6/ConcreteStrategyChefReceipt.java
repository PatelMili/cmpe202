import java.text.DecimalFormat;

public class ConcreteStrategyChefReceipt implements Strategy
{
    
    private int x;
      double ans ;

    
    public ConcreteStrategyChefReceipt()
    {
        
    }

    public void printDescription(Burger order,int i){
        System.out.println("-------------------------------------");
        System.out.println("Bill receipt for customer");
        System.out.println("-------------------------------------");
        DecimalFormat fmt = new DecimalFormat("$0.00");
        order.printDescription(i);
        ans = order.total();
        System.out.println("  Sub. Total:\t\t" + fmt.format(ans));
        System.out.println("-------------------------------------");
    }
}
