package SwingGraphics;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Color;
import java.awt.geom.Rectangle2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.BasicStroke;
import java.util.ArrayList;
/**
 * Creates a JPanel that the graphics can be displayed on. 
 */
public class Scene extends JPanel implements Runnable{
    private ArrayList<DrawableObject> items = new ArrayList<DrawableObject>();

    /**
     * Constructor. Creates a new Scene.
     */
    public Scene(){
        Thread t = new Thread(this);
        t.start();
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
            graphics.clearRect(0, 0, this.getWidth(), this.getHeight());
            for(int i = 0; i < items.size(); i++){
                DrawableObject ob = items.get(i);

                if(ob instanceof Square){
                    Square s = (Square) ob;
                    graphics.setColor(s.getColour());
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
                    graphics.setColor(c.getColour());
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
                    graphics.setColor(l.getColour());
                    graphics.setStroke(new BasicStroke((float)l.getWidth()));
                    graphics.draw(new Line2D.Double(l.getStartX(),l.getStartY(),l.getEndX(),l.getEndY()));
                }
            }
        }
    }

    /**
     * Used too add an item that will be drawn to the screen. 
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
}