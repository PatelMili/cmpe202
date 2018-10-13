
public class ConcreteStrategyCustomerReceipt implements Strategy
{
   
    public ConcreteStrategyCustomerReceipt()
    {
     
    }

    public void printDescription(Composite order){
        System.out.println("\nChef's Receipt\n");
        System.out.println("-------------------------------------");
        order.printDescription();
        System.out.println("-------------------------------------");
    }
}
