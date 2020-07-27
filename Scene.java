import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Color;
import java.awt.Rectangle;

public class Scene extends JPanel implements Runnable{
    int i = 0;
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

    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        Graphics2D graphics = (Graphics2D)g;
        graphics.setColor(Color.BLUE);
        Rectangle r = new Rectangle(100, 0, 100, 100);

        graphics.rotate(Math.toRadians(45), 50 + 100, 50 + 0);
        graphics.draw(r);
        graphics.fill(r);
    }
}