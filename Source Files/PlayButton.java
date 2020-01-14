import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PlayButton here.
 * 
 * @author Steven Lin 
 * @version (a version number or a date)
 */
public class PlayButton extends Actor
{
    
    /**
     * Act - do whatever the PlayButton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
       click();
       
    }   
    private void click()
    {
        if(Greenfoot.mouseClicked(this))
        {
            Greenfoot.setWorld(new NewOpeningScreen());
        }
        
    }
    public PlayButton()
    {
        setImage(new GreenfootImage("Play Button.gif"));
        getImage().scale(getImage().getWidth() / 2 + 110 , getImage().getHeight() /2 + 25  );
}   }