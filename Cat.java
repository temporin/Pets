public class Cat extends Pet
{
    private String breed;
    private String catSound = "meow";

    public Cat ( String name, String owner, String breedOf )
    {
        super( name, owner );
        breed = breedOf;

    }

    public String speak()
    {
        return catSound;
    }

    public void purr()
    {
        System.out.println( "Purring..." );
    }
}