import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class start here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class start extends World
{

    /**
     * Constructor for objects of class start.
     * 
     */
    public start()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(700, 700, 1); 
        S_text label = new S_text("2 Cars by Comet Pizza");
        start_button sb = new start_button("play_button_1.png",new MyWorld());
        addObject(label, 500,250);
        addObject(sb, 350,400);
    }
}
