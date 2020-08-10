package SwingGraphics;
/**
 * Models a simple square/ rectangle.
 * This class represents a square and can be drawn to the Scene class.
 */
public class Square extends Shape{

    /**
	 * Constructor. Creates a Square with the given parameters.
     * @param width The width of the square in pixels. 
     * @param height The height of the square in pixels. 
     * @param xPos The x position of the square in pixels (TOP LEFT of square). 
     * @param yPos The y position of the square in pixels (TOP LEFT of square). 
     * @param colour The colour of the square (Available colours are: BLACK, BLUE, CYAN, DARKGREY, GREY, GREEN, LIGHTGREY, MAGENTA, ORANGE, PINK, RED, WHITE, YELLOW).
     */
    public Square(int width, int height, double xPos, double yPos, String colour){
        super(width, height, xPos, yPos, colour);
    }

    /**
	 * Constructor. Creates a Square with the given parameters.
     * @param width The width of the square in pixels. 
     * @param height The height of the square in pixels. 
     * @param xPos The x position of the square in pixels (TOP LEFT of square). 
     * @param yPos The y position of the square in pixels (TOP LEFT of square). 
     * @param colour The colour of the square (Available colours are: BLACK, BLUE, CYAN, DARKGREY, GREY, GREEN, LIGHTGREY, MAGENTA, ORANGE, PINK, RED, WHITE, YELLOW).
     * @param angle The angle in degrees at which the square will be drawn (For example if set to 90 the square will be rotated 90 degrees clockwise).
     * @param layer The layer that the square will be drawn at (used to determine what objects will be drawn above what other objects if they are overlapping).
     */
    public Square(int width, int height, double xPos, double yPos, String colour, int angle, int layer){
        super(width, height, xPos, yPos, colour, angle, layer);
    }
}