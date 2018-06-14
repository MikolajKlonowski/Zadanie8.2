public class ShapeCalculator extends LineCalc implements Calc2D, Calc3D {
    @Override
    public double cubeVolume(Cube cube) {
        double a =Math.pow(cube.getY2()-cube.getX2(), 3);
        return a;
    }

    @Override
    public double ballVolume(Ball ball) {
        double a =4/3*Math.PI*Math.pow(ball.getR(),3);

        return a;
    }
}
