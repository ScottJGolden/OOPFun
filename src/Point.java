public class Point {

    private int x;
    private int y;

    public Point(int px, int py) {
        this.x = px;
        this.y = py;
    }

    public Point() {
        this.x = 0;
        this.y = 0;
    }

    @Override
    public String toString() {
        return "(" + this.x + ", " + this.y + ")";
    }

    public int getX() {
        return this.x;
    }

    public void setX(int newX) {
        this.x = newX;
    }

    public int getY() {
        return this.y;
    }

    public void setY(int newY) {
        this.y = newY;
    }
}
