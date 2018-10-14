
public class Bacon extends Leaf
{
    private String[] options ;

    public Bacon( String description )
    {
        super(description) ;
    }

    public void printDescription(){

        System.out.println(" "+description);
    }
}