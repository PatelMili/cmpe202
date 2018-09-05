
/**
 * Write a description of class NoQuarterState2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class NoQuarterState2 extends NoQuarterState1
{
    // instance variables - replace the example below with your own
     GumballMachine gumballMachine;

    
    
    public NoQuarterState2(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }
    
    public void ejectQuarter() {
        System.out.println("You haven't inserted a quarter");
    }
 

    public void insertQuarter(int coin[]) {
        //int a[] =coin;
        //System.out.println("a[0]"+a[0]);
        if(coin.length ==2){
            
            if(coin[0] == 25 && coin[1]==25){
                //System.out.println("a[0]"+a[0]);
                System.out.println("You inserted a quarter in q2");
                gumballMachine.setState(gumballMachine.getHasQuarterState());
            }else{
                gumballMachine.setState(gumballMachine.getNoQuarterState());   
            }
                
        
        
        }
        
        // System.out.println("You inserted a quarter in q2");
        // gumballMachine.setState(gumballMachine.getHasQuarterState());
	}
 
}
