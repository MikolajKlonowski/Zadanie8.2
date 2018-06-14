public class Ball extends Shape3D{
    private int R;

    public Ball(int x1, int y1, int z1, int r) {
        super(x1, y1, z1);
        R = r;
    }

    public int getR() {
        return R;
    }

    public void setR(int r) {
        R = r;
    }
}
