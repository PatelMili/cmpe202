## Lab 9

**Strategy Pattern**

The original code has Strategy Interface and two strategies, LazyStrategy and ActiveStrategy implementing Strategy interface and a class StrategyDataset where the two strategies are called.

In functional way there is only Strategy interface and the StrategyDataset , the need to create two separate strategy classes is eliminated as the varying methods are implemented using the lambda expressions.

*Comparison*

Using the functional way, there is no need of separate classes of different strategies, ActiveStrategy & LazyStrategy as their method implementation can be directly be passed as lambda expression. This makes the code more precise. When more strategies are required to be added in future there is no need to create a separate concrete strategy class, we can do it by adding the lambda expression. The functional way makes the code more clean and concise in the Strategy pattern implementation.


**Observer Pattern**

On change of interest rate, the Internet and Newspaper are updated about the new interest rate.

The original code has subject and observer interfaces, Newspaper & Internet implements Observer interface and Loan implements Subject interface. 

In Functional way, there is no need for separate Newspaper & Internet class, the method is implemented as a callback function. 

*Comparison*

Using the functional way, there is no need of separate observer classes, Internet & Newspaper as their method implementation can be directly be passed as lambda expression. This makes the code more precise however if there are more methods in the observer class or the same class is observer to different subjects , the functional way would be more complicated and that case, making separate class would better. However, if the observer class is listening to only one subject and has only single method, the functional way is better.

