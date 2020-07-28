public class Square extends Shape{
    public Square(int width, int height, double xPos, double yPos, String colour){
        super(width, height, xPos, yPos, colour);
    }

    public Square(int width, int height, double xPos, double yPos, String colour, int angle, int layer){
        super(width, height, xPos, yPos, colour, angle, layer);
    }
}