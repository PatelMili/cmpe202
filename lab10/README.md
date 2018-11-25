## Lab 10


**Comparison**

In lab 1, I made three objects of GumballMachine class with the model number passed into it. Depending on the model number and the array of input coins passed into the insertQuarter() metod, different variations of the gumball machine were handled.
So changing the configurations would mean huge changes in code as the code is tightly coupled. In FeatureIDE AspectJ, the configuration  of GumballMahcine is in a config file. The configuration can be changed in the config file to set required GumballMachine model. Using AOP we can make handling of variations and future requirement easily managable by just adding the features as and when they change. This can be done with minimal change as the configurations are separate.


**Screenshots**

 - slot model cost 50 
 ![](./screenshots/s_model_two_qtr.png)
 - crankmodel one qtr cost 25 
 ![](./screenshots/c_model_one_qtr.png)
 - crankmodel two qtr cost 50 
 ![](./screenshots/c_model_one_qtr.png)
