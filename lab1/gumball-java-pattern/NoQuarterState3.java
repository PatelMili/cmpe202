
/**
 * Write a description of class NoQuarterState3 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class NoQuarterState3 extends NoQuarterState1
{
    // instance variables - replace the example below with your own
    GumballMachine gumballMachine;

    
    public NoQuarterState3(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }


    public void insertQuarter(int coin[]) {

        int total=0;
        int flag=0;
        if(coin.length >0){
            for(int i=0;i<coin.length;i++){

                if(coin[i]==25||coin[i]==10||coin[i]==5){
                    flag=1;

                }else{
                    flag=0;
                    break;
                }
            }
            if(flag==1){
                for(int i=0;i<coin.length;i++){
                    total =total+coin[i];
                }
                if(total==50){
                    System.out.println("You inserted a quarter in q3");
                    gumballMachine.setState(gumballMachine.getHasQuarterState());
                }else{
                    gumballMachine.setState(gumballMachine.getNoQuarterState());
                }
            }

        }else{
            gumballMachine.setState(gumballMachine.getNoQuarterState());
        }
        // System.out.println("You inserted a quarter in q3");
        // gumballMachine.setState(gumballMachine.getHasQuarterState());
    }

}
