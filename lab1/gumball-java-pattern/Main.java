

public class Main {

    public static void main(String[] args) {
        
        int arr1[] ={25};
        int arr2[] ={25,25};
        int arr3[]= {25,10,10,5};
        GumballMachine gumballMachine1 = new GumballMachine(5,1);

        System.out.println(gumballMachine1);

        gumballMachine1.insertQuarter(arr1);
        gumballMachine1.turnCrank();
        
        
        GumballMachine gumballMachine2 = new GumballMachine(5,2);

        System.out.println(gumballMachine2);

        gumballMachine2.insertQuarter(arr2);
        gumballMachine2.turnCrank();
        
        GumballMachine gumballMachine3 = new GumballMachine(5,3);

        System.out.println(gumballMachine3);

        gumballMachine3.insertQuarter(arr3);
        gumballMachine3.turnCrank();

       // System.out.println(gumballMachine3);

        // gumballMachine.insertQuarter();
        // gumballMachine.turnCrank();
        // gumballMachine.insertQuarter();
        // gumballMachine.turnCrank();

        // System.out.println(gumballMachine);
    // 
}
}
