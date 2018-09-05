
public class GumballMachine {
    State soldOutState;
    State noQuarterState;
    State hasQuarterState;
    State soldState;

    State state = soldOutState;
    int count = 0;
    int modelNo;

    public GumballMachine(int numberGumballs,int modelNo) {
        soldOutState = new SoldOutState(this);
        noQuarterState = new NoQuarterState1(this);
        hasQuarterState = new HasQuarterState(this);
        soldState = new SoldState(this);
        state = noQuarterState;
        this.count = numberGumballs;
        this.modelNo = modelNo;
        if (numberGumballs > 0) {
            System.out.println("model no is: "+modelNo);
            
            if(modelNo==1){
                state = noQuarterState;
            }else if(modelNo==2){
                state = new NoQuarterState2(this);

            }else if(modelNo==3){ 
                state = new NoQuarterState3(this);
            }
           
        } 
    }

    public void insertQuarter(int arr[]) {
        state.insertQuarter(arr);
    }

    public void ejectQuarter() {
        state.ejectQuarter();
    }

    public void turnCrank() {
        state.turnCrank();
        state.dispense();
    }

    void setState(State state) {
        this.state = state;
    }

    void releaseBall() {
        System.out.println("A gumball comes rolling out the slot...");
        if (count != 0) {
            count = count - 1;
        }
    }

    int getCount() {
        return count;
    }

    void refill(int count) {
        this.count = count;
        state = noQuarterState;
    }

    public State getState() {
        return state;
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public State getNoQuarterState() {
        return noQuarterState;
    }

    public State getHasQuarterState() {
        return hasQuarterState;
    }

    public State getSoldState() {
        return soldState;
    }

    public String toString() {
        StringBuffer result = new StringBuffer();
        result.append("\nMighty Gumball, Inc.");
        result.append("\nJava-enabled Standing Gumball Model #2004");
        result.append("\nInventory: " + count + " gumball");
        if (count != 1) {
            result.append("s");
        }
        result.append("\n");
        result.append("Machine is " + state + "\n");
        return result.toString();
    }
}
