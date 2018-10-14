
public class ConcreteStrategyCustomerReceipt implements Strategy
{
   
    public ConcreteStrategyCustomerReceipt()
    {
     
    }

    public void printDescription(Burger order,int i){
        System.out.println("-------------------------------------");
        System.out.println("Chef's Receipt");
        System.out.println("-------------------------------------");
        order.printDescription(i);
        System.out.println("-------------------------------------");
    }
}
