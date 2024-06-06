package qap2_java;

public class MyRectangleText {
    public static void main(String[] args) {
        MyPoint p1 = new MyPoint(2, 2);
        MyPoint p2 = new MyPoint(1, 1);
        MyRectangle r1 = new MyRectangle(4, 4, 2, 2);
        MyRectangle r2 = new MyRectangle(p1, p2);

        System.out.println(r1.getTop_left());
        System.out.println(r1.getBottom_right());
        System.out.println(r2.getTop_left());
        System.out.println(r2.getBottom_right());

        r1.setTop_left(new MyPoint(8, 8));
        r1.setBottom_right(new MyPoint(4, 4));
        r2.setTop_left(new MyPoint(4, 4));
        r2.setBottom_right(new MyPoint(2, 2));

        System.out.println(r1.getTop_left());
        System.out.println(r1.getBottom_right());
        System.out.println(r2.getTop_left());
        System.out.println(r2.getBottom_right());

        System.out.println(r1.getWidth());
        System.out.println(r1.getHeight());
        System.out.println(r1.getPerimeter());
        System.out.println(r1.getArea());

        System.out.println(r2.getWidth());
        System.out.println(r2.getHeight());
        System.out.println(r2.getPerimeter());
        System.out.println(r2.getArea());

        System.out.println(r1.toString());
        System.out.println(r2.toString());
    }
}
