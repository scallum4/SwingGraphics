import java.awt.Color;
import java.util.HashMap;

public class DrawableObject{
    private static final String DEFAULT_COLOUR = "BLUE";
    private int layer;
    private String colour;
    private HashMap<String, Color> colours = new HashMap<>();

    public DrawableObject(){
        layer = 0;
        colour = "";
        init();
    }

    public DrawableObject(String colour){
        layer = 0;
        this.colour = colour.toUpperCase();
        init();
    }

    public DrawableObject(int layer, String colour){
        this.layer = layer;
        this.colour = colour.toUpperCase();
        init();
    }

    public void init(){
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

    public int getLayer() {
        return layer;
    }

    public Color getColour(){
        if(colours.get(colour) == null)
            colour = DEFAULT_COLOUR;
        return colours.get(colour);
    }

    public void setLayer(int layer) {
        this.layer = layer;
    }

    public void setColour(String colour){
        this.colour = colour.toUpperCase();
    }
}