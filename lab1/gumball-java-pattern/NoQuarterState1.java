

public class NoQuarterState1 implements State {
    GumballMachine gumballMachine;
    
    public NoQuarterState1(){
    }
 
    public NoQuarterState1(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }
 
	public void insertQuarter(int coin[]) {
		if(coin.length ==1){
            
            if(coin[0] == 25){
                //System.out.println("a[0]"+a[0]);
                System.out.println("You inserted a quarter in q1");
                gumballMachine.setState(gumballMachine.getHasQuarterState());
            }else{
                gumballMachine.setState(gumballMachine.getNoQuarterState());   
            }
                
        
        
        }
	}
 
	public void ejectQuarter() {
		System.out.println("You haven't inserted a quarter");
	}
 
	public void turnCrank() {
		System.out.println("You turned, but there's no quarter");
	 }
 
	public void dispense() {
		System.out.println("You need to pay first");
	} 
 
	public String toString() {
		return "waiting for quarter";
	}
}
