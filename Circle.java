package SwingGraphics;
/**
 * Models a simple circle/ ellipse.
 * This class represents a circle and can be drawn to the Scene class.
 */
public class Circle extends Shape{

    /**
	 * Constructor. Creates a Circle with the given parameters.
     * @param width The width of the circle in pixels. 
     * @param height The height of the circle in pixels. 
     * @param xPos The x position of the circle in pixels (TOP LEFT of circle). 
     * @param yPos The y position of the circle in pixels (TOP LEFT of circle). 
     * @param colour The colour of the circle (Available colours are: BLACK, BLUE, CYAN, DARKGREY, GREY, GREEN, LIGHTGREY, MAGENTA, ORANGE, PINK, RED, WHITE, YELLOW).
     */
    public Circle(int width, int height, double xPos, double yPos, String colour){
        super(width, height, xPos, yPos, colour);
    }

    /**
	 * Constructor. Creates a Circle with the given parameters.
     * @param width The width of the circle in pixels. 
     * @param height The height of the circle in pixels. 
     * @param xPos The x position of the circle in pixels (TOP LEFT of circle). 
     * @param yPos The y position of the circle in pixels (TOP LEFT of circle). 
     * @param colour The colour of the circle (Available colours are: BLACK, BLUE, CYAN, DARKGREY, GREY, GREEN, LIGHTGREY, MAGENTA, ORANGE, PINK, RED, WHITE, YELLOW).
     * @param angle The angle in degrees at which the cirlce will be drawn (For example if set to 90 the circle will be rotated 90 degrees clockwise).
     * @param layer The layer that the circle will be drawn at (used to determine what objects will be drawn above what other objects if they are overlapping).
     */
    public Circle(int width, int height, double xPos, double yPos, String colour, int angle, int layer){
        super(width, height, xPos, yPos, colour, angle, layer);
    }
}