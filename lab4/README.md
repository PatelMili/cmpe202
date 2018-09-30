# cmpe202


I am using chain of responsibility and observer pattern combined.

The basic flow of the application is: 
The customer signs up on the wait-list in the Restaurant class. The restaurant adds customer in queue and sends notification to customer. Restaurant the checks for the suitable for the party size on receiving available table’s size from the RestaurantManager class which gets the available table size from the Table class. The RestaurantManager is the client in the chain of responsibility. The restaurant notifies the customer. The customer chooses to confirm or leave. The RestaurantManager then changes the state of the table (to occupy/empty). 

Here, the Restaurant class and RestaurantManager have chain of responsibility pattern. RestaurantManager is the client and the Restaurant class has concrete handlers in the form of customer class’s objects. The RestaurantManager and Table have Observer Pattern. When the state of Table changes to occupied or available it will notify the RestaurantManager class. The Table class is the subject, RestaurantManager is the Observer.


