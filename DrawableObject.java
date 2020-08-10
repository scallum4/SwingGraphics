package SwingGraphics;
import java.awt.Color;
import java.util.HashMap;
/**
 * Used to model a object that will be drawn to the screen.
 * You should not need to create an instance of this class.
 */
public class DrawableObject{

    private static final String DEFAULT_COLOUR = "BLUE";       // The colour an object will be if the user does not specifty a colour. 
    private int layer;                                         // The layer that the object will be drawn at (used to determine what objects will be drawn above what other objects if they are overlapping).
    private String colour;                                     // The colour of the object. 
    private HashMap<String, Color> colours = new HashMap<>();  // A hasmap of all the colours and their names as a string. 

    /**
     * Constructor. Creates a DrawableObject.
     */
    public DrawableObject(){
        layer = 0;
        colour = "";
        init();
    }

    /**
     * Constructor. Creates a DrawableObject with the given parameters.
     * @param colour The colour of the object. 
     */
    public DrawableObject(String colour){
        layer = 0;
        this.colour = colour.toUpperCase();
        init();
    }

    /**
     * Constructor. Creates a DrawableObject with the given parameters.
     * @param colour The colour of the object. 
     * @param layer The layer that the object will be drawn at (used to determine what objects will be drawn above what other objects if they are overlapping).
     */
    public DrawableObject(String colour, int layer){
        this.colour = colour.toUpperCase();
        this.layer = layer;
        init();
    }

    /**
     * Called when the class is initiated. Puts the colours in to the hashmap.
     * Should not be called by the user. 
     */
    private void init(){
        colours.put("BLACK", Color.BLACK);
        colours.put("BLUE", Color.BLUE);
        colours.put("CYAN", Color.CYAN);
        colours.put("DARKGREY", Color.DARK_GRAY);
        colours.put("GREY", Color.GRAY);
        colours.put("GREEN", Color.GREEN);
        colours.put("LIGHTGREY", Color.LIGHT_GRAY);
        colours.put("MAGENTA", Color.MAGENTA);
        colours.put("ORANGE", Color.ORANGE);
        colours.put("PINK", Color.PINK);
        colours.put("RED", Color.RED);
        colours.put("WHITE", Color.WHITE);
        colours.put("YELLOW", Color.YELLOW);
    }

    /**
     * Gets the layer of the object. 
     * @return The layer of the object.
     */
    public int getLayer() {
        return layer;
    }

    /**
     * Gets the colour of the object. 
     * @return The colour of the object.
     */
    public Color getColour(){
        if(colours.get(colour) == null)
            colour = DEFAULT_COLOUR;
        return colours.get(colour);
    }

    /**
     * Sets the layer of the object. 
     * @param layer The new layer of the object.
     */
    public void setLayer(int layer) {
        this.layer = layer;
    }

    /**
     * Sets the colour of the object. 
     * @param colour The new layer of the object.
     */
    public void setColour(String colour){
        this.colour = colour.toUpperCase();
    }
}