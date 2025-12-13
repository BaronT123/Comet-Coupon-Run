import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class settings_button here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class settings_button extends Actor
{
    private World link;
    public settings_button(String image, World link){
        setImage(new GreenfootImage(image));
        this.link = link;
    }
    public void act()
    {
        if (Greenfoot.mouseClicked(this) || Greenfoot.isKeyDown("escape")){
            Greenfoot.stop();
            Greenfoot.setWorld(this.link);
        }// Add your action code here.
    }
}
