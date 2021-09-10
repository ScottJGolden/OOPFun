public class Circle {

    private Point center;
    private int radius;

    public Circle(Point pCenter, int pRadius) {
        this.center = pCenter;
        this.radius = pRadius;
    }

    public Circle() {
        this.center = new Point();
        this.radius = 0;
    }

    public Point getCenter() {
        return center;
    }

    public int getRadius() {
        return radius;
    }

    public void setCenter(Point newCenter) {
        center = newCenter;
    }

    public void setRadius(int newRadius) {
        radius = newRadius;
    }

    @Override
    public String toString() {
        return "Center: " + center + " Radius: " + radius;
    }
}
