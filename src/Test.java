public class Test {
    public static void main(String[] args) {
        ShapeCalculator kalkulator = new ShapeCalculator();
        Ball ball1 = new Ball(1,1,1,5);
        System.out.println(kalkulator.ballVolume(ball1));

    }
}
