public class main {
    public static void main(String[] args) {
        // 1. Create our current point (5, 7) from the previous exercise
        Point currentPoint = new Point(5, 7);

        // 2. Create the target point (9, 3)
        Point targetPoint = new Point(9, 3);

        // 3. Distance to itself
        double distToSelf = currentPoint.calculateDistanceTo(currentPoint);
        System.out.println("Distance to itself: " + distToSelf);

        // 4. Distance to (9, 3)
        double distToOther = currentPoint.calculateDistanceTo(targetPoint);
        System.out.println("Distance to (9, 3): " + distToOther);
    }
}