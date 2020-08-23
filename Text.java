package swinggraphics;

public class Text extends DrawableObject{
    private int xPos;
    private int yPos;
    private int textSize;
    private String text;

    public Text(String text, int xPos, int yPos, int textSize, String colour){
        super(colour);
        this.text = text;
        this.xPos = xPos;
        this.yPos = yPos;
        this.textSize = textSize;
    }

    public Text(String text, int xPos, int yPos, int textSize, String colour, int layer){
        super(colour, layer);
        this.text = text;
        this.xPos = xPos;
        this.yPos = yPos;
        this.textSize = textSize;
    }

    public int getXPos() {
        return xPos;
    }

    public int getYPos() {
        return yPos;
    }

    public int getTextSize() {
        return textSize;
    }

    public String getText() {
        return text;
    }

    public void setXPos(int xPos) {
        this.xPos = xPos;
    }

    public void setYPos(int yPos) {
        this.yPos = yPos;
    }

    public void setTextSize(int textSize) {
        this.textSize = textSize;
    }

    public void setText(String text) {
        this.text = text;
    }
}