public class Circle extends Shape{
    public Circle(int width, int height, int xPos, int yPos, String colour){
        super(width, height, xPos, yPos, colour);
    }

    public Circle(int width, int height, int xPos, int yPos, String colour, int direction, int layer){
        super(width, height, xPos, yPos, colour, direction, layer);
    }
}