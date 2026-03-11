class PointCol extends Point{
	String col; 
	public PointCol(int x, int y, String col){
		super(x, y); //bah n3yto l parent constructor 
		this.col = col;
	}
	public void coulorise(String col){
		this.col = col;
	}
	public void Display(){
		super.Display();
		System.out.println("color = " + col);
	}
}