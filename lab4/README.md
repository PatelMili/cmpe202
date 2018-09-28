# cmpe202

I am using state and observer pattern combined. 

The basic flow of the application is: 

The customer signs up on the wait-list. The restaurant adds customer in queue and sends notification to customer. Rstaurant the ckecks for the specific size able suitable for the party size. When state of table becomes availbe, the restaurant notifies the customer. The customer chooses to confirm or leave.  The restaurant then either changes the state of the table (to occupied) or moves to the next customer in line. 

Here, the restaurant class would be a context to Table. Table is my state. The restaurant would also serve as subject to the customer (which is my observer).