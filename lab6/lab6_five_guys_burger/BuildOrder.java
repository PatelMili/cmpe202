
public class BuildOrder
{
    public static Component getOrder()
    {
        int orderNumber = 0;

        Burger burger = new Burger("LBB", 1);
        TopBunToppings lettuce = new TopBunToppings("LETTUCE");
        TopBunToppings tomato = new TopBunToppings("TOMATO");
        BottomBunToppings gOnion = new BottomBunToppings("G ONION");
        BottomBunToppings jGrilled = new BottomBunToppings("JALA Grilled");
        Bacon bacon = new Bacon("{{{BACON}}}");
        burger.addChild(lettuce);
        burger.addChild(tomato);
        burger.addChild(gOnion);
        burger.addChild(jGrilled);
        burger.addChild(bacon);

        Fries fries = new Fries("LTL CAJ", 1, 1);
        burger.addChild(fries);
        ConcreteStrategyCustomerReceipt customerReceipt = new ConcreteStrategyCustomerReceipt();
        customerReceipt.printDescription(burger);
        ConcreteStrategyChefReceipt chefReceipt = new ConcreteStrategyChefReceipt();
        chefReceipt.printDescription(burger);
        return burger;

    }
}
