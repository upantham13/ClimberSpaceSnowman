
/**
 * The class models and draws SnowMen at any x,y coordinates.
 *
 * @author Umasathvik Pantham
 * @version 02/21/2021
 */
public class SnowMan
{
    // instance variables
    public static final int HAT_SIZE = 20;
    public static final int HAT_BRIM_SIDE_SIZE = 10;
    public static final int SMALL_DIAMETER = 20;
    public static final int DIAMETER_INCREMENT = 20;
    public static final int RADIUS_INCREMENT = 10;
    private double x;
    private double y;
    /**
     * Constructor for objects of class SnowMan
     * 
     * @param xPos the x-coordinate of the upper-left corner of the rectangular hat of the snowman
     * @param yPos the y-coordinate of the upper-left corner of the rectangular hat of the snowman
     */
    public SnowMan(double xPos, double yPos)
    {
        x = xPos;
        y = yPos;
    }

    /**
     * Draws the SnowMan
     */
    public void draw()
    {
        Rectangle rectangle1 = new Rectangle(x, y, HAT_SIZE, HAT_SIZE);
        rectangle1.draw();
        
        rectangle1.fill();
        
        Line line1 = new Line(x - 10, y + 20, 4 * HAT_BRIM_SIDE_SIZE + x - 10, y + 20);
        line1.draw();
        
        Ellipse circle1 = new Ellipse(x, y + DIAMETER_INCREMENT, SMALL_DIAMETER, SMALL_DIAMETER);
        circle1.draw();
        
        Ellipse circle2 = new Ellipse(x - RADIUS_INCREMENT, y + (2 * DIAMETER_INCREMENT), 2 * SMALL_DIAMETER, 2 * SMALL_DIAMETER);
        circle2.draw();
        
        Ellipse circle3 = new Ellipse(x - DIAMETER_INCREMENT, y + (4 * DIAMETER_INCREMENT), 3 * SMALL_DIAMETER, 3 * SMALL_DIAMETER);
        circle3.draw();
    }
}
