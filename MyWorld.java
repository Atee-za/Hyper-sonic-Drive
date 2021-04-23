import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 600, 1);
        setPaintOrder(Back.class,Instructions.class);
        prepare();
        
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {

        Start start = new Start();
        addObject(start,810,96);
        start.setLocation(853,133);
        Instructions instructions = new Instructions();
        addObject(instructions,181,519);
        instructions.setLocation(79,561);
        GameName gamename = new GameName();
        addObject(gamename,349,197);
        Logo logo = new Logo();
        addObject(logo,184,31);
    }
}
