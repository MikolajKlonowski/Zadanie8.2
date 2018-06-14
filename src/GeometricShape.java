public abstract class GeometricShape extends Shape2D {
    private int x3;
    private int y3;

    public GeometricShape(int x1, int y1, int x2, int y2, int x3, int y3) {
        super(x1, y1, x2, y2);
        this.x3 = x3;
        this.y3 = y3;
    }

    public int getX3() {
        return x3;
    }

    public void setX3(int x3) {
        this.x3 = x3;
    }

    public int getY3() {
        return y3;
    }

    public void setY3(int y3) {
        this.y3 = y3;
    }
}
