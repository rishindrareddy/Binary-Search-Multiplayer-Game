import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Instructions here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Instructions extends Actor
{
    /**
     * Act - do whatever the Instructions wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    private boolean hover =false;
    
    public void act() 
    {
        
        if(Greenfoot.mouseMoved(null))
        hover = Greenfoot.mouseMoved(this);
        if(hover)
        {
            setImage("button_instructions-hover.png"); 
           // Greenfoot.playSound("Tiny_Button.wav");
        }
        else
        setImage("button_instructions.png");
        
        if(Greenfoot.mouseClicked(this)){
            Greenfoot.playSound("Fuzzy_Beep.wav");
            Greenfoot.setWorld(new Instruction());
        }
        
    }   
}
