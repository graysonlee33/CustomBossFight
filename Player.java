
/**
 * Write a description of class Player here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Player
{
    // instance variables - replace the example below with your own
    private int health;
    

    /**
     * Constructor for objects of class Player
     */
    public Player()
    {
        health = 100;
    }

    public int getHealth()
    {
        return health;
    }
    
    public void changeHealth(int n)
    {
        health = n;
    }
    
    public void yourTurn()
    {
        System.out.println("It's your turn to fight!");
        System.out.println("-------------------------");
        System.out.println("Attack 1: Lightning strike (10 dmg) (no debuff)");
        System.out.println("Attack 2: 14 wheeler truck (15 dmg) (-5 debuff)");
        System.out.println("Attack 3: Meteor (20 dmg) (-10 debuff)");
        System.out.println("Attack 4: Heal (+15HP)");
        System.out.println("-------------------------");
    }
    
    public void choose(int n)
    {
        if (n == 1)
        {
            System.out.println("You choose lightning strike!");
            System.out.println("It hits for 10 damage!");
        }
        if (n == 2)
        {
            System.out.println("You choose 14 wheeler truck!");
            System.out.println("It hits for 15 damage!");
        }
        if (n == 3)
        {
            System.out.println("You chose meteor!");
            System.out.println("It hits for 20 damage!");
        }
        if (n == 4)
        {
            System.out.println("You chose heal!");
            System.out.println("It heals for 15 health!");
        }
    }
}
