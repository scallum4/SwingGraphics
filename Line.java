package SwingGraphics;
/**
 * Models a simple line.
 * This class represents a line and can be drawn to the Scene class.
 */
public class Line extends DrawableObject{

    private int startX;   // The x coordinate of the start of the line.
    private int startY;   // The y coordinate of the start of the line.
    private int endX;     // The x coordinate of the end of the line.
    private int endY;     // The y coordinate of the end of the line.
    private int width;    // The width/ stroke of the line.

    /**
	 * Constructor. Creates a Line with the given parameters.
     * @param startX The x coordinate of the start of the line.
     * @param startY The y coordinate of the start of the line.
     * @param endX The x coordinate of the end of the line.
     * @param endY The y coordinate of the end of the line.
     * @param width The width/ stroke of the line.
     * */
    public Line(int startX, int startY, int endX, int endY, int width){
        super();
        this.startX = startX;
        this.startY = startY;
        this.endX = endX;
        this.endY = endY;
        this.width = width;
    }

    /**
	 * Constructor. Creates a Line with the given parameters.
     * @param startX The x coordinate of the start of the line.
     * @param startY The y coordinate of the start of the line.
     * @param endX The x coordinate of the end of the line.
     * @param endY The y coordinate of the end of the line.
     * @param width The width/ stroke of the line.
     * @param layer The layer that the line will be drawn at (used to determine what objects will be drawn above what other objects if they are overlapping).
     * @param colour The colour of the line (Available colours are: BLACK, BLUE, CYAN, DARKGREY, GREY, GREEN, LIGHTGREY, MAGENTA, ORANGE, PINK, RED, WHITE, YELLOW).
     */
    public Line(int startX, int startY, int endX, int endY, int width, int layer, String colour){
        super(colour, layer);
        this.startX = startX;
        this.startY = startY;
        this.endX = endX;
        this.endY = endY;
        this.width = width;
    }

    /**
     * Gets the x position at the start of the line. 
     * @return The x position at the start of the line.
     */
    public int getStartX() {
        return startX;
    }

    /**
     * Gets the y position at the start of the line. 
     * @return The y position at the start of the line.
     */
    public int getStartY() {
        return startY;
    }

    /**
     * Gets the x position at the end of the line. 
     * @return The x position at the end of the line.
     */
    public int getEndX() {
        return endX;
    }

    /**
     * Gets the y position at the end of the line. 
     * @return The y position at the end of the line.
     */
    public int getEndY() {
        return endY;
    }

    /**
     * Gets the width/ stroke of the line. 
     * @return The width/ stroke of the line.
     */
    public int getWidth() {
        return width;
    }

    /**
     * Sets the x position at the start of the line. 
     * @param startX The new x position at the start of the line.
     */
    public void setStartX(int startX) {
        this.startX = startX;
    }

    /**
     * Sets the y position at the start of the line. 
     * @param startY The new y position at the start of the line.
     */
    public void setStartY(int startY) {
        this.startY = startY;
    }

    /**
     * Sets the x position at the end of the line. 
     * @param endX The new x position at the end of the line.
     */
    public void setEndX(int endX) {
        this.endX = endX;
    }

    /**
     * Sets the y position at the end of the line. 
     * @param endY The new y position at the end of the line.
     */
    public void setEndY(int endY) {
        this.endY = endY;
    }

    /**
     * Sets the width/ stroke of the line. 
     * @param width The new width/ stroke of the line. 
     */
    public void setWidth(int width) {
        this.width = width;
    }
}