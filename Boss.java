
/**
 * Write a description of class Boss here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Boss
{
    // instance variables - replace the example below with your own
    private String name;
    private int health;

    /**
     * Constructor for objects of class Boss
     */
    public Boss()
    {
        // initialise instance variables
        name = "God";
        health = 100;
    }
    
    public Boss(String name)
    {
        this.name = name;
        health = 100;
    }
    
    public String getName()
    {
        return name;
    }
    
    public int getHealth()
    {
        return health;
    }
    
    public void changeHealth(int n)
    {
        health = n;
    }

    public int attack()
    {
        int choice = (int) (Math.random() * 4);
        return choice;
    }
    
}
