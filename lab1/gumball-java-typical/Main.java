

public class Main {

    public static void main(String[] args) {
        
        //second parameter is for model number, 1 is gumball machine type one, 2 is for gumball machine type 2 and 3 is for gumball machine type 3
        
        GumballMachine gumballMachine = new GumballMachine(5,2);

        int []array1= {25};
        int []array2={25,25};  
        int []array3={25,10,10,5};
        //i parameter is machine one, two paramter is machine two[],
        
        
        System.out.println(gumballMachine);

        gumballMachine.insertQuarter( array1 );
        gumballMachine.turnCrank();

        System.out.println(gumballMachine);

        gumballMachine.insertQuarter( array2 );
        gumballMachine.turnCrank();
        gumballMachine.insertQuarter( array3 );
        gumballMachine.turnCrank();

        System.out.println(gumballMachine);
    }
}
