public class Shape extends DrawableObject{
    private int width;
    private int height;
    private int xPos;
    private int yPos;
    private int direction;

    public Shape(int width, int height, int xPos, int yPos, String colour){
        super(colour);
        this.width = width;
        this.height = height;
        this.xPos = xPos;
        this.yPos = yPos;
        direction = 0;
    }

    public Shape(int width, int height, int xPos, int yPos, String colour, int direction, int layer){
        super(layer, colour);
        this.width = width;
        this.height = height;
        this.xPos = xPos;
        this.yPos = yPos;
        this.direction = direction;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public int getxPos() {
        return xPos;
    }

    public int getyPos() {
        return yPos;
    }

    public int getDirection() {
        return direction;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setxPos(int xPos) {
        this.xPos = xPos;
    }

    public void setyPos(int yPos) {
        this.yPos = yPos;
    }

    public void setDirection(int direction) {
        this.direction = direction;
    }

}