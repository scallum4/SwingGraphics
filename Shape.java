package SwingGraphics;
/**
 * Used to model a shape.
 * You should not need to create an instance of this class.
 */
public class Shape extends DrawableObject{

    private int width;     // The width of the shape. 
    private int height;    // The height of the shape. 
    private double xPos;   // The x position of the shape. 
    private double yPos;   // The y position of the shape. 
    private int angle;     // The angle position of the shape(in degrees). 

    /**
	 * Constructor. Creates a Shape with the given parameters.
     * @param width The width of the shape in pixels. 
     * @param height The height of the shape in pixels. 
     * @param xPos The x position of the shape in pixels (TOP LEFT of shape). 
     * @param yPos The y position of the shape in pixels (TOP LEFT of shape). 
     * @param colour The colour of the shape (Available colours are: BLACK, BLUE, CYAN, DARKGREY, GREY, GREEN, LIGHTGREY, MAGENTA, ORANGE, PINK, RED, WHITE, YELLOW).
     */
    public Shape(int width, int height, double xPos, double yPos, String colour){
        super(colour);
        this.width = width;
        this.height = height;
        this.xPos = xPos;
        this.yPos = yPos;
        angle = 0;
    }

    /**
	 * Constructor. Creates a Shape with the given parameters.
     * @param width The width of the shape in pixels. 
     * @param height The height of the shape in pixels. 
     * @param xPos The x position of the shape in pixels (TOP LEFT of shape). 
     * @param yPos The y position of the shape in pixels (TOP LEFT of shape). 
     * @param colour The colour of the shape (Available colours are: BLACK, BLUE, CYAN, DARKGREY, GREY, GREEN, LIGHTGREY, MAGENTA, ORANGE, PINK, RED, WHITE, YELLOW).
     * @param angle The angle in degrees at which the shape will be drawn (For example if set to 90 the shape will be rotated 90 degrees clockwise).
     * @param layer The layer that the shape will be drawn at (used to determine what objects will be drawn above what other objects if they are overlapping).
     */
    public Shape(int width, int height, double xPos, double yPos, String colour, int angle, int layer){
        super(colour, layer);
        this.width = width;
        this.height = height;
        this.xPos = xPos;
        this.yPos = yPos;
        this.angle = angle;
    }

    /**
     * Moves the shape to a new location.
     * @param xPos The new x position of the shape (TOP LEFT of shape). 
     * @param yPos The new y position of the shape (TOP LEFT of shape). 
     */
    public void move(double xPos, double yPos){
        this.xPos = xPos;
        this.yPos = yPos;
    }

    /**
     * Gets the width of the shape. 
     * @return The width of the shape.
     */
    public int getWidth() {
        return width;
    }

    /**
     * Gets the height of the shape. 
     * @return The height of the shape.
     */
    public int getHeight() {
        return height;
    }

    /**
     * Gets the x positon of the shape (TOP LEFT of shape). 
     * @return The x position of the shape.
     */
    public double getxPos() {
        return xPos;
    }

    /**
     * Gets the y positon of the shape (TOP LEFT of shape). 
     * @return The y position of the shape.
     */
    public double getyPos() {
        return yPos;
    }

    /**
     * Gets the angle of the shape (TOP LEFT of shape). 
     * @return The angle of the shape.
     */
    public int getAngle() {
        return angle;
    }

    /**
     * Sets the width of the shape. 
     * @param width The new width of the shape.
     */
    public void setWidth(int width) {
        this.width = width;
    }

    /**
     * Sets the height of the shape. 
     * @param height The new height of the shape.
     */
    public void setHeight(int height) {
        this.height = height;
    }

    /**
     * Sets the x position of the shape. 
     * @param xPos The new x position of the shape.
     */
    public void setxPos(double xPos) {
        this.xPos = xPos;
    }

    /**
     * Sets the y position of the shape. 
     * @param yPos The new y position of the shape.
     */
    public void setyPos(double yPos) {
        this.yPos = yPos;
    }

    /**
     * Sets the angle of the shape. 
     * @param angle The new angle of the shape.
     */
    public void setAngle(int angle) {
        this.angle = angle;
    }

}