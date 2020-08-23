package swinggraphics;
import java.awt.Color;
import java.util.HashMap;
/**
 * Used to model a object that will be drawn to the screen.
 * You should not need to create an instance of this class.
 */
public class DrawableObject{

    private int layer;      // The layer that the object will be drawn at (used to determine what objects will be drawn above what other objects if they are overlapping).
    private String colour;  // The colour of the object. 

    /**
     * Constructor. Creates a DrawableObject.
     */
    public DrawableObject(){
        layer = 0;
        colour = "";
    }

    /**
     * Constructor. Creates a DrawableObject with the given parameters.
     * @param colour The colour of the object. 
     */
    public DrawableObject(String colour){
        layer = 0;
        this.colour = colour.toUpperCase();
    }

    /**
     * Constructor. Creates a DrawableObject with the given parameters.
     * @param colour The colour of the object. 
     * @param layer The layer that the object will be drawn at (used to determine what objects will be drawn above what other objects if they are overlapping).
     */
    public DrawableObject(String colour, int layer){
        this.colour = colour.toUpperCase();
        this.layer = layer;
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
    public String getColour(){
        return colour;
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
