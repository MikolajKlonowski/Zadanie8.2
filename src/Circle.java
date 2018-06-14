public class Circle extends GeometricShape {
    private int r1;

    public Circle(int x1, int y1, int r1) {
        super(x1, y1, 0, 0, 0, 0);
        this.r1 = r1;
    }

    public int getR1() {
        return r1;
    }

    public void setR1(int r1) {
        this.r1 = r1;
    }
}

