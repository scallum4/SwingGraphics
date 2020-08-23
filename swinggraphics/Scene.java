package swinggraphics;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Color;
import java.awt.geom.Rectangle2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.BasicStroke;
import java.awt.Font;
import java.util.ArrayList;
import java.util.HashMap;
/**
 * Creates a JPanel that the graphics can be displayed on. 
 */
public class Scene extends JPanel implements Runnable{

    private static final String DEFAULT_OBJECT_COLOUR = "RED";  // Default colour for the objects that are drawn to the screen. Used if the colour the user entered isnt valid. 
    private static final String DEFAULT_BACKGROUND_COLOUR = "WHITE"; // Default colour for the background. Used if the colour the user entered isnt valid. 
    private String backgroundColour = "WHITE";  // The colour of the scenes background (Available colours are: BLACK, BLUE, CYAN, DARKGREY, GREY, GREEN, LIGHTGREY, MAGENTA, ORANGE, PINK, RED, WHITE, YELLOW).
    private ArrayList<DrawableObject> items = new ArrayList<DrawableObject>();  // ArrayList that stores all the objects that will be drawn to the screen.
    private HashMap<String, Color> colours = new HashMap<>();  // A hasmap of all the colours and their names as a string. 

    /**
     * Constructor. Creates a new Scene.
     */
    public Scene(){
        init();
        Thread t = new Thread(this);
        t.start();
    }

     /**
      * Constructor. Creates a new Scene with a specifird background colour.
      * @param backgroundColour The colour of the background (Available colours are: BLACK, BLUE, CYAN, DARKGREY, GREY, GREEN, LIGHTGREY, MAGENTA, ORANGE, PINK, RED, WHITE, YELLOW).
      */
    public Scene(String backgroundColour){
        this.backgroundColour = backgroundColour;
        init();
        Thread t = new Thread(this);
        t.start();
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
     * Called by the constructor to repaint each frame.
     * Should only be called by the contructor, not by the user. 
     */
    public void run(){
        while(true) {
            try {
                this.repaint();
                Thread.sleep(10);
            } catch (InterruptedException iex) {}
        }
    }

    /**
     * Called by the operating system to repaint each frame.
     * Do not call this method. 
     */
    public void paintComponent(Graphics g){
        synchronized (this){
            Graphics2D graphics = (Graphics2D)g;
            graphics.setBackground(backgroundAsColor());
            graphics.clearRect(0, 0, this.getWidth(), this.getHeight());
            for(int i = 0; i < items.size(); i++){
                DrawableObject ob = items.get(i);

                if(ob instanceof Square){
                    Square s = (Square) ob;
                    graphics.setColor(stringToColor(s.getColour()));
                    Rectangle2D.Double r = new Rectangle2D.Double(s.getxPos(), s.getyPos(), s.getWidth(), s.getHeight());
                    if(s.getAngle() != 0) {
                        graphics.rotate(Math.toRadians(s.getAngle()), (s.getWidth() / 2) + s.getxPos(), (s.getHeight() / 2) + s.getyPos());
                        graphics.fill(r);
                        graphics.rotate(Math.toRadians(-s.getAngle()), (s.getWidth() / 2) + s.getxPos(), (s.getHeight() / 2) + s.getyPos());
                    } else{
                        graphics.fill(r);
                    }
                } else if(ob instanceof Circle){
                    Circle c = (Circle) ob;
                    graphics.setColor(stringToColor(c.getColour()));
                    Ellipse2D.Double r = new Ellipse2D.Double(c.getxPos(), c.getyPos(), c.getWidth(), c.getHeight());
                    if(c.getAngle() != 0) {
                        graphics.rotate(Math.toRadians(c.getAngle()), (c.getWidth() / 2) + c.getxPos(), (c.getHeight() / 2) + c.getyPos());
                        graphics.fill(r);
                        graphics.rotate(Math.toRadians(-c.getAngle()), (c.getWidth() / 2) + c.getxPos(), (c.getHeight() / 2) + c.getyPos());
                    } else{
                        graphics.fill(r);
                    }
                } else if(ob instanceof Line){
                    Line l = (Line) ob;
                    graphics.setColor(stringToColor(l.getColour()));
                    graphics.setStroke(new BasicStroke((float)l.getWidth()));
                    graphics.draw(new Line2D.Double(l.getStartX(),l.getStartY(),l.getEndX(),l.getEndY()));
                } else if(ob instanceof Text){
                    Text t = (Text) ob;
                    graphics.setFont(new Font("Helvetica", Font.BOLD, t.getTextSize()));
                    graphics.setColor(stringToColor(t.getColour()));
                    graphics.drawString(t.getText(),(float)t.getXPos(), (float)t.getYPos());
                }
            }
        }
    }

    /**
     * Gets the colour of the object. 
     * @param colour A colour of an object as a String (Available colours are: BLACK, BLUE, CYAN, DARKGREY, GREY, GREEN, LIGHTGREY, MAGENTA, ORANGE, PINK, RED, WHITE, YELLOW).
     * @return The colour of the object.
     */
    public Color stringToColor(String colour){
        if(colours.get(colour) == null)
            return colours.get(DEFAULT_OBJECT_COLOUR);
        return colours.get(colour);
    }

    /**
     * Gets the colour of the background. 
     * @return The colour of the background.
     */
    public Color backgroundAsColor(){
        if(colours.get(backgroundColour) == null)
            return colours.get(DEFAULT_BACKGROUND_COLOUR);
        return colours.get(backgroundColour);
    }

    /**
     * Used to add an item that will be drawn to the screen. 
     * @param object The object that will be added. 
     */
    public void addElement(DrawableObject object){
        int layer = object.getLayer();

        for(int i = 0; i < items.size(); i++){
            DrawableObject ob = items.get(i);
            if(ob.getLayer() > layer) {
                items.add(i, object);
                return;
            }
        }
        items.add(object);
    }

    /**
     * Used too remove an item and stop it from being drawn to the screen. 
     * @param object The object that will be removed. 
     */
    public void removeElement(DrawableObject object){
        items.remove(object);
    }

    /**
     * Gets the background colour of the scene. 
     * @return The colour of the background as a String.
     */
    public String getBackgroundColour(){
        return backgroundColour;
    }

    /**
     * Changes the background of the scene.
     * @param backgroundColour The colour the background will be changed to (Available colours are: BLACK, BLUE, CYAN, DARKGREY, GREY, GREEN, LIGHTGREY, MAGENTA, ORANGE, PINK, RED, WHITE, YELLOW).
     */
    public void setBackgroundColour(String backgroundColour){
        this.backgroundColour = backgroundColour;
    }

    /**
     * Clears all the items from the screen. 
     */
    public void clearScene(){
        items.clear();
    }
}
