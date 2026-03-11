public class Point {
    int a;
    int b;
    // Default constructor
    public Point() {
        this.a = 0;
        this.b = 0;
    }

    // Constructor with parameters
    public Point(int x, int y) {
        this.a = x;
        this.b = y;
    }

    public void move(int dx, int dy) {
        this.a += dx;
        this.b += dy;
    }

    public void display() {
        System.out.println("Point(" + a + ", " + b + ")");
    }
	public void calculateDistance(Point(int c, int d);){
		double D;
		D = Math.sqrt(Math.pow(c - a, 2) + Math.pow(d - b, 2));
		System.out.println("the Distance is "+ " "+ D );
	}
}
