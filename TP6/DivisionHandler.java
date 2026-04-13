public class DivisionHandler{
	public static void main(String[] args) {
	try{
		int var1 = Integer.parseInt(args[0]);
		int var2 = Integer.parseInt(args[1]);
		int result = var1 / var2;
		System.out.println("the result is " + result);
		
	}
	catch(NumberFormatException e){
		System.out.println("it is not an integer please enter an integer");
	}
	catch(ArithmeticException e){
		System.out.println("cant be divided by 0 ");
	}
	}
}