public class Main{
	public static void main(String[] args){
		PointCol p1 = new PointCol(3, 5, "red");
		p1.Display();
		p1.coulorise("blue");
		System.out.println("after changing the color : ");
		p1.Display();
	}
}