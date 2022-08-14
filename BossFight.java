
/**
 * Write a description of class BossFight here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.*;
public class BossFight
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);
        System.out.println("Name of Boss --> ");
        String name = console.nextLine();
        int bChoice = 0;
        int pChoice = 0;
        int round = 1;
        Boss b = new Boss(name);
        Player p = new Player();
        System.out.println(b.getName() + " has appeared!");
        while (b.getHealth() > 0 && p.getHealth() > 0)
        {
            System.out.println("------------------------");
            System.out.println("ROUND " + round);
            System.out.println("------------------------");
            System.out.println("FIGHT");
            System.out.println();
            round++;
            bChoice = b.attack();
            if (bChoice == 0)
            {
                System.out.println(b.getName() + " casts fireball!");
                System.out.println("It hits for 10 damage!");
                p.changeHealth(p.getHealth() - 10);
            }
            else if (bChoice == 1)
            {
                System.out.println(b.getName() + " casts earthquake!");
                System.out.println("It hits for 15 damage!");
                p.changeHealth(p.getHealth() - 15);
            }
            else if (bChoice == 2)
            {
                System.out.println(b.getName() + " casts tsunami!");
                System.out.println("It hits for 20 damage!");
                p.changeHealth(p.getHealth() - 20);
            }
            else if (bChoice == 3)
            {
                System.out.println(b.getName() + " casts heal!");
                System.out.println("It heals him for 10 health!");
                b.changeHealth(b.getHealth() + 10);
            }
            
            System.out.println("Boss Health: " + b.getHealth());
            System.out.println("Your health: " + p.getHealth());
            
            if (p.getHealth() <= 0)
            {
                break;
            }
            System.out.println();
            
            p.yourTurn();
            System.out.println("Input number of attack --> ");
            pChoice = console.nextInt();
            p.choose(pChoice);
            if (pChoice == 1)
            {
                b.changeHealth(b.getHealth() - 10);
            }
            if (pChoice == 2)
            {
                b.changeHealth(b.getHealth() - 15);
                p.changeHealth(p.getHealth() - 5);
                System.out.println("Debuff of 5 hits you...");
            }
            if (pChoice == 3)
            {
                b.changeHealth(b.getHealth() - 20);
                p.changeHealth(p.getHealth() - 10);
                System.out.println("Debuff of 10 hits you...");
            }
            if (pChoice == 4)
            {
                p.changeHealth(p.getHealth() + 15);
            }
            
            System.out.println("Boss Health: " + b.getHealth());
            System.out.println("Your health: " + p.getHealth());
            
            System.out.println();
        }
        System.out.println();
        if (p.getHealth() > b.getHealth())
        {
            System.out.println("Congratulations, you have defeated " + b.getName() + "!");
        }
        if (p.getHealth() < b.getHealth())
        {
            System.out.println("You have fallen at the hands of " + b.getName() + "...");
        }
    }
}
