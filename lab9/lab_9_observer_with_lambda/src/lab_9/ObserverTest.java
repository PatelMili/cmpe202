package lab_9;

public class ObserverTest {

	public static void main(String args[]) {
        

        Loan personalLoan = new Loan("Personal Loan", 12.5f,
                     "Standard Charterd");
      
        personalLoan.registerObserver((float interest)->{
        	System.out.println("----------lambda way------------");
        	System.out.println("Internet: Interest Rate updated, new Rate is: "
                    + interest);
        });
        
        personalLoan.registerObserver((float interest)->{
        	System.out.println("----------lambda way------------");
        	   System.out.println("Newspaper: Interest Rate updated, new Rate is: "
                       + interest);
        });
        
        personalLoan.setInterest(3.5f);

 }


}
