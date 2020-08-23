package swinggraphics;
/**
 * Models simple text.
 * This class represents a square and can be drawn to the Scene class.
 */
public class Text extends DrawableObject{
    private int xPos;
    private int yPos;
    private int textSize;
    private String text;

    /**
     * Constructor. Creates text with the given parameters.
     * @param text The text that will be displayed.
     * @param xPos The x position of the text in pixels (TOP LEFT of the text).
     * @param yPos The y position of the text in pixels (TOP LEFT of the text).
     * @param textSize The size of the text.
     * @param colour The colour of the text (Available colours are: BLACK, BLUE, CYAN, DARKGREY, GREY, GREEN, LIGHTGREY, MAGENTA, ORANGE, PINK, RED, WHITE, YELLOW).
     */
    public Text(String text, int xPos, int yPos, int textSize, String colour){
        super(colour);
        this.text = text;
        this.xPos = xPos;
        this.yPos = yPos;
        this.textSize = textSize;
    }

    /**
     * Constructor. Creates text with the given parameters.
     * @param text The text that will be displayed.
     * @param xPos The x position of the text in pixels (TOP LEFT of the text).
     * @param yPos The y position of the text in pixels (TOP LEFT of the text).
     * @param textSize The size of the text.
     * @param colour The colour of the text (Available colours are: BLACK, BLUE, CYAN, DARKGREY, GREY, GREEN, LIGHTGREY, MAGENTA, ORANGE, PINK, RED, WHITE, YELLOW).
     * @param layer The layer that the text will be drawn at (used to determine what objects will be drawn above what other objects if they are overlapping).
     */
    public Text(String text, int xPos, int yPos, int textSize, String colour, int layer){
        super(colour, layer);
        this.text = text;
        this.xPos = xPos;
        this.yPos = yPos;
        this.textSize = textSize;
    }

    /**
     * Gets the x position of the text.
     * @return The x position of the text.
     */
    public int getXPos() {
        return xPos;
    }

    /**
     * Gets the y position of the text.
     * @return The y position of the text.
     */
    public int getYPos() {
        return yPos;
    }

    /**
     * Gets the size of the text.
     * @return The size of the text.
     */
    public int getTextSize() {
        return textSize;
    }

    /**
     * Gets the text.
     * @return The text as String.
     */
    public String getText() {
        return text;
    }

    /**
     * Sets the x position of the text.
     * @param xPos The new x position of the text.
     */
    public void setXPos(int xPos) {
        this.xPos = xPos;
    }

    /**
     * Sets the y position of the text.
     * @param yPos The new y position of the text.
     */
    public void setYPos(int yPos) {
        this.yPos = yPos;
    }

    /**
     * Sets the size of the text.
     * @param textSize The new size of the text.
     */
    public void setTextSize(int textSize) {
        this.textSize = textSize;
    }

    /**
     * Changes the text displayed.
     * @param text The new text displayed.
     */
    public void setText(String text) {
        this.text = text;
    }
}