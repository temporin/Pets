public abstract class Pet 
{
    private String petName;
    private String petOwner;

    public Pet( String name, String owner )
    {
        petName = name;
        petOwner = owner;
    }
    
    public String getOwner()
    {
        return owner;
    }

    public void ChangeOwner ( String owner )
    {
        petOwner = owner;
    }

    public String getName()
    {
        return petName;
    }

    public abstract String speak();
}