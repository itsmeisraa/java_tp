class Main{
    public static void displayInfo(PointCol p) {
        p.Display();
	  }
    
    public static void main(String[] args) {
        PointCol p1 = new PointCol(3, 4, "red");
        PointCol p3 = new PointCol(10, 22, "orange");
        
        displayInfo(p1);
        displayInfo(p3);
    }
}