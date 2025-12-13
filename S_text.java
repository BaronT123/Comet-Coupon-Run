import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class S_text here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class S_text extends Actor
{
    /**
     * Act - do whatever the S_text wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public S_text(String text){
        GreenfootImage img = new GreenfootImage(text.length()*20,30);
        img.setColor(Color.YELLOW);
        img.drawString(text,2,20);
        
        setImage(img);
    }
    public void act()
    {
        // Add your action code here.
    }
}
