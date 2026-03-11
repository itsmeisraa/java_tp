class Main {
    
    public static void displayShapeInfo(Shape s) {
        System.out.println("Area: " + s.area());
        System.out.println("Perimeter: " + s.perimeter());
        System.out.println();
    }
    
    public static void main(String[] args) {
        Circle c = new Circle(5);
        Rectangle r = new Rectangle(4, 6);
        Triangle t = new Triangle(3, 4, 5);
        
        System.out.println("Circle (radius=5)");
        displayShapeInfo(c);
        
        System.out.println("Rectangle (4x6)");
        displayShapeInfo(r);
        
        System.out.println("Triangle (3,4,5)");
        displayShapeInfo(t);
        Shape[] shapes = {c, r, t};
        
        for (int i = 0; i < shapes.length; i++) {
            System.out.println("Shape " + (i+1) + ":");
            displayShapeInfo(shapes[i]);
        }
    }
}