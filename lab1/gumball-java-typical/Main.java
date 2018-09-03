

public class Main {

    public static void main(String[] args) {
        
        //second parameter is for model number, 1 is gumball machine type one, 2 is for gumball machine type 2 and 3 is for gumball machine type 3
        GumballMachine gumballMachine1 = new GumballMachine(5,1);
        GumballMachine gumballMachine2 = new GumballMachine(5,2);
        GumballMachine gumballMachine3 = new GumballMachine(5,3);

        int []array1= {25};
        int []array2={25,25};  
        int []array3={25,10,10,5};
        //i parameter is machine one, two paramter is machine two[],
        
        
        System.out.println(gumballMachine1);

        gumballMachine1.insertQuarter( array1 );
        gumballMachine1.turnCrank();

        System.out.println(gumballMachine2);
        
        gumballMachine2.insertQuarter( array2 );
        gumballMachine2.turnCrank();

        System.out.println(gumballMachine3);
        gumballMachine3.insertQuarter( array3 );
        gumballMachine3.turnCrank();

        
    }
}
