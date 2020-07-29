package SwingGraphics;

public class Shape extends DrawableObject{
    private int width;
    private int height;
    private double xPos;
    private double yPos;
    private int angle;

    public Shape(int width, int height, double xPos, double yPos, String colour){
        super(colour);
        this.width = width;
        this.height = height;
        this.xPos = xPos;
        this.yPos = yPos;
        angle = 0;
    }

    public Shape(int width, int height, double xPos, double yPos, String colour, int angle, int layer){
        super(layer, colour);
        this.width = width;
        this.height = height;
        this.xPos = xPos;
        this.yPos = yPos;
        this.angle = angle;
    }

    public void move(double xPos, double yPos){
        this.xPos = xPos;
        this.yPos = yPos;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public double getxPos() {
        return xPos;
    }

    public double getyPos() {
        return yPos;
    }

    public int getAngle() {
        return angle;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setxPos(double xPos) {
        this.xPos = xPos;
    }

    public void setyPos(double yPos) {
        this.yPos = yPos;
    }

    public void setAngle(int angle) {
        this.angle = angle;
    }

}