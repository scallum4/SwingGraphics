public class Square extends Shape{
    public Square(int width, int height, int xPos, int yPos, String colour){
        super(width, height, xPos, yPos, colour);
    }

    public Square(int width, int height, int xPos, int yPos, String colour, int direction, int layer){
        super(width, height, xPos, yPos, colour, direction, layer);
    }
}