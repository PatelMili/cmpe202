package lab_9_strategy;

public class LazyStrategy implements Strategy{

	  @Override
	  public void performTask() {
	    System.out.println("Perform task a day before deadline!");
	  }

	}