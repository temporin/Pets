public class Dog extends Pet
{
    private int traininingFact;

    public Dog( String name, String owner )
    {
        super( name, owner );
        trainingFact = (int)(Math.random() * 100 ) + 1;

    }

    public String speak()
    {
        int consider = (int)(Math.random * 10) + 1;
        if ( consider > 3 )
            return "Woof!";
        else   
            return "Bark!";
    }

} 