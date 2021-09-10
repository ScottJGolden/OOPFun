public class PointTester {

    public static void main(String[] args) {
        Point p1 = new Point();
        Point p2 = new Point(5, 10);
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p1.getX() + ", " + p1.getY());
        p1.setX(10);
        p1.setY(20);
        System.out.println(p1.getX() + ", " + p1.getY());
    }
}
