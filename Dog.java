import java.util.*;

public class Dog extends Pet
{
    private int trainingFact;
    private ArrayList<String> tricks = new ArrayList<>();

    public Dog( String name, String owner )
    {
        super( name, owner );
        trainingFact = (int)(Math.random() * 100 ) + 1;

    }

    public String speak()
    {
        int consider = (int)(Math.random() * 10) + 1;
        if ( consider > 3 )
            return "Woof!";
        else   
            return "Bark!";
        
    }

    public void learnNewTrick( int diffLevel, String trick )
    {
        if ( diffLevel > trainingFact )
            System.out.println ( "Failed to Learn New Trick; Difficulty was: " + diffLevel + "\nCompared to your dog's trainability of: " + trainingFact );
        else
        {
            System.out.println ( "Successfully learned: " + trick + " !" );
            tricks.add( trick );
        }
    }

    public String doTrick()
    {
        int picker = (int)( Math.random() * tricks.size() );
        return tricks.get(picker);
    }

    public String getTricks()
    {
        String a = "";
        for ( String b : tricks )
            a += b;
        return a;
    }
    public static void main ( String[] args )
    {
        
        Dog gDane = new Dog( "Terry", "Great Ali " );

            
            System.out.println ( gDane.speak() );
            for ( int index = 0; index < 100; index++ ){
                String testA =  "roll" + (int)(Math.random() * 1000  );
                gDane.learnNewTrick( (int)(Math.random() * 100) + 1, testA );
            }
            for ( int testeraa = 0; testeraa < 11; testeraa++ )
                System.out.println(gDane.doTrick());


        
    }

} 