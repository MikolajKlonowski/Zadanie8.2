public class Rectangle extends GeometricShape {
    private int x4;
    private int y4;

    public Rectangle(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4) {
        super(x1, y1, x2, y2, x3, y3);
        this.x4 = x4;
        this.y4 = y4;
    }
}
