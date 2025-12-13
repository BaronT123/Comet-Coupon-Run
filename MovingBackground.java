import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ParallaxBackground here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MovingBackground extends Actor
{
    private int speedX;  // Horizontal speed of background
    private int speedY;  // Vertical speed of background
    private int width;   // Width of the background image
    private int height;  // Height of the background image
    
    // Constructor to set the speed and initial image
    public MovingBackground(int speedX, int speedY, String imageFile)
    {
        this.speedX = speedX;
        this.speedY = speedY;

        GreenfootImage image = new GreenfootImage(imageFile);
        setImage(image);
        
        this.width = image.getWidth();
        this.height = image.getHeight();
    }

    // Act method to move the background continuously
    public void act()
    {
        moveBackground();
    }

    // Method to move the background image
    private void moveBackground()
    {
        // Move the background by updating its position
        setLocation(getX() + speedX, getY() + speedY);
        
        // If the background moves out of the screen, reset its position
        if (getX() >= width || getX() <= 0)  // Adjust for scrolling right/left
        {
            setLocation(getX() - (width * (speedX > 0 ? 1 : -1)), getY());
        }

        if (getY() >= height || getY() <= 0)  // Adjust for scrolling up/down
        {
            setLocation(getX(), getY() - (height * (speedY > 0 ? 1 : -1)));
        }
    }
}
