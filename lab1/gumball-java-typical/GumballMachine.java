
public class GumballMachine
{

    private int num_gumballs;
    private boolean has_quarter;
    private int model_no;

    public GumballMachine( int size,int model_no)
    {
        // initialise instance variables
        this.num_gumballs = size;
        this.has_quarter = false;
        this.model_no = model_no;
    }

    // public void checkModel(int model_no)
    // {
        // switch(model_no){

            // case 1: //model number one 
            // break;
            // case 2: //model number two
            // break;
            // case 3: //model number three
            // break;
            // default://in case of different number 

        // }

    // }

    public void insertQuarter(int coin[])
    {
        //System.out.println( "model no:"+ model_no ) ;
        switch(model_no){

            case 1: //model number one 
                   // System.out.println( "model no 1:"+ model_no ) ;
                   if(coin.length == 1){
                       
                        if ( coin[0] == 25)
                            this.has_quarter = true ;
                        else 
                            this.has_quarter = false ;
                            
                    }else{
                     this.has_quarter = false;   
                    }
                    
                    break;
            case 2: //model number two
                    //System.out.println( "model no 2:"+ model_no +"coin length"+coin.length ) ;
                    
                    if(coin.length == 2){
                        if ( coin[0] == 25 && coin[1]== 25)
                            this.has_quarter = true ;
                        else 
                            this.has_quarter = false ;
                    }
                    else{
                        this.has_quarter = false;
                    }
                
                    
                    break;
            case 3: //model number three
            
                   // System.out.println( "model no 3:"+ model_no ) ;
                    int total=0;
                    int flag = 0;
                     if(coin.length >0)
                        {
                           for(int i=0;i<coin.length;i++){
                            
                                //System.out.println( "coin[i]"+ coin[i] ) ;
                                if(coin[i]==25 || coin[i]==10 || coin[i]==5){
                                    
                                    flag=1;
                                    //System.out.println( "flag is "+ flag ) ;
                                
                                }else{
                                    flag=0;
                                    //System.out.println( "flag is "+ flag ) ;
                                    break;
                                }
                                
                                
                            }
                           if(flag==1){
                            
                                for(int i=0;i<coin.length;i++){
                            
                                    total = total+ coin[i];
                                
                                }
                            //System.out.println( "total"+ total ) ;
                                if(total==50){
                                    this.has_quarter = true ;
                                }
                            }
                            
                            
                        
                    }
                    else 
                        this.has_quarter = false ;
            break;
            default://in case of different number 

        }

    }

    public void turnCrank()
    {
        if ( this.has_quarter )
        {
            if ( this.num_gumballs > 0 )
            {
                this.num_gumballs-- ;
                this.has_quarter = false ;
                System.out.println( "Thanks for your quarter.  Gumball Ejected!" ) ;
            }
            else
            {
                System.out.println( "No More Gumballs!  Sorry, can't return your quarter." ) ;
            }
        }
        else 
        {
            System.out.println( "Please insert a quarter" ) ;
        }        
    }
}
