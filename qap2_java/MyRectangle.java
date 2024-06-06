package qap2_java;
public class MyRectangle {
    private MyPoint top_left;
    private MyPoint bottom_right;
//constructors
    public MyRectangle(int topX,int topY,int botX,int botY){
        this.top_left = new MyPoint(topX, topY);
        this.bottom_right = new MyPoint(botX, botY);
    }
    public MyRectangle(MyPoint top_left,MyPoint bottom_right){
        this.top_left=top_left;
        this.bottom_right=bottom_right;
    }
//getters and setters
    public MyPoint getTop_left() {
        return top_left;
    }
    public void setTop_left(MyPoint top_left) {
        this.top_left = top_left;
    }
    public MyPoint getBottom_right() {
        return bottom_right;
    }
    public void setBottom_right(MyPoint bottom_right) {
        this.bottom_right = bottom_right;
    }

    //doing math to get height
    public int getHeight(){
        return Math.abs(bottom_right.getX()-top_left.getX());
    }
    //doing math to get width
    public int getWidth(){
        return Math.abs(bottom_right.getY()-top_left.getY());
    }
    //doing math to get permiter
    public int getPerimeter(){
        return 2 *(getWidth()+getHeight());
    }
    //doing math to get area
    public int getArea(){
        return getWidth()*getHeight();
    }
    public String toString(){
        return("My Rectangle: top left" + top_left + "bottem right " +bottom_right);
    }
    
}
