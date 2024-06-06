package qap2_java;

public class MyLine {
    private MyPoint start;
    private MyPoint end;
    //constructors
    public MyLine(int x1,int y1,int x2,int y2){
        this.start = new MyPoint(x1, y1);
        this.end = new MyPoint(x2, y2);
    }
    public MyLine(MyPoint start,MyPoint end){
        this.start=start;
        this.end=end;
    }
//getters and setters for start,end,startX,startY,endX,endY,startXY,endXY
    public MyPoint getStart() {
        return start;
    }
    public MyPoint getEnd() {
        return end;
    }
    public void setStart(MyPoint start) {
        this.start = start;
    }
    public void setEnd(MyPoint end) {
        this.end = end;
    }
    public int getStartX(int x){
        return this.start.getX();
    }
    public int getStartY(int y){
        return this.start.getY();
    }
    public void setStartX(int x){
        this.start.setX(x);
    }
    public void setStartY(int y){
        this.start.setY(y);
    }
    
    public int getEndX(int x){
        return this.end.getX();
    }
    public int getEndY(int y){
        return this.end.getY();
    }
    public void setEndX(int x){
        this.end.setX(x);
    }
    public void setEndY(int y){
        this.end.setY(y);
    }

    public int[] getStartXY(){
        return new int[]{this.start.getX(),this.start.getY()};
    }

    public void setStartXY(int x,int y){
        this.start.setXY(x, y);
    }

    public int[] getEndXY(){
        return new int[]{this.end.getX(),this.end.getY()};
    }

    public void setEndXY(int x,int y){
        this.end.setXY(x, y);
    }
//getting the length using MyPoint
    public double getLength(){
        return start.distance(end);
    }
    //getting the gradient using Math.atan2
    public double getGradient(){
        int xDiff = end.getX()-start.getX();
        int yDiff = end.getY()-start.getY();
        return Math.atan2(yDiff, xDiff);
    }
    public String toString(){
        return("My Line [Start = "+start+",end = "+end+"]");
    }


}
