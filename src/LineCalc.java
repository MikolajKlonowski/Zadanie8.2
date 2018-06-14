import java.lang.Math.*;


public class LineCalc implements Calc2D {
    double lineLength(Line2D line) {
        double a = Math.sqrt(Math.pow(line.getX2() - line.getX1(), 2)-Math.pow(line.getY2()-line.getY1(),2));

        return a;
    }

    @Override
    public double circleArea(Circle circle) {
        double a =Math.PI*Math.pow(circle.getR1(),2);
        return a;

    }

    @Override
    public double rectangleArea(Rectangle rectangle) {
        double a = Math.sqrt(Math.pow(rectangle.getX2() - rectangle.getX1(), 2)-Math.pow(rectangle.getY2()-rectangle.getY1(),2));
        double b = Math.sqrt(Math.pow(rectangle.getX3() - rectangle.getX2(), 2)-Math.pow(rectangle.getY3()-rectangle.getY2(),2));

        return a*b;
    }
}
