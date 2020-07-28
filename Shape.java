public class Shape{
    private int width;
    private int height;
    private int xPos;
    private int yPos;
    private int direction;
    private int layer;

    public Square(int width, int height, int xPos, int yPos){
        this.width = width;
        this.height = height;
        this.xPos = xPos;
        this.yPos = yPos;
        direction = 0;
        layer = 0;
    }

    public Square(int width, int height, int xPos, int yPos, int direction, int layer){
        this.width = width;
        this.height = height;
        this.xPos = xPos;
        this.yPos = yPos;
        this.direction = direction;
        this.layer = layer;
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

    public int getLayer() {
        return layer;
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

    public void setLayer(int layer) {
        this.layer = layer;
    }
}