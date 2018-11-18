package lab_9_strategy;

import java.util.Arrays;
import java.util.List;

public class StrategyDataSet {
	public static void main(String[] args) {

	    List<Strategy> strategies = 
	        Arrays.asList(
	          new LazyStrategy(), 
	          new ActiveStrategy()
	        );

	    for(Strategy stg : strategies){
	      stg.performTask();
	    }
	  }

}
