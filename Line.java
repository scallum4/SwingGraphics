package SwingGraphics;

public class Line extends DrawableObject{
    private int startX;
    private int startY;
    private int endX;
    private int endY;
    private int width;

    public Line(int startX, int startY, int endX, int endY, int width){
        super();
        this.startX = startX;
        this.startY = startY;
        this.endX = endX;
        this.endY = endY;
        this.width = width;
    }

    public Line(int startX, int startY, int endX, int endY, int width, int layer, String colour){
        super(layer, colour);
        this.startX = startX;
        this.startY = startY;
        this.endX = endX;
        this.endY = endY;
        this.width = width;
    }

    public int getStartX() {
        return startX;
    }

    public int getStartY() {
        return startY;
    }

    public int getEndX() {
        return endX;
    }

    public int getEndY() {
        return endY;
    }

    public int getWidth() {
        return width;
    }

    public void setStartX(int startX) {
        this.startX = startX;
    }

    public void setStartY(int startY) {
        this.startY = startY;
    }

    public void setEndX(int endX) {
        this.endX = endX;
    }

    public void setEndY(int endY) {
        this.endY = endY;
    }

    public void setWidth(int width) {
        this.width = width;
    }
}