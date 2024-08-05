public class Point {
    private int x;
    private int y;

    public Point() {
        this(0, 0);
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance(){
        return Math.sqrt(x * x + y * y);
    }

    public double distance(Point second){
        int x = this.x - second.x;
        int y = this.y - second.y;
        return Math.sqrt(x * x + y * y);
    }

    public double distance(int x, int y){
        int x1 = this.x - x;
        int y1 = this.y - y;

        return Math.sqrt(x1 * x1 + y1 * y1);
    }
}
