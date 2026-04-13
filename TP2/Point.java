class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // The new Abstraction method
    public double calculateDistanceTo(Point other) {
        double xDiff = other.x - this.x;
        double yDiff = other.y - this.y;

        return Math.sqrt(Math.pow(xDiff, 2) + Math.pow(yDiff, 2));
    }

    public void display() {
        System.out.println("Point(" + x + ", " + y + ")");
    }
}
