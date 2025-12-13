import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class start_button here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class start_button extends Actor
{
    /**
     * Act - do whatever the start_button wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private World link;
    public start_button(String image, World link){
        setImage(new GreenfootImage(image));
        this.link = link;
    }
    public void act()
    {
        if (Greenfoot.mouseClicked(this)){
            Greenfoot.playSound("car-engine-starting-43705.mp3");
            Greenfoot.setWorld(this.link);
        }// Add your action code here.
    }
}
