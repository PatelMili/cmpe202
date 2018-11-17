## Lab 9

On change of interest rate, the Internet and Newspaper are updated about the new interest rate.

The original code has subject and observer interfaces, Newspaper & Internet implements Observer interface and Loan implements Subject interface. 

In Functional way, there is no need for separate Newspaper & Internet class, the method is implemented as a callback function. 

Comparison
Using the functional way, there is no need of separate observer classes, Internet & Newspaper as their method implementation can be directly be passed as lambda expression. This makes the code more precise however if there are more methods in the observer class or the same class is observer to different subjects , the functional way would be more complicated and that case, making separate class would better. However, if the observer class is listening to only one subject and has only single method, the functional way is better.

