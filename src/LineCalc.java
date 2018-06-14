import java.lang.Math.*;


public class LineCalc implements Calc2D {
    double lineLength(Line2D line) {
        double a = Math.sqrt(Math.pow(line.getY1() - line.getX1(), 2)-Math.pow(line.getY2()-line.getX2(),2));

        return a;
    }

    @Override
    public double circleArea(Circle circle) {
        double a =Math.PI*Math.pow(circle.getR1(),2);
        return a;

    }

    @Override
    public double rectangleArea(Rectangle rectangle) {
        double a = (rectangle.getY2()-rectangle.getY1()) *(rectangle.getX3()-rectangle.getX2());


        return a;
    }
}
