import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Color;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D.Double;
import java.util.ArrayList;

public class Scene extends JPanel implements Runnable{
    private ArrayList<DrawableObject> items = new ArrayList<DrawableObject>();

    public Scene(){
        //System.out.println("Current thread");
        Thread t = new Thread(this);
        t.start();
    }

    public void run(){
        while(true) {
            try {
                //System.out.println("New thread");
                this.repaint();
                Thread.sleep(10);
            } catch (InterruptedException iex) {
            }
        }
    }

    public void paintComponent(Graphics g) {
       /* super.paintComponent(g);
        Graphics2D graphics = (Graphics2D)g;
        graphics.setColor(Color.BLUE);
        Rectangle r = new Rectangle(100, 0, tempS.getWidth(), tempS.getHeight());

        graphics.rotate(Math.toRadians(45), 50 + 100, 50 + 0);
        graphics.draw(r);
        graphics.fill(r);*/
    }

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
}