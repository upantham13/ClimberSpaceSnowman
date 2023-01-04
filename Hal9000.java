
/**
 * Models a computer controling the systems of a spaceship while interacting with its crew.
 *
 * @author Umasathvik Pantham
 * @version 02/20/2021
 */
public class Hal9000
{
    //Instance Variables
    private String name;
    
    /**
     * Constructs a crew member with the given name and status.
     * 
     * @param theName the name of this crew member
     */
    public Hal9000 (String theName)
    {
        name = theName;
    }
    
    /**
     * Gets the name of this crew member
     * 
     * @return the name of this crew member
     */
    public String getName()
    {
        return name;
    }
    
    /**
     * Sets the name for this crew member
     * 
     * @param newName the new name for this crew member
     */
    public void setName(String newName)
    {
        name = newName;
    }
    
    /**
     * Responds with a greeting for this crew member
     * 
     * @return greet the greeting, "Greetings, + name of crew member + ."
     */
    public String greet()
    {
        return("Greetings, " + name + ".");
    }
    
    /**
     * Responds with a status for this crew member
     * 
     * @return giveStatus the status, "Everything is a go, + name of crew member + ."
     */
    public String giveStatus()
    {
        return("Everything is a go, " + name + ".");
    }
    
    /**
     * Responds with end result of command for this crew member
     * 
     * @param whatToDo the end result of the executeCommand
     * @return whatToDo the status, "I am sorry, + name of crew member + I can't + whatToDo + ."
     */
    public String executeCommand(String whatToDo)
    {
        return("I am sorry, " + name + ". I can't " + whatToDo + ".");
    }
}
