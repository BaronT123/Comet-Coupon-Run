import greenfoot.*;  // Import Greenfoot classes

public class back_button extends Actor
{
    private boolean isClicked;

    // Constructor
    public back_button()
    {
        // Set the image for the resume button (you can replace with your own image)
        setImage("settings_button_re.jpeg.jpg");
        isClicked = false;
    }

    // Act method - called in each frame
    public void act()
    {
        checkClick();
    }

    // Detect if the button is clicked
    private void checkClick()
    {
        if (Greenfoot.mouseClicked(this) || Greenfoot.isKeyDown("escape")) {
            isClicked = true;
            resumeGame();  // Call the method to resume the game
        }
    }

    // Method to resume the game
    public void resumeGame()
    {
        // Switch back to the main game world
        Greenfoot.setWorld(new MyWorld());
    }

    // Method to check if the button is clicked
    public boolean isClicked()
    {
        return isClicked;
    }
}

