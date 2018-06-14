


public class Test {
    public static void main(String[] args) {
        ShapeCalculator kalkulator = new ShapeCalculator();
        Ball ball1 = new Ball(1,1,1,5);
        System.out.println(kalkulator.ballVolume(ball1));
        Rectangle rectangle = new Rectangle(1,1,1,5,5,5,5,1);
        System.out.println(kalkulator.rectangleArea(rectangle));
        Circle circle = new Circle(1,1,10);
        System.out.println(kalkulator.circleArea(circle));
        Cube cube = new Cube(1,1,1,2,8,2,3,3,3,4,4,4,5,5,5,6,6,6,7,7,7,8,8,8);
        System.out.println(kalkulator.cubeVolume(cube));
        Line2D line = new Line2D(1,9,2,2);
        System.out.println(kalkulator.lineLength(line));





    }
}
