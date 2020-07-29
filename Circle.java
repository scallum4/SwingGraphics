package SwingGraphics;

public class Circle extends Shape{
    public Circle(int width, int height, double xPos, double yPos, String colour){
        super(width, height, xPos, yPos, colour);
    }

    public Circle(int width, int height, double xPos, double yPos, String colour, int angle, int layer){
        super(width, height, xPos, yPos, colour, angle, layer);
    }
}