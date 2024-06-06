package qap2_java;

public class MyLineTest {
    public static void main(String[] args) {
        MyPoint p1 = new MyPoint(1, 1);
        MyPoint p2 = new MyPoint(2, 2);
        MyLine l1 = new MyLine(1, 1, 2, 2);
        MyLine l2 = new MyLine(p1, p2);
        
        
        
        System.out.println("line1 start "+l1.getStart());
        System.out.println("line1 end "+l1.getEnd());
        System.out.println("line2 start "+l2.getStart());
        System.out.println("line2 start "+l2.getEnd());

        System.out.println();

        l1.setStart(p1);
        l1.setEnd(p2);
        System.out.println("new line1 start = "+l1.getStart());
        System.out.println("new line1 end = "+l1.getEnd());

        System.out.println();

        l2.setStartX(1);
        l2.setStartY(1);
        l2.setEndX(2);
        l2.setEndY(2);
        System.out.println("new line2 start = "+l2.getStart());
        System.out.println("new line2 end = "+l2.getEnd());

        System.out.println();

        l1.setStartXY(1, 1);
        l1.setEndXY(2, 2);
        System.out.println("new line1 start = "+l1.getStart());
        System.out.println("new line1 end = "+l1.getEnd());

        System.out.println();

        int[] startXY = l1.getStartXY();
        int[] endXY = l1.getEndXY();
        System.out.println("line1 Start XY =  "+startXY[0]+"," + startXY[1] );
        System.out.println("line1 end XY =  "+endXY[0]+"," + endXY[1] );

        System.out.println();

        System.out.println("line1 length"+l1.getLength());
        System.out.println("line2 gradient"+l2.getGradient());

        System.out.println();

        System.out.println(l1.toString());
        System.out.println(l2.toString());
    }
}
